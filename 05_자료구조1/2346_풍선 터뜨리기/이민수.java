import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());  

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] balloonin = new int[N];
        for (int i = 0; i < N; i++) {
            balloonin[i] = Integer.parseInt(st.nextToken());
        }
        sb.append("1 "); 
        int moveValue = balloonin[0];  

        //인덱스값과 인덱스가 가지고 있는 이동 값을 같이 넣어준다.
        // i+1 : (처음 풍선은 넣어주지 않음) => 가장 처음 터트리기 때문
        for(int i = 1; i < N; i++){
            dq.add(new Balloon(i+1, balloonin[i]));
        }

        while(!dq.isEmpty()){
            if(moveValue > 0){
                //앞에 있는 요소를 모두 뒤로 보낸다.
                for(int i = 1; i < moveValue; i++){
                    dq.add(dq.poll());
                }
                Balloon next = dq.poll();
                moveValue = next.numValue; //이동값 갱신
                sb.append(next.index+" "); //터트린 풍선의 위치값 출력 목록에 저장
            }
            else{
                //뒤에 있는 요소들 모두 앞으로 보낸다.
                for(int i = 1; i < -moveValue; i++){
                    dq.addFirst(dq.pollLast());
                }
                //모두 뒤로 보냈다면
                Balloon next = dq.pollLast();
                moveValue = next.numValue;
                sb.append(next.index+" ");
            }

        }
        System.out.println(sb);
    }
}
class Balloon{
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 17524 KB , 시간 : 180 ms
