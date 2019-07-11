package zad20_1;

import logic.weight.Gram;
import logic.weight.Kilogram;
import logic.weight.Milligram;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculateWeight")
public class ServletWeigth extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String skilogram = request.getParameter("kilogram");
        String sgram = request.getParameter("gram");
        String smilligram = request.getParameter("miligram");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        int initialValue = Helper.getInitialValue(skilogram, sgram, smilligram);

        double kilogram;
        double gram;
        double milligram;

        Kilogram calculatedKilogram;
        Gram calculatedGram;
        Milligram calculatedMilligram;

        switch (initialValue) {
            case 0:
                kilogram = Double.parseDouble(request.getParameter("kilogram"));
                calculatedKilogram = new Kilogram(kilogram);
                calculatedGram = new Gram(calculatedKilogram);
                calculatedMilligram = new Milligram(calculatedKilogram);

                break;
            case 1:
                gram = Double.parseDouble(request.getParameter("gram"));
                calculatedGram = new Gram(gram);
                calculatedKilogram = new Kilogram(calculatedGram);
                calculatedMilligram = new Milligram(calculatedGram);

                break;
            case 2:
                milligram = Double.parseDouble(request.getParameter("miligram"));
                calculatedMilligram = new Milligram(milligram);
                calculatedKilogram = new Kilogram(calculatedMilligram);
                calculatedGram = new Gram(calculatedMilligram);

                break;
            default:
                writer.println("Tylko jedno pole może być wypełnione");
                return;
        }

        writer.println("Przelicznik Metryczny");
        writer.println("metry: " + calculatedKilogram.getSize());
        writer.println("centymetry: " + calculatedGram.getSize());
        writer.println("milimetry: " + calculatedMilligram.getSize());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
