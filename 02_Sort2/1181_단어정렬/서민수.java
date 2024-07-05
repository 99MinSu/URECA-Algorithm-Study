# 언어 : Java , (성공/실패) : 1/1, 메모리 : 25512 KB , 시간 : 656 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            set.add(br.readLine());//Hash사용하여 중복값 제거
        }
        
        List<String> list = new ArrayList<>(set);//리스트에 중복제거한 Hash값 복사
        
        Collections.sort(list, new Comparator<String>() {//길이순 정렬
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {//길이가 같을시 사전순
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        
        for (String str : list) {
            System.out.println(str);
        }
    }
}
