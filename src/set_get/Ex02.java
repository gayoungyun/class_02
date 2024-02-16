package set_get;//set설정, get얻어옴

import java.util.Scanner;

class Test02 {
	private int num, age;//은닉

	public int getNum() {//캡슐화
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	/*
	public void setNum(int num) {
		this.num= num;//100을 위에 num으로 넣어라
	}
	public int getNum() {
		return num;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
*/
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.setNum(100);
		t.setAge(20);
		int a = t.getAge();
		System.out.println("age : "+a);
		System.out.println(t.getNum());
	}

}
