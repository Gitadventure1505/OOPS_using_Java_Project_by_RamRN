package Ram_Cohort1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Start 
{
	
	Start()
	{
		System.out.println("*****************");
		System.out.println("Developer Name : Ramkumar Nagarajan");
		System.out.println("Designation  :  Java Developer");
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println("*****************");
		System.out.println();
		System.out.println();	
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		  new Start();
		  new workFlow().Execution();
		  	
	}
	


}
