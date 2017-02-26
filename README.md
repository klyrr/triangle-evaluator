# Task

Write a program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

# run the program

`mvn compile && mvn exec:java`

# run the tests

`mvn package`

# Architectural decisions

I decided against too much abstraction because of the YAGNI principle.
As long as I don't really implement it I will not add an abstraction layer that I am not needing right now.


