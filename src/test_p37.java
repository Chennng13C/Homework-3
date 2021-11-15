import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p37 {

	public static void main(String[] args)throws IOException {
		System.out.println("please input a letter");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str = br.readLine();
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("轉換成大寫"+stru);
		System.out.println("轉換成小寫"+strl);
	}

}
