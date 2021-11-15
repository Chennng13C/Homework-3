
public class test_p31 {

	public static void main(String[] args) {
		Car31.sumshow();
		Car31 car1;
		car1 = new Car31();
		car1.setCar31(1234,20.5);

		Car31.sumshow();
		
		Car31 car2;
		car2 = new Car31();
		car2.setCar31(2345,21.5);
		car2.show();
		
		Car31.sumshow();		
	}
}
class Car31{
	public static int sum=0;
	private int num;
	private double gas;
	public Car31() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar31(int n, double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public static void sumshow() {
		System.out.println("車子總共有:"+sum+"台");
	}	
	public void show() {
		System.out.println("車號是:"+num);
		System.out.println("汽油量是"+gas);
	}
}
