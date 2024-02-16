package variable;

import java.util.Scanner;

public class TestClass001 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("입력기능");

		System.out.print("이름 : ");
		name = input.next();
		System.out.print("국어 : ");
		kor = input.nextInt();
		System.out.print("영어 : ");
		eng = input.nextInt();
		System.out.print("수학 : ");
		math = input.nextInt();
	}

	public void opData() {
		//System.out.println("연산기능");
		sum= kor+eng+math;
		//System.out.println("sum : "+sum);
		avg = sum/3;
		//System.out.println("avg : "+avg);
		if(avg>=90) {
			grade = "A등급";
		}else if(avg>=80) {
			grade = "B등급";
		}else {
			grade = "C등급";
		}
		//System.out.println("grade : "+grade);
	}
	
	public void printData() {
		System.out.println("출력기능");
		System.out.println(name+" = 합 : "+sum+", 평균 : "+avg+", 등급 : "+grade);
	}

}







