package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8sortTest {

	
	
	
	public static void main(String[] args) {
		
		List< Student> ls= new ArrayList<Student>(); 
		Student st = new Student("A", 1);
		Student st1 = new Student("Z", 2);
		Student st2 = new Student("D", 3);
		Student st3 = new Student("F", 4);
		ls.add(st);
		ls.add(st1);
		ls.add(st2);
		ls.add(st3);

		
		List<String> lst =ls.stream().map(n->n.name).collect(Collectors.toList());
		System.out.println(lst);
		
		lst.stream().sorted().forEach(System.out :: println);
	}

}
class Student{
	
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
