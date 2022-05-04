package Q3;

import java.util.Scanner;

public class Main {

	static Message[] arr = new Message[5];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		arr[0] = new Message("Tejas", "Pankaj", "Have A Good Day !!!",
				(new Address("Desai Nagar", "Kolhapur", "Maharashtra", "India", 425387)));

		arr[1] = new Message("Mayur", "Akshay", "You Only Live Once !!!",
				(new Address("Bondre Nagar", "Pune", "Maharashtra", "India", 123456)));

		arr[2] = new Message("Pankaj", "Atharv", "Believe in Yourself !!!",
				(new Address("Girmal Nagar", "Nagpur", "Maharashtra", "India", 122021)));

		arr[3] = new Message("Ruchita", "Tejas", "Be Positive !!!",
				(new Address("Jawale Nagar", "Nashik", "Maharashtra", "India", 422010)));

		arr[4] = new Message("Atharv", "Ruchita", "Have A Great  Saturday !!!",
				(new Address("Patil Nagar", "Jalgoan", "Maharashtra", "India", 423651)));

		System.out.println("Enter City Name : ");
		String City = sc.next();

		for (int i = 0; i < arr.length; i++) {
			
			if (City.equalsIgnoreCase(arr[i].ReceiverAddress.City)) {
				System.out.println("\nSender Name : " + arr[i].SenderName + "\n" + "Recervier Name : "
						+ arr[i].ReceiverName + "\nMessage :" + arr[i].Message + "\nArea : "
						+ arr[i].ReceiverAddress.Area + "\nCity : " + arr[i].ReceiverAddress.City + "\nState : "
						+ arr[i].ReceiverAddress.State + "\nCountry : " + arr[i].ReceiverAddress.Country
						+ "\nPincode : " + arr[i].ReceiverAddress.Pin + "\n");
			}
		}

	}

}
