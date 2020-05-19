package com.infy.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infy.model.Room;

public class TestMessaging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		Room room = (Room) context.getBean("room");
		
		System.out.println(room.getRoomNumber());
		System.out.println(room.getAllotedTo());
		
		
		

	}

}
