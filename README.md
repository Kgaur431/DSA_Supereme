## Stack 
``` 
    In Stack Data structure, we add & remove the data from the one end.
        like:-
            Cup of tea, glass of water etc. 
        Eg:-    
            1.  Stack of plates:-
                        if we have stack of plates we pick the top most plate & use it. 
                        means, "Last placed plate on the top is use first".
                        
                            LIFO -->    Last IN First Out.  (Last enter element will remove first)
        UseCase:-
        Good Ex:-
                "Undo Operation":-
                    In Chrome browser today I have closed 5-6 tabs that we can reopen directly. 
                    means, if we closed 3 tabs & we try to reopen it then "first will open last close tab then second close last tab will open, then third close last ".
                    like:-
                        Ctrl + Shift + T.
                    
                    How Undo works:-  
                            eg:-
                                let say, there is any fun & initally we have 0 & we do add 3 operation on 0 (0+3) then becomes 3, then we do multipley 2 on 3 (3*2) 
                                then we do divide by (6/2) then it becomes 3 then we do -1 (3-1) then it become 2. see img 1.   
                                
                                suddenly we realise that last operation has incorrect operations. so we have to undo this operation 
                                
                                If we have Stack DS, then we have two choices to store the data in Stack.
                                    Choice1:- 
                                        -   these things (+*-) are the operations(means anything that we do) 
                                        -   these things (3 6 3) are the states(means after doing that opeartion what is the current version of the number || file).
                                            
                                        so if we have to store data in stack
                                        Ques:-  What we will prefer to store Operation || States ?
                                        Ans :- 
                                                If we store operations, 
                                                    ex:-    
                                                        any num x & we did the operation %5 on x then we got num 3.  
                                                        If we have this information %5 then can we find out x ?
                                                            we can't find out uniquely what is the x. 
                                                            like:-  for + - * we have inverse operation available like but for % we don't have inverse operation available.
                                                                the x can be {3, 8, 13, 18 ... any number}
                                                
                                                If we store states, 
                                                    ex:- use above ex here 
                                                        0 --> 3 --> 6 --> 3 --> 2   see img 1.
                                                            last operation was incorrect so if i want to reach back to 3  then we remove the top most element like 2 
                                                                now we reachecd where we want. that we can do multiple times,
                                                        
                                Storing States in Stack is beneficial.
```
### Stack Data Structure support four operations.
```
    1.  Push(x) 
            it means "Enter the element".
            we enter the data from top of stack. like we put the water into glass & we drink from top of the glass (there is no Strow in glass) 
            we don't return from push fun, so fun type is Void.
    
    2.  Pop()
            it means "Remove top element from stack".
            if we want to return the removed element that we can do but it's optional so fun type is Void.
                eg:-    
                    In Java, it's return pop element.
                    In C++, it does not return the pop element. 
    
    3.  top() / peek()
            it means "Get top element from stack".
            here we are not removing the element, we just getting the information that what is the element at the top. 
    
    4.  isEmplty()  
            it means "check if Stack is Empty".
            it's return True || False.
                        
                                
    TC for all the operation is always :-   O(1)

``` 
#### Problem 0:- Implement Stack
1.  We can implement stack using lots of data structures. here we implement using array.
``` 
      means, we have to implement these above 4 functions in TC = O(1).
        Perform operation:-
                push(2)
                push(3)
                push(8)
                pop()                           8   // pop 8.    ==>                                        5  // push 5    // isemplty false.
                peek()                          3                           3   // peek we got 3    ==>     3
                push(5)                         2                           2                               2
                isEmpty()
                    see o/p in pdf.
          :- Push & Pop does not return anything, here.
                
                we have to consider array as stack   
                    Ques:-  how do we consider array as stack ?
                    Ans :-  "By closing it from 3 side & opening it only from 1 side" then array is stack.
                            
                    -   if we consider this (img 2) as stack, then we entring from this side & removing from this side (img 2)
                    -   to maintain stack we know only 1 end is there. 1 end of the stack is index 0.
                            & what about the other end of the stack like index 1 2 3 so on. 
                            that we don't know, so we have to maintain it using a variable.     we can say {Prefix of the array is our stack}
                        
                        Stack is from index 0 to variable top.    
                            Ques:-  What is the inital value of stack ? so that we can say stack is start from this.
                            Ans :-   -1 
                                    if index 0 is starting of the stack that means from 0 to 0 the stack is. but we don't have in the stack currently
                                        so if index 0 is stack then it is invalid.

                            there are ways in which we can start stack from 0 means we cosider stack from 1 to top then we can start stack from 0 that is fine,
                                so we implement stack in lots of way but we discussed very basic way.

                        Now, from index 0 to top we have the stack. so initally top = -1 that means we don't have anything in the stack.
                        now we implement the fun. 
                        
                        push(x):-
                                void push( int x) 
                                    {
                                            // first we have to increase the top becoz currently top = -1. now stack is index 0 to 0 that means we can insert 1 element. 
                                            //   we push 2. if we push 3 then increase top & push 3 & same push 5.  now "from index 0 to 2 we have stack" right now.
                                    top +=1;
                                    A[top] = x;         // now we have three elements in the stack.     see img 4.
                                    }
                        Pop():-
                                void  pop() {
                                        // if stack is 0 to top. if we remove 1 element then where top should go. means we decrease the top. (2 to 1) 
                                    top -=1;    // see img 3.
                                    }
                        peek():-
                                int peek()
                                {
                                    return A[top];
                                }
                        push():-    now we have to perform push(5) 
                        isEmpty():-
                                boolean isEmpty(){
                                    return top == -1;   // if we remove these three element then top = -1 that means stack is empty. 
                                    }
                Imp things:-
                    -   if we have array & we keep on pushing items then there will be a time where array will completely filled. & then keep on adding it get overflow.   
                            Ques:-  How to avoid overflow issues ?
                            Ans :-   we can use "Dynamic arrays."     
                                        like:-
                                            Arraylist. now we don't limit in size. 
                    -   if we remove from empty stack.
                            Ques:-  What if we get data from empty stack means Underflow ?  
                            Ans :-  
                            UPDATED Code:-
                                        void  pop() {
                                            if(!isEmpty())
                                                top -=1;    // see in pdf.
                                        }
                    -   if stack is empty then we are accessing -1 index. we got IndexOutOfBound.
                            Ques:-  How to avoid IndexOutOfBound ?
                            Ans :-
                            Updated Code:-
                                        int peek()
                                            {
                                                if(!isEmpty())
                                                    return A[top];
                                                else
                                                    return -1           // indicating that stack is empty (0, INT_MAX, INT_MIN)
                                            }
                    TC = O(1)                     
``` 
## Queues:-
``` 
    In Queue Data Structure, we add from one side & remove from another side. see img 5 
        like:-
            we have Strow to drink water.   means its open from two sides.
        eg:-
            Toll Tickets, Movie Tickes and so on.    
        Rear:-  "From where we enter"
        Front:- "From where we exit"
            
            First In First Out.


        Operation on Queue:- Main Function.
           1.   Enqueue():- 
                    -   it is similar to push operation in stack.
                    -   it means "Insert x from Rear End".
           
           2.   Dequeue()-
                    -   remove front element from the queue.

           3.   isEmplty()  
                    -   it means "check if Stack is Empty".
                        it's return True || False.

        Depending on UseCase:-  
            1.  Front():-
                    -   to know what is the front(end) element.
            
            2.  Rear():- 
                    -   to know what is the rear(first || entry) element

        TC = O(1)   for all operation.
``` 
#### Problem 0:- Implement Queue
```
     means, we have to implement these above 4 functions in TC = O(1).
        Perform operation:-
            enqueue(2)
            enqueue(3)
            enqueue(8)
            dequeue()
            front() 
            rear()
            dequeue()
            isEmpty()
            enqueue(5)
                    see o/p in pdf.
                We can consider the queue where add from rear side & remove from front side. 
                    Ques:-  What will be the Queue in the Array ? means in Stack, it closed from one side. in Queue, it open from both side.
                    Ans :-  To define queue, we need two variables. Front & Rear.
                            "Queue is from index f to r". where "r is the entry point & f is the exit point". see img 6
                    
                    Ques:-  first we descide What will be the inital value of Front & Rear ? 
                    Ans :-  better way is 
                                Front = 0         Rear = -1 
                                    becoz when enter the element in queue then we have to update the rear which means,
                                        assume f = -1 & r = -1           r index = -1 ==> 0     ==> 1       ==> 2
                                        three element we have add/enter in the queue enqueue(2), enqueue(3), enqueue(8).
                                        now defination of queue is "it is from index f to r". 
                                        if f = -1 & r = 2 
                                        then, it is not valid index that queue is from -1 to 2 
                                    
                                    so, better way is to f = 0, r = 0.
                                        
                            we carn write this also, 
                                Front = -1         Rear = -1
                                        if we might choose diff defination of queue then f = -1 & r = -1 are ok. but if we choose above defination for queue then above defination is better.  
                
                enqueue(x):-
                                void enqueue( int x) 
                                    {
                                    r +=1;
                                    A[r] = x;        
                                    }
                                if defination has index f to r is queue. then we dequeue element then what should we do.  
                                    means we remove element from the front. so we just have to update the front like 0 to 1. current status of queue (img 7)
                dequeue():-
                        void pop() {
                                f +=1;
                                }
                isEmpty():-
                        boolean isEmpty(){
                            return f == r;  // if f == r means indexes are equal then there is element in queue if                  - Incorrect.
                            return f > r;   // means there is no element in queue. like:-  (img 7) if we remove two element then f = 3. so 3 > 2 means queue is empty.     - correct.
                            }

                front():-
                    int front() 
                    {
                        return A[f];    // means A[1] is 3. 
                    }
                
                rear():-
                    int rear () 
                    {
                        return A[r];    // means A[2] is 8. 
                    }
                                        3           8       
                    after performing front() ==> rear() ==> dequeue() then f == r means we have one element is present in queue is 8. see img 8.
                    now when enqueue(5) then we increase r = 3, now we have two element in queue. see img 9.

                Memory Wastage:-    
                     like:-
                        see img 9,
                        we are entring the element on index 3, 4, ... . means index 0 & 1 elements are not replaced with new elements that we are entring.  
                            like:-   if queue is empty, r=-1 then we just increase the r=-1 to r=0 & enter the value and so on.  increase r & insert element.
                                     these indexes 0 & 1 are the wastage of space.
                
                 Imp things:-
                    -   if we have array & we keep on adding items then there will be a time where array will completely filled. & then keep on adding it get overflow.   
                            Ques:-  How to avoid overflow issues ?
                            Ans :-   we can use "Dynamic arrays."     
                                        like:-
                                            Arraylist. now we don't limit in size. 
                    -   if we remove from empty queue.
                            Ques:-  What if we get data from empty queue means Underflow ?  
                            Ans :-  
                            UPDATED Code:-
                                        void  dequeue() {
                                            if(!isEmpty())
                                                 f +=1;
                                        }
                    -   if queue is empty then we are accessing -1 index. we got IndexOutOfBound.
                            Ques:-  How to avoid IndexOutOfBound ?
                            Ans :-
                            Updated Code:-
                                        int front()
                                            {
                                                if(!isEmpty())
                                                    return A[f];
                                                else
                                                    return -1           // indicating that queue is empty (0, INT_MAX, INT_MIN)
                                            }
                                        
                                        int rear () 
                                            {
                                                 if(!isEmpty())
                                                    return A[r];   
                                                 else
                                                    return -1           // indicating that queue is empty (0, INT_MAX, INT_MIN)
                                            }
                    TC = O(1)
```

