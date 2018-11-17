package dto;

import java.util.Date;

public class Cours {
    private String coursName;
    private String coursname2;
    private String clock;

    public Cours(){
    }

    public Cours(String coursName, String coursname2, String clock) {
        this.coursName = coursName;
        this.coursname2 = coursname2;
        this.clock = clock;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public String getCoursname2() {
        return coursname2;
    }

    public void setCoursname2(String coursname2) {
        this.coursname2 = coursname2;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }
}
