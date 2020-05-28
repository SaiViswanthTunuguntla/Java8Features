import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(3);
        l.add(20);
        l.add(90);
        l.add(45);
        l.add(1);
        //System.out.println(l);
        List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
       // System.out.println(l1);

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);

        //for(int i=1;i<4;i++) System.out.println(i);
    }
}
