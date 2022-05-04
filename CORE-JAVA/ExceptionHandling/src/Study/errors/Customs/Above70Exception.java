package Study.errors.Customs;

public class Above70Exception extends RuntimeException {

	public Above70Exception() {
		super("The Employee Cannot Be Older Than 70 Years");
	}

}
