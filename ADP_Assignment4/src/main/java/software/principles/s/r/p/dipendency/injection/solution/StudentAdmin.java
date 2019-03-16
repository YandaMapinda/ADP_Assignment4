package software.principles.s.r.p.dipendency.injection.solution;

public interface StudentAdmin {
    void studentAdminDetails();
}
class Address implements StudentAdmin{

    public void addressDetails(){
    }
    @Override
    public void studentAdminDetails() {
        addressDetails();
    }
}
class Student{
    StudentAdmin admin;
     public void studentDeatails(){
         admin.studentAdminDetails();
     }
}
