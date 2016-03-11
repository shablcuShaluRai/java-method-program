/*
 * a static block is a block of statements declared as static. 
 * 
 */



 class Staticblock {
	 
	 static {
		 /*
		  * jvm first executed the static block after that searches the main method.
		  * then executed the main method 
		  * 
		  */
			System.out.println("static block");
		}

	public static void main(String[] args) {
	 /*
	  * 
	  * if main method not found then following error will raise
	  * 
	  * 
	  * 
	  * 
	  * Error: Main method not found in class Staticblock, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

	  * 
	   
	  */

		System.out.println("main block");
	}

}
