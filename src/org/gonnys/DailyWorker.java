package org.gonnys;

public class DailyWorker implements Salary  {

    int workHour;
    double pay;

    @Override
    public double calc() {
        return workHour*pay;
    }
}