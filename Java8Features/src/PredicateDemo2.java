import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String[] args){
        String[] names={"Kajal","sunny","mallika","kareena","kathrina"};
        Predicate<String> p= s -> s.startsWith("k");  //we can use this condition too s.charAt(0)=='k'
        for(String s:names){
            if(p.test(s.toLowerCase()))
            System.out.println(s);
        }
    }
}



