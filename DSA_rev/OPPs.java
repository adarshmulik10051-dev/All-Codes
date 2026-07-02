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

   //9. Abstraction:
   //9.1 Abstaction classe
  // Animal a = new Animal();// nhi  banu shakt object abstaction class cha 
   Horse h = new Horse();
   h.eat();
   h.legs();

   Chik C= new Chik ();
   c.eat();

   //9.2 Interface :
  //   Chess s = new Chess();// object nhi bnu shakat inerface cha 

   King k = new King();
    k.moves();
    k.position();

    // 10 static keyword 
     
    Employee E1 = new Employee();
    E1.setname("Adarsh");
    E1.display();//Adarsh TCS

    Employee E2 = new Employee();
    E2.setname("Rohit");
    E2.display();//Rohit TCS tcs atumatic alla static banvla hota

      //11 super key word:

      Mobile m = new Mobile();
       m.display();//Samsung
 


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

   //9. Abstraction:(Hide HOW Show WHAT)
   /*
     defination:
     hiding all unnecessary deatail and showing only  important part part to user 

     why we use
     improve security
     user focus on only what to do not how 

     imp part :
     -hide  implementation detail 
     -aceve useing abstact class of interface 
     -one of most imp piller of oops 
     
     ex--  car 
          you know: break, steering ,horn 
          you dont know: how engine works ,gearbox working
   
   */
  
    //9.1 Abstract class : 

    /*Important Points:
    ✔ Cannot create objects.
    ✔ Can have Constructors.
    ✔ Can have Variables.
    ✔ Can have Abstract & Non-Abstract Methods.
    ✔ Child class must implement abstract methods. 

    */
     
      abstract class Animals{
        void eat(){
            System.out.println("all animal eats");
        };

        abstract void legs(); // each subclass have this walk() function complsory but
                             //  te kasa asel te to-to subclass tharvel
      }
       class Horse extends Animals{
         void legs(){//ithe banva laglach karan parent class made abstract ne method banvli ahhe
            System.out.println("Horse have 4 leg");
         }
      }
      
      class Chik extends Animals{
        void legs(){
            System.out.println("chik have 2 legs ");//compusory
        }
      }
      //see main 

      //10.Interface :
      /*

      defination:
      An Interface is a blueprint of a class that contains
      method declarations and constants.

      why:
      -To achieve  100% abstraction.
      -support multiple inheritance .
      -give idea about what in contract. 

      imp point :
      -decrale using interface keyword.
      -cannot create objet.
      -method will public and static.
      -Implemented using implements keyword. 
       */

      interface Chess {
        //kahli appam 2 method banvle ya pahijet subclass mde 
            public void moves();
            public void position();
      }

      class Queen implements Chess{
        public void  moves(){
            System.out.println("move all direction");
        }
        public void position(){
            System.out.println("left side of king ");
        }
      }
      class King implements Chess{
        public void  moves(){
            System.out.println("move all directionbut 0ne step");
        }
        public void position(){
            System.out.println("right side of king ");
        }
      }
                /*
            ===============================================
            ABSTRACT CLASS vs INTERFACE
            ===============================================

            | Abstract Class                     | Interface                          |
            |------------------------------------|------------------------------------|
            | Uses abstract keyword              | Uses interface keyword             |
            | Inherited using extends            | Implemented using implements       |
            | Supports Partial Abstraction       | Supports 100% Abstraction          |
            | Can have Constructors              | Cannot have Constructors           |
            | Can have Abstract & Normal Methods | Methods are abstract by default    |
            | Can have Instance Variables        | Variables are public static final  |
            | Can have any Access Modifier       | Methods are public by default      |
            | Single Inheritance                 | Multiple Inheritance Supported     |
            | Used when classes are related      | Used to define a common contract   |

            Memory Trick:

            Abstract Class  -> IS-A Relationship (extends)
            Interface       -> CAN-DO Relationship (implements)

            Example:

            abstract class Animal { }      // Dog IS AN Animal

            interface Flyable { }          // Bird CAN Fly

            ===============================================
            */

            //11 static keyword 
            /*
            Definition:
                The static keyword is used to create members
                that belong to the class
              
                why :
                save memory 
                share to all object 
                easily can acess 

                ex--> multiple student ahet s1 s2  s1 ch nem vegla score vega 
                                                   s2 ch name score vegla 
                                                   but doganch same college ahhe na 
                                                   mg college name static banvnar 

                
            */

            class Employee  {
                static String companyName="TCS";
                String name ;
                int  id ;

                void setname(String name){
                    this .name = name;
                }

                void display(){
                    System.out.println(name+" "+companyName );
                }
            }
            

            //11.Super keyword :
            /*
            Definition:
            super is a keyword that refers to the immediate parent class.

            Why?
                ✔ Access Parent class variables.
                ✔ Call Parent class methods.
                ✔ Call Parent class constructor.

             - need inheritance only 
             */
             

                class Phone {
                    String brand = "Samsung";
                }
                class Mobile extends Phone {

                    void display() {
                        System.out.println(super.brand);//acess kela parent cha brand
                        

                    }
                }





      
