package com.example.java; //package is required input
import addPackage.*; //we have added this file into this java project | import can only be added below the package declaration
import java.util.*; //this needs to be added first

class HelloWorld { //access specifier is needed in classes java unlike c++, name of class must start with capital letter
    public static void main(String[] args) {
	    System.out.println("Hello World"); //click ctrl + q for quick documentation
	    String aString = "Renz"; //assigning variable is pretty much the same from c++
        System.out.println("Your name is " + aString); //click shift+f1 for web documentation
    }
}

//LESSON C.11 - KINDS OF PRINT STATEMENTS IN JAVA
class C11 {
    public static void main (String[] args){
        System.out.print("Sample Text"); //does not have implicit \n
        System.out.println("println automatically add new line for the next line"); //it's like putting \n at the end
        String sampleString = "printf";
        System.out.printf("C style printing " + sampleString); //you need placeholder just like printing in c and c++ printf
    }
}

//LESSON C.12 - PRIMITIVE DATA TYPES
//everything is the same with c++ except byte datatype
class C12 {
    public static void main (String[] args){
        byte aByte = 1; //1 byte
        short aShort = 1; //2 byte
        int aInt = 1; //4 byte
        long aLong = 1; //8 byte
        float aFloat = 1.1f; //4 byte
        double aDouble = 1.1d; //8 byte
        char aChar = 'a'; //1 byte
        boolean aBool = true; //bool has only a value of true or false it can't be 1 or 2 unlike c++, in c++ anything with a value is true, that is not true for java
        String aString = "abc"; //not a primitive data type, this sample has 4 byte of occupied space, null included
    }
}

//LESSON C.13 - OPERATORS
//no difference with c++
class C13 {
    public static void main (String[] args){

        //UNARY OPERATORS
        int a = 1;
        a++; //add 1 after the end of statement
        ++a; //add 1 immediately, no need to wait for end statement
        a--; //decrease 1 after the end of statement
        --a; //decrease 1 immediately, no need to wait for end statement

        //ARITHMETIC OPERATORS
        int b = 1;
        int c = 2;
        int result;
        result = a + b; //obviously you add 1 and 2
        result = a - b;
        result = a * b; //'*' just means multiplication, there's no pointers in java unlike c++
        result = a / b; //a divided by b
        result = a % b; //get the remainder when you divide a by b, answer is 1

        //RELATIONAL OPERATORS
        float d = 1.1f;
        float e = 2.2f;
        boolean doThis = false;
        if (d != e){ //if d is not equal to e
            doThis = true;
        }
        else if (d > e){ //if d is greater than e
            doThis = true;
        }
        else if (d < e){ //if d is less than e
            doThis = true;
        }
        else if (d >= e){ //if d is greater than or equal to e
            doThis = true;
        }
        else if (d <= e){ //if d is less than or equal to e
            doThis = true;
        }
        else if (d == e){ //if d is equal to e
            doThis = true;
        }

        //LOGICAL OPERATORS
        double f = 1.11d;
        double g = 2.22d;
        double h = 3.33d;
        boolean doThisAgain = false;
        if (f > g && f > h){ //if ((true) && (true)) | both conditions need to be true
            doThisAgain = true;
        }
        else if (f < g || f < h){ //if ((true) && (false)) | one condition need to be true
            doThisAgain = true;
        }
        else if (!(f > g)){ //if condition is true make it false; vice-versa | f is not greater than g so this would be true
            doThisAgain = true;
        }

        //ASSIGNMENT OPERATORS
        //l value = r value
        long i = 123; //we are assigning the value of 123 to variable 'i'
        int j = 10; //binary value: 01010
        int k = 20; //binary value: 10100
        int l = 30; //binary value: 011110
        int m = 40; // binary value: 101000
        i += 123; //this is equal to i = i + 123
        i -= 123; //this is equal to i = i - 123
        i *= 123; //this is equal to i = i * 123 (multiply)
        i /= 123; //this is equal to i = i / 123 (division)
        i %= 123; //this is equal to i = i % 123 (remainder)

        //BITWISE ASSIGNMENT OPERATORS & BITWISE OPERATORS
        j &= k; //this is equal to i = i & k | & - both binary must be 1 to be 1 | resulting binary: 00000
        j ^= k; //this is equal to i = i ^ k | ^ - only 1 of the binary must be 1 to be 1 | resulting binary: 11110
        j |= k; //this is equal to i = i | k | | - only 1 of the binary can be 1 and it would be 1 | resulting binary: 11110
        l <<= 1; //this is equal to i = i << k | << - shift the binary value right | resulting binary: 111100
        m >>= 1; //this is equal to i = i >> k | >> - shift the binary value left | resulting binary: 010100
    }
}

