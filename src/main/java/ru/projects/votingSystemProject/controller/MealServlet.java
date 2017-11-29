package ru.projects.votingSystemProject.controller;

import ru.projects.votingSystemProject.AuthorizedUser;
import ru.projects.votingSystemProject.service.MealServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MealServlet extends HttpServlet
{
    private MealServiceImpl mealService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null && AuthorizedUser.getId()==1)
        {
            req.setAttribute("meals", mealService.getAll());
            req.getRequestDispatcher("/meals.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
