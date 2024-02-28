# java Practice
{google_docs}https://docs.google.com/document/d/1f5gtRUDHb__Yanq6u325WVhNtRa4S9iBpcztFmu8Sik/edit?usp=sharing{/google_docs}
# JAVA Notes for INTERVIEW Preparation

<b>Why do we use Object Oriented Programming?</b>
To create an 
Organized, 
Flexible, 
Modular and 
Reusable 
code.

What are some advantages/benefits of Java? / Why should we use it?
Platform Independent (OS)
Open Source (Free of cost)
Object Oriented
Easy to learn / Simple
Portable
Secured
High Performance

What do you mean by platform independent?
It means that the Java program can run on any operating system. We don’t need to rewrite the code on a different platform. 

What are bytecodes?
Bytecodes are a set of instructions that looks similar to machine code but not limited to any specific processor.

What is open source?


What is Object Oriented Programming?


What is an object?
■ An instance of a class is another word for an actual object. 
■ To work with data represented by the class, we need a variable for the class. It is called an object.
■ It should start with uppercase and should be a noun.

Two main components of classes and objects are: 
Attributes (variables)
Behaviors (methods)

What are Methods?
■ Methods are the functions defined inside the classes that operate on instances (Objects) of those classes. 
■ It should start with lowercase and should be a verb.

Class creation Syntax:
class Class_Name{

}

Object creation Syntax:
Class_Name Object = new Class_Name();

Java Compilation?
Javac stands for Java Compiler. After compilation it will create a class file in the same folder. These class files are nothing but the bytecodes.
Eg: javac HelloWorld.Java

What are bytecodes?
Bytecodes are machine codes (machine readable codes) that contain binary values.


Java Interpreter?
Java interpreter is simply called java. After compiling(creating bytecode/class file for) java program we can run the bytecode using the java interpreter.
Eg: java HelloWorld

What is a class?
A class is a template for multiple objects with similar features. 
A class library is a set of classes.

Strings
String is a part of the class library.

Encapsulation
Encapsulation in java is the process of wrapping code and data together into a single unit. 
Eg: capsule

Inheritance
Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of the parent object.

An interface is a collection of method names, without actual definitions, that indicate that a class has a set of behaviors in addition to the behaviors the class gets from its superclasses. 

Polymorphism
It is the ability of a programming language to process objects depending on their class.

Interfaces


Packages


Unions and Structures
Unions and Structures are not supported.

AWT
The Abstract Window Toolkit (AWT) is Java's original platform-dependent windowing, graphics, and user-interface widget toolkit, preceding Swing. The AWT is part of the Java Foundation Classes (JFC) — the standard API for providing a graphical user interface (GUI) for a Java program.

Statements
Everything, every line is a statement in Java. It ends with a semicolon(;) at the end. Also known as member elements or fields.

Identifiers
Identifiers are the name given to various program elements like variables, class, methods, constants, etc.

Variables
Variables are used to store values. They occupy memory space. They have a name, type and a value.
There are 3 types of variables in Java:
Instance variable (object variables)
Class variable (applies to all classes)
Local variable (declared within the method or blocks)

Java language is case sensitive. Variables ‘X’ and ‘x’ are different ones.

Literal
Any constant value which can be assigned to the variable is called literal/constant.



new
To create a new object new is used. Memory is allotted for the new instance created for a given class. Constructors are the special methods for creating and initializing new instances of classes. 

On creating our own classes, we can create as many constructors as we want.

Memory Management
Memory management in java is automatic and dynamic. When we create an object in java,  it automatically allocates a certain amount of memory in heap. We don’t need to allocate memory for objects explicitly.

Syntax for creating an object variable: (using dot ‘.’)
ObjectName.variable;

Class variables
Class variables are created and stored in class itself. Their values are applied to the class and all of its instances. 

Class variable is created by using the static keyword before the variable.
Eg: class FamilyMember {
static string surname = “Johnson”;
String name;
Int age;
}


Reference to objects
When we assign objects to variables, or pass objects as arguments to methods, you are passing references to those objects, not the objects themselves or copies of objects. 

Casting and Converting objects and Primitive types
Casting is the mechanism of converting the value of an object or primitive type into another type. It does not affect the original object or value.

Data types
Primitive / Value types: int, float, boolean
Object / Reference types: String, Point, Window, etc.,