//LESSON C.14 - IF,ELSE,ELSE IF
//again, no difference with c++
class C14 {
    public static void main (String[] args){
        int a = 100;
        int b = 200;
        int c;
        boolean doGangnamStyle = false;
        if (a > b){
            doGangnamStyle = true;
        }
        else if (a < b){
            doGangnamStyle = true;
        }
        else
            c = 300; //if only one-liner, no bracket is needed, but it is a good practice to always apply bracket
    }
}

//LESSON C.15 - ARRAYS
//a little bit different with c++ array, in c++ array decays into pointers but java has no pointers, syntax initialization is also different
class C15 {
    public static void main (String[] args){
        final int size = 5;

        //method 1 declaration
        int[] arr = new int[size];

        //method 2 declaration + initialization (best practice)
        int[] arr2 = {1,2,3,4,5};

        //changing values - counting starts from zero, like in c++
        arr[0] = 100; //since array 'arr' currently has no value we have assigned a value of 100 to the first element
        arr[4] = 500; //arr[4] is not like *(arr+4) because again, java has no pointers unlike c++

    }
}

//LESSON C.16 - FOR LOOPS AND RANGE BASED FOR LOOPS
//everything is the same just like in c++
class C16 {
    public static void main(String[] args) {
        //for (initialization; condition; increment)
        for (int i = 0; i < 10; i++){
            System.out.println("value of i is " + i);
        }

        int[] iArray = {2,4,6,8,10};
        for (int i:iArray){ //range based for loops is only used on containers such as array,etc. | this is equal to i = iArray[i]
            System.out.println("value of iArray is " + i);
        }
    }
}

//LESSON C.17 - WHILE AND DO WHILE LOOPS
//literally no difference with c++
class C17 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        //while (condition) is true
        while (a <= 9) { //any variable with a value is true, if a becomes 0 it become false
            System.out.println("value of a is " + a);
            a++;
        }

        //same as while but in here you have to do the thing first before looping
        do {
            System.out.println("do this at least once");
            b--;
        }while (b > 1); //this would loop 3 times

    }
}

//LESSON C.19 - CLASSES AND OBJECTS
//idk if there's any difference with c++ everything looks the same

class C19 { //class name must start with capital letter
    //data members
    int a;
    int b;

    //methods
    void setValue (int x, int y) {
        a = y;
        b = x;
    }
    void displayValue () {
            System.out.println("a is " + a + "\nb is " + b );
        }
} //there's no ';' unlike in c++

class C19A {
    public static void main(String[] args) {
        //  class   obj = new constructor
        C19 obj = new C19();
        obj.setValue(100,200);
        obj.displayValue();
    }
}

//LESSON C.20 - INSTANCE,LOCAL,STATIC VARIABLE
//java has no global variables unlike c++
class C20 {
    //you can't initialize data members of classes, you could only initialize them in constructor just like in c++
    int a; //this is an instance variable, this is available on the whole part of the class
    static int c; //this is a static variable, this could only be initialized once

    public static void main (String[] args){
        //non static variables lifetime are ended when the '}' is reached
        int b; //this is a local variable, this variable is only available to this method
    }
}

