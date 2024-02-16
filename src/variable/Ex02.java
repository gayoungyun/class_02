package variable;

class Test02{
	public int num;//리턴 매개변수 필요x, 인스턴스 변수(객체), 한번사용할때는 불필요, 여러공간 사용할때
	
	public void test1() {
		int s;//일회용 변수 , 특정지역에서만 사용할때
		num  = 100;
		System.out.println("test1 : "+num);
	}
	public void test2() {
		System.out.println("test2 : "+num);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02(); //t 가 인스턴스 변수
		t.test1(); t.test2();
		
	}

}
