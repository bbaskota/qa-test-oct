package variablesTypes;

public class LearningVariableTypes {
	
	// instance variable 

	public int MyAge = 21 ;
	
	public static void main(String[] args) {
	 
		// Instantiate the class 
		
		LearningVariableTypes instanceVariable1 = new LearningVariableTypes();
		LearningVariableTypes instanceVariable2 = new LearningVariableTypes();
		
		System.out.println(instanceVariable1.MyAge);
		
		// declaring second value 
		instanceVariable2.MyAge = 66 ;
		
		System.out.println(instanceVariable2.MyAge);
		

	}

}
