package javbva;

class User {
	String name;
	
	User(String name){
		this.name = name;
	}
	
	User(){
		this("Me!");
	}
	
	void sayHi() {
		System.out.println("hi" + this.name);
		
	}
	
}
class AdminUser extends User{
	
	AdminUser(String name){
		super(name);
	}
	
	
}

public class java_a {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User tom;
		tom = new User();
		System.out.println(tom.name);
		tom.sayHi();
		
		
	}

}
