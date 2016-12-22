package rpc;

import com.bucuoa.west.rpc.remoting.client.netty.RpcProxy;
import com.bucuoa.west.rpc.service.EchoService;


public class ClientStartUp {
	public static void main(String[] args) {
		
		String host = "127.0.0.1:14527";
//		Client client = new Client(host, 14527);

		EchoService echoService = new RpcProxy(host).create(EchoService.class);//.getProxy(EchoService.class,client);

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
