package Generics;

public class Main {

	public static void main(String[] args) {

		/**
		 * Las clases genéricas permiten informar de muchos errores de compilación y
		 * eliminar los cast, mejorando la legibilidad del código.
		 * 
		 * Los métodos de las clases genéricas podrán trabajar con un tipo de datos
		 * genérico que se determina en el momento de instanciar la clase.
		 */

		GenericList genericList = new GenericList(); // <-- no indicamos el tipo genérico
		genericList.add(234);
		int muNymber2 = (int) genericList.get(0); // <-- hay que hacer cast

		GenericList<Integer> integerList = new GenericList<>(); // <-- indicamos Integer como tipo genérico
		integerList.add(234);
		int myNumber = integerList.get(0); // <-- no hay que hacer cast

		GenericList<Data> dataList = new GenericList<>(); // <-- indicamos una clase propia como tipo genérico
		dataList.add(new Data());
		Data myData = dataList.get(0);

		/**
		 * No podemos crear un GenericList de tipo String porque en la clase GenericList
		 * hemos indicado que el tipo genérico debe extender de Number.
		 */
		// GenericList<String> stringList = new GenericList<>();

	}

}
