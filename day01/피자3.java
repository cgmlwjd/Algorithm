package day01;

import java.util.Scanner;

public class ����3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���� ���� �� �Է�");
		int slice = sc.nextInt();
		System.out.println("��� �� �Է�");
		
		int n = sc.nextInt();
		
		Solution5 st = new Solution5();
		int result = st.solution(slice, n);
		System.out.println(result);
	}
}

class Solution5 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice==0) {
        	answer=n/slice;
        }
        else if(n%slice!=0) {
        	answer=n/slice+1;
        }
        return answer;
    }
}
