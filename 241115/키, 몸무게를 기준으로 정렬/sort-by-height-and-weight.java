import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int height, weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person){
        if(this.height == person.height){
            return person.weight - this.weight;
        }
        return this.height - person.height;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int h,w;

        Person[] people = new Person[n];

        for(int i=0; i<n; i++){
            name = sc.next();
            h = sc.nextInt();
            w = sc.nextInt();

            people[i] = new Person(name,h,w);
        }

        Arrays.sort(people);

        for(int i=0; i<n; i++){
            System.out.println(people[i].name+" "+people[i].height+" "+people[i].weight);
        }
    }
}