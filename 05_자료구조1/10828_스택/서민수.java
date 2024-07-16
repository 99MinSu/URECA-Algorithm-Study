# 언어 : Java , (성공/실패) : 1/0, 메모리 : 20820 KB , 시간 : 272 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				st.push(Integer.parseInt(s[1]));
				break;
			case "pop":
				if(st.isEmpty()) System.out.println(-1);
				else System.out.println(st.pop());
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if(st.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "top":
				if(st.isEmpty()) System.out.println(-1);
				else System.out.println(st.peek());
				break;
			}
		}
    }
}
