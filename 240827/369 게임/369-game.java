import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c = 0;
        boolean flag ; 

        for(int i=1; i<=n; i++){
            c = i;
            flag = false;
            if(c%3==0) {
                flag = true;
            }else{
                while(c>0){
                    if(c%10 != 0 && c%10%3 == 0){
                        flag = true; break;
                    }
                    c /= 10;
                }
            }
            System.out.print(flag == true? 0+" " : i+" ");
        }
    }
}