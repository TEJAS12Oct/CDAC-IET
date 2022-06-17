package Study.UsingExternalLibrary;

import java.lang.reflect.InvocationTargetException;

import Study.Anonymous.*;
import Study.Reflection.ReflectionEx2;
import Study.Reflection.ReflectionExample;

public class Test {

	public static void main(String[] args) {
		
		User.main(null);
		
		try {
			ReflectionEx2.main(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
