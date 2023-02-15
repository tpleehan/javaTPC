package kr.poly;

public class Dog extends Animal {
	// 이름, 나이, 종: 객체의 상태정보
	// 재정의(override)
	public void eat() {
		System.out.println("멍멍이가 왁자지껄 음식을 먹는다.");
	}

	public Dog() {
		super(); // new Animal();
	}
}
