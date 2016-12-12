package rpc;

import com.bucuoa.west.rpc.remoting.client.*;
import com.bucuoa.west.rpc.service.EchoService;
import com.bucuoa.west.rpc.utils.SpringContextUtil;

public class ClientStartUp {
	public static void main(String[] args) {
		
		Client client = new Client("127.0.0.1", 14527);

		EchoService echoService = ClientRemoteCall.getProxy(EchoService.class,client);

		System.out.println(echoService.echo("hello,hello"));
		System.out.println(echoService.echo("hellow,rod 1"));
		System.out.println(echoService.echo("hellow,rod 2"));
		System.out.println(echoService.echo("hellow,rod 3"));
		System.out.println(echoService.echo("hellow,rod 3"));
		System.out.println(echoService.echo("hellow,rod 4"));
		
//		EchoService bean = (EchoService)SpringContextUtil.getBean("echoService");
		
//		System.out.println("bean utils==>"+bean.echo("hello,hello"));
	}
}
