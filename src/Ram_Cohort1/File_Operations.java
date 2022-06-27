package Ram_Cohort1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class File_Operations extends Switches
{
	String folderPath;
	String delete_Filename;
	File folder;
	File[] AllFiles;
	ArrayList<File> fileobj;
	FileWriter FW;
	File_Operations(String folderPath)
	{
		this.folderPath = folderPath;
		folder = new File(folderPath);
		
		AllFiles = folder.listFiles();

		
		fileobj = new ArrayList<File>();

		
	}
	File_Operations()
	{
		
	}
	
	void createFile() throws IOException, InterruptedException
	{
		System.out.println("Enter the folder path");
		String folderpath = sc.next();
		System.out.println("Enter the file name");
		String filename = sc.next();
		//System.out.println(folder.length());
		String merge = folderpath.concat("//").concat(filename);
		try 
		{
		FW = new FileWriter(merge);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Either the file or folder entered is not appropriate\nplease enter it again");
			Thread.sleep(1000);
			this.createFile();
		}
		System.out.println("Enter context of the file");
		String text = sc.next();
		FW.write(text);
		FW.flush();
		
		
	}
	
	
	void List() throws IOException
	{	

		try 
		{
			for(File eachFile:AllFiles)
			{
				fileobj.add(eachFile);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Entered folder path is not exists\n");
			//System.out.println("");
			System.out.println("Please enter the proper folder path again");
			System.out.println("");
			String UserSelection_Disp_files = sc.next(); 
			File_Operations fo = new File_Operations(UserSelection_Disp_files);
			fo.List();
			//new Switches().execute();
			//new workFlow().Execution();
			
		}
		
		Collections.sort(fileobj);
		System.out.println("\n");
				
		for(File eachFile:fileobj)
		{
			
			System.out.println(eachFile.getName());
		}
		
	}
	
	void Delete_file()
	{

		{
			 sc = new Scanner(System.in);
			boolean available = false;
			do
			{
				//boolean available = false;
				System.out.println("Enter the folder path to delete files\n ");
				String UserSelection_Disp_files = sc.next(); 
				 folder = new File(UserSelection_Disp_files);
				if(folder.exists())
				{
				available=true;
				}
				else
				{
					System.out.println("Entered folder path is not exists\n ");
				}
			}while(available == false);
		}
		
		
		AllFiles  = folder.listFiles();
		System.out.println("Enter the name of the file");
		String filename = sc.next();
		boolean result = false;
		for (File single_file : AllFiles)
		{
			if(filename.equals(single_file.getName()))
			{
				
				single_file.delete();
				System.out.println("File deleted successfully");
				result = true;
				
			}


		}
		if(result == false)
		{
			System.out.println("File not exists ");
		}
		
	}


	void Search_File()
	{

		{
			 sc = new Scanner(System.in);
			boolean folder_available = false;
			do
			{
				//boolean available = false;
				System.out.println("Enter the folder path to search file that you want\n ");
				String UserSelection_Disp_files = sc.next(); 
				 folder = new File(UserSelection_Disp_files);
				if(folder.exists())
				{
				folder_available=true;
				}
				else
				{
					System.out.println("Entered folder path is not exists\n ");
				}
			}while(folder_available == false);
		}
		
		
		AllFiles  = folder.listFiles();
		System.out.println("Enter the name of the file you are searching for\n");
		String filename = sc.next();
		boolean result = false;
		for (File single_file : AllFiles)
		{
			if(filename.equals(single_file.getName()))
			{
				
				System.out.println("File is available");
				result = true;
				
			}


		}
		if(result == false)
		{
			System.out.println("File not exists ");
		}
		
	}

	


}
