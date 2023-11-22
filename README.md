## Class & Objects
1.  Disclamer:- **We discussing Class & Objects only which is required for Linked List & Trees**
``` 
    Ques:-  What is Class ?
    Ans :-  It is nothing but an "Blueprint".
    
    Ques:-  What is Object ?
    Ans :-  It is nothing but an "Actual Instance of the class". 
    
    Ques:-  Can one Blueprint used to To construct multiple appartments ?       like:-  In the society the appartment above & below both are exactly same.
    Ans :-  so, One Class can have multiple objects.
    
    When we define a class, class comprise of two things.
        1.  Attributes to define data.
        2.  Methods to define functionalities.
    
    Eg:-    
        Creating a blueprint of the Car.
            Class Car {
                name    // these are data for the car.
                color
                milage
                .
                .   
                anything that we want to know / store about the car that comes under attribute of the car.
                
                drive(){...}    // basic functionality of the car.
                AC() {...}
                Wiper() {on/off} 
                music() {on/off} 
                sunRoof() {open/close}
                .
                .
                these are functionality of the car. || Methods.
            }
            
        img 1, uday buys a car(blue color) which is a physical car. 
        means Uday car is the Object for the Class Car(purple color).
        
        Class can have multiple objects. img 1.  
            if we pick any either Uday or Sairam, we can say drive(), ac() or other functionalities are almost similar in all the cars. 
          
            Ex:-    There is a class Student. img 2.
                    when we write Student S1 = new Student();   then what happen. 
                        new Student():-
                            we get memory where we store data for the particular Student. like name & id of the students. memory address is #2368 that created by 'new Student()'. 
                        
                        Student S1:-    
                            Student S1 what happen if we write this. 
                                S1 will store this memory address #2368, it is actually "Object reference of Student class".                        
                                means we can refer the object {name, id} using this reference S1.
                                so when we acess to name, id then we can access it by using S1.
                    
            now, Student S3;        if we write like this.  we does not write new ...  
                S3 is just Object Reference of Student Class.  we have not assigned any object to S3. then S3 will not store the data.
                like:-
                    print(s3.name);         means we will not get any data, becoz there are no object assigned to it. so S3 by default store null. 
                    we will get NullPointerExcepetion becoz 'we are trying to access some data which is not present'. 
                    
            now, Student S4 = S2;       // shallow Copy. it means 'we don't create any seprate memory, instead diff objects points to the same memory'.     ==>     multiple objects pointing to the same memory.       here we save memory, but changes will reflect. but copy the data.
                    whatever changes we will do with S4 that will also reflect to S2 becoz both are pointing to same object.
                    
            Ques:-  If we want that Changes of obj1 should not reflect on Obj2 & we want to copy the Obj1 into obj2 ?
            Ans :-  We need to create a new memory.
                    Student S6 = new Student();     img 3.
                    ..........
                    ..........
                    
                    Student S7 = new Student();     img 3.
                        // Copying the data of S6 into S7.
                        S7.name = S6.name; 
                        S7.id = S6.id;  
                    
                    
                    Deep Copy, it means "Any change in one object will not reflect in other object".        here we are not save memory, but changes will also not reflect. but copy the data.
                    
    see problem      see in pdf. 
    Constructor:-
            -   It has same name as class name.
            -   Constructor is only initializing the attributes then we don't have to return anything from the constructor. so always not return any value.             "By default we don't need to write void in the constructor becoz it never return any value".
    
    Code:-  Finding the sum of rectangle which is not square. see in pdf. 
        ans = 0;
        for i--> 0 to N-1
            Rectangle R1 = new Rectangle(A[i], B[i]);
            boolean result = R1.isSquare();
            if(result == false)
                ans = R1.l + R1.b;
        return ans;
        
                ||
        
        Rectangle R1;       Single reference variable will point  multiple objects.      
        ans = 0;
        for i--> 0 to N-1
             R1 = new Rectangle(A[i], B[i]);
            boolean result = R1.isSquare();
            if(result == false)
                ans = R1.l + R1.b;
        return ans;
```
### Why we are reading Class.
``` 
    Imagine, instead of rectangle, we have complex figure like Square. for square we have diff diff methods which doing complex things.
        In the Main are of Code (below one) if we just writing one function isSquare() & this Main code if we show to some other person then he can know easily what the code is doing.
            {
                    ans = 0;
                    for i--> 0 to N-1
                        Rectangle R1 = new Rectangle(A[i], B[i]);
                        boolean result = R1.isSquare();
                        if(result == false)
                            ans = R1.l + R1.b;
                    return ans;
            }
        If we write the complex thing inside the code itself then new person will not able to understand what is going on.                                      means, it "More Readable".
        
        again if we solve diff question in which the same class is used then I don't have to recreate it again. we use same class again & again.                means, it "More Readable".
        
        If I want to add a new method to Check if area is 
            1.  Greater than a int K.
            
                we can use area() method inside another method of the same class. 
                    img 3.
                A good practice is Always to use This keyword so that we can specify that we can calculate area of current rectangle.   without using This keyword the code is working fine.

            2.  Greater than another rectagne. 
                    img 4.
                for the current area of rectangle we are checking with the Object R that we are passing. 
                *we can have multiple function with same name but with diff parameters* so compiler can understand based on the params, which function we are calling.          means, Method Overloading.
```
### Problem
``` 
        index:-  0  1 2  3 4
        A=      [2  5 3  6 2]
        B=      [4  5 1  6 2]
        Area:-   8 25 3 36 4
        Ans:-    0 0  1  0 2        
            index0:-    there is no square on the left side, so ans = 0.
            index1:-    there is no square on the left side, so ans = 0.
            index2:-    there is square on the left side & the area of current square is 3 & the area of left side square is 25 that is greater so ans = 1.
            index3:-    there is square on the left side but the area of current square is 36 & the area of left side square is 25 that is lesser so ans = 0.
            index4:-    there is two square on the left side & the area of current square is 4 & the area of left side square is 25, 36 that is greater so ans = 2. becoz current is smaller than from 2 square.
            
Array of Object References:-        
        simple array:-
                int[] a = new int[n];
                Rectange R[] = new Rectangle[N];  
                -   it will create array of size N. 
                -   but instead of integer it will be type of Rectangle Class. 
                -   it will have N diff Object References.                          Array of Object References.
                *   Class can also consider as Custom Data type.

        Code:-
                we have to use these function of Rectangle class. img 4.        that is the main goal.
                
                1.
                Rectange R[] = new Rectangle[N];                            Creating N Object References.
                for i--> 0 to N-1
                    R[i] = new Rectangle(A[i], B[i]);                       Creating an N diff Objects. means we have array of objects.         // all the rectangles are stored in the array.
                
                2.  For every of Rectangle we have to solve                 // Now we have rectangle array.
                for i--> 0 to N-1                                           // we are iterating on every Rectangle.
                    ans = 0;                                                // for every index of R array, the current ans is 0.
                    for j--> 0 to i-1                                     // for every j we have to go left side means i-1.         // this is left side index range.               // we are checking how many squares on the left side are greater than the current Rectangle R[i].
                
                3.  we have to check no. of square with area greater than the area of current rectangle.        // so the left side of the Rectangle should be a square.   
                    if (R[j].isSquare() && R[j].areaGreaterThan(R[i])                        // if R[j] is square & R[j] has area greater that area of ith rectangle.  
                        {
                            ans += 1;
                        }
                print(ans);
```
### Object Reference inside a Class
``` 

    Class Node {                    // name of the class.
         int data;                  // storing data inside the class.
         Node next;               // if we use Class Name as Custom Data type like:- Rectange R[] = new Rectangle[N];       // means object reference inside the class. so we can store the object of the class.
         Node(int x)              // creating constructor.
         {
            data = x;
            next = null;
         }


    Ques:-  what will happen when do this, Node a = new Node(1);
    Ans :-  img 5.  creating multiple object with diff memory address.
            
   now, Node next; it is object reference of the Node class.  
        first we create the object of class b. 
        a.next = b;     now a.next has reference to class b.  a.next is pointing to address of class b.     img 6.
        if we repeat the thing multiple times (creating a node Object class), this structure is know as Linked List.
```
