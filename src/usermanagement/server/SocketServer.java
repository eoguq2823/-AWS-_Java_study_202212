package usermanagement.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import usermanagement.dto.RequestDto;
import usermanagement.dto.ResponseDto;
import usermanagement.entity.User;
import usermanagement.server.controller.AccountController;

public class SocketServer extends Thread {
	
	private static List<SocketServer> socketServerList = new ArrayList<>();

	//멤버변수
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private Gson gson;
	
	public SocketServer(Socket socket) {
		this.socket = socket;
		gson = new Gson();
		socketServerList.add(this);
	}
	@Override
	public void run() {
		try {
			reciveRequest();
			
		} catch (IOException e) {
			System.out.println(socket.getInetAddress() + ": " + socket.getPort() + "클라이언트의 접속이 끊어졌습니다.");
		}
	}
	
	private void reciveRequest() throws IOException {
		inputStream = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		
		while(true) {
			String request = reader.readLine();
			if(request == null) {
				throw new ConnectException(); //예외강제호출
			}
			
			RequestMapping(request);
		}
	}
	private void RequestMapping(String request) throws IOException {
		RequestDto<?> requestDto = gson.fromJson(request, RequestDto.class);
		String resource = requestDto.getResource();
		switch (resource) {
			case "register":
				ResponseDto<?> responseDto = AccountController.getInstance().register((String)requestDto.getBody());
				sendResponse(responseDto);
//				User user = gson.fromJson((String)requestDto.getBody(), User.class);
//				requestDto.getBody(); //바디에 데이터 리소스에 ??
//				outputStream = socket.getOutputStream();
//				PrintWriter writer = new PrintWriter(outputStream, true);
//				ResponseDto<String> responseDto = new ResponseDto<String>("ok", "회원가입 성공");
//				writer.println(gson.toJson(responseDto));
//				writer.flush(); //버퍼를 싹다 지워준다 필수
				
				break;
			default:
				System.out.println("해당 요청은 처리할 수 없습니다.(404)");
				break;
		}
	}
	
	private void sendResponse(ResponseDto<?> responseDto) throws IOException {
		String respons = gson.toJson(responseDto);
		outputStream = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(outputStream, true);
		writer.println(respons);
		writer.flush();
		
	}
	
	
}
