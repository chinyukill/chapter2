package com.chenxue.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestPerson02 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("d:"+File.separator+"person.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			Person person=(Person)ois.readObject();
			System.out.println(person.getAge());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
