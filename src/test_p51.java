
public class test_p51 {

	public static void main(String[] args) {
		System.out.println("宣告car1");
		Car51[] car1;
		car1 = new Car51[3];
		for(int i=0;i<car1.length;i++) {
			car1[i]=new Car51();
		}
		
		car1[0].setcar(1234,20.5);
		car1[1].setcar(2345,21.5);
		car1[2].setcar(3456,22.5);
		
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
	}
}
class Car51{
	private int num;
	private double gas;
	public Car51() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	void show() {
		System.out.println("車號是:"+num);
		System.out.println("汽油量是"+gas);
	}
}
