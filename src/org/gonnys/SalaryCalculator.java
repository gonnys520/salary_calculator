package org.gonnys;

import java.util.Scanner;

public class SalaryCalculator {

    public void doJob()throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("월급계산기입니다.");
        System.out.println("직원종류를 입력하세요");

        String prefix = "org.gonnys.";
        String className = prefix + scanner.nextLine();

        AbstractMaker maker = (AbstractMaker)Class.forName(className).newInstance();

        Salary emp = maker.make();
        System.out.println("해당 직원의 월급은"+ emp.calc()+ "입니다.");

    }
}