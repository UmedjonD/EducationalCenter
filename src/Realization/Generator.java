package Realization;

import dto.Cours;
import dto.Students;

import java.util.Random;

public class Generator {
    private Random random = new Random();
    Output output = new Output();

    public Cours randomCours(){

        Cours cours = new Cours();

        String[] coursName = {"Технологий Java","Библиотека JFC/Swing","Технология JDBC",
                "Технология JAX", "Библиотеки commons"};

        String name = coursName[random.nextInt(coursName.length)];
        cours.setCoursName(name);
        return cours;

    }




}
