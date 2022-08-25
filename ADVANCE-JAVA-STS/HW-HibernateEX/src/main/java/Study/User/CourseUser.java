package Study.User;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CourseUser {

	static Session session = null;
	static int Choice = 0;

	public static void main(String[] args) {

		// WE CONFIGURE THE HIBERNATE ORM
		SessionFactory sessionFactory = null;
		// READ the XML
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata

		// USING XML and Entity CREATE DDL
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory

		// GET THE FACTORY
		sessionFactory = metadata.getSessionFactoryBuilder().build();

		// ACQUIRE THE SESSION (interface between javacode and hibernate
		session = sessionFactory.openSession();

		Scanner SC = new Scanner(System.in);

		do {
			System.out.println("\nCourse Menu ");
			System.out.println("0. Exit");
			System.out.println("1. Add Course");
			System.out.println("2. Update Course And  Faculty");
			System.out.println("3. Delete Course");
			System.out.println("4. Show Specific Course");
			System.out.println("5. Show All Course");
			System.out.println("Enter Your Choice ");
			Choice = SC.nextInt();

			switch (Choice) {
			case 1: {
				System.out.println("Enter ID ");
				int id = SC.nextInt();
				System.out.println("Enter Course Name ");
				String Name = SC.next();
				System.out.println("Enter Course Desciption ");
				String Desc = SC.next();
				System.out.println("Enter Course Duration ");
				int Duration = SC.nextInt();
				System.out.println("Enter Faculty Name ");
				String FName = SC.next();

				CourseDAO.AddCourse(session, id, Name, Desc, Duration, FName);
				break;
			}
			case 2: {
				System.out.println("Enter ID ");
				int id = SC.nextInt();
				System.out.println("Enter Course Name ");
				String Name = SC.next();
				System.out.println("Enter Faculty Name ");
				String FName = SC.next();

				CourseDAO.UpdateCourseFaculty(session, id, Name, FName);
				break;
			}
			case 3: {
				System.out.println("Enter ID ");
				int id = SC.nextInt();

				CourseDAO.DeleteCourse(session, id);
				break;

			}
			case 4: {
				System.out.println("Enter ID ");
				int id = SC.nextInt();

				CourseDAO.ShowCourse(session, id);
				break;
			}
			case 5: {

				CourseDAO.ShowAllCourse(session);
				break;
			}
			default: {
				System.out.println("Invalid Choice...!!!");
			}
			}

		} while (Choice != 0);

	}

}
