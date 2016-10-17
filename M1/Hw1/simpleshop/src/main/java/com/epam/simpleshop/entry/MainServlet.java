package com.epam.simpleshop.entry;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.simpleshop.entry.filter.Validator;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private Validator validator;

    @Override
    public void init() throws ServletException
    {
        super.init();
        validator = new Validator();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int price = (int) (Math.random() * 10000 - 5000);
        if (!validator.isValidPrice(price))
        {
            price = 0;
        }
        response.getWriter().append("Your price is: " + price);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

}
