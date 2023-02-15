package kr.tpc;

public class Cat extends Animal {
	// 이름, 나이, 종: 객체의 상태정보
	public void night() {
		System.out.println("밤에 눈에서 빛이난다.");
	}

	@Override
	public void eat() {
		System.out.println("야옹이가 할짝 할짝 음식을 먹는다.");
	}
}
