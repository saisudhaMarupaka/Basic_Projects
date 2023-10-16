package akhila;

public class Pangram {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	//ABCDEFGHIJKLMNOPQRSTUVWXYZ
	System.out.println(isPangram(s.toUpperCase()));;
}

private static boolean isPangram(String s) {
	if(s.length()>26)
	{
		return false;
	}
	else
	{
		for(int ch='A';ch<='Z';ch++)
		{
			if(s.indexOf(ch)<0)
			{
				return false;
			}
		}
	}
	
	return true;
}
}
