package com.app.main;

import java.io.File;
import java.util.Scanner;

import com.app.bo.FileBo;
import com.app.bo.FileBoImpl;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to LockedMe.com");
		Scanner sc=new Scanner(System.in);
		FileBo filebo=new FileBoImpl();
		int ch=0;
		do
		{
			System.out.println("LookedMe.com Menu");
			System.out.println("------------------");
			System.out.println("1)sort file");
			System.out.println("2)create directory");
			System.out.println("3)delete file");
			System.out.println("4)search file");
			System.out.println("5)list all files");
			System.out.println("6)Exit");
			System.out.println("Enter the choice:");
			
			ch = Integer.parseInt(sc.nextLine());
			
			switch(ch) {
			case 1:
				filebo.sortfilesinaccorder();
				break;
			case 2:
				System.out.println("Enter the name for the file:");
				String filename=sc.nextLine();
				filebo.createDirectories(filename);
				break;
			case 3:
				System.out.println("Enter the name for the file:");
				String fname=sc.nextLine();
				filebo.deletefile(fname);
				break;
			case 4:
				System.out.println("Enter the name for the file:");
				String Fname=sc.nextLine();
				filebo.searchfile(Fname);
				break;
			case 5:
				filebo.getAllFiles();
				break;
			case 6:
				System.out.println("Thank you for using LockedMe");
				break;
			default:
				System.out.println("Invalid option ...Choose again!! ");
			
			
			}
		}while(ch!=6);
		//create directory
		
		
	}

}