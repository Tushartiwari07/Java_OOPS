package com.oops.constructor;


public class CalcusingArray
{
public static void add(int[] a)
{
	int sum = 0;
	for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
public static void add(double[]b)
{
	double  sum =0;
	for (int i=0;i<=b.length-1;i++)
	{
		sum = sum+b[i];
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	int[]a1={2,4,16,591};
	add(a1);
	int[]a2={24,16,22,28,31,29};
	add(a2);
	double[]b1= {16.24,9.6,9.46,94.15};
	add(b1);
  }
}
