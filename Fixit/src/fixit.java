//Fix it!

import java.util.Scanner;

public class fixit 
{	
	void vow(String str)
		{
			char val;
				for(int j=0;j<str.length();j++)
				{
					val=str.charAt(j);	
					if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u'||val=='A'||val=='E'||val=='I'||val=='O'||val=='U')
					{
						System.out.println(val); 		 
					}
				}
		}
public static void main(String[ ] arg)
	{
		valinstring c=new valinstring();
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		s=sc.nextLine();	
		System.out.println("Vowels in a string are :"); 	
		c.vowels(s);	
	}
}
