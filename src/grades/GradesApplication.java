package grades;
import  java.util.*;
import  java.util.concurrent.ThreadLocalRandom;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String,Student> students=new HashMap<>();

        Student st1=new Student("rlagob83");
        Student st2=new Student("jananias");
        Student st3=new Student("lmorales1986");
        Student st4=new Student("Manthony90");

        st1=addNotes(st1);
        st2=addNotes(st2);
        st3=addNotes(st3);
        st4=addNotes(st4);

        students.put("Robert",st1);
        students.put("Juliette",st2);
        students.put("Lisa",st3);
        students.put("Marc",st4);


        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the github usernames of our students:");
        System.out.println(students.values());
        Scanner sc=new Scanner(System.in);
//this block of code loop over the hashMap elements using a mapa entry set of data
        Iterator it = students.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Student temporal=(Student) e.getValue();
            System.out.println(e.getKey() + " " + e.getValue());
            System.out.println(temporal+" this is my student and his average is:"+temporal.getGradeAverage());
        }
    }


    static public Student addNotes(Student student){
        for(int i=0;i<3;i++){
           int numero = ThreadLocalRandom.current().nextInt(60, 99 + 1);
            student.addGrade(numero);
        }
        return student;
    }

}
