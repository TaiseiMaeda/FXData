package fxdi.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileIO {

	public String[] inputFile(String path) {
		String[] file = new String[400];
		int i = 0;
		 try(FileInputStream is = new FileInputStream(path);){
	            InputStreamReader ir = new InputStreamReader(is,"Shift_JIS");
	            BufferedReader br = new BufferedReader(ir);
	            String tmp;
	            while((tmp = br.readLine()) != null){
	            	file[i]=tmp;
	                i++;
	            }
	            
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return file;
	}
}
