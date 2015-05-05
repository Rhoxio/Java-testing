import java.util.*;

public class Person {

	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public static void main(String[] args){
		Person sally = new Person();
		Person bob = new Person();

		HashMap<String, Integer> hash = new Hashmap<>();

		hash.put("Dog", 1);
		hash.put("Cat", 2);

		System.out.println(hash.get("Dog"));

		System.out.println(Arrays.toString(args));

		bob.setName("Bob");
		sally.setName("Sally");
		System.out.println(sally.getName());
		System.out.println(bob.getName());
	}
}


// 