// Java program to convert binary to
// decimal when input is represented
// as binary string.
import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;

class binarytodecimal {

	static int binaryToDecimal(String n)
	{
		String num = n;
		int dec_value = 0;

		int base = 1;

		int len = num.length();
		for (int i = len - 1; i >= 0; i--) {
			if (num.charAt(i) == '1')
				dec_value += base;
			base = base * 2;
		}

		return dec_value;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		System.out.println(binaryToDecimal(temp));
	}
}