//LESSON C.21 - 2D ARRAY
//everything except syntax is the same with c++
class C21 {
    public static void main (String[] args){
        //int[row][column]
        int[][] arr = new int[10][5]; //it can be declared like this | if declared like this, size needs to be indicated
        arr[0][0] = 5; //initialization

        //better declaration (best practice) | no size indication needed, it automatically knows what the size based on the input
        double[][] Arr123 = {{1,2,},{3,4},{5,6}};

        //irregular array - it's not explicitly available in c++, but there's a technique for it in c++ | also called as jagged array
        int[][] irrArr = new int[2][]; //here we have only input 2 columns with no rows
        irrArr[2] = new int[3]; //index 1 (element 2) of the fixed column array has now a row of 3
        irrArr[1] = new int[2]; //index 0 (element 1) of the fixed column array has now a row of 2
    }
}

//LESSON C.22 - PACKAGES
//package is just a folder on which does this java project belongs
//import is the equivalent of #include in c++ | e.g. import packageName.thisFolder; | e.g. import packageName.*; '*' means everything within this folder
//package thisfolder; //this is placed at the top
//import addPackage.*; //we have added this file into this java project | add this at the top/header
class C22 {
    public static void main (String[] args){
        int a,b;
        a = 10;
        b = 20;
        AddClass obj = new AddClass();
        obj.sampleMethod(a,b);
    }
}

//LESSON C.23 - BREAK AND CONTINUE
//no difference with c++
class C23 {
    public static void main (String[] args){
        for (int i = 0; i < 10; i++){
            if (i==2){
                continue; //if the above condition is true, the loop will start from the top and not execute the one below
            }
            else if (i==6){
                break; //the loop will stop if the above condition is true
            }
            System.out.println(i);
        }
    }
}

//LESSON C.25 - METHOD OVERLOADING
//no difference with c++, btw this overloading is a type of compile time polymorphism
class C25 {
    //these 2 methods has the same name but different datatype of arguments, it could also be differentiated with no. or sequence of arguments
    //return datatype can also be changed but it is not used to differentiate if the 2 method is different, only the argument
    int add(int x, int y){
        return x + y;
    }
    static double add(double x, double y){
        double result = x + y + 1;
        return result;
    }
    public static void main (String[] args){
        double x = 1.11111d;
        double y = 2321321.1d;
        System.out.println(add(x,y));
    }
}

//LESSON C.26 - CONSTRUCTOR
//again no diff with c++, except c++ has more ways to initialize an instance variable
class C26 {
    int a;
    //default constructor are automatically created, but if you specify a parameterized constructor they won't be automatically created anymore
    C26 ( ) { } //constructor has the same name with class name, this is what default constructor looks like

    //constructor could also be overloaded just like methods, just like in c++
    C26 (int x){
        a = x;
    }

    void printValue () {
        System.out.println("value of instance variable a is " + a);
    }

    public static void main (String[] args){
        C26 obj = new C26(5);
        obj.printValue();
    }
}

//LESSON C.27 - NAMING CONVENTIONS
//CLASSES AND STRUCTS - Every Word Starts With Capital Letter LikeThis
//METHODS AND VARIABLES - Use camelCase
//METHOD NAMING - best practice to start with verb, e.g. calculateArea()
//CONST/FINAL - Use ALL CAPS
//BOOLEAN METHODS/FUNCTION - Start with is, e.g. isEven()

class C27 { //proper naming convention for class
    int sampleVariable; //proper naming convention for variable

    double calculateArea(int x, int y){ //proper naming convention for method
        return x*y;
    }

    boolean isEven (int x) { //proper naming convention for boolean
        if (x%2 == 0){
            return true;
        }
        return false;
    }

    public static void main (String[] args){

        //this is a constant variable so make it all caps for best practice
        final float PI = 3.14f;
    }
}

