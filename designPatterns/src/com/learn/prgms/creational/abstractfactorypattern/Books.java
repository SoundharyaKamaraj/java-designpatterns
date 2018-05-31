/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 *         problem we can face is class needs to contain objects of other
 *         classes or class hierarchies within it; this can be very easily
 *         achieved by just using the new keyword and the class constructor. The
 *         problem with this approach is that it is a very hard coded approach
 *         to create objects as this creates dependency between the two classes.
 * 
 *         So factory pattern solve this problem very easily by model an
 *         interface for creating an object which at creation time can let its
 *         subclasses decide which class to instantiate, Factory Pattern
 *         promotes loose coupling by eliminating the need to bind
 *         application-specific classes into the code. The factory methods are
 *         typically implemented as virtual methods, so this pattern is also
 *         referred to as the “Virtual Constructor”. These methods create the
 *         objects of the products or target classes.
 * 
 *         When to use Factory design pattern in Java
 * 
 *         Static Factory methods are common in frameworks where library code
 *         needs to create objects of types which may be sub classed by
 *         applications using the framework. Some or all concrete products can
 *         be created in multiple ways, or we want to leave open the option that
 *         in the future there may be new ways to create the concrete product.
 *         Factory method is used when Products don't need to know how they are
 *         created. We can use factory pattern where we have to create an object
 *         of any one of sub-classes depending on the data provided
 *
 * 
 */
public interface Books {

	public String getBookType();
}
