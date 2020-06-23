package java8feature;

import java.util.function.Consumer;

public class FeatureConsumerClaining {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name +"ready to release");
		Consumer<Movie> c2 = m -> System.out.println(m.name +"is released but bigg flop");
		Consumer<Movie> c3 = m -> System.out.println(m.name +"storing info.");
		Consumer< Movie> cc= c1.andThen(c2).andThen(c3);
		
		Movie m1 = new Movie("spider");
		cc.accept(m1);
		

	}

}

class Movie{
	
	String name;
	Movie( String name){
		this.name=name;
	}
}
