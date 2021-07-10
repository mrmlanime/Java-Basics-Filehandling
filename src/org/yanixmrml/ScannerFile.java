package org.yanixmrml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String args[]) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("yanixmrml\\team.txt")); //Note this will not create a file and throws exception if the file is not existing
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(scan!=null) {
				scan.close();
			}
		}
		
		/****
		 * 
		 * Differences 
		 * BufferedReader					Scanner
		 * Buf is synchronous class			Buf is not synchronous
		 * Should be used with multi		Should be avoided when using multithreading
		 * threading						
		 * Larger Buffer, 8KB				Small Buffer, 1KB
		 * Buf is a bit faster as			Scan is bit slower
		 * it reads sequence of characters
		 * For Files better use buffered	For console input, better use Scanner	
		 * 
		 */
		
	}
}
