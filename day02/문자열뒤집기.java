package day02;

import java.util.Scanner;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
		String my_string =sc.next();
		System.out.println("첫번째 배열을 선택하세요");
		int s = sc.nextInt();
		System.out.println("두번째 배열을 선택하세요");
		int e=sc.nextInt();
		
		Solution9 st= new Solution9();
		
		String result=st.solution(my_string, s, e);
		System.out.println(result);
	}

}

class Solution9 {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(answer);
        String my_string2 = sb.reverse().toString();
        my_string = my_string.replaceAll(answer, my_string2);
        return my_string;
        
    }
}
