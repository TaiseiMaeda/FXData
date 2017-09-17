package fxdi;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import fxdi.dao.FXDataDao;
import fxdi.entity.FXDataEntity;
import fxdi.utils.CodeConstants;
import fxdi.utils.FileIO;
import fxdi.utils.UtilMethods;

public class Main {

	public static void main(String[] args) {
		if(args.length > 0) { 
			insertTodayRecords(args[0]);
		}else {
			insertTodayRecordsOLD();
		}
	}
	
	public static void insertTodayRecordsOLD() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		//String strToday = sdf.format(new Date()) ;
		String strToday = "20170915";
		for(int cp=0;cp<9;cp++) {
			String path = "D:\\FX\\Data\\" + CodeConstants.currencyPairs[cp] + "\\" + CodeConstants.currencyPairs[cp] + strToday;
			FileIO fio = new FileIO();
			String[] strary = fio.inputFile(path + ".csv");
			String[] strary2 = fio.inputFile(path + "_2.csv");
			FXDataDao dao = new FXDataDao();
			try {
				for (int i=2;i<402;i++) {
					FXDataEntity entity = new FXDataEntity("5分足", CodeConstants.currencyPairs[cp]);
					entity.importRecordCsv1(strary[i].replaceAll("-----","0").split(","));
					entity.importRecordCsv2(strary2[i].replaceAll("-----","0").split(","));
					dao.insert(entity);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void insertTodayRecords(String ashi) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		String strToday = sdf.format(new Date()) ;
		//String strToday = "20170915";
		FXDataEntity oldEntity = null;
		FXDataEntity newEntity = null;
		FXDataDao dao = new FXDataDao();
		FileIO fio = new FileIO();
		for(int cp=0;cp<9;cp++) {
			String path = "D:\\FX\\Data\\" + CodeConstants.currencyPairs[cp] + "\\" + CodeConstants.currencyPairs[cp] + strToday + ashi;
			String[] strary = fio.inputFile(path + ".csv");
			String[] strary2 = fio.inputFile(path + "_2.csv");
			try {
				for (int i=2;i<402;i++) {
					oldEntity = dao.select1record(CodeConstants.currencyPairs[cp], ashi,
							new Timestamp(UtilMethods.stringToDateyyyyMMddHHmm(strary[i].replaceAll("-----","0").split(",")[0]).getTime()));
					newEntity = new FXDataEntity(ashi, CodeConstants.currencyPairs[cp]);
					newEntity.importRecordCsv1(strary[i].replaceAll("-----","0").split(","));
					newEntity.importRecordCsv2(strary2[i].replaceAll("-----","0").split(","));
					if(oldEntity == null) {
						dao.insert(newEntity);
					}else {
						oldEntity.newIntoOldEntity(newEntity);
						dao.update(oldEntity);
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
