package Iterables;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {

	@SuppressWarnings("unchecked")
	private T[] items = (T[]) new Object[10];
	private int count;

	/**
	 * Debemos implementar el método iterator() de la interfaz Iterable. Este método
	 * debe devolver una implementación de Iterator.
	 */
	@Override
	public Iterator<T> iterator() {
		return new ListIterator(this);
	}

	public void add(T item) {
		items[count++] = item;
	}

	public T get(int index) {
		return items[index];
	}

	/**
	 * Implementamos Iterator como clase privada.
	 * @author daniel
	 *
	 */
	private class ListIterator implements Iterator<T> {

		private CustomList<T> list;
		private int index;

		public ListIterator(CustomList<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			return (index < list.count);
		}

		@Override
		public T next() {
			return list.items[index++];
		}

	}

}
