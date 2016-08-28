package com.linusapps.collectionvisualizer.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
/**
 * An Extension of a doubly LinkedList, but has methods that return the elapsed time for certain operations.
 * The method returns the elapsed time taken to perform the operation, but if it was not successful, it returns -1.
 * @author linus
 *
 * @param <E>
 */
public class CustomLinkedList<E> extends LinkedList<E> implements CustomAbstractCollection<E>{
	
	
	public CustomLinkedList() {
		super();
	}
	
	public CustomLinkedList(Collection <? extends E> c){
		super(c);
	}
	
	/**
	 * Adds an item, and returns the time taken to add that item.
	 * @return
	 */
	@Override
	public long addItem(E item){
		long startTime = System.nanoTime();
		super.add(item);
		long endTime = System.nanoTime();
		return super.add(item) == true ? endTime-startTime : -1; 
	}
	
	/**
	 * Removes an item and returns the time taken to remove that item.
	 */
	@Override
	public long removeItem(E item){
		long startTime = System.nanoTime();
		super.remove(item);
		long endTime = System.nanoTime();
		return super.remove(item) == true ? endTime-startTime : -1; 
	}
	
	/**
	 * Returns how long it checks to find an item.
	 * @param item
	 * @return
	 */
	@Override
	public long checkContains(E item){
		long startTime = System.nanoTime();
		super.contains(item);
		long endTime = System.nanoTime();
		return super.contains(item) == true ? endTime-startTime : -1; 
	}
	
	/**
	 * Draws the list.
	 */
	@Override
	public void draw(){
		System.out.println("\nLinkedList: " + "contains " + (super.size()-1) + (super.size() > 1 ? " values" : " value"));
		for(int i = 1; i < super.size(); ++i){
			System.out.print(super.get(i).toString() + "->");
			
		}
		System.out.print("/NULL");
	}

	
	
	
}
