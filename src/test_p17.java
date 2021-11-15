
public class test_p17 {

	public static void main(String[] args) {
		Car17 car1;
		car1 = new Car17();
		car1.setNumGas(1234,20.5);
		int num=car1.getnum();
		double gas=car1.getgas();
		System.out.println("調查樣品實得知");
		System.out.println("車號是"+num+"汽油量是"+gas);
	}
}
class Car17{
	int num;
	double gas;
	int getnum() {
		System.out.println("調查車號");
		return num;
	}
	double getgas() {
		System.out.println("調查汽油量");
		return gas;
	}	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
}
