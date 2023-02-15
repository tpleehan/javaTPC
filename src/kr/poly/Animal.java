package kr.poly;

public abstract class Animal { // 추상클래스(불완전한 객체(클래스)) -> Animal ani = new Animal(); X (생성할 수 없다.)
	// Dog, Cat --> eat()
	public abstract void eat(); // 추상메서드(불완전한 메서드)

	public void move() { // 구현 메서드
		System.out.println("무리를 지어서 이동한다.");
	}
}
