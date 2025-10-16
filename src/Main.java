import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Student daniil = new Student();
        Student polina = new Student();
        daniil.name = "Daniil";
        daniil.studentId = 6;
        polina.name = "Polina";
        polina.studentId = 9;

        // Создаем FileWriter для записи в файл
        FileWriter fileWriter = new FileWriter("students.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Записываем данные студентов в файл
        printWriter.println(daniil.name + " " + daniil.studentId);
        printWriter.println(polina.name + " " + polina.studentId);

        // Закрываем файл
        printWriter.close();
    }
}