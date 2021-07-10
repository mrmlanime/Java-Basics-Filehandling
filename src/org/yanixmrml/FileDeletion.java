package org.yanixmrml;

import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("yanixmrml\\team.txt");
		if(file.delete()) {
			System.out.println("File is deleted");
		}else {
			System.out.println("Error while deleting file");
		}
	}

}
