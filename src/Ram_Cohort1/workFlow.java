package Ram_Cohort1;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class workFlow 
{
	
	
	void Mainmenu() throws InterruptedException
	{
		Thread.sleep(500);
		System.out.println("Press 1 For getting File names in ascending order");
		System.out.println("Press 2 For Business level operations");
		System.out.println("Press 3 to close the applications");
		System.out.println();
		
	}
	
	public void Execution() throws IOException, InterruptedException
	{
		
		Mainmenu();
		System.out.println();
		System.out.println();
		
		Switches sw = new Switches();
		//sw.userInput();
		sw.levelOne();
	}
	
	
	
	
	
	
}
