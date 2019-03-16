package software.principles.s.r.p.s.r.p;

public class StudentLoan {
    int numOfYears;
    double fees;
    double interest;

    public double countLoan(double loanAmount){
        loanAmount = fees*numOfYears/interest;
        return loanAmount;
    }
}
