package day02;

import java.util.Scanner;

public class ���ڿ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���");
		String str1 = sc.next();
		System.out.println("����2�� �Է��ϼ���");
		String str2 = sc.next();
		
		Solution7 st= new Solution7();
		String result=st.solution(str1, str2);
		System.out.println(result);

	}

}

class Solution7 {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++) {
        	answer += str1.substring(i, i+1);
        	answer += str2.substring(i, i+1);
        }
        return answer;
    }
}