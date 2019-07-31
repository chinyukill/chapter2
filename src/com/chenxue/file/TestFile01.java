package com.chenxue.file;

import java.io.File;
import java.io.IOException;

public class TestFile01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("d:\\test.txt");
		file.createNewFile();
		System.out.println(file.exists());
		File file2 = new File("d:\\testfile");
		System.out.println(file2.mkdir());
		File file3 = new File("testfile\\a\\b");
		System.out.println(file3.mkdirs());;
//		file.delete();
		File file4 = new File("testfile\\a","a.txt");
		System.out.println(file4.getAbsolutePath());
		file4.createNewFile();
	}

}
