package day02;
import java.util.Scanner;

public class 대소문자바꿔서출력 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요");
        String a = sc.next();
        
        String answer="";
        for(int i=0; i<a.length(); i++) {
        char c = a.charAt(i);
        if(Character.isUpperCase(c)) {
        	answer += Character.toLowerCase(c);
        }else {
        	answer+=Character.toUpperCase(c);
        }
    }
	System.out.println(answer);
	}
}
