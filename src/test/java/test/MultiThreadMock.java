package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiThreadMock {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		for(int i = 1; i <= 10; i ++)
		{
			MultiMockThread mock = new MultiMockThread(ctx);
			mock.start();
		}
	}

}
