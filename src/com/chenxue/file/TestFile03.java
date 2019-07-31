package com.chenxue.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("d:"+File.separator+"test.txt");
//			int num=0;
//			while ((num=fis.read())!=-1) {
//				System.out.println((char)num);
//				
//			}
			byte[] bs=new byte[4];
			
			fis.read(bs);
			
			String string = new String(bs);
			
			System.out.println(string);
			
			fis.read(bs);
			
			String string2 = new String(bs);
			System.out.println(string2);
			int i=fis.read(bs);
			fis.read(bs);
			
//			System.out.println(i);
			String string3 = new String(bs,0,i);
			System.out.println(string3);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
