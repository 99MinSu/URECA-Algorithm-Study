# 언어 : Java , (성공/실패) : 1/0, 메모리 : 25148 KB , 시간 : 320 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				q.offer(Integer.parseInt(s[1]));
				break;
				
			case "pop":
				if(q.isEmpty()) System.out.println(-1);
				else System.out.println(q.poll());
				break;
				
			case "size":
				System.out.println(q.size());
				break;
				
			case "empty":
				if(q.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
				
			case "front":
				if(q.isEmpty()) System.out.println(-1);
				else System.out.println(q.peek());
				break;
				
			case "back":
				if(!q.isEmpty()) {
					int last = 0;
					ArrayList<Integer> list = new ArrayList<>();
					while(!q.isEmpty()) {
						
						last = Integer.valueOf(q.poll());
						list.add(last);
					}
					System.out.println(last);
					for(int a : list) {
						q.offer(a);
					}
				}
				else {
					System.out.println(-1);
				}
			}
		}
    }
}
