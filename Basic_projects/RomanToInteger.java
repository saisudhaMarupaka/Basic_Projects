package akhila;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
public static int toInteger(String str) 
{
if(str==null||str.length()==0)
{
	return 0;
}
Map<Character,Integer> roman=new HashMap<Character,Integer>();
roman.put('I', 1);
roman.put('V', 5);
roman.put('X', 10);
roman.put('L', 50);
roman.put('C', 100);
roman.put('D', 500);
roman.put('M', 1000);
int result=0;
for(int i=0;i<str.length()-1;i++)
{
	if(roman.get(str.charAt(i))>=roman.get(str.charAt(i+1)))
	{
		result=result+roman.get(str.charAt(i));
	}
	else
	{
		result=result-roman.get(str.charAt(i));
	}
}
result=result+roman.get(str.charAt(str.length()-1));
return result;
}
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Roman Number ");
	String str=sc.next();
//	String str="XV";
	int result=RomanToInteger.toInteger(str);
	System.out.println(result);

}
}
