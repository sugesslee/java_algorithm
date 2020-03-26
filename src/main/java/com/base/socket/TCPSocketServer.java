package com.base.socket;


import lombok.extern.slf4j.Slf4j;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
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
@Slf4j
public class TCPSocketServer {
	private static ServerSocket serverSocket = null;
	private static DataInputStream dataInputStream;

	public static void init(int port) throws IOException {
		serverSocket = new ServerSocket(port);
//		serverSocket.setSoTimeout();
	}

	public static void main(String[] args) throws IOException {
		int port = 8080;
		log.info("在{}端口启动Socket服务端，等待连接...", port);
		try {
			init(port);
			while (true) {
				Socket server = serverSocket.accept();
				log.info("接收到连接请求，请求地址为：{}", server.getRemoteSocketAddress());

				new MessageHandle(server).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();
			dataInputStream.close();
		}
	}
}
