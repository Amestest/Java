package ncs.test10;

public class Book {
//필드
	private String 카테고리;
	private String 책이름;
	private double 책가격;
	private double 할인율;
	
	
	
//메서드
	//Setter
	public void set카테고리(String 카테고리) {
		this.카테고리 = 카테고리;
	}
	public void set책이름(String 책이름) {
		this.책이름 = 책이름;
	}
	public void set책가격(double 책가격) {
		this.책가격 = 책가격;
	}
	public void set할인율(double 할인율) {
		this.할인율 = 할인율;
	}
	//Getter
		public String get카테고리() {
		return 카테고리;
		}
		
		public String get책이름() {
			return 책이름;
		}
		public double get책가격() {
			return 책가격;
		}
		public double get할인율() {
			return 할인율;
		}
	//생성자 기본
	public Book() {}
	
		
	//생성자 필수 카테고리 책이름 가격 할인율alt shift s o
	public Book(String 카테고리, String 책이름, double 책가격, double 할인율) {
		this.카테고리 = 카테고리;
		this.책이름 = 책이름;
		this.책가격 = 책가격;
		this.할인율 = 할인율;
	}
}