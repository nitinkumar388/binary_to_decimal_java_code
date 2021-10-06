// Java program to convert binary to
// decimal when input is represented
// as binary string.
import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;

class binarytodecimal {

	static int binaryToDecimal(String n)
	{
		return Integer.parseInt(n, 2);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		System.out.println(binaryToDecimal(temp));
	}
}
