import java.util.*;

public class Main {
    public static boolean isDate(int y, int m, int d){
        int[] mArray={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] dArray={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean flag = false; //윤년 여부


        //m=2일경우 윤년인지 아닌지 고려
        if(m == 2){
            if(y%4 == 0){
                flag = true;

                if(y%100 == 0) {
                    flag = false;
                    
                    if(y%400 == 0){
                        flag = true;
                    }
                }
            }
        }

        if(flag) dArray[1] = 29;

        //유효한 년월일인지
        if(dArray[m-1] >= d) return true;


        return false;
    }

    public static String season(int m){
        String name = "";
        
        switch(m/3){
            case 1 : name  = "Spring"; break;
            case 2 : name  = "Summer"; break;
            case 3 : name  = "Fall"  ; break;
            default : name = "Winter";
        }

        return name;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isDate(y,m,d)){
            System.out.print(season(m));
        }else{
            System.out.print(-1);
        }

    }
}