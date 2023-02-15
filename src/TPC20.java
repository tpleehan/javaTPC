import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않음
		Dog d = new Dog();
		d.eat(); // ? -> 멍멍이가 왁자지껄 음식을 먹는다.

		Cat c = new Cat();
		c.eat(); // ? -> 야옹이가 할짝 할짝 음식을 먹는다.
		c.night();

		// Dog.class, Cat.class
		Animal ani = new Dog(); // upcasting(자동형변환)
		ani.eat(); // ? -> 멍멍이가 왁자지껄 음식을 먹는다.

		ani = new Cat();
		ani.eat(); // ? -> 야옹이가 할짝 할짝 음식을 먹는다.
		// ani.night();
		((Cat)ani).night(); // 밤에 눈에서 빛이난다. --> downcasting(강제형변환)

	}
}