Types of casting and conversion:
Casting between Primitive type 
i) For converting smaller types to larger ones, no need to use explicit cast. It automatically converts. Eg: int to float, int to long,..
ii) To convert larger values to smaller types use explicit cast.
Syntax: 
(typename) value
Eg:
(int) (x/y);

Casting between Object types
Syntax: (classname) object
Object of one class can be cast into an object of another class. For this the class has to be inherited. That is, we can cast the object of one class to the object of another subclass or superclass only. 
Syntax:
(classname) object
Eg:
GreenApple a;
Apple a2;
a = new GreenApple();
a2 = (Apple) a;
Objects can also be cast to interfaces, but the interface has to be implemented from its class or superclass.


Converting primitive types to Objects and vice versa
java.lang package includes several special classes that correspond to each primitive data type. Integer for int type, Float for float type, etc.,
Eg:
Integer intObject = new Integer(35);	
//converts value(primitive) into object
To convert objects back to primitive:
int theInt = intObject.intValue();	// returns 35



Java Class Libraries
java.lang 
java.util 
java.io 
java.net 
java.awt 
java.applet 

Arrays
Array is used to store multiple values / list of items. Arrays can contain any type of values but we cannot store different types in a single array. (Like array of integers, array of strings,..)
An array is a finite ordered collection of homogeneous data elements.
Syntax: <data_type> <arrayName>[ ] ;
Eg: int temps[ ]; 
or 
int[ ] temps;

Allocating memory for an array
Syntax: <arrayName> = new <type>[<size>];
Eg: x = new int [100];

Defining and allocating memory together
Syntax: <type> <arrayName> [ ] = new <type> [<size>];
Eg: int x [ ] = new int [100];

2D Arrays
Eg: int myArray [ ] [ ] = {{1, 2, 3}, {4, 5, 6}};

Creating Array Objects
There are 2 ways:
Using a new operator to create a new instance of array.
Eg: String[ ] names = new String[10];
or
int[ ] temps = new int[99];

When you create an array object using new, all its elements are initialized for you (0 for numeric arrays, false for boolean, ‘\0’ for character arrays, and null for everything else). You can also create and initialize an array at the same time.


Instead of using new to create the new array object, enclose the elements of the array inside braces, separated by commas:
Eg: String[ ] chiles = { “jalapeno”, “anaheim”, “serrano,”  “habanero,” “thai” };

Multidimensional Arrays
Java does not support multidimensional arrays. Instead we can use an array of arrays.

Conditional Operator:
An alternative / simple method instead of if condition.
Syntax: 
Condition ? true_statement : false_statement



Switch conditions

Syntax:
switch (test) {
case value1:
Statement;
break;
case value2:
Statement;
break;
case value3:
Statement;
break;
default: statement;
}

For loop
It is used to execute a block of statements repeatedly for a certain number of times.
syntax:
for(initial_value; test_condition; increment) {
statement;
}

While loop
The while loop is used to repeat a statement or block of statements as long as the condition is true.
Syntax:
while (condition) {
 bodyOfLoop;
}

Dowhile loop
while loops test the condition before looping,making it possible that the body of the loop will never execute if the condition is false the first time it’s tested.
syntax:
do {
 bodyOfLoop;
} while (condition)

Constants
Constants are useful for setting global states in a method or object, or for giving meaningful
names to object-wide values that will never change. In Java, you can create constants only for
instance or class variables, not for local variables. 

A constant variable is something that does not change.
Eg: the value of pi = 3.1415..
The only way to define constants in Java is by using the final keyword.
Eg: final int val = 0;      //constant variable ‘val’

Defining Methods
Syntax:
return_type method_name (type1 arg1, type2 arg2) {
…………..
…………..
}

For a method that is returning an array object, use square brackets after the type.
Syntax:
int[ ] makeRange(int upper, int lower) { …. }

this keyword
this refers to the current object, and you can use it anywhere that object might appear - in dot notation to refer to the object’s instance variables, as an argument to a method, as the return value for the current method, and so on.
■ this is used to reduce name-space collision.
■ this can be used inside any method to refer to the current object.

Eg: this.x;
this.myMethod(this);
……..
return this;

Eg: 
class A{
void m() { System.out.println(“Hello m”); }
void n();
System.out.println(“hello n”);

this.m();
}
}

class Demonstration{
public static void main(String args[]){
A a = new A();
a.n();
}
}

