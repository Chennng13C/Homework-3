
public class test_p47 {

	public static void main(String[] args) {
		Car47 car1;
		car1 = new Car47();
		car1.show();
		int number=1234;
		double gas=20.5;
		String str="1號車";
		car1.setcar(number,gas);
		car1.setname(str);
		car1.show();
		
	}
}
class Car47{
	private int num;
	private double gas;
	private String name;
	public Car47() {
		num=0;
		gas=0.0;
		name="no name";
		System.out.println("生產了車子");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void setname(String nm) {
		name =nm;
		System.out.println("將車名設為"+name);
	}
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}
