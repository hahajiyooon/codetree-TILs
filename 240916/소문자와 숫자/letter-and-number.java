import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(arr[i] >= '0' && arr[i] <= '9'){
                result += arr[i];

            }else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                result += (char)(arr[i]-'A'+'a');

            }else if(arr[i] >= 'a' && arr[i] <= 'z'){
                result += arr[i];

            }
        }//for

        System.out.print(result);
    }
}