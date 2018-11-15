package company;

import Realization.RealizationImpl;
import instance.StudentIns;

public class Main {
    public static void main(String[] args) {
        RealizationImpl realization = new RealizationImpl();
        StudentIns studentIns = new StudentIns();

        System.out.println("======= СТУДЕНТЫ И ДАТА ПОСТУПЛЕНИЯ ========");
        realization.out(studentIns);




    }
}
