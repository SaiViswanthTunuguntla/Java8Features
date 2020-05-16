import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args){
        Supplier<String> s=()->{
          String otp="";
          for(int i=0;i<6;i++) otp=otp+(int) (Math.random()*10);
          return otp;
        };
        Consumer<String> c= si-> System.out.println(si);
        c.accept(s.get());
        c.accept(s.get());
        c.accept(s.get());
        c.accept(s.get());
        c.accept(s.get());
        c.accept(s.get());

    }
}

