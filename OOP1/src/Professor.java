import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the professor a name and a chair
	
	//todo: write getter and setter methods
	
	public Professor(String nama, String group){
		name = nama;
		chair = group;
	}
	
	public String getname(){
		return name;
	}
	
	public String getchair(){
		return chair;
	}
	
	public void addLecture(String lecture){
		//todo: fill this method
		
		lectures.add(lecture);
	}
	
	public ArrayList getlectures(){
		return lectures;
	}
}
