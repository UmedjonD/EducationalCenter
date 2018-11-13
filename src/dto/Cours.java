package dto;

import java.util.Date;

public class Cours {
    public String coursName;
    public int clock;

    public Cours(){
    }
    public Cours(String name, int clock){
        this.coursName = name;
        this.clock = clock;
    }

    public String getName() {
        return coursName;
    }

    public void setName(String name) {
        this.coursName = name;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "name='" + coursName + '\'' +
                ", clock=" + clock +
                '}';
    }
}
