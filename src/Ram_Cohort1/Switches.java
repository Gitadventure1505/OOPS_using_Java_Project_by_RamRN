package Ram_Cohort1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Switches 
{
	Scanner sc = new Scanner(System.in);;
	int UserSelection, UserSelection2; 
	void userInput() throws IOException, InterruptedException
	{
		
		 try
		 {
		 UserSelection = sc.nextInt();
		 if(UserSelection < 1 || UserSelection > 3 )
		 {
			 throw new InputValueExceeded("Integer value which is not inbetween 1 to 3 is not accepted");
		 }
		 }
		 catch(InputMismatchException e)
		 {
			 System.out.println("-----VALIDATION MESSAGE-----");
			 System.out.println("please enter only integer value ");
			 System.out.println();
			 Thread.sleep(2000);
			 new workFlow().Execution();
		 }
		 catch(InputValueExceeded e)
		 {
			 System.out.println("-----VALIDATION MESSAGE-----");
			 System.out.println(e.errorName());
			 Thread.sleep(2000);
			 System.out.println();
			 new workFlow().Execution();
		 }

	}
	
	void levelOne() throws IOException, InterruptedException
	{
		sc = new Scanner(System.in);
		 try
		 {
		 UserSelection = sc.nextInt();
		 if(UserSelection < 1 || UserSelection > 3 )
		 {
			 throw new InputValueExceeded("Integer value which is not inbetween 1 to 3 is not accepted");
		 }
		 }
		 catch(InputMismatchException e)
		 {
			 System.out.println("-----VALIDATION MESSAGE-----");
			 System.out.println("please enter only integer value ");
			 System.out.println();
			// Thread.sleep(00);
			 new workFlow().Execution();
		 }
		 catch(InputValueExceeded e)
		 {
			 System.out.println("-----VALIDATION MESSAGE-----");
			 System.out.println(e.errorName());
			 //Thread.sleep(1000);
			 System.out.println();
			 new workFlow().Execution();
		 }
	switch(UserSelection)
	{
	case 1: //To display the files in ascending order
	{
		System.out.println("Enter the folder path to display files in ascending order");
		String UserSelection_Disp_files = sc.next(); 
		File_Operations fo = new File_Operations(UserSelection_Disp_files);
		fo.List();
		break;
	}
	case 2: //To business level operations
		{
		
			this.levelTwo();
			break;
		}
		
	case 3:
	{
		System.out.println("Application stopped, Thanks for using our application");
		System.exit(0);
		
	}
 }
}
		void levelTwo() throws IOException, InterruptedException
		{
			
			System.out.println("Press 1 to create file");
			System.out.println("Press 2 to delete file");
			System.out.println("Press 3 to search the file");
			System.out.println("press 4 to go back to homescreen");
			
			
			try
			 {
				UserSelection2 = sc.nextInt();
			 if(UserSelection2 < 1 || UserSelection2 > 4 )
			 {
				 throw new InputValueExceeded("Integer value which is not inbetween 1 to 4 is not accepted");
			 }
			 }
			 catch(InputMismatchException e)
			 {
				 System.out.println("-----VALIDATION MESSAGE-----");
				 System.out.println("please enter only integer value ");
				 System.out.println();
				// Thread.sleep(1000);
				 //this.levelTwo();
				 new Switches().levelTwo();
				// new workFlow().Execution();
			 }
			 catch(InputValueExceeded e)
			 {
				 System.out.println("-----VALIDATION MESSAGE-----");
				 System.out.println(e.errorName());
				// Thread.sleep(1000);
				 System.out.println();
				 //this.levelTwo();
				 new Switches().levelTwo();
				// new workFlow().Execution();
			 }
			switch(UserSelection2)//Nested Switch case
			{
			case 1://To create file
			{
				File_Operations fo = new File_Operations("Empty");
				fo.createFile();
				System.out.println("New file created");	
				break;
				
			}	
			case 2://To delete file
			{
				File_Operations fo = new File_Operations();
				fo.Delete_file();
				break;
			}
			case 3://To search file
			{
				File_Operations fo = new File_Operations();
				fo.Search_File();
				
				 
				break;
			}
			case 4://To Navigate mainmenu
			{
				new workFlow().Execution();
				break;
				
			}
		}
		
		
		
	}
	
}

	
	

