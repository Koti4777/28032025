package com.filereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Path.of("/28032025/src/test/resources/testdata/notepad.txt");
		System.out.println(newwayReading(path));
	}
	
	public static String newwayReading(Path input) {
		String output=null;
		try {
			output = Files.readString(input);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return output;
		
	}
	


}
