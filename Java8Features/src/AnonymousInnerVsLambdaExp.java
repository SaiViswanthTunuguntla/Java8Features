

public class AnonymousInnerVsLambdaExp {
   int x=888;
   public  void m2(){

       Interf i=() -> {
           int x=999;
           System.out.println("Lambda Expression implementation: "+this.x);
       };
       i.m1();
   }
   public  void m3(){

       Interf i2=new Interf() {
           int x=999;
           @Override
           public void m1() {
               System.out.println("Anonymous class Implemntation: "+this.x);
           }
       };
       i2.m1();
   }

   public static void main(String[] args){
       AnonymousInnerVsLambdaExp a=new AnonymousInnerVsLambdaExp();
       a.m2();
       a.m3();
   }


}
