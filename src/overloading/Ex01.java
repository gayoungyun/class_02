package overloading;

//import java.util.ArrayList;

class TestClass01 {//다른파일에서 해당 파일 사용x, 파일 따로따로해라
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n) {//인자값있으면 매개수있는쪽으로 온다int n
		System.out.println("n을 가지고 연산합니다");
	}
	public void sumFunc(int n, int num) {//인자값있으면 매개수있는쪽으로 온다int n
		System.out.println(n+num+"입니다");
	}
	public void sumFunc(String n, String num) {//인자값있으면 매개수있는쪽으로 온다int n
		System.out.println(n+num+"입니다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.sumFunc();
		t.sumFunc( 10 );//인자값존재
		t.sumFunc(10,20);
		t.sumFunc("안녕", "하세요");
		
	}

}
