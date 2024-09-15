import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int leng = str.length();
        int q = sc.nextInt();
        int type = 0;
        String reverse = "";

        for(int i=0; i<q; i++){
            type = sc.nextInt();

            if(type == 1){
                str = str.substring(1)+str.substring(0,1);
            }else if(type == 2){
                str = str.substring(leng-1)+str.substring(0,leng-1);
            }else{
                for(int j=leng-1; j>-1; j--){
                    reverse += str.charAt(j);
                }
                str = reverse;
            }//if

            System.out.println(str);

        }
    }
}