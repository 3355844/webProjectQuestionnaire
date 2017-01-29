package controller;

import models.Human;
import models.HumanManager;
import models.StatisticManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 25.01.2017.
 */
@WebServlet(name = "controller", urlPatterns = "/")
public class ServletController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HumanManager humanManager = new HumanManager();
        Human human = humanManager.parseHuman(request);
        humanManager.save(human);
        StatisticManager statisticManager = new StatisticManager(humanManager);
        request.setAttribute("statisticManager", statisticManager);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
}