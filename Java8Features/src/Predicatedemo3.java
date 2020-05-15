import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicatedemo3 {
    public static void main(String[] args){
        String[] names={"sai","",null,"saiViswanth","","tunuguntla",null};
        Predicate<String> p=s-> s!=null&&s.length()!=0;
        ArrayList<String> namesList=new ArrayList<>();
        for (String s:names) {
            if(p.test(s)) namesList.add(s);
        }
        System.out.println(namesList);
    }
}
