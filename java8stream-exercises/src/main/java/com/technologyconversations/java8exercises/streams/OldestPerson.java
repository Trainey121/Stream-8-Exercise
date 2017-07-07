package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

	public static Person getOldestPerson7(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

	public static Person getOldestPerson(List<Person> people) {
		final Comparator<Person> comp = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
		Person oldest = people.stream().max(comp).get();
		return oldest;

	}
}
