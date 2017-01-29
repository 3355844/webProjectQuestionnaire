package models;

/**
 * Created by user on 28.01.2017.
 */
public class StatisticManager {
    private HumanManager humanManager;
    private int humanAge = 0;
    private int humanMan = 0;
    private int humanWomen = 0;
    private int humanSalary = 0;
    private int humanCar = 0;
    private int humanBicycle = 0;
    private int humanMotorcycle = 0;
    private int humanBoat = 0;

    @Override
    public String toString() {
        return "StatisticManager{" +
                "humanAge=" + humanAge +
                ", humanMan=" + humanMan +
                ", humanWomen=" + humanWomen +
                ", humanSalary=" + humanSalary +
                ", humanCar=" + humanCar +
                ", humanBicycle=" + humanBicycle +
                ", humanMotorcycle=" + humanMotorcycle +
                ", humanBoat=" + humanBoat +
                '}';
    }

    public HumanManager getHumanManager() {
        return humanManager;
    }

    public int getHumanAge() {
        return humanAge;
    }

    public int getHumanMan() {
        return humanMan;
    }

    public int getHumanWomen() {
        return humanWomen;
    }

    public int getHumanSalary() {
        return humanSalary;
    }

    public int getHumanCar() {
        return humanCar;
    }

    public int getHumanBicycle() {
        return humanBicycle;
    }

    public int getHumanMotorcycle() {
        return humanMotorcycle;
    }

    public int getHumanBoat() {
        return humanBoat;
    }

    public StatisticManager(HumanManager humanManager) {
        int count = 0;
        this.humanManager = humanManager;
        for (Human human : humanManager.getHumans()) {
            count++;
            this.humanAge = humanAge + human.getHumanAge();
            this.humanSalary = (int) (humanSalary + human.getHumanSalary());
            if (human.isHumanSex()) {
                humanMan++;
            } else {
                humanWomen++;
            }
            for (String transport : human.getHumanTransport()) {
                if (transport.equalsIgnoreCase("car")) {
                    humanCar++;
                } else if (transport.equalsIgnoreCase("bicycle")) {
                    humanBicycle++;
                } else if (transport.equalsIgnoreCase("boat")) {
                    humanBoat++;
                } else {
                    humanMotorcycle++;
                }
            }
        }
        humanAge = humanAge / count;
        humanSalary = humanSalary / count;
    }
}
