package Cricket;

public class Main {

	public static void main(String[] args) {
		player virat = new player("Virat", "Bat", 4000);
		player dhoni = new player("Dhoni", "Bat", 5000);

		player ashwin = new player("Ashwin", "Ball", 450);
		player bumrah = new player("bumrah", "Ball", 300);

		//player xyz = new player();

		if (virat.getRuns() < dhoni.getRuns())
			System.out.println(dhoni);
		else
			System.out.println(virat);

		ashwin.NumberOfInnsPlayed(76);
		bumrah.NumberOfInnsPlayed(45);

		if (ashwin.getAvgWicketPerInnn() >= bumrah.getAvgWicketPerInnn())
			System.out.println(ashwin);
		else
			System.out.println(bumrah);
	}

}
