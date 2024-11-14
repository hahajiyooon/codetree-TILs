import java.util.*;

class Score implements Comparable<Score> {
    String n;
    int k,e,m;

    public Score(String n, int k, int e, int m){
        this.n = n;
        this.k = k;
        this.e = e;
        this.m = m;
    }

    @Override
    public int compareTo(Score score){
        if(this.k == score.k){
            if(this.e == score.e){
                return score.m - this.m;
            }
            return score.e - this.e;
        }
        return score.k - this.k;
    }
    
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int kor,eng,math;
        
        Score[] scores = new Score[n];

        for(int i=0; i<n; i++){
            name = sc.next();
            kor = sc.nextInt();
            eng = sc.nextInt();
            math = sc.nextInt();

            scores[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(scores);

        for(int i=0; i<n; i++){
            System.out.println(scores[i].n+" "+scores[i].k+" "+scores[i].e+" "+scores[i].m);
        }

    }
}