import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String capital = sc.next();
        String result ;

        switch(capital){
            case "S" : result="Superior";  break;
            case "A" : result="Excellent"; break;
            case "B" : result="Good";      break;
            case "C" : result="Usually";   break;
            case "D" : result="Effort";    break;
            default  : result="Failure ";
        }

        System.out.println(result);

    }
}