package org.file;

import java.io.File;

import java.io.IOException;

public class Notepad {

	
	public static void main(String[] args) throws IOException {
/*	
	File f=new File("E:\\Java\\Aravinth\\ck\\fileblog\\classy.txt");
	
	
	
	boolean Folder = f.mkdirs();
	System.out.println(Folder);
	
	boolean newfile = f.createNewFile();
	System.out.println(newfile);
	
	boolean Directory = f.isDirectory();
System.out.println(Directory);

boolean file = f.isFile();
System.out.println(file);
*/
File f=new File("C:\\Users\\DELL\\eclipse-workspace");



File[] as= f.listFiles();
for (File y : as) {
	System.out.println(y);
}

String[] a = f.list();

for (String x : a) {
	System.out.println(x);
	
}	
}	
}
	





