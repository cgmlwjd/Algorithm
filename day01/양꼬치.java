package day01;

import java.util.Scanner;

public class �粿ġ {

	public static void main(String[] args) {
		int n = 64;
		int k = 6;
		Solution2 st = new Solution2();
		int price = st.solution(n,k);
		System.out.println(price);
		
	}

}

class Solution2 {
    public int solution(int n, int k) {
        int answer = 0;
        int free = n/10; //���� ����� ����
        int beverage=k-free;
        answer=n*12000+beverage*2000;
        
        return answer;
    }
}
