package day02;

import java.util.Scanner;

public class A�����ϱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String myString=sc.next();
		
		Solution8 st=new Solution8();
		String result=st.solution(myString);
		System.out.println(result);
		
	}

}

class Solution8 {
    public String solution(String myString) {
        myString =myString.toLowerCase();
        myString=myString.replaceAll("a", "A");
        return myString;
    }
}
