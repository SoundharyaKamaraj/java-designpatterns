/**
 * 
 */
package com.java.programs.examples.generics;

import com.java.programs.examples.generics.Node;

/**
 * @author Soundharya
 *
 */
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
