package Collection.HW2;

public class UnAuthorizedExeption extends Exception
{
	public UnAuthorizedExeption() {
		super("Wrong Password");
	}
}
