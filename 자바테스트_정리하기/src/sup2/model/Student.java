package sup2.model;

public class Student {
	String 이름;
	int 학년;
	int 반;
	int 번호;
	char 성별;
	double 성적;
//메서드
	//필수 이름 학년 반 번호 성별 성적 alt shift s o
	//public void 정보(){				//참이면 남학생 불 여학생
	//	String 성별확인 = (성별 == 'M')?
	//}
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, double 성적) {
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void 정보() {
		String 성별확인 = (성별 == 'M')? "남학생" : "여학생";
		System.out.println(학년+"학년"+반+"반"+"번호"+번호+"성별확인"+ 성별확인 +"   "+이름+ "는 성적이" + 성적 + "이다.");
		
	}

}
