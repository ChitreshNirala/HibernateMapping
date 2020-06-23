package java8feature;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class featureBiFunction {

	public static void main(String[] args) {
		ArrayList<Employee> l = new  ArrayList<Employee>();

		BiFunction<Integer, String, Employee> f=(eno,name) -> new Employee(eno, name);
		l.add(f.apply(100, "Durga"));
		l.add(f.apply(101, "ravi"));
		l.add(f.apply(102, "Shyam"));
		l.add(f.apply(103, "Punki"));
		
		
		for(Employee e:l) {
			System.out.println("Employee Number: " +e.eno);
			System.out.println("Employee name: " +e.name);
			System.out.println();
			
		}
	}

}


class Employee{
	
	int eno;
	String name;
	
	public Employee(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
}