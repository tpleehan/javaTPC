public class TPC07 {
	public static void main(String[] args) {
		int a = 20;
		float b = 56.7f;

		float v = sum(a, b);
		System.out.println(v);

		int[] arr = {1, 2, 3, 4, 5};

		int vv = arrSum(arr);
		System.out.println(vv);
	}

	private static int arrSum(int[] x) {
		int hap = 0;

		for (int i = 0; i < x.length; i++) {
			hap += x[i];
		}
		return hap;
	}

	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
}
