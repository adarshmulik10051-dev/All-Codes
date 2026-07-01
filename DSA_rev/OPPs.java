public class OPPs {
// theory khali vacha 
public static void main(String args[]){
        //1.object: //2.class khali ahhe 
     Pen p1 = new Pen();//object created 
     p1.chnagecolor("blue");
     System.out.println(p1.color);
     p1.color="yellow";
     System.out.println(p1.color);
     p1.setTip(5);
     System.out.println(p1.tip);

     //3.Access modifires :
     BankAccount b1 = new BankAccount();
     b1.username ="adarsh";
     System.out.println(b1.username);
     // b1.PassWord="adarsh12"// error not acess beacause of private 
     b1.SetPass("adarsh12");
     //  System.out.println(b1.password); no acess 

     //4.Getters & setter    
     Student s1 = new Student();
        s1.setname("adaarsh");
        System.out.println(s1.getname());

     //5 encapsultion:
     ApanaCollege u1 = new ApanaCollege();
      u1.setpassword("Adarshmulik");//setters
      System.out.println(u1.getpassword());   //getters

   //6. constructor
   Cricket player1 = new Cricket();

   //7.Inheritance:
   //7.1.Singlelevel Inheritance: 
  //one child class inherits property from one parent.
     Dog d = new Dog();
     d.eat();//yess animal can eat
     d.bark();//yes all dog bark
     //animal-->dogs 
  

   //7.2 multilevel inheritance:
    //the child class beacome parent class of  another class 
   Puppy p = new Puppy();
   p.eat();
   p.bark();
   p.play();//puppys are play
   //animal-->dog-->puppy

   //7.3 heirachial level inheritance:
   //multiple child class inherit from one parent class 
     Cat c = new Cat();
     c.eat();
     d.eat();
   /*
    Animal
    /   \
   Dog  Cat */

   //7.4 Hybrid Inheritance:
   // is combination of two or more types if inheritance.
   //it cannot be support class it can be use interface 
   // due to avoid diamond problem 

   //8.polymorphism

   //8.1 compiletime polymorphism:(method overloading);
   Calculator c1 = new Calculator();
   System.out.println(c1.sum(1,2));
   System.out.println(c1.sum(1,2,3));
   //8.2  run time khali 

}

}
    /* ==========================
    OOP (Object Oriented Programming)
    ==========================
    //1.defination: oops is the programming paradigms that orgnise code
    //using class object &interface --> cars ,student ,bankaccount

    2.class:
    class is the groop of enties or its blueprint /template for create objets 
    it define:
    variables(data) and meathod(behaviour) 
    student class , car class 
    example pen is class contain data and method */
    class Pen {
    String color;
    int tip;

    void chnagecolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
  } 

 //2.Object: 

 /*
  defination:
  object is the real worls representation of class 

  why we use:
  used to acess data variables and methods of class 

  syntax:
  className Objectname = new className();

  example:
  Pen  p1 = new pen();//main class mde banva nehmi 
  pen--> className 
  p1--> object name 
  new-> allocate memory and create objet 
  pen()-->constructor

  Real Life Example:
    Class  -> Car
    Object -> BMW, Audi, Tesla
  see main class:1 */
  
  
 /* 
  //3.Access Modifires:

   defination:
   controls accessiblity of classes ,methods ,variables ,construtors

   why we use:
   to provide security and controll

   types:
   1. public   :Accesible from anywhere (most acess\|/)
   2. protected: same packege subclass
   3. default  : only same package
   4. private  :within the same class (least acess|^)
 */
class BankAccount{
    public String username;
    private String PassWord;

    public void SetPass( String pwd){
       PassWord=pwd;
    }
}
//see main class 3.

