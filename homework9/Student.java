package homework9;

import java.io.Serializable;

public class Student implements Serializable {
    private String familia;
    private String name;
    private String otchecstvo;
    private int mark;

    public Student(String familia, String name, String otchecstvo, int mark) {
        this.familia = familia;
        this.name = name;
        this.otchecstvo = otchecstvo;
        this.mark = mark;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int mark) {
        this.mark = mark;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchecstvo() {
        return otchecstvo;
    }

    public void setOtchecstvo(String otchecstvo) {
        this.otchecstvo = otchecstvo;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String FIO(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.familia + " " + this.name + " " + this.otchecstvo);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return this.familia + " " + this.name + " " + this.otchecstvo + " " + this.mark;
    }
}
