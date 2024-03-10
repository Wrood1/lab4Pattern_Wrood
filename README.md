
# 1.1 Overview

This Lab session aims to provide a comprehensive understanding of Builder and Factory Patterns through real-world scenarios and hands-on implementation.

# 1.2 Objective

The purpose of this lab is to equip students with practical knowledge and skills in applying the Java Builder and Factory Design Patterns. By the end of this session, you’ll be able to implement efficient object-creation mechanisms and understand the benefits of using the Builder and Factory Design Patterns.

# 2 Lab Session 1: Builder Design Pattern

# Definition

The Builder design pattern is a creational pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

# Benefits

Flexibility: Allows the construction of complex objects step by step.
Reusability: The same construction process can be used to create different representations.
Control: Provides control over the construction process, allowing variations in the final product.

# When to Use
The Builder pattern is suitable in scenarios where the construction of an object involves multiple steps, and the constructed objects can have different representations.


# Lab Session 2:Factory Design Pattern 

#  Definition:
The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

# Benefits:

Encapsulation: The client code is abstracted from the details of class instantiation.
Flexibility: It allows the addition of new product types without modifying existing code.
Consistency: It ensures consistency in creating related objects.

# When to Use:
The Factory pattern is suitable in scenarios where the client code needs to create instances of several related classes, and the actual classes to be instantiated are determined at runtime.