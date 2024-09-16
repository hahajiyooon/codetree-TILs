import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] cA = a.toCharArray();
        char[] cB = b.toCharArray();
        int sum = 0;
        boolean flag = false;

        for(int i=0; i<cA.length; i++){
            if(cA[i] < '0' || cA[i] > '9') {
                sum += Integer.parseInt(a.substring(0, a.indexOf(cA[i])));
                flag = true;
                break;
            }
        }

        //입력값 중에 특수문자가 없다면
        if(!flag){sum += Integer.parseInt(a);}

        flag = false;

        for(int i=0; i<cB.length; i++){
            if(cB[i] < '0' || cB[i] > '9') {
                sum += Integer.parseInt(b.substring(0, b.indexOf(cB[i])));
                flag = true;
                break;
            }
        }
        //입력값 중에 특수문자가 없다면
        if(!flag){sum += Integer.parseInt(b);}

        System.out.print(sum);


    }
}