import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * Created by saazimi on 05/08/2018.
 */
public class mainn {
    public static void main(String []args){
            Student student = new Student();
            student.setUserName("saazimi");
            student.setNumber(831461324);

            Address home_address = new Address();
            home_address.setStreet("Jey");
            home_address.setState("Tehran");
            home_address.setCity("Tehran");
            home_address.setPincode("1111");

            Address office_address = new Address();
            office_address.setStreet("Atgentina");
            office_address.setState("Tehran");
            office_address.setCity("Tehran");
            office_address.setPincode("2222");
            student.getListofAddresses().add(home_address);
            student.getListofAddresses().add(office_address);


                SessionFactory factory = null;
                Session session = null;

            try {

                factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
                session = factory.openSession();
                session.beginTransaction();
                session.save(student);
                session.getTransaction().commit();
                session.close();
//                factory.close();

            }
            catch (Exception exp){
                System.out.println(exp.toString() + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
                session.close();
//                factory.close();
            }
//            finally {
//                session.close();
//                factory.close();
//            }
    }
}
