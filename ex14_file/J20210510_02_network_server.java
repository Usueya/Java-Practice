package ex14_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

class Server{
	private int port = 33333;
	void start() {
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader br = null;
		try {
			server = new ServerSocket(port);
			//port number : server에 접속하기위한 유일한 번호
			System.out.println("서버시작");
			while(true) { //Client 요청까지 대기
				System.out.println("client대기중...");
				socket = server.accept(); //Client 요청시 허용
				System.out.println("Server: Client 접속성공");
				//socket -> 데이터를 주고 받을 수 있는 stream 생성
				br = new BufferedReader( //라인별 읽기
						new InputStreamReader(
								socket.getInputStream()));
				while(true) {
					String data = br.readLine();
					if(data  == null || data.equals("quit")) break;
					System.out.println("받은메세지: "+data);
				}
			}
		}catch (SocketException e) {
			System.out.println("접속종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if (br != null) br.close();
					if (socket != null) socket.close();
					if (server != null) server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

public class J20210510_02_network_server {

	public static void main(String[] args) {		
		Server server = new Server();
		server.start();	

	}

}
