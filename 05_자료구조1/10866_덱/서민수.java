# 언어 : Java , (성공/실패) : 1/2, 메모리 : 21080 KB , 시간 : 292 ms //LinkedList 사용
# 언어 : Java , (성공/실패) : 1/2, 메모리 : 19560 KB , 시간 : 276 ms //ArrayDeque사용
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			
			switch(s[0]) {
			case "push_front":
				dq.addFirst(Integer.parseInt(s[1]));
				break;
			case "push_back":
				dq.addLast(Integer.parseInt(s[1]));
				break;
			case "pop_front":
				System.out.println(dq.isEmpty() ? -1 : dq.pollFirst());
				break;
			case "pop_back":
				System.out.println(dq.isEmpty() ? -1 : dq.pollLast());
				break;
			case "size":
				System.out.println(dq.size());
				break;
			case "empty":
				System.out.println(dq.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(dq.isEmpty() ? -1 : dq.peekFirst());
				break;
			case "back":
				System.out.println(dq.isEmpty() ? -1 : dq.peekLast());
				break;
			}
		}       
    }
}
