import java.util.Scanner;
import java.util.function.Predicate;

class  User {
    String uname;
    String upassword;
    public User(String uname, String upassword) {
        this.uname = uname;
        this.upassword = upassword;
    }

    }

public class PredicateDemo4 {
    public static void main(String[] args){
        Predicate<User> p= user -> user.uname.toLowerCase().equals("sai")&&user.upassword.equals("nimda");
        Scanner sc=new Scanner(System.in);
        System.out.println("UserName");
        String uname=sc.next();
        System.out.println("Password");
        String upass=sc.next();
        User u= new User(uname,upass);
        if(p.test(u)) System.out.println("User is Authenticated "+u.uname);
        else System.out.println("invalid user");
    }
}
