package Q3;

import java.util.Scanner;

public class Main {

	static Message[] arr = new Message[5];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		arr[0] = new Message("Tejas", "Pankaj", "Have A Good Day !!!",
				(new Address("Chandani Chauk", "Kolhapur", "Maharashtra", "India", 422010)));

		arr[1] = new Message("Mayur", "Akshay", "You Only Live Once !!!",
				(new Address("Chandani Chauk", "Pune", "Maharashtra", "India", 123456)));

		arr[2] = new Message("Pankaj", "Atharv", "Believe in Yourself !!!",
				(new Address("Chandani Chauk", "Nagpur", "Maharashtra", "India", 122021)));

		arr[3] = new Message("Ruchita", "Tejas", "Be Positive !!!",
				(new Address("Chandani Chauk", "Nashik", "Maharashtra", "India", 225533)));

		arr[4] = new Message("Atharv", "Ruchita", "Have A Great  Saturday !!!",
				(new Address("Chandani Chauk", "Pune", "Maharashtra", "India", 423651)));

		System.out.println("Enter City Name : ");
		String City = sc.next();
//		System.out.println("Enter Index");
//		int Index = sc.nextInt();

//		System.out.println();
//			System.out.println(arr[0].Message);
//		}

		for (int i = 0; i < arr.length; i++) {
			
			if (City.equals(arr[i].ReceiverAddress.City)) {
				System.out.println(arr[i].Message);
			}
		}

	}

}
