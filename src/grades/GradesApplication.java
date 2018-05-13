package grades;
import  java.util.*;
import  java.util.concurrent.ThreadLocalRandom;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {

            myApplication();
    }


    static public Student addNotes(Student student){
        for(int i=0;i<3;i++){
           int numero = ThreadLocalRandom.current().nextInt(60, 99 + 1);
            student.addGrade(numero);
        }
        return student;
    }

    static public void myApplication(){
        HashMap<String,Student> students=new HashMap<>();

        Student st1=new Student("rlagob83");
        Student st2=new Student("jananias");
        Student st3=new Student("lmorales1986");
        Student st4=new Student("Manthony90");
        Student st5=new Student("Heather");

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

        boolean more=true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose an option:\n"+
            "1. See a single User\n"
                    +"2. List all Users and their grades");

            int option=sc.nextInt();
            if(option==1) {
                Scanner single=new Scanner(System.in);
                System.out.println("What student would you like to see more information on? ");
                String selected = single.nextLine();
                data(students, selected);
                System.out.println("Would you like to see another student?\n");
                more = Input.yesNo();
                if (!more) {
                    System.out.println("Goodbye, and have a wonderful day!");
                }
            }
            else if (option==2){
                data(students);
                System.out.println("Do you wanna go on looking ");
                more=Input.yesNo();
            }
        }
        while (more);
    }



    public static void data(Map mapa,String username){
        Iterator it = mapa.entrySet().iterator();
        String chain;
        boolean found=false;
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Student temporal=(Student) e.getValue();
            if(temporal.getUsername().equalsIgnoreCase(username)){
                System.out.println("Name:"+e.getKey()+" -Github Username:"+temporal.getUsername()+"\n"
                +"Current Average:"+temporal.getGradeAverage());
                for (int i=0;i<temporal.getGrades().size();i++)
                {
                    System.out.println("grade "+i+1+": "+temporal.getGrades().get(i));
                }
                found=true;
            }
        }
        if(!found){
            System.out.println("Sorry, no student found with the gihub username of"+"username");
        }

    }

    public static void data(Map mapa){
        Iterator it = mapa.entrySet().iterator();
        String chain;
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Student temporal=(Student) e.getValue();
                System.out.println("Name:"+e.getKey()+" -Github Username:"+temporal.getUsername()+"\n"
                        +"Current Average:"+temporal.getGradeAverage());
                for (int i=0;i<temporal.getGrades().size();i++)
                {
                    System.out.println("grade "+i+1+": "+temporal.getGrades().get(i));
                }
        }
    }

}
