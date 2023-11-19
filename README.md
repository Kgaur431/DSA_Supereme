## Recursion Basics
``` 
    "Function Calling itself".

    Ques:-  What are the uses of Recursion ?
    Ans :-  
            -   In Sorting Algo's, the O(N log(N)) TC that we used is of Merge Sort / Quick Sort algo's, both of them are based on Recursion.
            -   In Binary Tree || Binary Search Tree (most imp topic on interview) are based on Recursion.
            -   In Backtracking (very length code || high implementation code)  are based on Recursion.
            -   In Dynamic Programming (most imp topic on interview) that are based on Recursion.
            -   In Graphs (most imp topic on interview) that are based on Recursion.
            ... these are most important to us where Recursion used, but Recursion are used so many places.
            
            Use:-   Solving answer for current problem using subproblem.
                    like:-
                        Array:- for array we have subpart called subarray.
                        String:- for string we have subpart called substring.
                        problem:- for problem we have smalle part called subproblem.    || smaller instance of same problem.
```

### Given a positive integer N, find sum of first N natural numbers. N>0
``` 
    formula:-
            Sum of N = N*(N+1)/2
            
    Recursive Solution (Without Formula)
    
    N=4     1+2+3+4 = 10
    
    Ques:-  What is the sum of N=5 ?
    Ans :-  
            1+2+3+4+5 = ?
            Think:-
                Ques:-  What is this 1+2+3+4 ?
                Ans :-  it is Ans of sum of N=4.      
            So,
                Sum(5) = Sum(4) + 5. 
                here, Sum(5) is the current problem (means we have to find sum of N=5)
                      Sum(4) this is same problem with smaller input hence it is subproblem
                      
                Summary:-   'Using this subproblem, we can find the current problem'
            Generailsed Way,
                    Sum(N) = Sum(N-1) + N.    
    
    Recursive Step:-
        Steps to write Recursive Code.          ==>     Follw Three step process.
            Step1:- "Define What the function do".
                    Eg:-
                          Sum(N)      
                          Ques:-    if we write fun Sum(N), what this fun Sum(N) will do?    
                          Ans :-    It will give Sum of first N natural Numbers.   
                          
                          Ques:-    What is the return type of this fun, if it will return sum of N natural Numbers ?
                          Ans :-    int
                          
                          So our function defination should be.
                          int Sum(N)
                          {.......}             // ....... here we write the code.
                    Once we actually define the fun then we go to step 2.
            Step2:- "Build Logic on How to use subProblems to solve the current problem".
            
                        // here, we have to define that 'How our subproblem is helping us to solve the current problem'.
                    Eg:-
                        we know Sum(N) can be calculated with the help of Sum(N-1) + N.     // means we know how to use subproblme to solve current problem.
                           Sum(N) = Sum(N-1) + N.
                                    let say, for Sum(N-1) this itself use a subproblem to find the ans of itslef.
                                    means, we can write Sum(N-1) as Sum(N-2) + Sum(N-1) that means Sum(N-1) can internally uses the subproblem (Sum(N-2) + Sum(N-1)) of its own.
                           Sum(N-1) = Sum(N-2) + Sum(N-1)    
                                      for Sum(N-2), again its uses the smaller version || subproblem to solve the ans of itself.
                                      means, we can write Sum(N-2) as Sum(N-3) + Sum(N-2) that means Sum(N-2) can internally usest the same problem.
                           Sum(N-2) as Sum(N-3) + Sum(N-2)
                           .
                           .
                           .
                           this will keep on going on.
                           
                           we can think like:-
                                Sum(N) is person1 & person1 say to complete the work go to person2 that is Sum(N-1) person2, now person2 say to complete the work go to person3 that is Sum(N-2)... and so on.  In real life person1 say go to person2, he say go to person3 and so on. everyone says go to this person?.
                           Ques:-   if this will keep on happening, then our work will ever complete    ||      anyone have to take the ownership means there should be person who know what to do. ?
                           Ans :-   Base Case.
                                    means if 1 person will do the work compeletely then everyone else can do the work.
                                          that one person is know as Base Case. step 3.
            Step3:- Define Base Case.
                        Base Case is nothing but "Smallest subproblem for which we already know the ans".           
                        
                        Ques:-  What is the smallest input we can get for Sum(N) ?
                        Ans :-  1    
                        
                        Ques:-  What is sum of first N natural number of Sum(1) ?
                        Ans :-  1
                                like:-  
                                        {Sum(1) = 1}this is the person who will take the ownership of our work.
                                        means it is the smallest subproblem for 'which we already know the ans'.
                                            once this{Sum(1) = 1} is known then everyone(Sum(N) = Sum(N-1) + N, Sum(N-1) = Sum(N-2) + Sum(N-1), Sum(N-2) as Sum(N-3) + Sum(N-2)) will do their work.
                                            eg:-    once we know the samllest subproblem ans is 1 then we can find the complete ans like 1+2+3+4+... and so on.
    
    Code:-
           int Sum(N)                       // defining the fun                             step 1.
           {
                if(N==1)      // this will continue till base case is 1.                    step 3.
                {
                    return 1;
                }
                return  Sum(N-1) + N        // this Sum(N) fun will uses sub problem        step 2.
           }                 
                              
    Dry Run:-           For Easy Codes.        
            N=4                         // we need to find the ans for Sum(4)
            
            Sum(4)                      // thisSum(4) person is saying I can only find the ans, if you tell me the ans of Sum(3) & base condition is not true for thisSum(4) so execute this{return  Sum(3) + 4}
            {
                return  Sum(3) + 4
                      
                Sum(3)                      // so we go to Sum(3), thisSum(3) person is saying I can only find the ans, if you tell me the ans of Sum(2) & base condition is not true for thisSum(3) so execute this{return  Sum(2) + 3}
                {
                    return  Sum(2) + 3 
                         
                    Sum(2)                      // so we go to Sum(2), thisSum(2) person is saying I can only find the ans, if you tell me the ans of Sum(1) & base condition is not true for thisSum(2) so execute this{return  Sum(1) + 2}
                    {
                        return  Sum(1) + 2 
                             
                        Sum(1)                      // so we go to Sum(1) & said you have to do your work, thisSum(1) person has know when N is equal to 1 then the ans is 1.
                        {
                            return  1    
                        }
                    }
                }
            }
            
            
            
            once Sum(1) returns the ans=1 --> now Sum(2) ans=3 --> Sum(3) ans=6 --> Sum(4) ans=10   
            
            Imp:-
                    Sum(2) fun was called before Sum(1) but Sum(2) will comeplte after Sum(1) complete.     means Sum(2) was called first but Sum(1) will complete first then Sum(2) will complete.     || once Sum(1) return the ans then only Sum(2) can complete, untill Sum(1) not return the ans till the time Sum(2) will not able to complete his work.
                    
                    Ques:-  In this Ques "Given a positive integer N, find sum of first N natural numbers. N>0", Can we figure out What is the smallest possible Input. 
                    Ans :-  Yes,    Sum(1) = 1  That's enough to do any recursion problems.

```
### Write Recursive Code to find Factorial of N. N>0 (0 it neither +ve nor -ve, it just 0)
``` 
   Factorial of N:- "Multiplication of numbers till N".
                   Eg:-
                    N=5,    1*2*3*4*5.
                            it is same as above problem, instead of + sign use * sign.
                    N=4     1+2+3+4 = 10
                    
                    We know N>0,
                      for N=5   ==>  smallest sub smaller will be N=4, 1*2*3*4   
                      so,
                           we can get fact(N) if we know the ans of fact(N-1) then * with N. 
                            fact(N) = fact(N-1) * N.
                           The smallest subproblem input is fact(1):-
                            fact(1) = 1     now this will become the base case for our code.
                            
                    Code:-
                            Define the function.
                               long fact(N)                  // we can kept data type as long, int.
                                {
                                    if(N==1)        Base case is same.
                                    {
                                        return 1
                                    }
                                    return fact(N-1) * N;
                                }
                    
                    Note:-  in this ques, N>0 means N is +ve number 1,2,3...N. so we consider base case as N==1,
                                if we consider N=0, then base case should be N==0 & return 1;
```
## **Internal Implementation** Function call using recursion stack
``` 
    img 1, this is one of the way to write the function calls.
        
    Ques:-  What is Stack ?
    Ans :-  Stack means "anything in which we can insert & remove only from one side, not form between, not from below, only from one side".
            eg:-    Stack of plates.
            
            Stack data structure uses LIFO principle.
            
    Normal Function Calls:-
        -   If we write a fun,
                int add(x,y)
                {
                    return x+y;         it is not recursive fun, we just pass the params & it will just return the sum.
                }
                
        -   If we write a fun,
                int mul(x,y)
                {
                    return x*y;         
                }
                
        -   If we write a fun,
                int sub(x,y)
                {
                    return x-y;         
                }
            
        if we write like this,
            print (sub (mul (add (10,20), 30), 75))
            
            Does this above line is consider as valid in any programming lang.
            -   (add (10,20)    ==> This add will give us valid int as ans1.
            -   (mul ans1, 30)  ==> This ans1 will be multiplied with 30 & give us valid int as ans2.
            -   (sub ans2, 75)  ==> This ans2 will be subrtracted from 75 & give us valid int as ans3.
        
        In Memory, How function call works.
            we use memory like stack. img 2
            if we write this statement {print (sub (mul (add (10,20), 30), 75))} then what is the first statement that we are Calling, Not Executing.  
                first fun we are calling is         ==>      print()
                    this piece of code print() will need a memory to execute. so print takes memory.
                    but print() fun will only print the data when sub() fun give some data to print.
                second fun we are calling is         ==>     sub()
                    this piece of code sub() will need a memory to execute. so sub takes memory.
                    but sub() fun says to complete my work, sub() need some data from mul() fun the only I will subtract 75 from it & return the subtracted ans to the print(). 
                third fun we are calling is         ==>      mul()
                    this piece of code mul() will need a memory to execute. so mul takes memory.
                    but mul() fun says to complete my work, mul() need some data from add() fun the only I will mulitply 30 from it & return the multiplied ans to the sub(). 
                fourth fun we are calling is         ==>     addul()
                    this piece of code add() will need a memory to execute. so add takes memory.
                    but add() fun does not need any other fun.
            summary:-
                    we understodd how function call happening internally.
                    once the fun done with his work then it remove from the memory.
        
        Note:-
            Sequence:-
                Function Call       =   print --> sub --> mul --> add.          function call is happening in this manner.
                Function Execution  =   add --> mul --> sub --> print.          returned value or function completion happening in reverse order.
            means, add() fun call last, but it execute first.    img 2.
            so Function call internally uses LIFO principle.
            hence, we call it as Stack Memory.  see in pdf.
            
            "In Recursion, we call same function with different parameters so the second function call should be consider as different from first".
                like:-  Sum(4, Sum(3) both are different function call only function name is same, so both fun will take own seperate memory in the stack memory.
                
```         
### Fibonacci Numbers
``` 
    A number which is sum of previous numbers.      ||  "Sum of previous two numbers is the current number".
    First N fibonacci numbers are, 0 1 1 2 3 5 8 ......     // nth fibonacci numbers
                            N =    0 1 2 3 4 5 6 ......
    

    Idea:-
        To find nth fibonacci number we need the sum of last two number.
            3 + 5 = 8
            
            Note:-    if we know the fibonacci of 0 & fibonacci of 1 then only we can find the fibonacci of any other numbers.
        
        Ques:-  Find Nth fibonacci number using recursion ?
        Code :-
                step1:- define what function is doing.  with required params & return type of the function.
                step3:- base case, means we should know the 'ans of smallest problem/input which we know'. 
                step2:- build logic using subproblem.
                       int fib(N)                                   step1.
                        {   
                            if(N<=1)                        step3.
                             {
                                return N;
                             }
                            return fib(N-1) + fib(N-2);             step2.
                        }

    Interesting thing:-
            int fib(N)                              step1.
            {   
                if(N==1 || N==0)                    step3.
                 {
                    return N;
                 }
                return fib(N-1) + fib(N-2);         step2.
            }

         Call:-
            fib(-8) will call ==>    fib(-9) + fib(-10)...
            fib(-9) will call ==>    fib(108) + fib(-11)...
            .
            .  
            it will keep on call function in the memory, but memory is limited so it will reache its limit.
            we will get "Stack Overflow Error".     its actully Memory Limit Exceeded error.
         
         Conclusion:-
            if we see ever face MLE error that means, Our Base Case does not match with the Solution, Constraints ... 
                            ||
            if we see ever face MLE error that means, Input is very large. like fib(10^18)

```
### Given a positive integer N, print first N natural number from 1 to N. (using Recursion)
``` 
    N=5     o/p = 1 2 3 4 5
    
    Code:-
        Step1:- void prt(N) {}
        Step2:- prt(N) --> prt(N-1) then print(N)                   Use our sub problem to define the current problem so build login on prt(4).     prt(5) is print first 4 natural numbers  N=4, then print(N)             means for prt(5) we first print prt(N-1) then print(N)      ||      first print sum of natural number (N-1) then print (N)      **order of prt(N-1) & print(N) is important**
        Step3:- N==1   -->  print(1)
                
                Remember:-  'Untill & unless prt(N-1) will not done, we never print(N)'
        
        code, see in img 3.
        
        Imp:-   
            When program hits the base case:- after print(1), these lines {prt(N-1) then print(N)} will execute means prt(N-1) will be called, but it should not be called after hit the base case.     (generally program should be end after hitting the base case, from there it start returning the ans)
            Ques:-  How program should know that after reaching base case then it should not call this{prt(N-1) then print(N)}
            Ans :-  it's our duty while writing the code, we have to write "return". see in pdf.        ==>         Once Program reaches to base case then just return (either ans or only return) in int, void or any return type.
            
            Ques:-  Why we not use break ?
            Ans :-  Break Statement breaks a Loop. In looping statement we use break. but In function completion we have to return.
            
            **Always return when we hit base case, its good practice**
        
        Note:-  Recursion works when recursive fun will call, otherwise it stops.

    Dry Run:-
             N=4
                prt(4)
                {
                    1.  base case not match.
                    2.  call prt(3)
                        {
                            1.  base case not match.
                            2.  call prt(2)
                                {
                                    1.  base case not match.
                                    2.  call prt(1)
                                        {
                                            1.  base case match.
                                            2.  print(1).
                                        }
                                    3.  Untill & unless prt(1) will not done, we never print(2)     ==>     now prt(1) completed, so we print(2)    means prt(1) has completed then next statement will execute.
                                }
                            3.  Untill & unless prt(2) will not done, we never print(3)             ==>     now prt(2) completed, so we print(3)    means prt(2) has completed then next statement will execute.
                        }
                    3.  Untill & unless prt(3) will not done, we never print(4)                     ==>     now prt(3) completed, so we print(4)    means prt(2) has completed then next statement will execute.
                }
             
             O/p:-  1 2 3 4

```
### Given a String, check if it is a palindrome using recursion.
```

    Coding Steps:-
            when we check, then return type should be boolean.
        Step1:-   
                Boolean isPalindrome(s) {....}
        
        Step2:- 
                What is the subproblem for the current problem here.
                   like:-
                        malayalam
                        If Malayalam is a palindrome then first & last char should be same. & apart from first & last char remaining string should be same.     means, for complete string (malayalam) to be a palindrom, then these two char {first & last char} should match & the remaing string completely be a palindrome. img 4.
                        
                        now we should improve our fun defination with resepect to above line.
                            means instead of passing only string s, we can pass indexing also then it should be more meaningful.
                            like:-
                                    Boolean isPalindrome(s, l, r) {....}    here l=0, r=(N-1)
                                    eg:-
                                           isPalindrome(s, 0, N-1)
                                           {
                                                // Two things we have to check for given string as palindrome.
                                                    ((s[0] == s[N-1]) && isPalindrome(s, 0+1, N-2))               it means first & last char should be match. & the entire middle string should be palindrome.
                                           }
                                                   
                                                    Generalise way
                                           isPalindrome(s, l, r)
                                           {
                                                // Two things we have to check for given string as palindrome.
                                                    ((s[l] == s[r]) && isPalindrome(s, l+1, r-1))               it means first & last char should be match. & the entire middle string should be palindrome.
                                           } 
                                            
        Step3:-
                finding base case.
                        odd length                      these are subproblems                                           even length          
                                                            
                         1.  malayalam                                                                                  1.  abcbbcba                                                                                                         /               
                              now we check l & r should be match then we check if 'alayala' is palindrome or not.               now we check l & r should be match then we check if 'bcbbcb' is palindrome or not.
                         2.  alayalam                                                                                   2.  bcbbcb
                              now we check l & r should be match then we check if 'layal' is palindrome or not.                 now we check l & r should be match then we check if 'cbbc' is palindrome or not.
                         3. layal                                                                                       3.  cbbc
                              now we check l & r should be match then we check if 'aya' is palindrome or not.                   now we check l & r should be match then we check if 'bb' is palindrome or not.
                         4. aya                                                                                         4.  bb
                              now we check l & r should be match then we check if 'y' is palindrome or not.                     now we check l & r should be match then fun call will happen for "" || empty string, for empty string ans is true. becoz the reverse of empty stirng is empty string.   ans=true.
                         5. y
                              now we have single 'y', single char is also a palindrome. here, l==r.  ans=true.
                                l == r.                                                                                                         l > r.      now, l=b r=b so after this check l+1 & r-1 then also we are checking the same thing l=b r=b and so on. 
    
                if(l=>r){return true;}
                
                Note:-
                        "Don't use l++ r-- in the recursion prolbem always use l+1 r-1".


```



