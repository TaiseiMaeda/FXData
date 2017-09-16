package fxdi;

import java.text.SimpleDateFormat;
import java.util.Date;

import fxdi.dao.FXDataDao;
import fxdi.entity.FXDataEntity;
import fxdi.utils.CodeConstants;
import fxdi.utils.FileIO;

public class Main {

	public static void main(String[] args) {
		insertTodayRecords();
	}
	
	public static void insertTodayRecords() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
		String strToday = sdf.format(new Date()) ;
		for(int cp=1;cp<9;cp++) {
			String path = "D:\\FX\\Data\\" + CodeConstants.currencyPairs[cp] + "\\" + CodeConstants.currencyPairs[cp] + strToday;
			FileIO fio = new FileIO();
			String[] strary = fio.inputFile(path + ".csv");
			String[] strary2 = fio.inputFile(path + "_2.csv");
			FXDataDao dao = new FXDataDao();
			try {
				for (int i=2;i<402;i++) {
					FXDataEntity entity = new FXDataEntity("5足", CodeConstants.currencyPairs[cp]);
					entity.importRecordCsv1(strary[i].replaceAll("-----","0").split(","));
					entity.importRecordCsv2(strary2[i].replaceAll("-----","0").split(","));
					dao.insert(entity);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
