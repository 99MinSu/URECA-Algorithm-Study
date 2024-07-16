import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String S = br.readLine();
			
			//문자열의 각 자리의 값을 확인할때는 char형태로 바꿔서 확인하기 때문에 스택도 Character형으로 해준다.
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(') {
					stack.push(S.charAt(j));
				}else {
					//비어있는지를 먼저 본다.
					if(stack.empty()) {
						stack.push(S.charAt(j));
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.empty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class Main {
// 	static int n, count;
// 	static String ans;
// 	public static void main(String[] args) throws Exception{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		n = Integer.parseInt(br.readLine());
// 		for (int i = 0; i < n; i++) {
// 			String s = br.readLine();
// 			count = 0;
// 			for (int j = 0; j < s.length(); j++) {
// 				if(s.charAt(j) == '(') {
// 					count++;
// 				}else if(s.charAt(j) == ')') {
// 					count--;
// 				}
// 				if(count < 0) {
// 					ans = "NO";
// 					break;
// 				}
// 			}
// 			if(count == 0) {
// 				ans = "YES";
// 			}else
// 				ans = "NO";
// 			System.out.println(ans);
// 		}

// 	}
 
// }
// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 14380 KB , 시간 : 116 ms 스택 사용
// 언어 : JAVA , (성공/실패) : 1/3 , 메모리 : 14176 KB , 시간 : 112 ms 스택 X
