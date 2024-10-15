import java.util.*;

class Person{
    String name = "";
    String address = "";
    String area = "";

    public Person(){
        
    }

    public Person(String name, String address, String area){
        this.name = name;
        this.address = address;
        this.area = area;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person person = new Person();

        for(int i=0; i<n; i++){
            person = new Person(sc.next(), sc.next(), sc.next());
        }

        System.out.println("name "+person.name);
        System.out.println("addr "+person.address);
        System.out.println("city "+person.area);
    }
}