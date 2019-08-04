package com.webstudy;

import com.webstudy.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebstudyApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void testIoc(){
		String bean= (String) ioc.getBean("helloWord");
		System.out.println(bean);
	}



}
