import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p38 {

	public static void main(String[] args)throws IOException {
		System.out.println("please input a string");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); 
		String str1 = br1.readLine();
		
		System.out.println("please input search letter");
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); 
		String str2 = br2.readLine();
		char ch = str2.charAt(0);
	
		int num = str1.indexOf(ch);
		
		if(num!=-1) 
			System.out.println(str1+"����"+(num+1)+"�Ӧr�N�O�u"+ch+"�v");			
		else 
			System.out.println(str1+"���S���u"+ch+"�v");
}

}
