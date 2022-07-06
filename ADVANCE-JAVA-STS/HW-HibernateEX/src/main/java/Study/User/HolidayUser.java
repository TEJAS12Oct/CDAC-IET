package Study.User;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Date;

public class HolidayUser {

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
			System.out.println("1. Name & Date Holiday");
			System.out.println("2. Show Holiday Name");
			System.out.println("3. Upadte Holiday Name And Date");
			System.out.println("4. Delete Holiday Name");
			System.out.println("Enter Your Choice ");
			Choice = SC.nextInt();

			switch (Choice) {
			case 1: {

				System.out.println("Enter ID ");
				int id = SC.nextInt();

				System.out.println("Enter Holiday Name  ");
				String Name = SC.next();

				System.out.println("Enter Holiday Date ");
				String dt = SC.next();

				java.sql.Date date = Date.valueOf(dt);

				HolidayDAO.Holiday(session, id, Name, date);
				break;
			}

			case 2: {

				HolidayDAO.ShowHoliday(session);
				break;
			}
			case 3: {

				System.out.println("Enter ID ");
				int id = SC.nextInt();
				System.out.println("Enter Holiday Name ");
				String Name = SC.next();
				System.out.println("Enter Holiday Date "); // Date Format => 2022-10-12
				String dt = SC.next();

				java.sql.Date date = Date.valueOf(dt);

				HolidayDAO.UpadteHolidayName(session, id, Name, date);
				break;
			}
			case 4: {

				System.out.println("Enter ID ");
				int id = SC.nextInt();

				HolidayDAO.DeleteHoliday(session, id);
				break;
			}

			default: {
				System.out.println("Invalid Choice...!!!");
			}
			}

		} while (Choice != 0);

	}

}
