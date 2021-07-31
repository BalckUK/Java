package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {

		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);

		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� ��...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ����ϴ�");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.print("������>> ");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
