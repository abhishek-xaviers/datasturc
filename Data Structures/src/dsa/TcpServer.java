package dsa;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class TcpServer {
	
	

	public static void main(String[] args) {
		

		try {

			
			ServerSocket ss = new ServerSocket(8001);
			System.out.println("Server Started!!");

			
			Socket s = ss.accept();

			DataInputStream in = new DataInputStream(s.getInputStream());

			DataOutputStream out = new DataOutputStream(s.getOutputStream());

			
			
			String day = "monday";
			
			switch (day) {
			case "monday": 
				out.writeUTF("woo It's Monday!!");
			break;
			
			case "tuesday": 
				out.writeUTF("yay It's Tuesday!!");
			break;
			
			case "wednesday": 
				out.writeUTF("woo It's Wednesday!!");
			break;
			
			case "thursday": 
				out.writeUTF("yay It's Thursday!!");
			break;
			
			case "friday": 
				out.writeUTF("woo It's Friday!!");
			break;
			
			case "saturday": 
				out.writeUTF("Yay It's Saturday!!");
			break;
			
			default:
				out.writeUTF("Wrong Input");
			}
	
			

		} catch (Exception e) {
			e.getMessage();
		}

	}

}

