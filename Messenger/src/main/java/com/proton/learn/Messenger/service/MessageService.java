package com.proton.learn.Messenger.service;

import java.util.ArrayList;
import java.util.List;

//import javax.ws.rs.core.GenericEntity;

import com.proton.learn.Messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1L, "Hello World", "Proton");
		Message m2 = new Message(2L, "Hello Jersey", "Proton");
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}

}
