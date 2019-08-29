package _01_Bit_Shifting;

import java.util.ArrayList;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println("num shifted in decimal: " + numShifted);
		System.out.println("num shifted in binary: " + binary(17));
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		System.out.println("test " + (num >> 3));
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	static String binary(int _decimal)
	{
		int decimal = _decimal;
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
		return s.toString();
	}
}
