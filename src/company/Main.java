package company;

import Realization.Output;
import Realization.RealizationImpl;
import dto.Students;
import instance.StudentIns;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        RealizationImpl realization = new RealizationImpl();
        StudentIns studentIns = new StudentIns();
        Output output = new Output();

        System.out.println("======= СТУДЕНТЫ И ДАТА ПОСТУПЛЕНИЯ ========");

        for (Students stud: output.studFile()){
            System.out.println(stud.getName() +" " + stud.getCurriculim() + " " + stud.getStart());
        }
        System.out.println();
        System.out.println("=======СРЕДНИЕ ОЦЕНКИ СТУДЕНТОВ=====");
        output.coursFile();






    }
}
