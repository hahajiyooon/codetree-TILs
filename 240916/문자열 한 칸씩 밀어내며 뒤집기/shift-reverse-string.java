import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int leng = str.length();
        int q = sc.nextInt();
        int type = 0;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<q; i++){
            type = sc.nextInt();
            sb.setLength(0);

            if(type == 1){
                str = str.substring(1)+str.substring(0,1);
            }else if(type == 2){
                str = str.substring(leng-1)+str.substring(0,leng-1);
            }else{
                sb = new StringBuffer(str);
                str = sb.reverse().toString();
            }//if

            System.out.println(str);

        }
    }
}