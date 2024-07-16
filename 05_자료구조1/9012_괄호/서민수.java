# 언어 : Java , (성공/실패) : 1/0, 메모리 : 15020 KB , 시간 : 156 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<String> st = new Stack<>();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			boolean vps = true;
			String[] s = br.readLine().split("");
			
			for (int j = 0; j < s.length; j++) {
				if(s[j].equals("(")) {
					st.add("(");
				}
				else if(s[j].equals(")")) {
					if(st.isEmpty()) {
						vps = false;
					}
					else {
						st.pop();
					}
				}
			}
			System.out.println(vps && st.isEmpty() ? "YES" : "NO");
			st.clear();
		}
	}
}
