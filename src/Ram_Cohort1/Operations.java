package Ram_Cohort1;

import java.io.IOException;
import java.util.Scanner;

public class Operations 
{
	Scanner sc;
	int UserSelection, UserSelection2; 
	
	Operations()
	{
	 sc = new Scanner(System.in);
	 UserSelection = sc.nextInt();
	
	}
	void execute() throws IOException
	{
	switch(UserSelection)
	{
	case 1:
	{
		System.out.println("Ram");
		break;
	}
	case 2:
	{
		System.out.println("Press 1 to create file");
		System.out.println("Press 2 to delete file");
		System.out.println("Press 3 to search the file");
		System.out.println("press 4 to go back to homescreen");
		UserSelection2 = sc.nextInt();
		
		switch(UserSelection2)
		{
		case 1:
		{
			System.out.println("Enter the folder path");
			String folderpath = sc.next();
			System.out.println("Enter the file name");
			String filename = sc.next();
			String merge = folderpath.concat("//").concat(filename);
			new createFile(merge);
			break;
			
		}	
		case 2:
		{
			
		}
		case 3:
		{
			
		}
		case 4:
		{
			new workFlow().Execution();
			break;
			
		}
	
		
		}
		
		
		
	}
	
	}
	}

	
	
}
