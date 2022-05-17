package Q4;

public class Main {

	public static void main(String[] args) {
		// Every player has name, total_runs and role attributes
		Player dhoni = new Player("Dhoni", 10324, "Witcket-Keeper");
		Player virat = new Player("Virat", 9236, "Batsman");

		// If below line un-commented, it should be compile time error
		// Player p3 = new Player();

		if (dhoni.getTotalRuns() > virat.getTotalRuns())
			System.out.println(dhoni);
		else
			System.out.println(virat);
		
		
	}
	
	
}
