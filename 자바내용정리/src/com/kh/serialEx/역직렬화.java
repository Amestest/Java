package com.kh.serialEx;

import java.io.*;

public class 역직렬화 {
	public static void main(String[] args) {
		//직렬화된 파일 불러오기
		String 파일이름 = "student.txt";
		
		try {
			
			FileInputStream fis = new FileInputStream(파일이름);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//파일에서 객체를 역직렬화해서 읽어보기
			Student 학생 = (Student) ois.readObject();
			
			System.out.println("파일로부터 객체를 역직렬화했습니다.");
			
			System.out.println("역직렬화된 학생 txt : " + 학생);
		
		} catch (Exception e) {
			
			
			e.printStackTrace();
		
		}
	}
}
