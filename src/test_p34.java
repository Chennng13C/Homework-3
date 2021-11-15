import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p34 {
	public static void main(String[] args)throws IOException {
		System.out.println("please input a int number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("your input is "+num);

	}

}
