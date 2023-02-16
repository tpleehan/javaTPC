// import java.lang.*;
public class TPC34 {
	public static void main(String[] args) {
		// String
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1 (실패, 끝)
		System.out.println(str.replaceAll("P", "X"));

	}
}
