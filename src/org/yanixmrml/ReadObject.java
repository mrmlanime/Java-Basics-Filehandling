package org.yanixmrml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Note: Do not change the serialVersionUID because that is use to save the file on writing objectoutputstream
		 * So be careful on changing the the UID....
		 * 
		 * 
		 * 
		 */
		try(FileInputStream fis = new FileInputStream("yanixmrml\\vehicles.txt")){
			try(ObjectInputStream obj = new ObjectInputStream(fis)){
				Vehicle v1 = (Vehicle) obj.readObject();
				Vehicle v2 = (Vehicle) obj.readObject();
				System.out.println(v1);
				System.out.println(v2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
