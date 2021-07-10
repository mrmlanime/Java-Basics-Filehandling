package org.yanixmrml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	public static void main(String args[]) {
		//Need to have Java 1.7 and above version
		Vehicle bike = new Vehicle("bike",9444);
		Vehicle car = new Vehicle("car",4268);
		
		try(FileOutputStream fos = new FileOutputStream("yanixmrml\\vehicles.txt")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written to the file");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
