package ie.gmit.sw;

import java.io.IOException;
import java.util.*;
public class Runner {
	private Collection<Person> col = new ArrayList<Person>();
	
	public void go() {
		for (int i = 0; i < 1000000000; i++) {
			Person p = new Person(i);
			
			if (i % 100 == 0) col.add(p);
		}
	}
	
	public static void main(String[] args) throws IOException {
		int i = System.in.read();
		
		new Runner().go();
	}
	
}
