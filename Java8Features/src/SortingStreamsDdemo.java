import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStreamsDdemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(90);
        l.add(45);
        l.add(1);
        System.out.println("before sorting: "+l);
        List<Integer> l3= l.stream().sorted().collect(Collectors.toList());
        System.out.println("After Natural sorting: "+l3);
        Comparator<Integer> c=(i1, i2) -> (i1>i2)?-1:(i1<i2)?1:0;
        List<Integer> l1= l.stream().sorted(c).collect(Collectors.toList());
        System.out.println("After sorting: "+l1);
        List<Integer> l2= l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("After sorting using comapreto fn: "+l2);

        //Min() and Max() methods;
        Integer min= l.stream().min(c).get();
        System.out.println(min);
        Integer max= l.stream().max(c).get();
        System.out.println(max);



    }
}
