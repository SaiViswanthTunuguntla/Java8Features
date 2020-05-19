import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(90);
        l.add(45);
        l.add(1);
        System.out.println(l);
        List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l1);
    }
}
