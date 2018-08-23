import java.util.*;

public class Encryption 
{
	public static String encrypt(String s)
	{
		Random rd = new Random();
		int n = rd.nextInt(25) + 1;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++)
		{
			c[i] += n;
		}
		return new String(c);
	}
}
