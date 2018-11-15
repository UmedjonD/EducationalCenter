package Realization;

import instance.StudentIns;

public class RealizationImpl  {

    public void out(StudentIns studentIns){
        System.out.println(studentIns.students.getName()+" "
                + studentIns.students.getCurriculim() + " "
                + studentIns.students.getStart());

        System.out.println(studentIns.students1.getName()+" "
                + studentIns.students1.getCurriculim() + " "
                + studentIns.students1.getStart());

        System.out.println(studentIns.students2.getName()+" "
                + studentIns.students2.getCurriculim() + " "
                + studentIns.students2.getStart());

        System.out.println(studentIns.students3.getName()+" "
                + studentIns.students3.getCurriculim() + " "
                + studentIns.students3.getStart());

        System.out.println(studentIns.students4.getName()+" "
                + studentIns.students4.getCurriculim() + " "
                + studentIns.students4.getStart());
    }

    public void average(){
        
    }


}
