package software.principles.s.r.p.dipendency.injection;

public class Student {
    private Address address = new Address();

    public void studentDetails(){
        address.addressDetails();

    }
}
