package com.naveen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

import com.naveen.beans.Student;

public class CollectionsPractice {

	public static void map() {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("Z", "1");
		map.put("Y", "2");
		map.put("X", "3");
		map.put(null, "3");
		
		for (Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + ", " + e.getValue());
		}

	}

	public static void arrayList() {
		List<Object> l = new ArrayList<Object>();
		l.add(1);
		l.add("A");
		l.add("true");

		for (Object o : l) {
			System.out.println(o);
		}

	}

	public static void iterator() {
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");

		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(l);

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
			listIterator.add("Z");
		}

		System.out.println(list);
	}

	public static void hashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(null, "A");
		map.put(null, "B");
		map.put(null, "C");

		for (Entry<String, String> s : map.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}
		System.out.println(map.get(null));
	}

	public static void comparable() {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		Collections.sort(al, (Student a, Student b) -> (b.age - a.age));

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

	public static void equalMethod() {
		Student student = new Student(101, "Vijay", 23);
		Student student1 = student;

		System.out.println(student == student1);
		equalMethod2(student, student1);
	}

	public static void equalMethod2(Student a, Student b) {
		System.out.println(a == b);

	}

	public static void linkedHashSet() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(list);
		System.out.println(lhs);

	}

	public static void priorityQueue() {
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("Z");
		p.add("A");
		p.add("D");
		p.add("B");
		System.out.println(p.peek());

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(1);
		p1.add(7);
		p1.add(3);
		p1.add(2);
		System.out.println(p1);
	}

	public static void main(String[] args) {
		// map();
		// arrayList();
		// iterator();
		// hashMap();
		// comparable();
		// equalMethod();
		// linkedHashSet();
		priorityQueue();
	}
}
