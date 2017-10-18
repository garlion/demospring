package cn.mldn.demospring.ioc.service.impl;

import cn.mldn.demospring.ioc.service.IMessage;

public class MessageImpl implements IMessage {

	@Override
	public String echo(String msg) {
		return "【ECHO】" + msg ; 
	}

}