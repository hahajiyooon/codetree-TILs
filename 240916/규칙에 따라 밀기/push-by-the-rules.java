import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String lr = sc.next();
        char[] lrArr = lr.toCharArray();
        int leng = str.length();

        for(int i=0; i<lrArr.length; i++){
            if(lrArr[i] == 'L'){
                str = str.substring(1)+str.substring(0,1);
            }else{
                str = str.substring(leng-1)+str.substring(0,leng-1);
            }
        }//for
        System.out.println(str);


    }
}