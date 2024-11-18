import java.util.*;

class Student implements Comparable<Student>{
    int num,height,weight;

    public Student(int num, int height, int weight){
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }    
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num,h,w;

        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            num = i+1;
            h = sc.nextInt();
            w = sc.nextInt();

            students[i] = new Student(num,h,w);
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++){
            System.out.println(students[i].height+" "+students[i].weight+" "+students[i].num);
        }


    }
}