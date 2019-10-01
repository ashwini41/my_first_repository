package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {
	static ArrayList<String> al = new ArrayList<String>();

	public static void main(String[] args) {

		al.add("January");
		al.add("Februray");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
        al.add("November");
		al.add("December");
	

		System.out.println(al);

		iteratorr();
		//for_loop();
		//for_Each();

	}

	public static  void iteratorr() {
		System.out.println("iterator-------------------------------------------");
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
			if (element.contains("May")) {
				itr.add("happyhomes");
			}
			else
			if (element.contains("May")) {
				itr.remove();

			}
		}
		System.out.println(al);
	}

	public static void for_loop() {
		System.out.println("for_loop-------------------------------------------");
		for (int i = 0; i < al.size(); i++) {
			String a = al.get(i);
			//al.add("May");

			System.out.println(a + "-->newyear");

		}

	}

	public static void for_Each() {
		System.out.println("for_Each-------------------------------------------");
		for (String e : al) {
			System.out.println(e);

		}

	}

}