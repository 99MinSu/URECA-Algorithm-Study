import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 17716 KB , 시간 : 212 ms
