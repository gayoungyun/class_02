package set_get;
class quizTest02{
	private int kor, eng, math, sum;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return (int)avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}

public class quiz02 {
	public static void main(String[] args) {
		int k=100, e=90, m=80;
		
		quizTest02 qu= new quizTest02();
		qu.setKor(100);
		qu.setEng(90);
		qu.setMath(80);
		System.out.println("국어 : "+qu.getKor());
	}

}







