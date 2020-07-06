public class StringInternDemo {

    public static void main(String[] args) {
        String s1=new String("sai");
        String s2="sai";
        System.out.println(s1==s2);

        String s3=s1.intern();


    }
}
