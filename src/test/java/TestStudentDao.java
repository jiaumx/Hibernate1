import com.mqc.dao.StudentDao;
import com.mqc.dao.StudentDaoImpl;
import com.mqc.po.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestStudentDao {
    @org.junit.Test
    public void test() {
        StudentDao sd=new StudentDaoImpl();
        List<Student> students=((StudentDaoImpl) sd).findQueryAll();
            for (Student student:students) {
                System.out.println("student="+student);

        }
    }
}