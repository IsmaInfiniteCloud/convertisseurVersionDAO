package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Temperature;

public class TemperatureConverterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Get the value of the temperature and unit choice from the request
            String temperatureString = request.getParameter("temperature");
            String unit = request.getParameter("unit");

            double temperature = Double.parseDouble(temperatureString);

            // Create a Temperature object with the temperature and unit from the request
            Temperature temperatureDAO = new Temperature(temperature, unit);

            // Call the convertTemperature method on the Temperature object
            double convertedTemperature = temperatureDAO.convertTemperature();

            // Store the result of the conversion in the request object
            request.setAttribute("convertedTemperature", convertedTemperature);

            // Redirect to the JSP for display of the result
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (NumberFormatException ex) {
            // Handle invalid temperature input
            ex.printStackTrace();
            request.setAttribute("errorMessage", "Invalid temperature input");
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