//LESSON C.28 - WRAPPER CLASSES IN JAVA
//java isn't 100% oop since it uses primitive datatype, to use object datatype equivalent to these primitive you could do this
class C28 {
    public static void main (String[] args){
        //equivalent of int to wrap class is Integer, double is Double, etc. you know the pattern
        int a = 10;
        Integer obj = new Integer(a); //boxing
        int b = obj.intValue(); //unboxing

        Integer obj1 = 1; //autoboxing
        int c = obj1; //autounboxing

    }
}

//LESSON C.29 - STATIC KEYWORD
//few diff with c++ including static block and static variables cannot be declared inside method
//static variables are allocated in different part of the memory that is neither in the stack or heap, it does not get destroyed thus it retain its value, static var are only initialized once
//static var and method - you do not need to create an object to call them, static method can only use static var that is outside the function's scope
class C29 {
    static int a;
    static double dDouble = 100.110d; //this would only get initialized once
    static void sampleMethod () {
        a = 5; //a could be assigned in here since it is static
        int b = 100; //if creating a var inside a static function, no need to indicate static
        for (int i = 0; i < 10; i++) {
            float asdf = 10.001f; //this would get initialized every time the loop is in circle because it is not static :((
            dDouble++; //watch it increment
            asdf++; //it wouldn't get incremented since it is initialized every time the loop is in circle
        }
    }
    public static void main (String[] args) { //this is static so compiler does not have to create an object to call this method
        sampleMethod();
        }
}

//LESSON C.30 - TYPECASTING
//idk if there's a difference with c++ but i don't think so
//only used when assigning a different datatype to a variable with also a different datatype
class C30 {
    public static void main (String[] args){
        float fFloat = 123.1f;
        double dDouble = 1231.1231231;
        int aInt = (int) fFloat; //this is called explicit conversion, values are possibly truncated with typecasting
        //int aInt1 = dDouble; //this is implicitly converted but it gave a warning with intellej ide so it is a best practice to explicitly typecas
    }
}

//LESSON C.31 - SCANNER CLASS
//this is the std::cin equivalent for java
//import java.util.*; //this needs to be added first | add this at the top

class C31 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println("the value of input is " + userInput);
    }
}

//LESSON C.32 TO C.35 - INHERITANCE
//c++ inheritance syntax: class b:public class a (public means everything in the access specifier is exactly copied)
//java inheritance syntax: class b extends class a (no such thing as access specifier inside classes,this makes c++ more flexible)
class C32A {
    void methodOne () {
        int a = 10;
        System.out.println(a);
    }
}

