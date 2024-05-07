package com.kh.variableEx;
/*
자료형	변수명 = 변수값; 
 type	name = literal; literal = 리터럴
 변수
  자료형(기본) = primitive
  	숫자 : byte short in  // 기본으로 int형을 사용
  	문자 : char			 // '' 사용 한글자만 들어갈 수 있음
  	실수 : float double 	 //double 기본값
  	참,거짓 : boolean		 // false 기본값
  참조자료형(참조) = Reference
  	문자열 : String		// "" 사용 문자를 모두 나열하는 문자열  "" 특수문자 등 모든 것 사용 가능
  상수형    
  	final 자료형 상수명 = 값;
  	final int MAX_NUM = 100; //상시적으로 변하지 않는 수 값 변화 x 이름을 대문자로 표기
  
  열거형
  	상수를 하나씩 작성하기 번거로우니 관련있는 상수들을 한번에 {   } 안에 작성해서
  	final 과 자료형을 생략해서 작성하는 상수 표기 방법
  	열겨형 예시를 들면서 요일, 계절과 같이 변함 없는 예제를 사용해서 상수를 나열하는 방법을 확인함
  	enum 대표이름{
  		상수를 모두 작성
  	}
  */
//변수명은 어떤 특정 행위나 행동을 하기위한 것이 아니기 때문에 메서드 안에 작성하지 않아도 괜찮음
//System.out.print 와 같은 행동은 무언가를 행하기 위한 표기이기 때문에 메서드 안에 작성해줘야함
//클래스에서 바로 작성가능
public class 기본변수 {
//필드
	//자료형 기본
		//1.숫자
			int 숫자 = 10;
			byte b = 2;
			short sh = 3;
		//2.실수
			float ft = 3.14f; //기본 실수 값은 double 이고 double 은 float보다 큰 값이기 때문에
							  // 뒤에 f나 F 를 붙여서 작성해줘야함
			double db = 3.14; // 실수는 초기값이 double 이므로 뒤에 d를 안 붙여줘도 됨
		//3. 문자
			char ch = 'A';		//문자는 ''작성해줘야하고 가   A  이런식으로 하나만 넣어야함
		//4. true false
		// boolean 은 기본값이 false 이기때문에 	
			boolean bln; //과 boolean bln = false; 는 서로 같은 뜻
			
	//자료형 참조
			String name = "가나다"; //추가로 만들어진 자료형으로 대문자 S로 시작
			// 누구나 참조 자료형을 만들 수 있음
	//상수형	앞에 final 붙여주고 모두 사용할 경우 static 작성
			final int MAX_NUMBER = 100;
			final double PI = 3.14;
			final String 규칙 = "변경되면 안되는 규칙";
	//enum 열거형
			// 관련있는 상수형 모음집
			enum Day{
				MONDAY,THESDAY, WEDNESDAY, THURSDAY,FRIDAY, SATURDAY, SUNDAY
			}
			
			
}
