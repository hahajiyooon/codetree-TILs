import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n ;
        int SumEven = 0;
        int SumOdd = 0;

        for(int i =1; i<11; i++){
            n = sc.nextInt();

            if(i%2 == 0){
                SumEven += n;
            }else{
                SumOdd += n;
            }
        }
        
            System.out.print((SumEven-SumOdd>0)? SumEven-SumOdd : SumOdd-SumEven);
    }
}