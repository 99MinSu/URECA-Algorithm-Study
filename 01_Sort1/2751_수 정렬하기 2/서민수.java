// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 217152 KB , 시간 : 1028 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            // 배열의 왼쪽 절반 정렬
            mergeSort(array, left, mid);
            
            // 배열의 오른쪽 절반 정렬
            mergeSort(array, mid + 1, right);
            
            // 정렬된 두 부분 배열 병합
            merge(array, left, mid, right);
        }
    }
    
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // 왼쪽 부분 배열 복사
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        
        // 오른쪽 부분 배열 복사
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = left;
        
        // 두 부분 배열을 병합하여 정렬
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        // 왼쪽 배열의 남은 요소 추가
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        
        // 오른쪽 배열의 남은 요소 추가
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        mergeSort(array, 0, array.length - 1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(array[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
