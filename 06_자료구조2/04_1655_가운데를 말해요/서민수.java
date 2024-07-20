// 언어 : Java , (성공/실패) : 1/1 , 메모리 : 33140 KB , 시간 : 448 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        int N = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i < N; i++) {
        	int tmp = Integer.parseInt(br.readLine());
        	// 정수가 최대 힙의 루트 값보다 작거나 같으면 최대 힙에 추가
        	if (maxHeap.isEmpty() || tmp <= maxHeap.peek()) {
                maxHeap.add(tmp);
            } else {
                minHeap.add(tmp);
            }
        	//두 힙의 크기를 유지하기 위해 최대힙의 크기가 최소보다 2이상 크면 루트값 이동
        	if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {// 최소값이 최대값보다 크기 클 경우
                maxHeap.add(minHeap.poll());
            }
            
            sb.append(maxHeap.peek()).append("\n");
		}
        System.out.println(sb);
    }
}
//ex)
//왼쪽[] -> maxHeap, 오른쪽[] -> minHeap
//1 입력 : [1] [ ]  -> 1 출력
//5 입력 : [1] [5]   -> 1 출력
//2 입력 : [1 2] [5]  -> 2 출력
