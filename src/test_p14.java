
public class test_p14 {

	public static void main(String[] args) {
		Car14 car1;
		car1 = new Car14();
		car1.setnum(1234);
		car1.showgas(20.5);

	}
}
class Car14{
	int num;
	double gas;
	void setnum(int n) {
		num=n;
		System.out.println("�N�����]��"+num);
	}
	void showgas(double g) {
		gas = g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
}
