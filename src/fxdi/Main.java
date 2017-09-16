package fxdi;

import fxdi.dao.FXDataDao;
import fxdi.entity.FXDataEntity;
import fxdi.utils.FileIO;

public class Main {

	public static void main(String[] args) {
		FileIO fio = new FileIO();
		String[] strary = fio.inputFile("D:\\FX\\Data\\GBP\\GBP20170915.csv");
		String[] strary2 = fio.inputFile("D:\\FX\\Data\\GBP\\GBP20170915_2.csv");
		FXDataDao dao = new FXDataDao();
		try {
			for (int i=2;i<402;i++) {
				FXDataEntity entity = new FXDataEntity("5足", "gbp");
				entity.importRecordCsv1(strary[i].replaceAll("-----","0").split(","));
				entity.importRecordCsv2(strary2[i].replaceAll("-----","0").split(","));
				dao.insert(entity);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
