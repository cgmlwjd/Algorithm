package day01;

import java.util.Scanner;

public class �ʰ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ ������ �Է��ϼ���");
		int price = sc.nextInt();
		
		Solution6 st = new Solution6();
		int result = st.solution(price);
		System.out.println(result);

	}

}

class Solution6 {
    public int solution(int price) {
        int answer = 0;
        if(price>=500000) {
        	price *= 0.8;
        } else if(price >= 300000) {
        	price *= 0.9;
        } else if(price >= 100000) {
        	price *= 0.95;
        }
        
        return price;
    }
}
