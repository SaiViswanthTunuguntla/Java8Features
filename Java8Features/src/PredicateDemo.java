import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args)
    {
        Predicate<Collection>p =c-> !c.isEmpty();
        ArrayList<Integer> i=new ArrayList<>();
        i.add(1);
        ArrayList<Integer> j=new ArrayList<>();
        System.out.println(p.test(i));
        System.out.println(p.test(j));
    }
}
