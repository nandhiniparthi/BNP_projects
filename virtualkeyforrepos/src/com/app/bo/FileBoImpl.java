package com.app.bo;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileBoImpl implements FileBo {
	Scanner sc=new Scanner (System.in);
	@Override
	public void createFile(String name) {
		System.out.println("Enter path for the file with \"\\\"at the end: ");//with "\"at the end
		String path=sc.nextLine();
		File file=new File(""+path+""+name);

		if(file.exists())
		{
			System.out.println("File already exists!!!Try again");
		}
		else {
		boolean b;
		try {
			b = file.createNewFile();
			if(b)
			{
				 System.out.println("file created successfully.");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		}

		
	}

	@Override
	public void deletefile(String name) {
		System.out.println("Enter path for the file with \"\\\"at the end: ");//with "\"at the end
		String path=sc.nextLine();
		File file=new File(""+path+""+name);
		
		if(file.exists())
		{
		
			if(file.delete())
			{
			System.out.println("File deleted sucessfully!!!!");
			}
		}
		else {
			System.out.println("file doesnot exist!!!!");
		}
		
	}

	@Override
	public void searchfile(String name) {
		System.out.println("Enter path for the file with \"\\\"at the end: ");//with "\"at the end
		String path=sc.nextLine();
		File file=new File(""+path+""+name);

		try{
			if(file.exists())
		{
			
			System.out.println("File "+name+" was found at "+path+" !!!!");
			
		}
		else {
			System.out.println("File "+name+" was not found at "+path+" !!!!");
		}}catch(Exception e) {
			System.out.println(e);}
		
	}

	@Override
	public void getAllFiles() {
		System.out.println("Enter path for the file with \"\\\"at the end: ");//with "\"at the end
		String path=sc.nextLine();
		 try { 
	            File f = new File(path); 
	            File[] files = f.listFiles(); 
	            System.out.println("Files are:"); 
	            for (int i = 0; i < files.length; i++) { 
	                System.out.println(files[i].getName()); 
	            } 
	        } 
	        catch (Exception e) { 
	            System.err.println(e.getMessage()); 
	        } 
	    } 
		
	

	@Override
	public void sortfilesinaccorder() {
	
		System.out.println("Enter path for the file with \"\\\"at the end: ");//with "\"at the end
		String path=sc.nextLine();
		File file=new File(path);
		File[] files=file.listFiles();
		Arrays.sort(files,(f1,f2) ->f1.compareTo(f2));
		for(File file1:files){
			if(!file1.isHidden()) {
				if(file1.isFile()) {
					System.out.println(" "+file1.getName());
				}
				
			}
		}
		
	}
	
	}
