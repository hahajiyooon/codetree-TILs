import java.util.*;

class Score implements Comparable<Score>{
    String name;
    int s1,s2,s3;

    public Score(String name, int s1, int s2, int s3){
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public int compareTo(Score score){
        return (this.s1 + this.s2 + this.s3) - (score.s1 + score.s2 + score.s3);
        
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int sub1,sub2,sub3;

        Score[] scores = new Score[n];

        for(int i=0; i<n; i++){
            name = sc.next();
            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();

            scores[i] = new Score(name, sub1, sub2, sub3);
        }

        Arrays.sort(scores);

        for(int i=0; i<n; i++){
            System.out.println(scores[i].name+" "+scores[i].s1+" "+scores[i].s2+" "+scores[i].s3+" ");
        }


    }
}