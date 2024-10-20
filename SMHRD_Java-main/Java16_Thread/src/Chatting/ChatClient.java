package Chatting;

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {

	    try {
	         //서버에 접속할 수 있는 소켓 생성
	         Socket socket = new Socket("59.0.129.77",1234);
	         System.out.println("채팅프로그램 서버 접속 성공!");
	         
	         //서버에서 보낸 메세지 읽는 Thread
	         ListeningThread lt = new ListeningThread(socket);
	         //서버로 메세지 보내는 Thread
	         WritingThread wt = new WritingThread(socket);
	         
	         lt.start();
	         wt.start();
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }

	   }

	}
