package Ram_Cohort1;

public class InputValueExceeded extends Exception
{

	String message;
	InputValueExceeded(String str)
	{
		this.message = str;
	}

	
	String errorName()
	{
		return message;
	}
}
