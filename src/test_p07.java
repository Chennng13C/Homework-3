public class test_p07{

	public static void main(String[] args) {
		Car07 car1;
		car1 = new Car07();
		car1.num=1234;
		car1.gas=20.5;
		System.out.println("�����O:"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
		Car07 car2;
		car2 = new Car07();
		car2.num=2345;
		car2.gas=21.5;
		System.out.println("�����O:"+car2.num);
		System.out.println("�T�o�q�O"+car2.gas);		
	}
}
class Car07{
	int num;
	double gas;
}