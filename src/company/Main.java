package company;

import Realization.OutData;
import Realization.Output;
import Realization.RealizationImpl;
import dto.Cours;
import dto.Students;
import instance.StudentIns;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        RealizationImpl realization = new RealizationImpl();
        StudentIns studentIns = new StudentIns();
        Output output = new Output();

        System.out.println("======= СТУДЕНТЫ И ДАТА ПОСТУПЛЕНИЯ ========");

        for (Students stud: output.studFile()){
            OutData outData = new OutData();
            int d = outData.out(stud.getStart());
            System.out.println(stud.getName() + " " + stud.getCurriculim() + " поступил " + stud.getStart()+ " учится уже " + d + " дней");

       }

        System.out.println();
        System.out.println("=======КУРСЫ И КОЛИЧЕСТВО ЧАСОВ=====");
        for (Cours cours: output.coursFile()){
            System.out.println(cours.getCoursName() + " " + cours.getCoursname2() + " " + cours.getClock());
        }

   }

}
