package TDADeque;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

import Exceptions.EmptyListException;
import Exceptions.InvalidPositionException;
import TDALista.*;

/**
 * Clase LinkedDeque
 * Implementa la interfaz Deque de java, con una lista doblemente enlazada.
 * @author Nahuel Ignacio Fuentes.
 * @param <E> : Tipo de dato a almacenar en la estructura.
 */
public class LinkedDeque<E> implements Deque<E> {
	//Atributos de instancia
	protected int size;
	protected PositionList<E> lista;
	
	public LinkedDeque() {
		size=0;
		lista= new DoubleLinkedList<E>();
	}
	/**
	 * Consulta la cantidad de elementos
	 * en la estrucutra
	 * @return cantidad de elementos 
	 */
	public int size() {
		return size;
	}
	/**
	 * Chequea si la estructura esta vacia
	 * @return true si esta vacia, false si pasa lo contrario
	 */
	public boolean isEmpty() {
		return size==0;
	}
	/**
	 * Agrega un elemento al principio de
	 * la estructura
	 * @param E elemento a ingresar al inicio
	 */
	public void addFirst(E e) {
		lista.addFirst(e);
		size++;
	}
	/**
	 * Agrega un elemento al final
	 * de la estructura
	 * @param E elemento a ingresar al final
	 */
	public void addLast(E e) {
		lista.addLast(e);
		size++;
	}
	/**
	 * Remueve el primer elemento de la estructura
	 * si este existe y retorna el elemento
	 * eliminado
	 * @return elemento eliminado
	 */
	public E removeFirst() {
		E toReturn =null;
		try {
			toReturn=lista.remove(lista.first());
			size--;
		} catch (InvalidPositionException| EmptyListException e) {
			e.printStackTrace();
		} 
		return toReturn;
	}
	
	/**
	 * Remueve el ultimo elemento de la estructura
	 * si este existe y retorna el elemento
	 * eliminado
	 * @return elemento eliminado
	 */
	public E removeLast() {
		E toReturn=null;
		try {
			toReturn=lista.remove(lista.last());
			size--;
		} catch (InvalidPositionException|EmptyListException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	/**
	 * Devuelve el primer elemento de
	 * la estructura si este existe
	 * @return primer elemento del Deque
	 */
	public E getFirst() {
		E toReturn=null;
		try {
			toReturn =lista.first().element();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	
	/**
	 * Devuelve el primer elemento de
	 * la estructura si este existe
	 * @return ultimo elemento del Deque
	 */
	public E getLast() {
		E toReturn=null;
		try {
			toReturn =lista.last().element();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		return toReturn;

	}
	public E peekFirst() {
		E toReturn=null;
		if (!isEmpty())
			toReturn=getFirst();
		return toReturn;
	}
	public E peekLast() {
		E toReturn=null;
		if (!isEmpty())
			toReturn=getLast();
		return toReturn;
	}
	
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean offerFirst(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean offerLast(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	 * Metodos no implementados de la interfaz
	 * Deque , los cuales son necesario para la ejecucion
	 */
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}
	public void push(E arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean offer(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeFirstOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeLastOccurrence(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
