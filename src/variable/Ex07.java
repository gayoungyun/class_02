package variable;
class Test07 {
	public static final String KOREA = "대한민국"; //같이 쓸 수 있다
	public static int num;
	static {
		num= 12345;
	}
}

public class Ex07 {
	public static void main(String[] args) {
		//final String KOREA = "대한민국"; 
		//KOREA ="미국"
		System.out.println(Test07.KOREA);
		System.out.println(Test07.num);
		
		Test07 t = new Test07();
		System.out.println(t.KOREA);//사용은 가능하나 위에로 많이씀
		t.test();
	}

}
