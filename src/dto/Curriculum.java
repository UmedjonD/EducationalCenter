package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curriculum {
    public String curName;
    public Date starrDate;
    public List<Cours> cours;

    List<String> lists = new ArrayList<>();

    public void kur() {

        lists.add("Обзор технологий Java");
        lists.add("Библиотека JFC/Swing");
        lists.add("Технология JDBC");
        lists.add("Библиотеки commons");

    }
}
