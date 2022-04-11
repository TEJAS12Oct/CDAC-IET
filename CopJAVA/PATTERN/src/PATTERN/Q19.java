package PATTERN;

public class Q19 {

	public static void main(String[] args) {

		int i, j;
		char ch;
		for (ch = 'A'; ch <= 'E'; ch++) {
			for (i = 0; i < 5; i++) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (ch = 'A'; ch <= 'E'; ch++) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (ch = 'E'; ch >= 'A'; ch--) {
			for (i = 0; i < 5; i++) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (ch = 'E'; ch >= 'A'; ch--) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		ch = 'A';
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		ch = 'A';
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			ch--;
			ch--;
			ch--;
			ch--;
			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print((char) (i + j + 65));
				System.out.print(" ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print((i + 1) + " ");
			}

			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print((j + 1) + " ");
			}

			System.out.println();

		}
	}

}

/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 


A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 


E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 


E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 


A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 


A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 


A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 


* 
* * 
* * * 
* * * * 
* * * * * 


1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 


1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/