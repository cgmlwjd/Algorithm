package day01;

import java.util.Scanner;

public class ����1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���.");
		int n = sc.nextInt();
		
		Solution3 st = new Solution3();
		int result = st.solution(n);
		System.out.println(result);
	}
	
	
}

class Solution3 {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0) {
        	answer = n/7;
        }
        if(n%7!=0) {
        	answer = n/7+1;
        }
        return answer;
    }
}
