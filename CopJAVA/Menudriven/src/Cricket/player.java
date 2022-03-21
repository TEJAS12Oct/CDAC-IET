package Cricket;

public class player {

	private String name;
	private String type;
	private int typeData;
	private int numberOfInnsPlayed;

	public player(String name, String type, int typeData) {
		this.name = name;
		this.type = type;
		this.typeData = typeData;
		this.numberOfInnsPlayed = 0;

	}

	public int getRuns() {
		if (this.type.equals("Bat"))
			return typeData;
		else
			return 0;
	}

	public String toString() {
		String str = "Name : " + this.name + " ," + this.type + " , " + this.typeData + " , "
				+ "Number OF inns Played = " + this.numberOfInnsPlayed;
		return str;
	}

	public void NumberOfInnsPlayed(int x) {
		this.numberOfInnsPlayed = x;
	}

	public int getAvgWicketPerInnn() {
		if (this.type.equals("BAll")) {
			return (this.typeData / this.numberOfInnsPlayed);
		} else
			return 0;

	}

}
