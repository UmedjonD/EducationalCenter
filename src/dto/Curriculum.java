package dto;


import java.util.List;

public class Curriculum {

    private String Name;
    private int days;
    private List<Cours> cours;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStartDate() {
        return days;
    }

    public void setStartDate(int startDate) {
        this.days = startDate;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }
}
