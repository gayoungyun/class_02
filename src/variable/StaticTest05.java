package variable;

public class StaticTest05 {
	public static String URL = "c://공유폴더//접근한다";
	//다른 많은 파일, 다른 매소드에서 필요로할때 
	public String ur1_1 = "c://공유폴더//접근한다";
	//클래스 내부에서 많은 매소드에서 필요로 하는경우
	public void test1() {
		int num;
		//매소드 안에서 일회성으로 어떠한 연산을 할 때 사용
	}

}
