import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p40 {

	public static void main(String[] args)throws IOException {
		System.out.println("please input a string");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); 
		String str1 = br1.readLine();
		
		System.out.println("please input add string");
		String str2 = br1.readLine();
		
		StringBuffer sb = new StringBuffer(str1); 
		sb.append(str2);
		System.out.println("�b�u"+str1+"�v��s�W�u"+str2+"�v���ܡA�N�|�ܦ��u"+sb+"�v�C");
	}

}
