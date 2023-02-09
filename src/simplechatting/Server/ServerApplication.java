package simplechatting.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("서버실행");
			
//			while(true) { 
			Socket socket = serverSocket.accept(); //클라이언트 접속을 기다리는 녀석
				
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);
			out.println("join");
				
			InputStream inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
//			System.out.println(socket.getInetAddress() + "클라이언트가 연결되었습니다.");
//			}
			
			String weclomeMessage = in.readLine();
			System.out.println(weclomeMessage); //서버에서 보는 웰컴메세지
			out.println(weclomeMessage); //클라이언트한테 다시 돌려주는 웰컴메세지
			
			while(true) {
				in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if(serverSocket != null) {
				try {
					serverSocket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("서버종료");
		}
		
	}
}
