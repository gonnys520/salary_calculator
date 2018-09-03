package org.gonnys;

public class Freelancer implements Salary {

    double yearSal;
    double lunch;

    @Override
    public double calc() {
        return (yearSal/12) + lunch;
    }
}