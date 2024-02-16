package variable;

class Test01 
{
	
	public int test1() 
	{
		int num= 100;//넘은 지역변수
		System.out.println("test1 : "+num);
		return num;//밑에서 num 쓰기위해
	}
	public void test2(int num) 
	{
		System.out.println("test2 : "+num);
		
	}

}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		int n= t.test1();
		t.test2(n);
		
		/*
		String name = "홍길동";
		if(true) {
			String n = "1111";
			name = "김개똥";
		}
		System.out.println(n);
		
		System.out.println(name);
		*/
	}

}
