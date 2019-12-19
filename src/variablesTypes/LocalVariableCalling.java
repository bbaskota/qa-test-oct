package variablesTypes;

public class LocalVariableCalling  {

	public static void main(String[] args) {
		
		//ClassVariable lvariable = new ClassVariable ();
		//System.out.println(lvariable.addMethod());	

	}
	
	public int addMethod(){
		int a = 10;
		int b = 20;
		return a - b ;
		
	}

	public LocalVariableCalling(){
		System.out.println(this.addMethod());
		
	}
}
