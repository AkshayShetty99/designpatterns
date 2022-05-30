package day2704.demo;

import java.util.List;

public class ListFunction {
	
	public void passList(List<String> l) {
		for(int i=1;i<=5;i++) {
			l.add("message:"+i);
		}
		System.out.println("After adding data from other class and calling method from other method.");
		displayList(l);
		System.out.println("Removing last data from list.");
		deleteList(l);
	}
	public void displayList(List<String> l) {
		l.forEach(i->System.out.println(i));
	}
	public void deleteList(List<String> l) {
		l.remove(l.size()-1);
	}

}
