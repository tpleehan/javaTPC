import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		// eat() ---- 재정의(override) ---> eat()
		// Animal a = new Animal(); X
		// a.eat();
		// upcasting(부모의 역할로 사용 -> 명령을 내리는쪽)
		Animal ani = new Dog();
		ani.eat(); // eat { ? } --> eat { 멍멍이 }
		// override 재정의를 하지 않은 경우 다형성이 보장되지 않는다.
		ani.move();

		ani = new Cat();
		ani.eat(); // eat { ? } --> eat { 야옹이 }
		ani.move();
		((Cat)ani).night();

	}
}
