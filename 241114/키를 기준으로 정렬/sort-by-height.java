import java.util.*;

class Person{
    String n;
    int h,w;

    public Person(String n, int h, int w){
        this.n = n;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int height, weight;
        Person[] people = new Person[n];

        for(int i=0; i<n; i++){
            name = sc.next();
            height = sc.nextInt();
            weight = sc.nextInt();

            people[i] = new Person(name,height,weight);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b){
                return a.h-b.h;
            }
        });

        for(int i=0; i<n; i++){
            System.out.println(people[i].n+" "+people[i].h+" "+people[i].w);
        }

        
    }
}