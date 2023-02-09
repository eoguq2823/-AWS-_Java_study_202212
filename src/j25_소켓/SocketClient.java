package j25_소켓;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;

import usermanagement.dto.RequestDto;

public class SocketClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9090); // (ip ,포트)
			System.out.println("서버에 접속 성공");
			
			InputStream inputStream = socket.getInputStream();
			InputStreamReader stramReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(stramReader);
			
			System.out.println(reader.readLine());
			
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			Gson gson = new Gson();
			RequestDto<String> dto = new RequestDto<String>("test", "테스트 데이터");
					
			printWriter.println(gson.toJson(dto));
			
		} catch (UnknownHostException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
