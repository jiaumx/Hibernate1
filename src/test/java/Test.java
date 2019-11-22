import com.mqc.po.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction tx;
    @org.junit.Before
    public  void before(){
      Configuration configure=new Configuration().configure();
      sessionFactory=configure.buildSessionFactory();
      session=sessionFactory.openSession();
      tx=session.beginTransaction();
    }


    @org.junit.Test
    public void test() {
        Student student = session.get(Student.class, 1);
        System.out.println("student="+student);
    }
    @org.junit.Test
    public void insert() {
    Student student=new Student();
    student.setName("王六");
    session.save(student);
    }
    @org.junit.Test
    public void delete() {
        Student stu=session.get(Student.class,7);
        if (stu!=null){
            session.delete(stu);
        }

    }
    @org.junit.Test
    public void update() {
      Student stu=new Student();
      stu.setId(8);
      stu.setName("李四");
      session.update(stu);
    }
    @org.junit.Test
    public void SaveOrUpdate() {
        Student stu=new Student();
        stu.setId(11);
        stu.setName("小王");
        session.saveOrUpdate(stu);
    }
    @org.junit.After
    public void after(){
        tx.commit();
        session.close();
        sessionFactory.close();
    }

}