import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		int a;
		a = 10;

		Book b;
		b = new Book();
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);

		PersonVO p;
		p = new PersonVO();
		p.name = "홍길동";
		p.age = 40;
		p.weight = 68.4f;
		p.height = 175.7f;
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height);
		
	}
}
