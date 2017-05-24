import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a matriculation number
	
	//todo: write getter and setter methods
	
	

	public Student(String nama, int matriculation){
		name = nama;
		matrNr = matriculation;
	}
	
	public String getname(){
		return name;
	}
	
	public int getmatriculation(){
		return matrNr;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		
		lectures.add(lecture);
	}
	
	public ArrayList getlectures(){
		return lectures;
	}
}
