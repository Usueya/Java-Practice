package ex14_file;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*  Client < -----Socket----- > Server
 *  요청                        응답
 *                              port_number: 33333
 *               <랜선>         Lan_card_ip_number
 * 
 */

class Client{
	private String ip = "127.0.0.1";
	private int port = 33333;
	void start() {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		//PrintWriter:
		PrintWriter pw = null;
		//Client에서 접속할 서버의 ip, port필요
		try {
			socket = new Socket(ip,port);
			System.out.println("Client: 서버에 접속");
			pw = new PrintWriter(socket.getOutputStream(),true);
			while(true){
				System.out.print("메세지: ");
				String data = sc.nextLine();
				pw.println(data);
				if(data.equals("quit")) {
					System.out.println("대화종료");
					break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pw != null) pw.close();
					if(socket !=null) socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

public class J20210510_03_network_client {

	public static void main(String[] args) {
		Client client = new Client();
		client.start();

	}

}
