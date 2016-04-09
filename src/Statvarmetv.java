class Thing {
	String name;
	public static String description;
	public final static  int lucky_number=7;
	public static int count=0;
	public int id;
	
	public Thing(){
		id=count;
		count++;
	}

	public void showName() {
		System.out.println(name);
		System.out.println("object id :"+id +" ,"+description +":"+name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		// won't work : System.out.println(name);
	}
}

public class Statvarmetv {

	public static void main(String[] args) {

		Thing.description = "i am thing";

		//System.out.println(Thing.description);
		
		Thing.showInfo();
		System.out.println("before creating an object count is "+Thing.count);

		Thing t1 = new Thing();
		Thing t2 = new Thing();
		System.out.println("after creating an object count is "+Thing.count);


		t1.name = "shalu";
		t2.name = "Rai";
		// System.out.println(t1.name);
		// System.out.println(t2.name);
		t1.showName();
		t2.showName();
		System.out.println(Math.PI);
System.out.println(Thing.lucky_number);

	}

}
