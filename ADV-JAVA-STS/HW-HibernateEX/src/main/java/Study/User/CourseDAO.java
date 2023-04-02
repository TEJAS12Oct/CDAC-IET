package Study.User;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import Study.Entity.CourseEntity;

public class CourseDAO {

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

	public static void AddCourse(Session session, int id, String name, String desc, int duration, String fName) {
		CourseEntity obj = new CourseEntity(id, name, desc, duration, fName);
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();

	}

	public static void UpdateCourseFaculty(Session session, int id, String Name, String FName) {
		Transaction tx = session.beginTransaction();
		CourseEntity dbrow = session.get(CourseEntity.class, id);
		dbrow.setCourseName(Name);
		dbrow.setFacultyName(FName);
		tx.commit();

	}

	public static void DeleteCourse(Session session, int id) {
		Transaction tx = session.beginTransaction();
		CourseEntity dbrow = session.get(CourseEntity.class, id);
		session.delete(dbrow);
		tx.commit();

	}

	public static void ShowCourse(Session session, int id) {

		Query<CourseEntity> q = session.createQuery("from Study.Entity.CourseEntity ");
		q.list().stream().forEach((row) -> {
			if (row.getID() == id) {
				System.out.println(row);
			}
		});

	}

	public static void ShowAllCourse(Session session) {
		Query<CourseEntity> q = session.createQuery("from Study.Entity.CourseEntity ");
		q.list().stream().forEach((row) -> {
			System.out.println(row);

		});
	}

}