this keyword is used;
To access the instance variables and methods of the current object.
To invoke the current class constructor using this() or this(args).
To pass the current object as an argument to another method or constructor.
To return the current object from a method.
To resolve the ambiguity between instance variables and local variables that have the same name.
Ref: https://javabeginnerstutorial.com/core-java-tutorial/this-keyword-java/

Eg: for different types of this. declarations


Passing arguments to methods
Primitive types are passed by value, object/instance of class are passed by reference.
Eg: class RangeClass {
int[] makeRange (int lower, int upper) {
int arr[] = new int[ (upper - lower) + 1 ];
for (int i = 0; i < arr.length; i++) {
arr[i] = lower++;
}
return arr;
}

void methodOne(){
System.out.println("Inside Method ONE");
}

void methodTwo(){
System.out.println("Inside Method TWO");
methodOne();	// same as calling methodOne()
}

public static void main (String arg[]) {
int theArray[];
RangeClass rc = new RangeClass();
RangeClass theRange = new RangeClass();

theArray = theRange.makeRange(1,10);
System.out.print("The array: [ ");
for (int i = 0; i < theArray.length; i++) {
System.out.print(theArray[i] + " ");
}
System.out.println("]");
    rc.methodTwo();
}
}

Variable Scope and method definition
Eg: class ScopeTest {
 int test = 10;		//instance variable / class variable
 void printTest () {
 int test = 20;		//local variable
 System.out.println(“test = “ + test);		// output will be 20 
 }
}

The local variable hides the instance variable. To print the value of an instance variable we have to use this.test to refer to the instance variable.

Class Methods
To define class methods, use the static keyword in front of the method definition, just as you
would create a class variable. For example, the max class method might have a signature like this:
Eg: static int max (int arg1, int arg2) { ... }

The signature for the main() method:
public static void main (String args[]) 
{
……..
}
Here’s a run-down of the parts of the main() method:
■ public means that this method is available to other classes and objects. The main()
method must be declared public.
■ static is the keyword. Here it refers to a class method (Method belonging to a class). We don’t need an object to call this method.
■ void is the return type, void indicates that the main() method doesn’t return anything.
■ main() is the method name. We don’t call the main method anywhere, so it's the starting point.
■ String refers to String class.
■ args[ ] is the array of string objects. It is the array of any(variable) size. We can write anything instead of args like String x[ ].

(NOTE: Java sees everything as string objects.)



The body of the main() method contains any code you need to get your application started:
initial variables or creating instances of any classes you may have declared.

Arguments
The arguments that we pass in the java program will be stored as an array of strings. To treat them as non-strings we have to convert them into whatever the type we want.
Eg: for (int i = 0; i < args.length; i++) {
 sum += args[i];
 }
Here the code will get an error on compilation because sum is of int type and args[i] is of array type. To solve this error we should write as:
for (int i = 0; i < args.length; i++) {
sum += Integer.parseInt(args[i]);
 }

Constructors
■ Constructors always have the same name as the class.
■ Constructors don’t have a return type.
■ The constructor is executed before the main function in Java. 
■ A constructor is a special method/function that is used to initialize an object. 
■ The constructor is called when an object is created using the new keyword. 
■ A constructor can have parameters, and it can be used to initialize the instance variables of the class.

Overriding Constructors
Constructors cannot be overloaded technically. But

Finalizer Method
Finalizer methods are called just before the object is garbage collected and its memory reclaimed. It is the opposite of the constructor method.
Syntax:
void finalize() {
 ...
}
In most cases we don’t need to use finalize.

Naming Conventions
Class - Start with Uppercase, use nouns. 
Interface - Start with Uppercase, use adjectives. Eg: Runnable, Printable, ActionListener,..
Variable - . Start with Lowercase, use nouns, avoid one character variables like x,y,z. Eg: int id;
Constant - . Use all Uppercase, separate by using underscore Eg: static final int MAX_VALUE;
Method - Start with Lowercase, use verbs. Eg: void add();

Pointers
Java does not have pointers.

import statement
When we want to use some special class defined somewhere then we should use import.
Eg: import java.lang.*;

Output from Java Program

Command Line Input
public class Echo
{
public static void main(String args[]) 
{ 
for (int i=0;i<args.length;i++) 
{
	System.out.print(args [i]+" "); 
	System.out.print("\n");
}
System.exit(0);
}
}

Output:





