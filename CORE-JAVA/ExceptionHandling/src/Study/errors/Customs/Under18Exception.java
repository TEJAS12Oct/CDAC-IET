package Study.errors.Customs;

public class Under18Exception extends Exception {

	public Under18Exception() {
		super("The Employee Cannot Be Younger Than 18 Years");
	}
}
