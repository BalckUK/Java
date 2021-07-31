package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("보내기>> ");
				String outputMessage = scanner.nextLine();
				System.out.println(outputMessage);
				if(outputMessage.equals("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.print("서버 : "+ inputMessage+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
