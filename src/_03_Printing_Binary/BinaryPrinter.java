package _03_Printing_Binary;

import java.util.ArrayList;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		printByteBinary((byte) 100);
		printShortBinary((short) 100);
		printLongBinary(100l);
	}
	public static void printByteBinary(byte b) {
		int decimal = b;
		ArrayList<Integer> binary = new ArrayList<Integer>();
		for(int  i = 0; Math.pow(2, i) <= decimal; i++)
		{
			binary.add(0);
		}
		//System.out.println(binary.size());
		for(int i = binary.size() - 1; i >= 0; i--)
		{
			//System.out.println("checking" + i);
			if(Math.pow(2, i) <= decimal)
			{
				binary.set(i, 1);
				//System.out.println("subtracting" + Math.pow(2, i));
				decimal -= Math.pow(2, i);
				//System.out.println();
			}
			else
			{
				binary.set(i, 0);
			}
		}
		StringBuilder s = new StringBuilder("");
		for(int i  = 0; i < binary.size(); i++)
		{
			s.append(binary.get(i));
		}
		s.reverse();
		System.out.println(s.toString());
	}
	
	public static void printShortBinary(short s) {
		int decimal = s;
		ArrayList<Integer> binary = new ArrayList<Integer>();
		for(int  i = 0; Math.pow(2, i) <= decimal; i++)
		{
			binary.add(0);
		}
		System.out.println(binary.size());
		for(int i = binary.size() - 1; i >= 0; i--)
		{
			System.out.println("checking" + i);
			if(Math.pow(2, i) <= decimal)
			{
				binary.set(i, 1);
				System.out.println("subtracting" + Math.pow(2, i));
				decimal -= Math.pow(2, i);
				//System.out.println();
			}
			else
			{
				binary.set(i, 0);
			}
		}
		StringBuilder s1 = new StringBuilder("");
		for(int i  = 0; i < binary.size(); i++)
		{
			s1.append(binary.get(i));
		}
		s1.reverse();
		System.out.println(s1.toString());
	}
	
	public static void printIntBinary(int _i) {
		int decimal = _i;
		ArrayList<Integer> binary = new ArrayList<Integer>();
		for(int  i = 0; Math.pow(2, i) <= decimal; i++)
		{
			binary.add(0);
		}
		System.out.println(binary.size());
		for(int i = binary.size() - 1; i >= 0; i--)
		{
			System.out.println("checking" + i);
			if(Math.pow(2, i) <= decimal)
			{
				binary.set(i, 1);
				System.out.println("subtracting" + Math.pow(2, i));
				decimal -= Math.pow(2, i);
				//System.out.println();
			}
			else
			{
				binary.set(i, 0);
			}
		}
		StringBuilder s = new StringBuilder("");
		for(int i  = 0; i < binary.size(); i++)
		{
			s.append(binary.get(i));
		}
		s.reverse();
		System.out.println(s.toString());
	}
	
	public static void printLongBinary(long l) {
		ArrayList<Integer> binary = new ArrayList<Integer>();
		for(int  i = 0; Math.pow(2, i) <= l; i++)
		{
			binary.add(0);
		}
		System.out.println(binary.size());
		for(int i = binary.size() - 1; i >= 0; i--)
		{
			System.out.println("checking" + i);
			if(Math.pow(2, i) <= l)
			{
				binary.set(i, 1);
				System.out.println("subtracting" + Math.pow(2, i));
				l -= Math.pow(2, i);
				//System.out.println();
			}
			else
			{
				binary.set(i, 0);
			}
		}
		StringBuilder s = new StringBuilder("");
		for(int i  = 0; i < binary.size(); i++)
		{
			s.append(binary.get(i));
		}
		s.reverse();
		System.out.println(s.toString());
	}
}
