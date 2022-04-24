package Q2;

public class StringOpr {

	public static void length(String name)
	{
		System.out.println("String Length: "+name.length());
	}
	public static void subString(String name)
	{
			System.out.println("Substring: "+name.substring(2));
			System.out.println("Substring with End index: "+name.substring(2, 5));
	}
	public static void palindrome(String name)
	{
		StringBuffer str=new StringBuffer();
		StringBuffer str1=new StringBuffer(name);
		int j=0;
		char ch;
		for(int i=name.length()-1;i>=0;i--)
		{
			j=0;
			str.append(name.charAt(i));
		}
		System.out.println("STRING: "+str);
		
		if(name.equalsIgnoreCase(str.toString()))
		{
			System.out.println("Plaindrome string \n ");
		}
		else
		{
			System.out.println("Not a palindrome string \n");
		}

	}
	public static void count(String name)
	{
		char ch;
		int nc=0,vc=0,wsc=0;
		StringBuffer st=new StringBuffer(name);
		for(int i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			if(Character.isWhitespace(ch))
			{
				wsc++;
			} 
			if(ch>=48 && ch<=57)
			{
				nc++;
			}
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vc++;
			}
		}
		System.out.println(" White Space Count : "+wsc+", No of Digits Count : "+nc +", Vowels Count : "+vc);
	}
	
}
