package zad20_1;

import logic.length.Centymeter;
import logic.length.Meter;
import logic.length.Millimeter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculateLength")
public class ServletLength extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String smeter = request.getParameter("meter");
        String scentymeter = request.getParameter("centymeter");
        String smillimeter = request.getParameter("milimeter");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        int initialValue = Helper.getInitialValue(smeter, scentymeter, smillimeter);

        double meter;
        double centymeter;
        double millimeter;

        Meter calculatedMeter;
        Centymeter calculatedCentymeter;
        Millimeter calculatedMillimeter;

        switch (initialValue) {
            case 0:
                meter = Double.parseDouble(request.getParameter("meter"));
                calculatedMeter = new Meter(meter);
                calculatedCentymeter = new Centymeter(calculatedMeter);
                calculatedMillimeter = new Millimeter(calculatedMeter);

                break;
            case 1:
                centymeter = Double.parseDouble(request.getParameter("centymeter"));
                calculatedCentymeter = new Centymeter(centymeter);
                calculatedMeter = new Meter(calculatedCentymeter);
                calculatedMillimeter = new Millimeter(calculatedCentymeter);

                break;
            case 2:
                millimeter = Double.parseDouble(request.getParameter("milimeter"));
                calculatedMillimeter = new Millimeter(millimeter);
                calculatedMeter = new Meter(calculatedMillimeter);
                calculatedCentymeter = new Centymeter(calculatedMillimeter);

                break;
            default:
                writer.println("Tylko jedno pole może być wypełnione");
                return;
        }

        writer.println("Przelicznik Metryczny");
        writer.println("metry: " + calculatedMeter.getSize());
        writer.println("centymetry: " + calculatedCentymeter.getSize());
        writer.println("milimetry: " + calculatedMillimeter.getSize());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }



}
