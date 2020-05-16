import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFunctionDemo {
    String studentName;
    int marks;

    public StudentFunctionDemo(String studentName, int marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return
                "student Name='" + studentName + '\'' +
                ", marks=" + marks
                ;
    }

    public static void main(String[] args){
        ArrayList<StudentFunctionDemo> studentsList=new ArrayList<>();
        studentsList.add(new StudentFunctionDemo("sunnay",90));
        studentsList.add(new StudentFunctionDemo("cunnay",10));
        studentsList.add(new StudentFunctionDemo("pinny",60));
        studentsList.add(new StudentFunctionDemo("aunnay",45));
        studentsList.add(new StudentFunctionDemo("lunnay",30));

        Function<Integer,String> f= marks->{
          if(marks>=80) return "A[Distinction]";
          else if(marks>=60) return "B[FirstClass]";
          else if(marks>=45) return "C[SecondClass]";
          else if(marks>=30) return "D[ThirdClass]";
          else return "E[Fail]";
        };
        Predicate<StudentFunctionDemo> p=s-> s.marks>=60;
        Consumer<StudentFunctionDemo> c=s->
        {
            System.out.println(s+", Grade: "+f.apply(s.marks));
        };

        for (StudentFunctionDemo s:studentsList) {
            if(p.test(s))//only printing students with more than 60 marks and his grade
            c.accept(s);
        }
    }


}
