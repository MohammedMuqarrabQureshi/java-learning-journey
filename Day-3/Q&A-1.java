// Q7

// What will this print?

// class Test {

//     int x = 10;

//     Test() {
//         x = 20;
//     }

//     public static void main(String[] args) {

//         Test t = new Test();

//         System.out.println(t.x);
//     }
// }

// Answer: This will print 20. The constructor of the Test class sets the value of x to 20, so when we create an 
// instance of Test and print t.x, it will output 20.







// Q8

// What happens here?

// class Student {

//     String name;

//     Student(String name) {
//         this.name = name;
//     }

//     public static void main(String[] args) {

//         Student s1 = new Student("Rahul");

//         Student s2 = s1;

//         s2.name = "Amit";

//         System.out.println(s1.name);
//     }
// }

// Explain the memory/reference concept.

// Answer: This will print "Amit". In Java, when we assign s2 = s1, both s1 and s2 refer to the same Student object in memory. 
// Therefore, when we change the name of s2 to "Amit", it also changes the name of s1, since they are both pointing to the same object. 
// This demonstrates that in Java, objects are accessed through references, and multiple references can point to the same object in memory.






// Q9 — Constructor Trap

// What happens?

// class Student {

//     String name;

//     Student(String name) {
//         this.name = name;
//     }

//     public static void main(String[] args) {

//         Student s = new Student();
//     }
// }

// Will it compile?

// Why?

// Answer: No, it will not compile. The Student class has a constructor that takes a String parameter, 
// and since we have defined a constructor, the default no-argument constructor is not provided by the compiler. 
// Therefore, when we try to create a new Student object with no arguments (new Student()), 
// it results in a compilation error because there is no matching constructor that takes no arguments.    









// DAY 3 INTERVIEW QUESTIONS

// You should be able to answer these without notes:

// Basic
// What is OOP?
// What is a class?
// What is an object?
// Difference between class and object?
// What is an instance variable?
// What is an instance method?
// Constructors
// What is a constructor?
// Why do we need constructors?
// Constructor vs method?
// What is a default constructor?
// What is a parameterized constructor?
// Can constructors be overloaded?
// Can constructors be inherited?
// Can a constructor have a return type?
// What happens if we don't define a constructor?
// this
// What is this?
// Why do we use this.name = name?
// What is constructor chaining?
// Difference between this() and this.variable?
// Objects
// What is an object reference?
// Can two references point to the same object?
// What happens when two references point to the same object?