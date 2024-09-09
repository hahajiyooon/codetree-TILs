import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String cold = "";
        int temp = 0;
        int[] room = new int[4];

        for(int i=0; i<3; i++){
            cold = sc.next();
            temp = sc.nextInt();

            if(cold.equals("Y")){
                if(temp >= 37){
                    room[0]++;
                }else{
                    room[2]++;
                }
            }else{
                if(temp >= 37){
                    room[1]++;
                }else{
                    room[3]++;
                }
            }
        }

        for(int i : room){
            System.out.print(i+" ");
        }

        if(room[0] >= 2){
            System.out.print("E");
        }
    }
}