/**
 * 
 */
package com.java.programs.examples.generics;

import java.math.BigInteger;

/**
 * @author Soundharya
 *
 */
public class OrderedPair<K extends BigInteger, V extends Number> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}
