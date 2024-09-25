import java.util.*;

public class Main {
    public static boolean isDate(int m, int d){
        int[] mArray={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] dArray={31,28,31,30,31,30,31,30,31,30,31};

        for(int i=0; i<12; i++){
            if(mArray[i] == m) {
                if(dArray[i] >= d){
                    return true;
                }else{
                    return false;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isDate(m,d)? "Yes" : "No");
    }
}