import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Student daniil = new Student("Daniil", 6);
        // Используем метод addCourse для добавления курсов
        daniil.addCourse("Java Programming");
        daniil.addCourse("Database Systems");
        daniil.addCourse("Algorithms");
        // Создаем файл для сохранения курсов
        FileWriter fileWriter = new FileWriter("courses.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        // Используем метод listCourses с разным количеством параметров
        System.out.println("=== First listCourses call ===");
        daniil.listCourses(); // Без параметров - выводим текущие курсы
        System.out.println("\n=== Second listCourses call ===");
        daniil.listCourses("Web Development", "Data Science"); // С параметрами - добавляем и выводим
        // Сохраняем финальный список курсов в файл
        printWriter.println("Courses for " + daniil.name + ":");
        printWriter.println(daniil.getCoursesAsString());
        // Закрываем файл
        printWriter.close();
    }
}