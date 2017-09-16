package check;

import fxdi.utils.FileIO;

public class FileIOCheck {
	public static void main(String[] args) {
		FileIO fio = new FileIO();
		String[] strary = fio.inputFile("D:\\FX\\Data\\GBP\\GBP20170915.csv");
		for(String str:strary){
			System.out.println(str);
		}
	}
}
