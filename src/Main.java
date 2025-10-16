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
        //Вывод информации до изменений
        daniil.PrintInfo();

        FileWriter fileWriter = new FileWriter("update_log.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Изменяем переменную имени
        String logMessage = daniil.updateName("Daniel");
        printWriter.println(logMessage);

        // Вывод информации после
        daniil.PrintInfo();


        printWriter.close();
    }
}