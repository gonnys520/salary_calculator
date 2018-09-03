package org.gonnys;

public class DailyWorkerMaker extends AbstractMaker{

    public Salary make() {
        System.out.println("일용직 만들기");
        DailyWorker obj =  new DailyWorker();

        obj.workHour = inputI("일용직이 몇 시간이나 일했나요?");
        obj.pay = inputD("일용직의 시급은 얼마인가요?");


        return obj;
    }
}


