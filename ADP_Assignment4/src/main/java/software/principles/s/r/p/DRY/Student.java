package software.principles.s.r.p.DRY;

public class Student{

    public void underGradStudent(){
        System.out.println("Under graduate student");
        System.out.println("Registered full-time");
    }
    public void postGradStudent(){
        System.out.println("Post graduate student");
        System.out.println("Registered full-time");
    }

}
class StudentSolution{

    public void underGradStudent(){
        System.out.println("Under graduate student");
        fulltimeStudent();
    }
    public void postGradStudent(){
        System.out.println("Post graduate student");
        fulltimeStudent();
    }
    public void fulltimeStudent(){
        System.out.println("Registered full-time");
    }
}
