package variablesTypes;

public class ClassVariable {
	
	public static String MyName = "Mr Handsome";
	public String MySchool = "GekoTech";
	
	public static void main(String[] args) {	
			
	// class variable 
	System.out.println("This is class variable "  +  MyName);

	
	
	// instance variable 
	ClassVariable var = new ClassVariable();
	System.out.println("this is instance variable  "  +  var.MySchool);
	
	
	// Local variable 		
	addMethod();
	

	}
	
	public static void addMethod() {
	int a = 10;
	int b = 20;
	System.out.println( (a + b)) ;		
		
	}	
	
	// Method overloading
	public static void addMethod(int a, int b) {
		System.out.println( (a + b)) ;		
			
		}
	
	
}

	



