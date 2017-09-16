package check;

import fxdi.utils.FileIO;

public class FileIOCheck {
	public static void main(String[] args) {
		FileIO fio = new FileIO();
		System.out.println(fio.inputFile("D:\\FX\\Data\\GBP\\GBP20170915.csv"));
	}
}
