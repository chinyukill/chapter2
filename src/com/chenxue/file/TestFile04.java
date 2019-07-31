package com.chenxue.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis=null;
		try {
			fis=new FileInputStream("d:"+File.separator+"test.txt");
			byte[] bs=new byte[3];
			int temp=0;
			while ((temp=fis.read(bs))!=-1) {
				System.out.print(new String(bs,0,temp));
			}
//			int temp=0;
//			while ((temp=fis.read(bs,0,bs.length))!=-1) {
//				System.out.print(new String(bs,0,temp));
//			}
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
