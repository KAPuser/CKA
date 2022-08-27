package org.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class MavenType {
	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("E:\\Java\\Aravinth\\ck\\type.txt");
	     
		System.out.println(f.createNewFile());	
		System.out.println("Chennai branch");
		String s="Greens Technologyy";
		System.out.println("Chennai Branch");
		FileUtils.write(f, s);
	
		
		String ss="one of the selenium course center in chennai";
		FileUtils.write(f, ss,true);
		
		List<String> li=FileUtils.readLines(f);
		System.out.println(li);
	
	}
	

}
