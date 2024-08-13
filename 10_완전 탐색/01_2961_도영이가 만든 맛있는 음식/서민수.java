// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14136 KB , 시간 : 100 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, min;
    static int[][] arr;
    static boolean[] select;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        select = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());  // 신맛
            arr[i][1] = Integer.parseInt(st.nextToken());  // 쓴맛
        }
        
        min = Integer.MAX_VALUE;
        backtrack(0);
        System.out.println(min);
    }
    
    static void backtrack(int idx) {
        if (idx == N) {
            int S = 1;
            int B = 0;
            boolean flag = false;
            
            for (int i = 0; i < N; i++) {
                if (select[i]) {
                    S *= arr[i][0];
                    B += arr[i][1];
                    flag = true;
                }
            }
            
            if (flag) {
                min = Math.min(min, Math.abs(S - B));
            }
            return;
        }
        
        select[idx] = true;
        backtrack(idx + 1);
        
        select[idx] = false;
        backtrack(idx + 1);
    }
}
