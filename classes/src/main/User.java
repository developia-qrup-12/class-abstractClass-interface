package main;

import java.util.Objects;

public  class User implements UserInterface{
    // class obyekt  class qəlib obeykt isə həmin qəlibdən çıxan məhsul
	// class bina çertiyoju obyekt binanın özü
	// static dəyər və ya methodlar Class adı ilə çağırıla bilər
	String name;
	String surName;
	int age;
	
	static {// fərqi yoxdur normal olaraq obyekt yarandıqda ilk işə düşür
		System.out.println("ilk");
	}
	 
	  public static class InnerClass{
		  int a;
	  }

	@Override
	public String lastName(String name, String surname) {
		 return name+" "+surname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, surName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surName, other.surName);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}

}
