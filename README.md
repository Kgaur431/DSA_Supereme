## Recursion 2
### Given an integer N, find the sum of digit of N. (N>=0)
``` 
    N=2386      Ans 2+3+8+6 = 19
    
    Sub Problem:-
                In this problem, the subproblem is "less number of digit". so we should take out one of the digit seperately, now the easiest digit to take out is 6 (we can take out any of the digit).
                    2386, digit 6 we can get by doing N%10. & we get 238 by doing N/10      ==>     That it our subproblem
                    sod(N) = sod(N/10) + (N%10)
    Base Case:-
                we have two base case.
                -   if N can be single digit number.    return N.
                -   if N is 0.                          return 0.
    Code:-
      int sod (N)           step1.
      {
        if(N<=9)
        {
            return N.
        } 
        return sod(N/10) + (N%10);      step2.
      }
```
### Given integers a,b. Find a^b using recursion. (b>=0)
``` 
    eg:-    
        a=2 b=3     Ans => 2^3 =8
        a=3 b=3     Ans => 3^3 =9
    
    Sub Problem:-
              eg:-  2^5     ==> 2*2*2*2*2  
                                2*2*2*2     *   2
                                2^4         *   2
                    a^b     ==> a^(b-1)     *   a
              In this problem, the subproblem is "2^5-1".  
    
    Base Case:-
             if b=0, then return 1.
                x^0 = 1.                                               **** Imp******
    Code:-
            Defining the function.
            long pow(a,b)               // long used for large input.
            {
                if(b==0)
                {
                    return 1;
                }
                return pow(a, b-1) * a
            }
```
## Idea of TC
``` 
    Code:-
            Defining the function.
            long pow(a,b)               // long used for large input.
            {
                if(b==0)
                {
                    return 1;
                }
                return pow(a, b-1) * a
            }
    
    Dry Run:-  
        pow(2,9)
            Ques:-  How many function call this pow(2,9) fun will make to get the ans ?
            Ans :-  9. || b. img 1.
                    like:-
                        pow(2,9) is person1, so how many people we have to go before going to person1. || pow(2,9) is consider as person1, so how many more person we require to get the ans. 
                            9 person exclude(person1).
                        
    Same Code with different logic.                             better code in terms of recursion.
        Sub Problem:-
                  eg:-
                      2^6                     ==>     2*2*2 * 2*2*2
                       we can write it like this:-     2^3  *  2^3          // here we devided the power into half
                  
                      2^7                     ==> 2*2*2 * 2*2*2 * 2 
                       we can write it like this:- 2^3  *  2^3  * 2        // here we devided the power into half
                            
                            =======> (b is even)     (a^b/2) * (a^b/2)
                            |
                      a^b ==
                            |
                            =======> (b is odd)      (a^b/2) * (a^b/2) * a  
                        
                  In this problem, the subproblem is "2^5-1".
        Code:-
                img 2.
                here, we calling pow(a,b) multiple times. 
                like:-  pow(a,b) person1 said go to this person2 (a^b/2) & do your work then again go to the person2 (a^b/2) & do your work.        means we are going to the same person two times.
            
    In the program if we writing a same function with multiple times this is not good approach. 
    so, if we calculated onces & use multiple times.
        Code:-
                img 3.
                like:-  pow(a,b) person1 said go to the person2 {he = (a^b/2)} once & we are using the result that person2 is giving to multiple times.
    
        Dry Run:-
                pow(2,9)                                  here he = 512. after returning from pow(2,4).
                {
                    1.  our base case is not match.
                    2.  calculated he = pow(2,4).         9/2=4
                            pow(2,4)                      here he = 16. after returning from pow(2,2).
                            {
                                1.  our base case is not match.
                                2.  calculated he = pow(2,2).         4/2=2
                                
                                        pow(2,2)                      here he = 4. after returning from pow(2,1). 
                                        {
                                            1.  our base case is not match.
                                            2.  calculated he.                    2/2=1
                                            
                                                    he = pow(2,1).                here he = 2. after returning from pow(2,0).                               
                                                    {
                                                        1.  our base case is not match.
                                                        2.  calculated he.
                                                        
                                                                he = pow(2,0)       here he = 1. after returning from pow(2,0).
                                                                {
                                                                    1.  our base case is match.
                                                                    2.  return = 1;
                                                                }   ==> int completed.   
                                                                 
                                                        3.  a=2, b=1    b is odd number, so it return 2 (1*1*2).    
                                                    }   ==> int completed
                                                    
                                            3.    a=2, b=2    b is even number, so it return 4 (2*2).
                                        }   ==> int completed.
                                        
                                3.  a=2, b=4    b is even number. it return 16 (4*4).
                            }   ==> int completed.
                            
                    3.  a=2, b=9    b is odd number. it return 512 (16*16*2).
                }   ==> int completed.
                    img 5. 
                
                -   These are the function call we are making. img 4.
                Ques:-  How many function call we made in terms of input ?
                Ans :-  log (b). (power is being reduced by 2 at every step). 
                
                In the computer, "less number of function call directly save the time".
                        
```

## Time Complexity of Basic Recursion
``` 
    -   Sum of Natural Numbers.
            
            Code:-
                    int sum(N)
                    {
                        if(N==1)
                        {
                            return 1;
                        }
                        return sum(N-1) + N;
                    }
            
            Ques:-  What is TC ?
            Ans :-  Rate of growth of fun with respect to input.    ||      function of order input to define time.
            
            eg:-
                we have used our function name as T.    (we can condsider any name)
                
                f(x) = x^3 + x^2 + 1.       this is function of x.
                T(N) =  this is "function of N to define Time Complexity".                  this is my function name as T, input param is N,            
                
                let say we find sum of natural numbers.
                    for this function sum(N), the Time Complexity is T(N).      inside sum(N) we are using sum(N-1), for which the Time Complexity will be "function of N-1 to define its Time Complexity"      apart from the function call every other step will take O(1) time.  (see below code in pdf)
                        T(N) = T(N-1) + 1.                          Time complexity of sum(N).              {the input size will reduce T(N-1) then the time will decrease of the function T(N)}        ||      sum(N) the TC will be  T(N),  sum(N-1) the TC will be  T(N-1),  everything else is constant.
                           
                Ques:-  Using this {T(N) = T(N-1) + 1} how we calculated the TC ?
                Ans :-                                                                       re-watch 01:12:00   to   01:19:00                     
                        eg:-
                            consider this T(N) = T(N-1) + 1 as mathematical fun.
                                T(N) = T(N-1) + 1           this is the fun
                                
                            Imp:-
                                    T(N) = T(N-1) + 1.
                                        for solving this above equation, we know ans for T(N) if we know the what is the ans of T(N- 1).
                                            Ques:-  What is T(N-1) ?
                                            Ans :-                          // if we know this ans then we can put into this equation T(N) = T(N-1) + 1 & find T(N).
                                                    but we
                                    
                                we can say T(N-1) is equal to T(N-2) + 1
                                    when we replace N with N-1 in that function then it will become
                                    like:-
                                        T(N-1) = T(N-1-1) + 1       ==>     T(N) = T(N-2) + 1                 green color in pdf.
                                    now, combining both of them together.
                                        T(N)   = T(N-1) + 1
                                        T(N)   = T(N-2) + 1 
                                      --------------------------
                                        T(N) = T(N-2) + 2
                                again, we can say T(N-2) is equal to T(N-3) + 1
```