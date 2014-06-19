package service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String getMessage(){
		return "Hello, this is message";
	}
}
