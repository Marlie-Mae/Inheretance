package inheretance;

public class Kid extends Toddler { //extend keyword
	
	int gradeLevel;
	
	Kid(String name, String sex, int age, String favoriteGame, int gradeLevel){
		super(name,sex,age,favoriteGame);
		this.gradeLevel = gradeLevel;
	}
	
	void sayGradeLevel(){
		
		System.out.println("Grade: " + gradeLevel);
	}

}