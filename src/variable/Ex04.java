package variable;

class Test04 {
	public int num;
	public static String msg = "연습";//static제일 먼저 만들어지는 변수, 제일 오래유지
	
}
public class Ex04 {
	public static void main(String[] args) {
		System.out.println("변경 전 : "+Test04.msg);
		Test04.msg = "1111";
		System.out.println(Test04.msg);
		
		Test04 t = new Test04();
		t.num = 100;
	}

}
