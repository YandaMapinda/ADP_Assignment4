package software.principles.s.r.p.s.r.p;

public class Student {
    String name;
    String surname;
    String studNum;
    int age;
    String course;
    int numOfYears;

    public String getName() {
        return name;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
 public double studentLoan(double fees){
        double loan = fees * numOfYears;
        return loan;
 }
    @Override
    public String toString() {
        return super.toString();
    }
}
