package day02;
import java.util.Scanner;

public class ��ҹ��ڹٲ㼭��� {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
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
