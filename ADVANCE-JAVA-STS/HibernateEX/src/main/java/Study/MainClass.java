package Study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;
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
		insertEx();
//		updateEx();
//		DeletetEx();
//		selectEx();

	}

	public static void insertEx() {
		// TRANSIENT STATE
		StudentEntity obj = new StudentEntity(1, 49, "Tejas", "Jawale");
//		obj.setFirstName("Tushar"); // this is not in sync obj state in table
		Transaction tx = session.beginTransaction();
		session.save(obj);
		// NOW THE OBJECT IN PERSISTENT STATE
		tx.commit();
	}

	public static void updateEx() {
		Transaction tx = session.beginTransaction();

		// dbrow is in Persistant State
		StudentEntity dbrow = session.get(StudentEntity.class, 1);
		dbrow.setRollNumber(93);// the new object state is set in table

		session.evict(dbrow); // the dbrow is not sync with DB
		dbrow.setRollNumber(350); // not updated in DB => dbrow is detached
		session.saveOrUpdate(dbrow); // persistant state

		tx.commit();
	}

	public static void DeletetEx() {
		Transaction tx = session.beginTransaction();
		StudentEntity dbrow = session.get(StudentEntity.class, 1); // persistent state
		session.delete(dbrow); // removed
		// if i call dbrow setter here it will not sync with DB
		tx.commit();
	}

	public static void selectEx() {
		// WE ARE FIRING HQL = Hibernate Query Language

		// Query<StudentEntity> q = session.createQuery("from
		// Study.Entity.StudentEntity");
//		q.list().stream().forEach((row) -> {
//			System.out.println(row);
//		});

//		Query<StudentEntity> q = session.createQuery("from Study.Entity.StudentEntity s where s.rollNumber > :roll");
//		q.setParameter("roll", 70); // g8ter than 70 Roll No Display 
//		
//	//	NativeQuery<StudentEntity> nq = session.createSQLQuery(null);
//		
//		q.list().stream().forEach((row) -> {
//			System.out.println(row);
//		});

		Query<Object[]> q = session.createQuery(
				"select  s.firstName , s.lastName from  Study.Entity.StudentEntity s where s.rollNumber > :roll");
		q.setParameter("roll", 70); // g8ter than 70 Roll No Display

		q.list().stream().forEach((row) -> {
			System.out.println(row[0] + " " + row[1]);
		});
	}

}