/*
// 4.Getters and Setters:
    defination:
    getter and setter are public method that can acess & update 
    the private varibles of class.

    why we use:
    protect data from direct acess.
    to acehive encapsulation 

    syntax:
    getVarname();
    setvarname(value);

    ✔ Getter returns the value.
    ✔ Setter updates/modifies the value.
    ✔ Mostly used with private variables */


    class Student {
     private   String name;
     private   int age;

        //getters
        String getname(){
            return this.name;
        }
        void setname( String newName){
            this.name=newName;
        }
        //setters:
        void setAge(int Newage ){
            this.age=Newage;
        }
    }
    /* 
    //5.Encapsulation:

    defination:
    the wrapping up of data(Variables) and methods(function) in single unit(class)
     &also implement data hiding us

    why we use:
    . provide data Hiding .
    .protect data from unauthorized acess 
    .make code easier and maintain 
    . increse security

    how to acheive :
    make variable private 
    acess and update using getter setter

    */
   class ApanaCollege{
    private String userName;
    private String password;

     void setUserName(String name){//setter
        this.userName=name;
     }
     
     String getUsername(){//getter
        return this.userName;
     }
     void setpassword(String pass){//setter
         this.password=pass;
     }
     String getpassword(){//getter
       return  this.password;
     }
   }

   //5.1.Constructor:
    /*
    defination:
    constructor is a specail method that automatically call when object is crated

    Rules:
    ✔ Constructor name must be same as Class name.
    ✔ It has NO return type (not even void).
    ✔ Called automatically using 'new' keyword.
    ✔ Constructor can be overloaded.
    */
   class Cricket {
    String PlayerName;
    String criteria; 
    int runs;

    Cricket(){//this is constructor
     System.out.println("contstructor is called...");
    }
   }
   //5.1.2 types of constructor:
/* 
     1. Non-Parameterized Constructor:
     A constructor that does not accept any arguments.

     syntax:
     ClassName(){

        }


     2. Parameterized Constructor:
         defination:
         A constructor that accepts one or more parameters.

         Syntax:

            ClassName(datatype variable){

            }
            example:
             student (String name){

             }
             /*
            Important:

            Java provides a Default Constructor only if
            you do NOT create any constructor.

            If you create even one constructor,
            Java will NOT create the default constructor.

        3.copy constructor:
          
        defination:
        A Copy Constructor creates a new object by copying the values
        of another object.

        Student(Student s1){


           # Shallow Copy = Copies Reference (Shared Memory)
            Deep Copy = Copies Object (Separate Memory)
*/
     
     //6.Inheritance:
     /*
     
     defination:
     inheritance is  when properties and methods of base class 
     are passed on to derievd class 

     why we use:
     code reusablity
     avoid code duplication
     easy maintain
     run time polymorphism 

     syntax:
     child class extend parent class {
       
         }
     // types of Inheritance :
          1.single level
          2.multiple level
          3.heirachial level
          4.hybrid level

       
      */ 
    
     class Animal { //parent class
        void eat(){
            System.out.println("yess animal can eat");
        }
     }
     class Dog extends Animal{// single level animal-->dogs 
        void bark(){
            System.out.println("yes all dog barks ");
        }
     }
     class Puppy extends Dog{  //multilevel animal -->dog-->puppy
        void play(){
            System.out.println("puppys are play");
        }
     }
     class Cat extends Animal{ //animal-->1.cat 2.Dog
        void mewo(){
            System.out.println("cat meaow");
        }
     }
   

     //7.Polymorphism:
     /*
       defination:
       polymorphism mean "one" 'name' "many" 'forms' 

       why we use:
       same  method can perform diff works
       code duplication 

       types:
       1.compile-time polymorphism(method over loading )
       2.run-time polymorphism(method over riding)

       ex-- person can-student also,worker also -teacher also, 
       same person dif role
     //7.1 compile-time polymorphism 
          method overloading : having multiple same name methods but diff parametes.
          example:
         method()
         method(int a)
         method(int a,int b)
    */
    class Calculator{
        
        int sum(int a , int b){
            return a+b;
        }

        int sum(int a , int b, int c){
            return a+b+c;
        }

    }
    /* 
    8.2 run time pilymorphism:(method overriding)

    define: 
    redefining parent class method inside child class
    
    why :
     allow to deploy child class its own implementation
     acheve runtime poly
     Rules:
    ✔ Same Method Name.
    ✔ Same Parameters.
    ✔ Inheritance is Required.
    ✔ @Override annotation is optional but recommended

     animal {
     speak();{yes speek}
     }

     dog exetends animal {
     speak(){
       yes bark;
     }

     Overloading           Overriding                        
       ↓                      ↓
   Same Class               Parent → Child #nedd inheritance 


    */

      