### Problem1:- Check whether the given sequence of parenthesis is valid.        {AWS, Sutherland, Walmart}
``` 
      Parenthesis:-
            { }, [ ], ( )           // we have only these 6 chars
            
        s = "() {[] ()}"    -->     Valid
        s = "() { [ } ] ("    -->     In-Valid
                  |   | |
                  |   | --->    we don't have closing for this.
                  |   |------> for these pair we have this } in between. 
                  \---------->  "       "       see pdf. 

                "if equation can fit inside the parenthesis then its valid or vice versa"

        Wrong Strategy:-
            -   if we count of opening parenthesis & count of closing parenthesis is not right strategy.

        among queues & stack we are using stack data structure. we have only these 6 chars so we can use if else conditions for match closing & opening.
        
        Right Strategy:-
            "for all closing brackets, check if the last opening bracket matches." 
            
            catch here, whenever we have this thought in our mind that we have to check last opening brackets. means the last word then the word last will give idea to use stack.
            
        Think:-
            for every closing bracket we have to check last opening brackets, so what should we insert in the stack.
                means we need to keep track of opening brackets. 
                                ||
            for every opening bracket we have to check next closing brackets.
                                

            Ex1:-
                s = "() {[] ()}"
                    we have a empty stack.
                    first we have opening ( that we push into stack  
                    next we have closing ) then we pop out last opening bracket which is ( & comnpare is () both are matching, yes then continue to next.
                    then we have opening { that we push into stack   
                    then we have opening [ that we push into stack         
                    next we have closing } then we pop out last opening bracket which is { & comnpare is {} both are matching, yes then continue to next. 
                    next we have closing ] then we pop out last opening bracket which is [ & comnpare is [] both are matching, yes then continue to next.
                    then we have opening [ that we push into stack  
                    next we have closing ] then we pop out last opening bracket which is [ & comnpare is [] both are matching, yes then continue to next. 
                    
                    Ans = True.     see in pdf

            Ex2:-   
                    Ans = False.    see in pdf  
                    as long as we got wrong matching then return Ans = false.
            
            Ex3:-   
                    Ans = False.    see in pdf 
                    here, for these opening ( [ we don't have closing brackets so stack is not empty that's why Ans = false, becoz stack should be empty in the end. 

            that's why we are using stack in the question that is the idea. 
            
            TC = O(N)   // we have string length N, so every char has opening that we are inserting & for closing we are poping out so inserting & poping both are constant.
            SC = O(N)   // how many elements we need at max in our stack. In worst case everything thing as opening bracket the O(N)
```










