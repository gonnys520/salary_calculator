package org.gonnys;

public class ContractWorker implements Salary {

    double yearSal;
    double extraPay;


        @Override
        public double calc() {
            return Double.parseDouble(String.format("%.1f", ((yearSal/12) + extraPay)));
        }
    }



