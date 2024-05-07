package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalMain {
	//fileSave
	//전달받은 동물을 파일에 전달하고 저장하는 코드 작성
	public void fileSave(String 파일이름) {
		
		File file = new File(파일이름);
	
		
		try {
			//파일을 연결하고 글을 작성하는 write 생성
			FileWriter fw = new FileWriter(file);
			//파일에 문자열을 작성할 수 있으면서 출력까지 도와주는 Buffered writer 사용
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Animal 객체 생성 글작성해서 저장
			Animal 동물 = new Animal("멧돼지",3);
			//toString으로 출력되는 내용을 저장
			bw.write(동물.toString());
			bw.close();
			System.out.println("파일이 성공적으로 저장되었습니다.");
		} catch (IOException e) {
			
			
			e.printStackTrace();
		
		}
	}
	
	
	
	public static void main(String[] args) {
		//Animal 동물 = new Animal("코끼리",2);
		//System.out.println(동물);
		AnimalMain 동물메인파일만들기 = new AnimalMain();
		동물메인파일만들기.fileSave("animal.txt");
	}
}
