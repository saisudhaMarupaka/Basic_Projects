package akhila;

import java.util.Random;

public class ArrayShuffle 
{
public static void main(String[] args)
	{
	
int a[]= {1,2,3,4,5,6,7};
Random r=new Random();
for(int i=0;i<=a.length-1;i++)
{
	int random=r.nextInt(a.length);	
	int temp=a[i];
	a[i]=a[random];
	a[random]=temp;
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
}
}


