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
    public static String lastName ;

    //사전순으로 이름이 가장 느린 사람
    public static boolean TakeName(String name){
        int minLength = (lastName.length() < name.length())? lastName.length() : name.length();

        for(int i=0; i<minLength; i++){
            if(name.charAt(i) > lastName.charAt(i)){
                lastName = name;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name, addr, city;

        Person person = new Person();

        for(int i=0; i<n; i++){
            name = sc.next();
            addr = sc.next();
            city = sc.next();

            if(i == 0){
                lastName = name;
                person = new Person(name,addr,city);
            }else if(TakeName(name)){
                person = new Person(name,addr,city);
            }
        }//for

        System.out.println("name "+person.name);
        System.out.println("addr "+person.address);
        System.out.println("city "+person.area);
    }
}