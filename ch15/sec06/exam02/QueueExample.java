package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSms","신용권"));
		messageQueue.offer(new Message("sendkakaotolk","김자바"));
	
		while(!messageQueue.isEmpty()) {
			Message message=messageQueue.poll();
			
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"님에게 메일을보냅니다");
				break;
			case "sendSms":
				System.out.println(message.to+"님에게 SMS을보냅니다");
				break;
			case "sendkakaotolk":
				System.out.println(message.to+"님에게 카카오톡을보냅니다");
				break;
			}
		}
	}

}
