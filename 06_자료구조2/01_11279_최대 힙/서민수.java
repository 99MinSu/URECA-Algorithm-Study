 // 언어 : Java , (성공/실패) : 1/0 , 메모리 : 40000 KB , 시간 : 1248 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp != 0) {
				maxHeap.add(tmp);
			}
			else {
				maxHeap.add(0);
				System.out.println(maxHeap.poll());
			}
		}
    }
}
