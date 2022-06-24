package Ram_Cohort1;


import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createFile 
{

		FileWriter FW;
		createFile(String filePath) throws IOException
		{
					
					FW = new FileWriter(filePath);
					FW.write("Hi this is test file");
					FW.close();
					System.out.println("New file created");
					
			
			
			
		}

}
