import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        char[] sign ={'+', '-', '/', '*' };
        boolean flag = false;

        for(int i=0; i<sign.length; i++){
            if(sign[i] == o) flag=true;
        }

        if(flag){
            System.out.print(a+" "+o+" "+c+" = ");
            if(o == sign[0]){
                System.out.print(a+c);
            }else if(o == sign[1]){
                System.out.print(a-c);
            }else if(o == sign[2]){
                System.out.print(a/c);
            }else{
                System.out.print(a*c);
            }
        }else{
            System.out.print("False");
        }

    }
}