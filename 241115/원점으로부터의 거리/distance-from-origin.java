import java.util.*;

class Point implements Comparable<Point>{
    int num,x,y;

    public Point(int num, int x, int y){
        this.num = num;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point){
        int dist1 = Math.abs(this.x) + Math.abs(this.y);
        int dist2 = Math.abs(point.x) + Math.abs(point.y);

        if (dist1 == dist2) {
            return this.num - point.num;
        }
        return dist1 - dist2;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y,num;

        Point[] points = new Point[n];

        for(int i=0; i<n; i++){
            num = 1+i;
            x = sc.nextInt();
            y = sc.nextInt();

            points[i] = new Point(num,x,y);
        }

        Arrays.sort(points);

        for(int i=0; i<n; i++){
            System.out.println(points[i].num);
        }
    }
}