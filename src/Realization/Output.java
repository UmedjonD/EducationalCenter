package Realization;

import dto.Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Output {
    Students students = null;
    ArrayList<Students> arrayList = new ArrayList<>();
    String[][] stud;
    File file = new File("Students");

    public ArrayList<Students> studFile() throws FileNotFoundException {
        stud = new String[5][3];
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            for (int i = 0; i<stud.length; i++ ){
                for (int j = 0; j<stud[i].length; j++){
                    stud[i][j] = scanner.next();
                }
            }
        }
        for (int m = 0; m<stud.length; m++){
            for(int n =0; n<stud[m].length - 2; n++){
                arrayList.add(students = new Students(
                        stud[m][n],
                        stud[m][n+1],
                        stud[m][n+2]));
            }
        }
        scanner.close();
        return arrayList;
    }

    public void coursFile() throws FileNotFoundException {
        File file = new File("Cours");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] cours = line.split(" ");

        for (String string : cours) {
            System.out.println(Arrays.toString(cours));
        }
        scanner.close();
    }
}
