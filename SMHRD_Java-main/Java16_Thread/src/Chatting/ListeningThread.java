package Chatting;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListeningThread extends Thread{
   
   Socket socket = null; //소켓 정보 저장 필드   
   
   public ListeningThread(Socket socket) {
      this.socket = socket;
      
   }
   
   public void run() {
      //서버에서 보낸 메세지를 클라이언트로 가지고 오는 작업
      
      
      try {
         InputStream in = socket.getInputStream();
         BufferedReader reader = new BufferedReader(new InputStreamReader(in));
         
         while(true) { //읽는 작업을 무한반복
            System.out.println(reader.readLine());
            
            
         }
         
      } catch (Exception e) {
      
         e.printStackTrace();
      }
      
   }

}