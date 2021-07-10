package org.yanixmrml;

import java.io.File;
import java.io.IOException;

public class FileApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Creating Directory
		File file = new File("src\\Sample.txt"); //Good Practice is to use forward slash so Unix can be accomodated
		//This file will create inside the Project Directory
		file.createNewFile();
		System.out.println("File Created " );
	
		//Creating Directory
		File directory = new File("baseDirectory\\subDirectory\\s");
		directory.mkdir(); //Use mkdirs...
		System.out.println("Created Directory");
	}

}
