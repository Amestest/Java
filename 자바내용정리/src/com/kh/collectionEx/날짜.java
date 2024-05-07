package com.kh.collectionEx;
/*
 Date
 	날짜와 시간을 나타내는 클래스
 	현재 시간이나 특정 시점의 시간을 표현
 	날짜와 시간연산을 위한 다양한 기능르 제공하지 않기 대문에
 	java.time 폴더에 LocalDate LocalTime 등 다양한 클래스를 새롭게 도입
 	
 	Date 에서 변형된 날짜값으로 사용하는 것을 권장
 	
 	
 SimpleDateFormat 
 	년도  월  일  시  분 초   요일
 	yyyy-MM-dd  HH:mm:ss eeee
 				H 24시간	   E  : 요일 하나만 표기
 				h 오전오후   EEEE : 예를들어 금요일이이면 금요일 모두 표기
 							d.. : 컴퓨터나 각자 환경에 맞게 d, e, D 표기를 변경해서 작성
 	기본값
 	SimpleDateForm 변수명 = new SimpleDateFormat(); // 24. 5. 3. 오전 10:44 으로 표기
 	"" 안에 작성하는 특수문자는 정해진 형식이 없음- /  .  _  
 	
  	날짜 및 시간을 개발자나 사용자가 원하는 기준으로 형식을 맞춰서 사용
  	사용자가 지정한 패턴을 문자열로 형식화 하거나
  	문자열을 날짜 객체로 변환해서 사용하는 기능을 제공
  	
  	format(Date date) : 날짜 시간 형식
  					: 날짜(Date) → 문자열(String = SimpleDateFormat)
  	parse(String date) : 문자열을 날짜 시간 형식으로 변환
  						문자열로 이루어진 날짜(String = SimpleDateFormat) → 날짜(Date)
  */
public class 날짜 {

}
