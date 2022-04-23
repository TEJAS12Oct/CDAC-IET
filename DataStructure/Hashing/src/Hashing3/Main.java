package Hashing3;
public class Main {

	public static void main(String [] args)
	{
		Hash h1=new Hash(10);
		
	    h1.insert("AA");    //65*2 =130 rem=0  at 0
		h1.insert("BB");    //66*2 =132 rem=2  at 2
		h1.insert("CC");    //67*2 =134 rem=4  at 4
		h1.insert("DD");    //68*2 =136 rem=6  at 6
		h1.insert("EE");    //69*2 =138 rem=8  at 8
		h1.insert("FF");    //70*2 =140 rem=0  collision at 0  +1 so placed at position 1 
		h1.insert("GG");    //71*2 =142 rem=2  collision at 2  +1 so placed at position 3 
		h1.insert("HH");    //72*2 =144 rem=4  collision at 4  +1 so placed at position 5 
		h1.insert("II");
		h1.insert("JJ");    //10th element
		h1.insert("KK");    // 75*2 =150%10=   0 
//		h1.insert("LL");
		
		
		h1.removeData("AA");
		h1.removeData("ZZ");
		
		System.out.println(h1);
		
		
		
		
		
		
	}
}
