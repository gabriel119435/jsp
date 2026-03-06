package controller;

import domain.Facade;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/serv")
public class Serv extends HttpServlet {

    public Serv() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("people", Facade.getAll());
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name, sex, car, rocket;
        name = request.getParameter("name");
        sex = request.getParameter("sex");
        car = request.getParameter("car");
        rocket = request.getParameter("rocket");

        if (name == "" || sex == null) {
            request.getRequestDispatcher("WEB-INF/error.jsp").forward(request, response);
            return;
        }
        sex = Facade.turnSexIntoLetter(sex);
        request.setAttribute("sex", sex);
        // == compares memory address, 'equals' compare content
        if (car == null) car = "no";
        request.setAttribute("car", car);
        if (rocket == null) rocket = "no";
        request.setAttribute("rocket", rocket);

        Facade.addPerson(name, sex, car, rocket);
        request.setAttribute("people", Facade.getAll());
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
