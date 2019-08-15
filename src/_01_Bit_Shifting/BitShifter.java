package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println("num shifted in decimal: " + numShifted);
		System.out.println("num shifted in binary: " + binary(numShifted));
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	static int binary(int _decimal)
	{
		int decimal = _decimal;
		String result = "";
		boolean bool = true;
		while(bool)
		{
			result += decimal % 2;
			decimal = decimal/2;
			if(decimal == 0 || decimal == 1)
				bool = false;
		}
		return Integer.parseInt(result);
	}
}
