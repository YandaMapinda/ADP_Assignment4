package software.principles.s.r.p.principle.of.leastKnowledge;

import software.principles.s.r.p.dipendency.injection.Address;

import java.io.Console;

public class StudentDetails {
StudentAccount account;
double discPlan(String disc){
    return account.discPlan(disc);
}
}



