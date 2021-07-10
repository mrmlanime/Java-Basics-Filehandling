package org.yanixmrml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String args[]) {
		File file = new File("yanixmrml");
		file.mkdir();
		file = new File("yanixmrml\\team.txt");
		BufferedWriter writer = null;
		try {
			//file.createNewFile(); -> Ignore this if you pass true on FileWriter
			System.out.println("Created new File");
			writer = new BufferedWriter(new FileWriter(file,true));
			writer.write("Hello\n");
			writer.write("Mary\n");
			writer.write("Anna\n");
			writer.write("Martha\n");
			System.out.println("Writing on the file completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Best practice use try with resources to avoid resource leak
		//NOTE: Use this try with resources to automatically close the file to avoid resource leak
		try(BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file))){
			bufWriter.write("Samples\n");
			bufWriter.close(); //Optional for this try with resources
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
