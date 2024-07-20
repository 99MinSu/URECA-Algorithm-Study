import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 최대힙 최소힙 2개 선언
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	int num = Integer.parseInt(br.readLine());
			if(maxpq.size() == minpq.size()) { // 사이즈가 같으면 최대힙에 넣어준다
				maxpq.offer(num);
			}else
				minpq.offer(num);
			
			if(!maxpq.isEmpty() && !minpq.isEmpty()) {
				if(minpq.peek() < maxpq.peek()) { // 최소힙 앞 값이 최대 힙 앞보다 작으면 스왑
					int tmp = minpq.poll();
					minpq.offer(maxpq.poll());
					maxpq.offer(tmp);
				}
			}
			sb.append(maxpq.peek() + "\n");
        }
        System.out.println(sb);
    }

}
// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 40956 KB , 시간 : 552 ms
