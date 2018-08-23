import java.io.*;
import java.util.*;

public class Tester 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter string to be encrypted.");
		Scanner kbReader = new Scanner(System.in);
		String str = kbReader.nextLine();
		System.out.println("Your new string is " + Encryption.encrypt(str));
	}
}
