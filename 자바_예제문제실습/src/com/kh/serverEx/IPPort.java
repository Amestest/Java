package com.kh.serverEx;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 서버 IP가 192.200.3.58 일 때 서버로 연결하는 방법을 수정해서 작성하기 
  
  */
public class IPPort {
	public static void main(String[] args) {
		try {
			
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			System.out.println(serverIP);
									// serverIP = 192.168.0.28 각자 컴퓨터 IP주소
			Socket socket = new Socket(serverIP, 3000);
			System.out.println(socket);
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		
		}
	}
}
