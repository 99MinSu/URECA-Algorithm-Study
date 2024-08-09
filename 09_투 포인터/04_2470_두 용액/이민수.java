import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
               
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        StringTokenizer st= new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) 
            arr[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
             
        int left = 0;
        int right = N-1;
        int min = Integer.MAX_VALUE;
        int sol1 = 0;
        int sol2 = 0;
        
        while (left < right) {
            
            int value = Math.abs(arr[left] + arr[right]);
                       
            if (value < min) {
                
                min = value;
                sol1 = left;
                sol2 = right;
                
                if (value == 0) break;
            }
            
            if (Math.abs(arr[left]) < Math.abs(arr[right]))
                right--;
            else
                left++;
        }     
        System.out.println(arr[sol1] + " " + arr[sol2]);
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 28584 KB , 시간 : 344 ms
