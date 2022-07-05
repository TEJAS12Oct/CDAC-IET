package Study.User;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import Study.Entity.HolidayEntity;

public class HolidayDAO {
	static Session session = null;
	static int Choice = 0;
	static Scanner sc = new Scanner(System.in);

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

	}

	public static void Holiday(Session session, int id, String name, java.sql.Date date) {
		HolidayEntity obj = new HolidayEntity(id, name, date);
		session.save(obj);
		Transaction tx = session.beginTransaction();
		tx.commit();

	}

	public static void ShowHoliday(Session session) {
		Query<HolidayEntity> q = session.createQuery("from Study.Entity.HolidayEntity ");
		q.list().stream().forEach((row) -> {

			System.out.println(row);

		});

	}

	public static void UpadteHolidayName(Session session, int id, String name, java.sql.Date date) {

		Transaction tx = session.beginTransaction();
		HolidayEntity dbrow = session.get(HolidayEntity.class, id);
		dbrow.setNameOfHoliday(name);
		dbrow.setDateInCurrentYear(date);
		tx.commit();
	}

	public static void DeleteHoliday(Session session, int id) {
		Transaction tx = session.beginTransaction();
		HolidayEntity dbrow = session.get(HolidayEntity.class, id);
		session.delete(dbrow);
		tx.commit();

	}

}
