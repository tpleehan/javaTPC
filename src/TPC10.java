import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		int a;
		a = 10;

		BookDTO b = new BookDTO();
		b.title = "자바";
		b.price = 17000;
		b.company = "영진";
		b.page = 670;

		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");

	}
}
