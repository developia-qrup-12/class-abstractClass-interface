package main;

import main.User.InnerClass;

public class Main {

	public static void main(String[] args) {
//        User.InnerClass innerClass= user.new InnerClass(); // static olmadiqda 
        User.InnerClass innerClass2= new User.InnerClass(); // static olduqda
        
        
		User user=new User();
		User user2=new User();

		user.name="Vaqif";
		user.surName="Zeynalov";
		user.age=100;
		System.out.println("Adınız: "+user.name);
		System.out.println("Soyadınız: "+user.surName);
		System.out.println("Yaşınız: "+user.age);
		System.out.println(user.lastName(user.name, user.surName));
		System.out.println(user);
		System.out.println(user.equals(user2));
		System.out.println(user.equals(user));
		System.out.println(user.hashCode());


		


	}

}
