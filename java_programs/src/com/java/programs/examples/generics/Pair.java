package com.java.programs.examples.generics;

public interface Pair<K, V> {
	default void setKey(K key) {}

	default void setValue(V value) {  }

	default K getKey()   {return null;}

	default V getValue() {return null; }

}
