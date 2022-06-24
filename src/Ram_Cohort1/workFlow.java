package Ram_Cohort1;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class workFlow 
{
	
	
	void Mainmenu()
	{
		System.out.println("Press 1 For getting File name’s in ascending order");
		System.out.println("Press 2 For Business level operations");
		System.out.println("Press 3 to close the applications");
		System.out.println();
		
	}
	
	public void Execution() throws IOException
	{
		
		Mainmenu();
		System.out.println();
		System.out.println();
		
		Operations Op = new Operations();
		Op.execute();
	}
	
	
	
	
	
	
}
