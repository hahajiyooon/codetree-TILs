import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[] {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].charAt(2) == c || arr[i].charAt(3) == c){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}