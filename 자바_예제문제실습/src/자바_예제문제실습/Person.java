package 자바_예제문제실습;
/*
 캡슐화
 String 사람이름 김영희
 int 나이 10
 생성자 모두 ㅁ나들기
 toString 출력
 
 PersonMain person.txt 저장
 */
public class Person {
	private String 사람이름;
	private int 나이;
	
	public Person() {
	
	}

	public Person(String 사람이름, int 나이) {
		super();
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}

	public String get사람이름() {
		return 사람이름;
	}

	public int get나이() {
		return 나이;
	}

	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이 ;
	}
	
}
