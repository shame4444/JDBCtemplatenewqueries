package io.pragra.learning.springjdbctemplate.demo;

import io.pragra.learning.springjdbctemplate.demo.dao.UserDAO;
import io.pragra.learning.springjdbctemplate.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
     ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        UserDAO bean = context.getBean(UserDAO.class);
        bean.readAndPrintUser();
        //System.out.println(bean.addUser(new User(4, "krishna", "bhagvan")));
        User user = bean.findUserById(1);
        user.setLastName("raja");
        bean.updateUser(user);
        System.out.println(user);
    }

}
