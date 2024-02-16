package set_get;

import java.util.Scanner;

class quizTest01 {
	private String name;
	private int age;
	
	public int getAge( ) {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void settingAge() {
		age = age-1;
	}
}
public class quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		quizTest01 q = new quizTest01();
		q.setAge(age);
		q.setName(name);
		q.settingAge();
		//int a = t.getAge();
		System.out.println(q.getName()+"의 나이는 "+q.getAge());
		
	}

}







