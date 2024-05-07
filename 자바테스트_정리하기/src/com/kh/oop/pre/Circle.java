package com.kh.oop.pre;

//인터페이스를 처음에 가져올 때는 빨간선이 생기는건 당연
// 앞에서 작성한 미완성된 메서드를 완성해달라고 빨간색이 뜨는 것이기 때문!

public class Circle implements Drawble,Shape {
	@Override
	public double area() {
		return 4.8;
	}
	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
