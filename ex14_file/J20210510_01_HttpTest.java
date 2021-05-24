package ex14_file;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class J20210510_01_HttpTest {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		//http 웹 커넥션 생성 및 읽어오기
		
		//파싱
		String target = "https://finance.naver.com/item/board.nhn?code=068270";
		//10초마다 한번씩 네이버 이쓔를 파일로 저장하기
		// Thread.sleep(10000)
		//파일이름은 네이버시간
		//
		while(true) {
			HttpURLConnection con 
				= (HttpURLConnection)new URL(target).openConnection();
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
			FileWriter fw = null; 
			String temp; 

			while ((temp = br.readLine())!= null) {
				System.out.println(temp);
				if (temp.contains("title elss")) {
					System.out.println(temp);
//				String year = temp.substring(0,4);
//				System.out.println(year +"년");
//					fw = new FileWriter(temp + ".txt");
				}
			}
			//fw.close();
			br.close();
			con.disconnect();
			
			Thread.sleep(10000); //10초에 한번씩
		}

	}

}
