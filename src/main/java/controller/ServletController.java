package controller;

import models.Human;
import models.HumanManager;
import models.StatisticManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 25.01.2017.
 */
@WebServlet(name = "controller", urlPatterns = "/")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> transport = new ArrayList<String>();
        ArrayList<Human> humans;
        Human human = new Human();
        HumanManager humanManager = new HumanManager();

        human.setHumanName(request.getParameter("name"));
        human.setHumanAge(Integer.parseInt(request.getParameter("age")));
        human.setHumanSalary(Double.parseDouble(request.getParameter("salary")));
        String[] tr = request.getParameterValues("transport");
        for (String s : tr) {
            transport.add(s);
            System.out.println(s);
        }
        System.out.println(transport.toString());
        human.setHumanTransport(transport);
        if (request.getParameter("sex").equalsIgnoreCase("man")) {
            human.setHumanSex(true);
        } else {
            human.setHumanSex(false);
        }

        humanManager = humanManager.readFromFile(humanManager.getPath());
        humans = humanManager.getHumans();
        humans.add(human);
        humanManager.setHumans(humans);
        humanManager.writeToFile(humanManager);

//        StatisticManager statisticManager = new StatisticManager(humanManager);
//
//        request.setAttribute("statisticManager", statisticManager);
//        System.out.println(statisticManager.toString());
        request.getRequestDispatcher("welcome.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("to welcome page");
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
}
