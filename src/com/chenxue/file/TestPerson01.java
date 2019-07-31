package com.chenxue.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestPerson01 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("d:"+File.separator+"person.txt");) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person();
			p.setAge(10);
			oos.writeObject(p);//java.io.NotSerializableException
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
