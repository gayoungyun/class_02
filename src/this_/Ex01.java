package this_;
//8f8
class Test01{
	public int num = 12345;
	public void test() {
		int num = 303030; //있으면 먼저우선, this는 자기자신을 찾아감
		System.out.println("this : "+this);
		System.out.println("this : "+this.num);
		System.out.println("num : "+num);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println("main : "+t);
		System.out.println("main num : "+t.num);
		
		t.test();//this와동일
	}

}
