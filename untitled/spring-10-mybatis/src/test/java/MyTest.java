import com.kuang.dao.UserMapper;
import com.kuang.dao.UserMapperImpl;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        List<User> userList = userMapper.queryUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        int a=1;
        System.out.println();
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userDao = context.getBean("userDao",UserMapper.class);
        List<User> userList = userDao.queryUsers();
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
