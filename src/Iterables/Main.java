package Iterables;

public class Main {

	public static void main(String[] args) {

		CustomList<String> list = new CustomList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		String element = list.get(0);
		
		System.out.println(element);

		/**
		 * Al haber implementado la clase Iterable, podemos iterar sobre nuestra lista.
		 */
		
		for (String item : list) {
			System.out.print(item + ", ");
		}
		
		list.forEach(System.out::print);

	}

}
