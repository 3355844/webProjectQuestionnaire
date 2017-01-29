package models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by user on 27.01.2017.
 */
public class Human implements Serializable {
    private String humanName;
    private int humanAge;
    private boolean humanSex;
    private double humanSalary;
    private ArrayList<String> humanTransport;

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "humanName='" + humanName + '\'' +
                ", humanAge=" + humanAge +
                ", humanSex=" + humanSex +
                ", humanSalary=" + humanSalary +
                ", humanTransport=" + humanTransport.toString() +
                '}';
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(int humanAge) {
        this.humanAge = humanAge;
    }

    public boolean isHumanSex() {
        return humanSex;
    }

    public void setHumanSex(boolean humanSex) {
        this.humanSex = humanSex;
    }

    public double getHumanSalary() {
        return humanSalary;
    }

    public void setHumanSalary(double humanSalary) {
        this.humanSalary = humanSalary;
    }

    public ArrayList<String> getHumanTransport() {
        return humanTransport;
    }

    public void setHumanTransport(ArrayList<String> humanTransport) {
        this.humanTransport = humanTransport;
    }
}
