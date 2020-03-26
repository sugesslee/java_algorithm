package com.base.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/17     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/17 11:03 AM
 * @since 1.0.0
 */
public class TCPSocketClient {

	public static void main(String[] args) throws IOException {
		Socket socketClient = new Socket("127.0.0.1", 8080);
		BufferedReader bufferedReader;
		PrintWriter printWriter;
		bufferedReader = new BufferedReader(
				new InputStreamReader(socketClient.getInputStream(), StandardCharsets.UTF_8));
		printWriter = new PrintWriter(socketClient.getOutputStream(), true);

		Scanner in = new Scanner(System.in);
		String s;
		try {
			while (true) {
				s = in.next();
				if (s.equals("exit")) {
					break;
				}
				printWriter.println(s);
				printWriter.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			socketClient.close();
			bufferedReader.close();
			printWriter.close();
			in.close();
		}
	}
}
