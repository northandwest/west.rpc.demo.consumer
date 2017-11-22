package test;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bucuoa.west.rpc.service.EchoService;

public class MultiThreadClientStartUp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println("consumer is started");

		final EchoService taskService = (EchoService) ctx.getBean("echoService_task");

		//∂‡œﬂ≥Ã
		for(int i = 0;i < 10; i ++)
		{
			 new Thread(new Runnable() {
	             
		            @Override  
		            public void run() {  
		                while(true){  
		                    try {  
		                        System.out.println("--runnable->"+Thread.currentThread().getName());  
		                        int nextInt = new Random().nextInt(2000);
		        				Thread.sleep(nextInt);
		        				System.out.println(Thread.currentThread().getName()+":"+taskService.echo("Hi server,excute task: sleep "+nextInt+"ms"));
		                    } catch (InterruptedException e) {  
		                        e.printStackTrace();  
		                    }  
		                }  
		            }  
		        }).start();
		}
		
//		LockSupport.park();
	}
}
