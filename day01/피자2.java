package day01;

import java.util.Scanner;

public class 피자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사람의 수를 입력하세요");
		int n = sc.nextInt();
		
		Solution4 st = new Solution4();
		int result = st.solution(n);
		System.out.println(result);
		
		
		
	}
	

}

class Solution4 {
	public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 6*n; i++) {
        	if(6*i%n==0) {
        		answer = i;
        		break;
        	}
        }
        
        
        return answer;
       
    }
}


