import com.kuang.di.student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        student Student = (student) context.getBean("student");
        System.out.println(Student);
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user==user2);
    }
}
