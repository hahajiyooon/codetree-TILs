import java.util.*;

class Item{
    String name;
    int code;
    
    public Item(){
        this.name = "codetree";
        this.code = 50;
    }

    public Item(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Item item1 = new Item();
        Item item2 = new Item(sc.next() , sc.nextInt());

        System.out.println("product "+item1.code+" is "+item1.name);
        System.out.println("product "+item2.code+" is "+item2.name);

    }
}