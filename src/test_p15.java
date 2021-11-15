
public class test_p15 {

	public static void main(String[] args) {
		Car15 car1;
		car1 = new Car15();
		int num=1234;
		double gas=20.5;
		car1.setNumGas(num,gas);
	}
}
class Car15{
	int num;
	double gas;
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
}
