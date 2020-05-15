import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressions {
    public static void main(String[] args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(90);
        l.add(45);
        l.add(1);
        System.out.println("before Sorting: "+l);
        Collections.sort(l);
        System.out.println("After natural sorting: "+l);
        Comparator<Integer> c=(i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0;
        Collections.sort(l,c);

       // Collections.sort(l,(i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0);
        System.out.println("After sorting using Lambda Exp Descending order: "+l);


    }

}


