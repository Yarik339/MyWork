import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Student daniil = new Student("Daniil", 6);
        Student polina = new Student("Polina", 9);
        Student oleg = new Student();
        oleg.name = "Oleg";
        oleg.studentId = 11;
        FileWriter fileWriter = new FileWriter("constructors.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(daniil.name + " " + daniil.studentId);
        printWriter.println(polina.name + " " + polina.studentId);
        printWriter.println(oleg.name + " " + oleg.studentId);
        printWriter.close();

    }
}