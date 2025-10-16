public class Student {
    String name;
    int studentId;
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
}
