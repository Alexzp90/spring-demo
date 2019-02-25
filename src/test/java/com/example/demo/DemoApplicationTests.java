package com.example.demo;

import com.example.demo.beans.PrototypeBean;
import com.example.demo.beans.SingletonBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	public void contextLoads() {
		SingletonBean firstInstance = context.getBean(SingletonBean.class);
		SingletonBean secondInstance = context.getBean(SingletonBean.class);

		PrototypeBean prototypeBean = firstInstance.getPrototypeBean();
		PrototypeBean prototypeBean2 = secondInstance.getPrototypeBean();

		assertNotEquals(prototypeBean2, prototypeBean);
	}
}
