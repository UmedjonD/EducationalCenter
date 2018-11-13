package Realization;

import dto.Curriculum;

public class RealizationImpl implements  Realization {

    Curriculum curriculum = new Curriculum();

    @Override
    public void average() {

        double sum = 0;
        double sred = 0;
        int count = 0;

        for (int i = 0; i<curriculum.ratings.length; i++) {
            sum += curriculum.ratings[i];
            count++;
        }
        sred = sum / count;
        System.out.println(" До окончания обучения по программе J2EE Developer осталось 6 ч. Средний балл " +sred+ " Отчислить");
    }
}
