import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int q = sc.nextInt();
        int type = 0;
        int aInt, bInt;
        char aChar, bChar;
        char tmp ;
        

        for(int i=0; i<q; i++){
            type = sc.nextInt();

            if(type == 1){
                aInt = sc.nextInt()-1;
                bInt = sc.nextInt()-1;
                
                tmp = arr[aInt];
                arr[aInt] = arr[bInt];
                arr[bInt] = tmp;

            }else{
                aChar = sc.next().charAt(0);
                bChar = sc.next().charAt(0);

                for(int j=0; j<arr.length; j++){
                    if(arr[j] == aChar) arr[j] = bChar;
                }
            }

            System.out.println(String.valueOf(arr));

        }

    }
}