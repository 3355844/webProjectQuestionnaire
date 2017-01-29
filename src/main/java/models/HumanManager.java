package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by user on 27.01.2017.
 */
public class HumanManager {
    private String path = "C:/Users/33558/IdeaProjects/webProjectQuestionnaire/src/main/resources/human.json"; //default
    private ArrayList<Human> humans = new ArrayList<Human>();

    public void save(Human human) {
        HumanManager humanManager = readFromFile(path);
        humans = humanManager.getHumans();
        humans.add(human);
        humanManager.setHumans(humans);
        humanManager.writeToFile(humanManager);
    }

    public Human parseHuman(HttpServletRequest request) {
        Human human = new Human();
        ArrayList<String> transport = new ArrayList<String>();
        human.setHumanName(request.getParameter("name"));
        human.setHumanAge(Integer.parseInt(request.getParameter("age")));
        human.setHumanSalary(Double.parseDouble(request.getParameter("salary")));
        String[] tr = request.getParameterValues("transport");
        for (String s : tr) {
            transport.add(s);
        }
        human.setHumanTransport(transport);
        if (request.getParameter("sex").equalsIgnoreCase("man")) {
            human.setHumanSex(true);
        } else {
            human.setHumanSex(false);
        }
        return human;
    }

    public void writeToFile(HumanManager manager) {
        Gson gson = new GsonBuilder().create();
        try {
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
