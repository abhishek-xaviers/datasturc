package dsa;



import java.io.*;
import java.net.*;

public class TcpClient {

	public static void main(String[] args) {
		try {

			
			Socket s = new Socket("LocalHost", 8001);

			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter day: ");
			String a = br.readLine();

			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			out.writeChars(a);

			
			DataInputStream in = new DataInputStream(s.getInputStream());
			System.out.println(in.readUTF());

			
			s.close();

		} catch (Exception e) {
			e.getMessage();
		}

	}

}

