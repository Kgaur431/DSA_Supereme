# DSA_Supereme
#ASLI CODING

### 1. Introduction
```
Story 1 :- 
        1. there are two person Kartin & Mayur, they are participating in a contest & in that there is one task, 
            Task is "Given 10^6 integers in random order, sort them in ascending order( increasing order)"
            Input [3, 1, 8, 2]
            Output [1, 2, 3, 8]     // smallest number ==> largest number.
            
              Kartik come with own algorithm            &           Mayur come with own algorithm.
                Algo 1                                                  Alog 2
                Windows XP                                              Mackbook M2
                    | switch the machine.
                Mackbook M2
                    C++                                                  Python
                                                                            |   switch the language.
                                                                           C++
                Very Hot Temperature                                      Very Cold Temperature
                    | switch the temperature.
                Very Cold Temperature
                
                =    5sec.                                                   5sec.
                   
                  
                  they put all the 10^6 integers in their algo. 
                  they notice that 
              Exectution time of
                                 Algo 1 is:-  15 sec.   ==> 8 sec. (after switching the machine)
                                 Alog 2 is:-  10 sec.
                 both the code are giving correct output.
                 assume Space complexity of both the code is same.
                 if we are judge then best code is Alog 2 because it is taking less time to execute. but, 
                 this is not fair that both are using different machine. on that basis we are comparing the execution time 
                    of the code.  
                 now the time of execution of the algo 1 is taking 8 sec. when we swithc the machine. 
                
                 based on the execution time we can say that algo 1 is better than algo 2. but, 
                 Kartik has written the code in C++ & Mayur has written the code in Python. that is not fair.   
                    because " C++ is faster than Python"
                     Reason (kind of):- C++ is that faster "it is used in game development a lot"
                                        In the contest, "the online judges may be expects 1 sec for C++ but expects 5 sec for python"
                                            this usual time limit they give.
                                            means if we write code in C++ then online platform expects that our code is run in 1 sec.
                                                  if we write code in Python then online platform expects that our code is run in 5 sec. 
                                                        because online platform knows that Python is slower than C++.
                 so Mayur switched the language from Python to C++.
                    now the time of execution of the algo 2 is taking 5 sec. when we swithc the language.
                        Based on the execution time we can say that algo 2 is better than algo 1. but, there is one more factor 
                            that suppose Kartik is sitting in very Hot Place (we can consider the temperature as Volcano)
                                         Mayur is sitting in very Cold Place (we can consider the temperature as Mount Everest)
                 
                 if we set in the very hot temperature then our machine will be heated & it will slow down
                    so if they both sit in different temperature where temperature diff is very high. this is not fair
                        to compare the execution time of the code.
                        
                    so Kartik switched the temperature from Hot to Cold.
                        now the time of execution of the algo 1 is taking 5 sec. when we swithc the temperature.
                 finally both the code are taking same time to execute. 5 sec.
                 
              Learning from this story :-   
                        Execution Time :- Time Taken by our code to run. not any Time Complexity.
            
            Conclusion :- 
                           since, Execution Time is depends on multiple factors. 
                            so, it is not a good parameter to compare algorithms.
            
                          If we being a judge what will be the right strategy to compare the algorithms.
                              #Iteration. (because it is independent of machine, language, temperature)
                                 
                          this below code 
                            for i to N
                                print(i)
                                
                            No. of Iteration = N.
                                so if we run this code in any machine, at any temperature, in any languages 
                                    "No. of Iteration will be same"
                                        so, we can say that "No. of Iteration is a good parameter to compare algorithms" 
                                            not the Execution Time.
                                             
                                        { execution time of algo will diff but no. of iteration will remain same, if we wrote 
                                            the code in any language }. 
```
``` 
Story 2 :- 
       2. same Task
            Task is "Given N integers (10^6) in random order, sort them in ascending order( increasing order)"
            Input [3, 1, 8, 2]
            Output [1, 2, 3, 8]     // smallest number ==> largest number.
            
                   Kartik                    &                   Mayur
                     Algo 1                                          Alog 2
       
            #iteration:- 100 log (N)                                 N/10      
            
            
            
            by looking no. of Iteration we can say that Algo 1 is better than Algo 2.
                but, 
                     by Looking the graph 1,     
        Learning_1:- the learning is  "N <= 3500 then Algo 1 has greater no. of iteration than Algo 2"      *****************************************
                                         "N >= 3500 then Algo 1 has less no. of iteration than Algo 2"
                                    means, when N is small then Algo 2 is better because its take less no. of iteration.
                                            when N is large then Algo 1 is better because its take less no. of iteration. 
        
                            Input Size, No. of Iteration           
                            N <= 3500, Algo 2 > Algo 1
                            N >= 3500, Algo 1 < Algo 2 
                                            :- both are better depends on the input size of the N.     
```
[graph 1.](https://www.desmos.com/calculator/hgzqchci8p)

### Real World Case Studies
``` 
 we use these, 
    How many "Daily Instagram Active User" has ?   
        close to 500 million.
    
    Most viewed video on youtube ?
        baby shark dance.
            11 billion views.
    
    whatsapp message per day ? How many no. of messages people send on whatsapp per day ?
        100 billion messages per day. 
    
        ... so on.
    
      for them Large number of input size matter. 
        youtube does not care a video which has less views but youtube care a video which has more views.
        
    so if we design our own system then we design it in such a way that it can handle large no. of input size.
       if we have to use one of these two algo Kartik's Algo 1 or Mayur's Algo 2 then which one we will use ?
           we will use Kartik's Algo 1 because it is better for large input size.

    Learning_2 :- that we should design a system that can handle Large input size.      *********************************************************  
                    so we will build an algo that is better for large input size.
                
                if we have two algos, algo 1 & algo 2.   
             if the input size is less & we choose the alog 1 then still the work done would be faster ?
                yes, the difference is not that much. it will be considerable
                suppose we pic
                      mean if N = 10 then the diff bw the two algo iteration will be not considerable very large. 
                                
                      but, if N = 10^6 then the diff bw no. of iterations will be very much high.  
```

``` 
 Story 3 :- 
           Task :- Kartik is doing a task where he has to compare 100 of Algorithm  
                    he is not aware of many concepts to which he can compare an algo.
                    but he is smart so he know whatever algo we create that should work for larger input size 
                      means he aware of real world case studies. 
                        he came up with the idea that "he will just take random 5-6 large inputs & will run 
                           in every piece of code. & check whick algo is performing better.  
                           
```
### Asymptotic Analysis
```
                    "If we have multiple algorithm to compare then Take random Large inputs & to see which one is performing better. "  --> this is an idea of Asymptotic Analysis.
                           take large input & run in every algo to see which one is performing better.  means which one is less time consuming.
                           
                           Some time it is used (good idea). 
                               but we already saw that Execution Time is not a good parameter to compare algorithms.
                                   if we have diff diff things like machine, language, temperature 
                               what if we don't have a choice. (means algo is such that we can't calculate no. of Iteration
                                    means that it is so complex so we can't calculate no. of Iteration)
                                                    ||
                                    we don't have a choice to calculate no. of Iteration.
                                       this is an good idea. 
                           
                           Kartik reads a book & came to know as Big O.
                                            --> 100 log (N) ==> O(log N)
                                #iteration  
                                            --> N/10        ==> O(N)
                                        
                                assume its very complex to compare the no. of iteration of 100 algo. 
                                    but we get little idea on what is the rate of growth of function.
                                        like Alog 1 is Linear time
                                             Algo 2 is Logarithmic time
                                                Algo 3 is Quadratic time
                                                ... so on.
                                        kartik can compare the rate of growth of function. but we don't know the exact iteration
                                            so he can use Big O to compare the algo.
                                                 O(log N) 
                                                 O(N) 
                                                 O(N log N) ...
                                               
                                            he know that linear is better than quadratic. 
                                              
                                        sometimes we can't exactly no. of iteration for every algo. 
                                            so we can use Big O to compare the algo.         
                                            now Big O is a good parameter to compare the algo.     ***************************************  
                                                
           Caclulate Big O ?
                1. Calculate the no. of Iteration based on input size. may not be exact value but close value.  assume 2n^2 + 3n + 4
                2. Take Higher Order Terms & ingore it's constant cofficient & LOT.  
                        (constant can not impact on rate of growth.)  
                        but why are ignoring 3n & 4 ? these two are input size. 
                            if we select larger value of N, then 3N+4 also increases with input.
                                    ||
                        
                        Neglet the lower order terms. 
                           Ex:- N^2 + 10N
                                here, Contribution of Lowe Order Terms is 10N
                                 
                           we wil compare three things                                                                                      LOT ==> Lower Order Terms
                                Input Size                  Total Iteration                             % of Lower Order Contirbution in Total. (Contribution of LOT * 100 / Total No. of Iteration)
                                N = 10                      10^2 + 10 * 10 = 200                          ((10 * 10) * 100)/ 200 = 50% is the contribution of LOT in this equation.
                                                                                                           
                                N = 100                     100^2 + 10 * 100 = 11000                      ((1000) * 100) / 11000 = 9% is the contribution of LOT in this equation.
                                
                                N = 10,000 || 10^4          (10^4)^2 + 10 * 10^4                          ((10^4 * 10) * 100) / 100000100 =  0.1% is the contribution of LOT in this equation.
                                                                 = 10^8 + 10^5 = 100000100
                                
                           when we increase the input size then the contribution of lower order terms is very less. 
                              so for larger input size we can ignore the lower order terms.   
                
                ## till now we feel that Big O is a life savior but its not the case always. 
                            
                                                         
```  

#### Conclusion till now. 
1. first we discuss, that **Execution Time is not an good parameter to comparing the algo**.
2. then we discuss, that **no. of iteration is an good parameter but no. of Iteration for two algo can vary depending upon input size**.
3. if we compare two algos, when we don't have info about No. of Iteration then we can put large random input & check which algo is working faster.
4. ```
    but if we have idea about no. of Iteration then we can calculate rate of growth of function. 
        that we can call it as Big O.
    ``` 
```
    Big O has also some issue not exactly, but we should be aware of it.
Issue 1:- 
         Ashwani & Khushboo they are working on any  Taks. they create own algo
                         Algo 1                      &                       Algo 2
         #Iteration =     10^3 N                                                N^2
          Big O     =      O(N)                                                O(N^2)
         
         suppose, if a person unaware of No. of Iteration. just look at the Big O of algo 1 & algo 2. 
                    & that person writes below statement.
                    
               "Algo 1 is always better than Algo 2"        ==> Incorrect Statement.
               
         suppose, if there is another person  who write below statment
                
                "Algo 1 is always better than Algo 2 for large inputs."        ==> Correct Statement
                                        larger input means N > 1000. 
```
##### Issue with Big O
1. It can only tell us about the larger input. it can't tell us about the overall scenario.

###    **for entire overall scenario we always have to check No. Of Iteration.**

``` 
Issue 1:-  (Big O is ignores the constant factor, but constant factor does not implies that how the function is growing.)
        Kartik & Mayur they are writing ownn algo.
                        Kartik's                    &                       Mayur's 
                        Algo 1                                              Algo 2
        #Iteration =    2N^2 + N                                             5N^2
          Big O    =     O(N^2)                                             O(N^2)        
               
               with the input size they both are grow in same rate.                                    
                 does both algo are equally good.  ==> Incorrect Statement.
                      NO, if we compare no. of iteration
                        like suppose we have two function 
                         2N^2 + N      5N^2
                         tell which of the function is larger then the others. 
                             5N^2 is larger. 
                             How ?
                             2N^2 + N      5N^2   
                         -    2N^2         2N^2         // just for easiy calculation we are doing this.
                            ----------------------
                                N             3N^2
                                
                            so, 5N^2 is always greater than 2N^2 + N
                            
                            by doing this we can say that Mayur's algo is better than Kartik's algo.
                    
```
Big O is correct but not 100% correct. it corrects with rate of growth  
```
    Both the issue are not very important. but will use 
```


##  Big O
1. **rate of growth of a function.** 

### Power's of 10
```
    10^0 = 1            No. of zeros = 0
    10^1 = 10           No. of zeros = 1
    10^2 = 100          No. of zeros = 2
    10^3 = 1000         No. of zeros = 3
    10^4 = 10000        No. of zeros = 4
    10^5 = 100000       No. of zeros = 5
    10^6 = 1000000      No. of zeros = 6
    10^7 = 10000000     No. of zeros = 7
    10^8 = 100000000    No. of zeros = 8
    10^9 = 1000000000   No. of zeros = 9
    10^10 = 10000000000 No. of zeros = 10    
```