import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {

    //Function Chaining
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        String user= sc.next();
        String pass=sc.next();

        Function<String,String> f1=s->s.substring(0,5);
        Function<String,String> f2=s->s.toLowerCase();
        Predicate<String> p1=s->s.equals("saivi");
        Predicate<String> p2=s-> s.equals("Dallas");
        if(p1.test(f1.andThen(f2).apply(user))&& p2.test(pass)) System.out.println("User signed in");
        else System.out.println("not vaild");
    }


}
