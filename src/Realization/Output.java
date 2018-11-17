package Realization;

import dto.Cours;
import dto.Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    Students students = null;
    Cours cours = null;

    ArrayList<Students> studList = new ArrayList<>();

    String[][] studArray;
    String[][] courArray;
    File file = new File("Students");

    public ArrayList<Students> studFile() throws FileNotFoundException {
        studArray = new String[5][3];
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            for (int i = 0; i< studArray.length; i++ ){
                for (int j = 0; j< studArray[i].length; j++){
                    studArray[i][j] = scanner.next();
                }
            }
        }
        for (int m = 0; m<studArray.length; m++){
            for(int n = 0; n< studArray[m].length - 2; n++){
                studList.add(students = new Students(
                        studArray[m][n],
                        studArray[m][n+1],
                        studArray[m][n+2]));
            }
        }
        scanner.close();
        return studList;
    }

    public ArrayList<Cours> coursFile() throws FileNotFoundException {
        ArrayList<Cours> coursLIst = new ArrayList<>();
        courArray = new String[5][3];

        File file = new File("Cours");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            for (int i =0; i<courArray.length; i++) {
                for (int j=0; j<courArray[i].length; j++){
                    courArray[i][j] = scanner.next();
                }
            }
        }
        for (int m = 0; m<courArray.length; m++){
            for(int n = 0; n< courArray[m].length - 2; n++){
                coursLIst.add(cours = new Cours(
                        courArray[m][n],
                        courArray[m][n+1],
                        courArray[m][n+2]));
                        Integer.parseInt(courArray[m][n+2]);
            }
        }
        scanner.close();
        return coursLIst;
    }
}
