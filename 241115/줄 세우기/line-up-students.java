import java.util.*;

class Score implements Comparable<Score> {
    int num,h,w;

    public Score(int num, int h, int w){
        this.num = num;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Score score){
        if(score.h == this.h){
            if(score.w == this.w){
                return this.num - score.num;
            }
            return score.w - this.w;
        }
        return score.h - this.h;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num,height,weight;

        Score[] scores = new Score[n];

        for(int i=0; i<n; i++){
            num = i+1;
            height = sc.nextInt();
            weight = sc.nextInt();

            scores[i] = new Score(num, height, weight);
        }

        Arrays.sort(scores);
        
        for(int i=0; i<n; i++){
            System.out.println(scores[i].h+" "+scores[i].w+" "+scores[i].num);
        }

    }
}