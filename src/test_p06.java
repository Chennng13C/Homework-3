
public class test_p06 {

	public static void main(String[] args) {
		Car06 car1;
		car1 = new Car06();
		car1.num=1234;
		car1.gas=20.5;
		System.out.println("車號是:"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}
}
class Car06{
	int num;
	double gas;
}

