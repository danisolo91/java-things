package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = getPeople();

		// Filter
		List<Person> females = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());

		females.forEach(System.out::println);

		System.out.println();

		// Sort
		List<Person> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge)
						.thenComparing(Person::getGender).reversed())
				.collect(Collectors.toList());

		sorted.forEach(System.out::println);

		System.out.println();

		// All match
		// Todos los elementos cumplen la condición
		boolean allMatch = people.stream()
				.allMatch(person -> person.getAge() > 5);

		System.out.println(allMatch);

		System.out.println();

		// Any match
		// Si hay alguno que cumpla la condición
		boolean anyMatch = people.stream()
				.anyMatch(person -> person.getAge() > 5);

		System.out.println(anyMatch);

		System.out.println();

		// None match
		// Ninguno cumple la condición
		boolean noneMatch = people.stream()
				.noneMatch(person -> person.getName().equals("Antonio"));

		System.out.println(noneMatch);

		System.out.println();

		// Max
		people.stream().max(Comparator.comparing(Person::getAge))
				.ifPresent(System.out::println);

		System.out.println();

		// Min
		people.stream().min(Comparator.comparing(Person::getAge))
				.ifPresent(System.out::println);

		System.out.println();

		// Group
		Map<Gender, List<Person>> groupByGender = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));

		groupByGender.forEach((gender, people1) -> {
			System.out.println(gender);
			people1.forEach(System.out::println);
		});

		System.out.println();

		// Chaining
		Optional<String> oldestFemaleName = people.stream()
				.filter(person -> person.getGender().equals(Gender.FEMALE))
				.max(Comparator.comparing(Person::getAge)).map(Person::getName);

		oldestFemaleName.ifPresent(System.out::println);

	}

	private static List<Person> getPeople() {
		return List.of(new Person("James Bond", 20, Gender.MALE),
				new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE),
				new Person("Alex Box", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE),
				new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE));
	}

}
