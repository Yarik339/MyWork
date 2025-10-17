import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int studentId;
    private List<String> courses = new ArrayList<>();
    Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }
    Student(){

    }
    void PrintInfo(){
        System.out.println(name + " " + studentId);
    }
    public String updateName(String newName) {
        String logMessage = "Было:" + this.name + " Стало: " + newName;
        this.name = newName;
        return logMessage;
    }
    // Метод для добавления одного курса
    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }
    // Метод для вывода списка курсов (varargs)
    public void listCourses(String... newCourses) {
        System.out.println("Current courses for " + name + ":");
        // Добавляем новые курсы если они переданы
        for (String course : newCourses) {
            courses.add(course);
        }
        // Выводим все курсы
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
    }
    // Метод для получения всех курсов (для сохранения в файл)
    public String getCoursesAsString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < courses.size(); i++) {
            result.append((i + 1) + ". " + courses.get(i));
            if (i < courses.size() - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
