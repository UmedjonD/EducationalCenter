package dto;

import javax.xml.crypto.Data;

public class Students {

    private String name;
    private String curriculim;
    private String start;


    public Students() {
    }

    public Students(String name, String curriculim, String start) {
        this.name = name;
        this.curriculim = curriculim;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurriculim() {
        return curriculim;
    }

    public void setCurriculim(String curriculim) {
        this.curriculim = curriculim;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
