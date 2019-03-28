package com.example.demo;

import com.example.demo.beans.FirstPrototypeBean;
import com.example.demo.beans.SecondPrototypeBean;
import com.example.demo.beans.SingletonBean;
import com.example.demo.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private AccountService a1;

	@Autowired
	private AccountService c1;

	@Test
	public void testCreateNewInstanceOfPrototypeWhenGottenSingleton() {
		SingletonBean firstInstance = context.getBean(SingletonBean.class);
		SingletonBean secondInstance = context.getBean(SingletonBean.class);

		FirstPrototypeBean firstPrototypeBean = firstInstance.getFirstPrototypeBean();
		FirstPrototypeBean firstPrototypeBean2 = secondInstance.getFirstPrototypeBean();

		assertNotEquals(firstPrototypeBean2, firstPrototypeBean);
	}

	@Test
	public void testLoadingPrototypeWithInnerPrototypeBean() {
		FirstPrototypeBean firstInstance = context.getBean(FirstPrototypeBean.class);

		SecondPrototypeBean secondPrototypeBean1 = firstInstance.getSecondPrototypeBean();
		SecondPrototypeBean secondPrototypeBean2 = firstInstance.getSecondPrototypeBean();

		assertNotEquals(secondPrototypeBean1, secondPrototypeBean2);
	}

	@Test
	public void testAutowiredByName() {
		System.out.println(a1);

		assertEquals("AccountServiceImpl", a1.getClass().getSimpleName());

		System.out.println(c1);

		assertEquals("SecondAccountServiceImpl", c1.getClass().getSimpleName());
	}

	//
}
