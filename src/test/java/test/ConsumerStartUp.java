package test;

import java.util.concurrent.locks.LockSupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bucuoa.west.rpc.service.EchoService;
import com.bucuoa.west.rpc.tags.Consumer;

public class ConsumerStartUp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		TestService(ctx);
		
		System.out.println("consumer is started");

//		LockSupport.park();
	}

	public static void TestService(ApplicationContext ctx) {
		for(int i = 1 ; i<=12; i ++)
		{
			EchoService service = (EchoService) ctx.getBean("echoService"+i);
			System.out.println(Thread.currentThread().getName()+":"+service.echo("hah my first rpc!"+i));
		}
//		EchoService service2 = (EchoService) ctx.getBean("echoService2");
//		System.out.println(service2.echo("hah my second rpc!"));
//		
//		
//		EchoService service3 = (EchoService) ctx.getBean("echoService3");
//		System.out.println(service3.echo("hah my third rpc!"));
	}
}
