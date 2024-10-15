import java.util.*;

class Agent{
    char n = ' ';
    int s = 0;

    public Agent(char name, int score){
        this.n = name;
        this.s = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char name;
        int score;
        char minName = ' ';
        int minScore = 100;

        //배열 껍데기 생성
        Agent[] agents = new Agent[5];

        //배열안에 입력값 채우기
        for(int i=0; i<5; i++){
            name = sc.next().charAt(0);
            score = sc.nextInt();

            agents[i] = new Agent(name,score);

            //점수의 최소값 찾기
            Agent target = agents[i];
            if(minScore > target.s){
                minScore = target.s;
                minName = target.n;
            }
        }
        System.out.print(minName+" "+minScore);
    }
}