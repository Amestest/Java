package 자바_예제문제실습;
/*
  빨간선이 뜨는 부분을 해결하기  
  */
public class 오버로딩 {
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
	public void test(String s, int b) {}
	
	public void test(int a, double c) {}
	
	public void test(char a, char b) {}
	
	public void test(char ch) {}

	public void test(boolean a, double d) {}
	public void test(boolean b) {}
	
	public void test(short s, long z) {}
	public void test(short c) {}

	
	public void test(int a, String b) {}
	public void test(int a, String b, String c) {}
	
	public void test(String c,int b ,int e) {}
	public void test(String c,int b, long d) {}
	
	public void test(boolean a, boolean b , boolean c) {}
	public void test(boolean a, boolean b) {}
	
}
