package cn.mldn.demospring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.demospring.di.vo.Message;

public class TestMessageThreadDemo {
	public static void main(String[] args) {
		// 启动Spring上下文，在以后的实际开发过程之中，这一启动过程会由WEB容器负责
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-di.xml") ;
		for (int x = 0 ; x < 3 ; x ++) {
			new Thread(()->{
				Message msg = ctx.getBean("message",Message.class) ;	// 获得程序类
				System.out.println(Thread.currentThread().getName() + "、msg = " + msg);
			}) .start() ;
		}
		ctx.registerShutdownHook(); // 触发销毁方法
	}
}