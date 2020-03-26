package com.base.socket;

import java.io.*;
import java.net.Socket;

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
public class MessageHandle extends Thread {
	Socket socket;

	public MessageHandle(Socket server) {
		this.socket = server;
	}

	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

			String msg = null;
			while (true) {
				if ((msg = bufferedReader.readLine()) == null) {
					break;
				}
				System.out.println(msg);
				printWriter.write("get msg:" + msg);
				printWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				assert bufferedReader != null;
				bufferedReader.close();
				assert printWriter != null;
				printWriter.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
