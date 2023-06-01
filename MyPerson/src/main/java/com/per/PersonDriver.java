package com.per;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) context.getBean("myperson");
		System.out.println(person);
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}

}
