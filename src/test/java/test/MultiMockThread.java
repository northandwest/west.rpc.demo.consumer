package test;

import org.springframework.context.ApplicationContext;

public class MultiMockThread extends Thread{
	ApplicationContext ctx ;
	
	public MultiMockThread(ApplicationContext ctx)
	{
		this.ctx = ctx;
	}

	public void run()
	{
		ConsumerStartUp.TestService(this.ctx);
	}

}
