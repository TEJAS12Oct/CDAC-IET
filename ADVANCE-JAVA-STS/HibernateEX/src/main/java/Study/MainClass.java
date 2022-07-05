package Study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import Study.Entity.StudentEntity;

public class MainClass {
	static Session session = null;

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

//		insertEx();
//		updateEx();
//		DeletetEx();
		selectEx();

	}

	public static void insertEx() {
		StudentEntity obj = new StudentEntity(3, 69, "Pankaj", "Desai");

		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
	}

	public static void updateEx() {
		Transaction tx = session.beginTransaction();
		StudentEntity dbrow = session.get(StudentEntity.class, 1);
		dbrow.setRollNumber(93);
		tx.commit();
	}

	public static void DeletetEx() {
		Transaction tx = session.beginTransaction();
		StudentEntity dbrow = session.get(StudentEntity.class, 1);
		session.delete(dbrow);
		tx.commit();
	}

	public static void selectEx() {
		// WE ARE FIRING HQL = Hibernate Query Language
		Query<StudentEntity> q = session.createQuery("from Study.Entity.StudentEntity");
		q.list().stream().forEach((row) -> {
			System.out.println(row);
		});
	}

}
