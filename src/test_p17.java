
public class test_p17 {

	public static void main(String[] args) {
		Car17 car1;
		car1 = new Car17();
		car1.setNumGas(1234,20.5);
		int num=car1.getnum();
		double gas=car1.getgas();
		System.out.println("�լd�˫~��o��");
		System.out.println("�����O"+num+"�T�o�q�O"+gas);
	}
}
class Car17{
	int num;
	double gas;
	int getnum() {
		System.out.println("�լd����");
		return num;
	}
	double getgas() {
		System.out.println("�լd�T�o�q");
		return gas;
	}	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
}
