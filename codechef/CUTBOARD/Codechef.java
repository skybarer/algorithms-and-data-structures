/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int lenght = sc.nextInt();

		System.out.println();

		for(int i = 0; i < lenght; i++){
			
			int n = sc.nextInt();
			int m = sc.nextInt();

			System.out.println( (n-1)*(m-1) );
		}
	}
}