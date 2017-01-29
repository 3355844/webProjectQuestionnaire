import models.HumanManager;
import models.Human;
import models.StatisticManager;

import java.util.ArrayList;

/**
 * Created by user on 27.01.2017.
 */
public class MainTest {
    public static void main(String[] args) {


        HumanManager manager = new HumanManager();
        manager = manager.readFromFile(manager.getPath());
        ArrayList<String> transportList = new ArrayList<String>();
        Human human = new Human();
        human.setHumanName("Julia");
        human.setHumanAge(23);
        human.setHumanSalary(1500);
        human.setHumanSex(false);
        transportList.add("car");
        transportList.add("boat");
        transportList.add("bicycle");
        human.setHumanTransport(transportList);
        manager.getHumans().add(human);
        manager.writeToFile(manager);
        StatisticManager statisticManager = new StatisticManager(manager);
        System.out.println(statisticManager.toString());
    }
}
