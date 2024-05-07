package ncs.test15;

public class Book {
//필드
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	//기본생성자 
	public Book() {
	
	}
	//필수생성자
	public Book(String title, String author, int price, String publisher, double discountRet) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRet;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	//할인율과 정상가격을 확인해서 할인가를 알고싶을 때 작성한느 메서드
	public int get할인가() {
		//할인한느 계싼 방식 실수
		double discountAmount = price * discountRate; //예를 들어 100원 10% 판매하겠따.
		
		//정상가 - % 만큼 할인이 들어간 금액
		int 할인가격 = (int) (price - discountAmount);
		return 할인가격;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
