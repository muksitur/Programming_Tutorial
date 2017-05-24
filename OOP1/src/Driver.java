import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
	
	public static void main(String[] args) {
		//todo: create at least 1 student, 1 professor and one lecture
		// add the lecture to the student and the professor
		
		Scanner sc = new Scanner(System.in);
		String name,group,dum;
		int matriculation;
		String credits;
		System.out.println("name of the student");
		name = sc.nextLine();
		
		System.out.println("matriculation of the student");
		matriculation = sc.nextInt();
		
		Student s = new Student(name, matriculation);
		
		System.out.println("name of the professor");
		dum = sc.nextLine();
		name = sc.nextLine();
		System.out.println("name of the group");
		group = sc.nextLine();
		
		Professor p = new Professor(name, group);
		
		System.out.println("name of the lecture");
		name = sc.nextLine();
		//dum = sc.nextLine();
		System.out.println("credits of the lecture");
		credits = sc.nextLine();
		
		Lecture l = new Lecture(name, credits);
		
		s.addLecture(name);
		p.addLecture(name);
		
		System.out.println(s.getname()+" "+s.getmatriculation()+" "+s.getlectures()+" "+l.getcredits());
		System.out.println(p.getname()+" "+p.getchair()+" "+p.getlectures()+" "+l.getcredits());
		
	}
}
