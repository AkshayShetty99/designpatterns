package day2704.demo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		ListFunction lf=new ListFunction();
		//lf.passList(new ArrayList<String>());
		List<String> list=new ArrayList<String>();
		for(int i=1;i<=3;i++) {
			list.add("Main message"+i);
		}
		lf.displayList(list);
		lf.passList(list);
		System.out.println("After adding and removing data from other class and calling methods from main.");
		lf.displayList(list);
	}

}