//super class extends sub class
//c++ = class B: public A {
class C32B extends C32A { //single level inheritance, class b inherits everything class a has
    void methodTwo () {
        int[] arr = {1, 2, 3, 4, 6};
        int i = 0;
        for (; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

class C32C extends C32B { //multilevel inheritance, class c inherits everything class b has including the one inherited from class a
    void methodThree () {
        System.out.println("just print this");
    }
}

class C32D extends C32A { //hierarchical inheritance, class d and class b inherits from class a
    void methodFour () {
        System.out.println("yeah, just print this again");
    }
}

class C32 {
    public static void main (String[] args){
        C32B classB = new C32B();
        classB.methodOne(); // single level inheritance,this has been inherited from class a
        C32C classC = new C32C();
        classC.methodOne(); //multilevel inheritance, it inherits from class b which inherits from class a, thus being able to use class a's method
        C32D classD = new C32D();
        classD.methodOne(); //hierarchical inheritance, class d and class b inherits from class a
    }
}

//LESSON C.36 - OVERRIDING AND OVERLOADING METHOD
//overloading method is just the same with c++
//overriding is almost just the same with c++, idk the diff. | it occurs when derived class had the same method with base class | also called as dynamic binding
class C36 {
    int overloadingMethod (int x) {
        return x;
    }
    double overloadingMethod (int x, double y){
        return x+y;
    }
}

class C36A {
    void overrideMethod ( ) {
        System.out.println("base class");
    }
}

class C36B extends C36A {
    @Override
        //it is a good practice to add this when overriding a method
    void overrideMethod() {
        System.out.println("derived class");
    }
}

class C36Main {
    public static void main (String[] args) {
        //in here, method of C36A(base class) would be executed, C36B = C36A, that's illegal right? in normal circumstances it is, but with inherited classes its possible
        C36A derive = new C36B();
        derive.overrideMethod(); //in here we are calling derive method | if 2 methods were static you can't override it, the outcome would be "base" for static methods
    }
}

//LESSON C.37 - SUPER KEYWORD IN JAVA
//it is used to access parent's class data member/member functions
class C37A {
    int salary = 100;
    C37A () {
        System.out.println("intern constructor");
    }
    void sampleMethod () {
        System.out.println("using base class");
    }
}

class C37B extends C37A {
    int salary = 500;
    C37B () {
        super(); //here we are calling the Intern() constructor
    }
    void displaySalary () {
        //using 'super' means we're referring to the parent class
        System.out.println("salary is " + super.salary);
    }
    void sampleMethod () {
        System.out.println("using derive class");
    }
    void superMethod () {
        super.sampleMethod(); //here we are using the parent's class method
    }
    public static void main (String[] args){
        C37B obj = new C37B();
        obj.superMethod();
    }
}

//LESSON C.38 - THIS KEYWORD
//this is the same with c++ 'this' the difference is the way you call them, in c++ it is a pointer | 'this' refers to the instance variable or data members of the class

class This {
    int a;
    This (int a){
        this.a = a; //this.a is calling the instance variable 'a'
    }
}

//LESSON C.39 - FINAL
//this is the equivalent of c++'s constant in java but there are again some differences

final class Final { //final class cannot have subclass/cannot be inherited
    final int f = 10; //values of 'f' cannot be changed
    final void fMethod () { //final method cannot be overriden
        int a;
    }
}

//LESSON C.40 - ABSTRACT KEYWORD
//can't create an object with abstract class, it is only used when same data members is being used by different class you can make those classes inherit from abstract class
//you leave abstract method classes as blank, it is used when you want the child classes to determine what does the method's supposed to do

abstract class Abstract { //cannot create an object with this
    int a = 100;
    abstract void randomMethod (); //child class will define its context
    void randomMethodAgain () { //it could also contain concrete method, basically its like a normal class but can't be declared as object
        System.out.println("example of concrete method");
    }
}

class A extends Abstract { //class a inherits everything from class Abstract
     void randomMethod () {
        int b;
    }
}

//LESSON C.41 - INTERFACE
//interface are like to do list, every method declared in interface are all default abstract, can't create concrete method in interface
//variables are default public static final, means it can be accessed anywhere,it can only be initialized once, it retains information and the values cannot be changed

interface sampleInterface {
    int a = 1000; //this is default public static final int a = 1000
    void displayInterface (); //this is default abstract void displayInterface (); | we can only define it at child class
}
class IClass implements sampleInterface { //this is the inheritance value for interface
    @Override
    public void displayInterface () {
        System.out.println("this does this!");
    }
}

class C41 {
    public static void main (String[] args){
        IClass obj = new IClass();
        obj.displayInterface();
    }
}

//LESSON A.1 - ACCESS MODIFIERS

//class can only be default or public, public modifier means it can be accessed through a different package
class Modifiers {
    //instance variables and methods can be public,default,private, and protected, everything is the same with c++ for access specifiers
    public int a; //everyone can access this
    private int b; //current class is the only one that has access to this
    protected int c; //current class and subclass can only access it

    Modifiers (int a){
        this.a = a;
    }

    public void displayA () {
        System.out.println(this.a);
    }
}

class C41Main {
    public static void main (String[] args) {
        Modifiers obj = new Modifiers(5);
        obj.displayA();

    }
}










