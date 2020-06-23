package firstspring;

public class Employeee {

	private int id;
	private String name;
	private Address address;
	
	
	public Employeee() {System.out.println("def cons");}  
	  
	public Employeee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
}
