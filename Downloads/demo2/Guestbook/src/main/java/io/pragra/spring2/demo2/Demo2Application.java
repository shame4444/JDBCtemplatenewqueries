package io.pragra.spring2.demo2;

import io.pragra.spring2.demo2.Domain.Guest;
import io.pragra.spring2.demo2.Service.GuestBookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("app-Content.xml");
		Guest bean1 = context1.getBean("guest",Guest.class);

		GuestBookService bean = (GuestBookService) context1.getBean("guestBookService");
		bean.addGuest(bean1);
		bean.showGuest();


	}

}
