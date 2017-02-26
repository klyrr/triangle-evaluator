# Task

Write a program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

# Run the tests

`mvn package`

# Run the program

`mvn compile && mvn exec:java`

The program will then ask you for your input. For example:

```
Please enter the length of the three triangle sides:
Next side:
22
Next side:
22
Next side:
22
The given triangle is EQUILATERAL
```

# Architectural decisions

I decided against too much abstraction because of the YAGNI principle.
As long as I don't really implement it I will not add an abstraction layer that I am not needing right now.

I put the class `TriangleEvaluator` in another file to make it testable. In this case I can test the class independently from the `Main` class.

I used an enum `TriangleType` as return value to be able to add more types of triangles in the future. And I like enums.

## Things to discuss

I used english strings for the input. For more languages these should be replaced with placeholder translations as the application
is not internationalized right now.


