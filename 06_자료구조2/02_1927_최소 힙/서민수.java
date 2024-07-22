 // 언어 : Java , (성공/실패) : 1/0 , 메모리 : 38020 KB , 시간 : 1208 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp == 0) {
				if(minHeap.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(minHeap.poll());
				}
				
			}
			else {
				minHeap.add(tmp);
			}
		}
    }
}
