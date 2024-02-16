package set_get;
class Test01 {
	private int num = 12345;//내부접근은 가능, 1000 으로 바뀜
	private int num1;
	private int num2;
	private int num3;
	public void test(int n) {
		num = n;
	}
	public int test2() {
		return num;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test(1000);
		System.out.println(t.test2());
	}

}
