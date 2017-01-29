package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 27.01.2017.
 */
public class HumanManager {
    private String path = "C:/Users/33558/IdeaProjects/webProgectQuestionnaire/src/main/resources/human.json"; //default
    private ArrayList<Human> humans = new ArrayList<Human>();

    public void writeToFile(HumanManager manager) {
        Gson gson = new GsonBuilder().create();
        try {
            System.out.println("Come to json ");
            System.out.println(manager.getPath());
            Writer writer = new FileWriter(new File(manager.getPath()));
            gson.toJson(manager, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HumanManager readFromFile(String path) {
        Gson gson = new GsonBuilder().create();
        HumanManager manager = null;
        try {
            Reader reader = new FileReader(path);
            manager = gson.fromJson(reader, HumanManager.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return manager;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "HumanManager{" +
                "path='" + path + '\'' +
                ", humans=" + humans.toString() +
                '}';
    }
}
