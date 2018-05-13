package grades;
import java.util.ArrayList;

public class Student {

    private String username;
    private ArrayList<Integer> grades;

    public Student(String username) {
        this.username = username;
        this.grades = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double prom=0;
        for (Integer grade: grades) {
            prom+=grade;
        }
        return (prom/grades.size());
    }


    public String toString() {
        return "|"+username+"|";
    }
}
