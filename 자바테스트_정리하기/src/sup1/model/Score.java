package sup1.model;

public class Score {
//필드
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
//메서드
	//필수 생성자
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//void 점수
	public void Score() {
		sum = kor + eng + math;
		avg = sum / 3.0;
		//평균 50점 이상이면 합격
		//삼항연산자로 합격 불합격
		String 결과 = (kor>=50 && math >= 50 && eng>=50) ? "합격": "불합격";
		//각 점수가 50 이상 평균 50점 이상
		//출력문으로 국어영어 수학점수
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		//삼항연산자에 대하 ㄴ결과 출력
		System.out.println(결과);
	}
}
