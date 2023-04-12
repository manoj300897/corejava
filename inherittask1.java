import java.util.*;

class Students13 {
    String name;
    int age;
    String qualification;
    int assessmentMarks;
public void display() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Select a student file");
        System.out.println("1");
        System.out.println("2");
        int man=sc.nextInt();
	switch (man) {
            case 1:
                name = "manoj";
                age = 20;
                qualification = "Be.ece";
                assessmentMarks = 50;
                break;
            case 2:
                name = "dhanvandh";
                age = 22;
                qualification = "B.Sc ecs";
                assessmentMarks = 80;
                break;
            default:
                System.out.println("man");
               	break;
        	}
	System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tQualification: " + qualification);
        System.out.println("\tAssessment Marks: " + assessmentMarks);
    }
}


class FullStack extends Students13 {
    public void jobRole() {
        System.out.println("\t" + name + " works as a Full Stack Developer");
    }
}


class WebDevelopment extends Fullstack {
    public void salary() {
        int salary = assessmentMarks *1000;
        System.out.println("\t" + name + "salary is" + salary);
    }
}


public class inherittask1{
    public static void main(String[] args) {
        Fullstack full = new Fullstack();
	  Webdevlopment web = new Webdevelopment();
	  full.display();
	  full.jobrole();
	   web.salary();
    }
}
