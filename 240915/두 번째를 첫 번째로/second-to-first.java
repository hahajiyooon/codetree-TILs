import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char first = arr[0];
        char second = arr[1];

        for(int i=0; i<arr.length; i++){
            if(arr[i] == second) arr[i] = first;
        }

        System.out.print(String.valueOf(arr));
    }
}