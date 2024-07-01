//언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 22220 KB , 시간 : 272 ms
//실패이유: quicksort 호출에서 값을 잘못넣어 스택오버플로우
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int length = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr, 0, length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int partRight = partition(arr, start, end);//파티션 오른쪽 첫번쨰 인덱스
		
		// 피벗의 왼쪽 부분 정렬 -> 시작점이 partRight - 1과 같을시 값이 1개만 있기때문에 정렬할 필요 X
		if(start < partRight - 1) quickSort(arr, start, partRight - 1);
		// 피벗의 오른쪽 부분 정렬
		if(partRight < end) quickSort(arr, partRight, end);
		
	}
	
	public static int partition(int[] arr, int start, int end) {
		int m = (start + end)/2;
		
        int pivot = arr[m];//파티션의 중간값
        
        //start와 end 엇갈릴때까지 반복
        while(start <= end) {
        	while(arr[start] < pivot) start++;//pivot보다 큰 값이 나올떄까지 start++ 반복
        	while(arr[end] > pivot) end--;//pivot보다 작은 값이 나올떄까지 start++ 반복
        	
        	if(start <= end) {
        		//엇갈리지 않았으면 정렬된 값 교체
        		int tmp = arr[start];
        		arr[start] = arr[end];
        		arr[end] = tmp;
        		
        		start++;
        		end--;
        	}
        }
        return start; //새로 나뉜 파티션의 오른쪽부분 첫번째 인덱스 반환
	}
}
