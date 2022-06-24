package Ram_Cohort1;
import java.io.File;
import java.util.ArrayList;

public class Display_File 
{
	String folderPath;
	ArrayList<String> fileNamesAsc = new ArrayList<String>();
	ArrayList<File> fileobj;
	Display_File(String folderPath)
	{
		this.folderPath = folderPath;
		this.fileobj = new ArrayList<File>();
	}
	
	File folder = new File(folderPath);
	File[] AllFiles = folder.listFiles();
	
	
	void List()
	{
		for(File eachFile:AllFiles)
		{
			if(eachFile.isFile())
			{
				System.out.println("File name is"+eachFile.getName());
				fileobj.add(eachFile);
			}
			else if(eachFile.isDirectory())
			{
				System.out.println("Folder name is"+eachFile.getName());
				fileobj.add(eachFile);
			}
		}
	}
	
	
	
	
	
	
}
