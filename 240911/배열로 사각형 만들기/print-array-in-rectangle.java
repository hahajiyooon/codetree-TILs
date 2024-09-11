public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] arr = new int[5][5];

        //배열 1로 초기화
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = 1;
            }
        }

        //배열에 더해주기
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
               arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }

        //출력
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}