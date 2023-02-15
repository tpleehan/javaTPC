public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;

		TPC09 tpc09 = new TPC09(); // heap area(힙)
		int v = tpc09.sum(a, b); // non-static method call

		System.out.println(v);
	}

	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}
