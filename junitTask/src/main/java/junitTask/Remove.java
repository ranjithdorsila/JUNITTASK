package junitTask;

public class Remove {
	
	
	public String removeA(String input) {
		int length=input.length();
		String output="";
			char firstLetter=input.charAt(0);
			char secoundLetter=input.charAt(1);
			if(firstLetter=='A' && secoundLetter=='A' && length==2)
			{
				output+="NULL";
			}
			else if(firstLetter=='A' && secoundLetter=='A')
			{
				output=output+input.substring(2, length);
			}
			else if(firstLetter=='A')
			{
				output=output+input.substring(1, length);
			}
			else if(secoundLetter=='A')
			{
				output=output+firstLetter+input.substring(2, length);
				
			}
			
			else
			{
				output=output+input;
			}
		return output;
	}
	

}
