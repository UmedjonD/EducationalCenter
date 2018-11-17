package Realization;

import dto.Cours;
import dto.Students;

import java.util.Random;

public class Generator {
    private Random random = new Random();

    public Cours randomCours(){

        Cours cours = new Cours();
        Output output = new Output();

        String name = output.studList[random.nextInt(output.studList.size())];
        cours.getCoursName(name);

    }
    public Students studentRandom(){

        
        return null;
    }
}
