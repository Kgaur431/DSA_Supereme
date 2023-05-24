# DSA_Supereme
#ASLI CODING 

## NUMBERS IN RANGE OF [L,R]
    
1. ### NUMBERS IN RANGE OF [3,8]
```
    ANS --> {3,4,5,6,7,8} = 6
    [3,8] ==> both 3 and 8 are included
    EG --> 
           [L,R] ==> [L, L+1, ... , R-1, R]
           (L,R] ==> [L+1, L+2, ... , R-1, R]
           [L,R) ==> [L, L+1, ... , R-2, R-1] 
    FORMULA --> R-L+1
    LIKE --> [3,8] ==> 8-3+1 = 6
```
2. WHAT IS THE NUMBER OF TIMES N IS DIVIDED BY 2 TO REACH 1.
```
    ANS --> log base 2 of N 
```
3. ### WHAT IS ARITHMETIC PROGRESSION
```
    ANS --> any series in which the difference between any two terms is constant/fixed. 
    EG --> 4, 7, 10, 13, 16 ...
    DIFFERENCE --> 7 - 4 = 3
                  10 - 7 = 3
                  13 - 10 = 3
    GENERALISE --> 
        a = 4
        d = 3 
        SO --> a + (a + d) + (a + 2d) + (a + 3d) .... + a + (n-1)d.
        QUES --> WHY a + (n-1)d ?                                                // ==> Nth term = a + (n-1)d
        ANS --> because we have added d to a second term so we have to subtract it from Nth term.        
```
4. WHAT IS THE SUM OF FIRST N TERM OF ARITHMETIC PROGRESSION. 
```
    SERIES --> a + (a + d) + (a + 2d) + (a + 3d) .... +  a+(n-2)d + a+(n-1)d. 
    QUES --> How to solve this series ?
    ANS --> using Gauss Formula.
    OBSERVATION --> 
                    TAKE THE SERIES
                    REVERSE THE SERIES
                    ADD BOTH THE SERIES
    LIKE -->
              S= a + (a + d) + (a + 2d) + (a + 3d) .... +  a + (n-2)d + a + (n-1)d. 
              S= a+(n-1)d + a+(n-2)d + a+(n-3)d + a+(n-4)d .... + (a+d) + a.
             ------------------------------------------------------------------------------------
              2S = 2a + (n-1)d + 2a + (n-1)d + 2a + (n-1)d + 2a + (n-1)d .... + 2a + (n-1)d + 2a.       // this will repeat N times. 
    SO -->           2S = N(2a + (n-1)d)    
                      S = N(2a + (n-1)d)/2
                      S = N/2 (2a+ (n-1)d)
```
5. ### WHAT IS GEOMETRIC PROGRESSION
```
    SERIES --> 2, 6, 18, 54, ...
    MEANS --> IF WE CONSIDER ANY TWO ELEMENT TOGETHER, "THE RESULT OF SECOND ELEMENT DIVIDED BY FIRST ELEMENT IS CONSTANT/FIXED".
                IF THE RESULT / RATIO IS CONSTANT/FIXED FOR ALL THE ELEMENTS THEN THE SERIES IS GEOMETRIC PROGRESSION.
    EG --> 6/2 = 3
          18/6 = 3
          54/18 = 3
    GENERALISE -->
                    WE ARE FINDING THE "COMMON RATIO" BETWEEN THE ELEMENTS"
```
6.  WHAT IS THE N^th TERM OF GEOMETRIC PROGRESSION SERIES
```
    EG -->   6/2 = 3
             18/6 = 3
             54/18 = 3
    GENERALISE -->
                     a = 2      // first term
                     r = 3      // common ratio
    SO --> a + a*r + a*r*r + a*r*r*r + a*r*r*r*r + .... 
    ANS --> because we have multiplied r to a second term so we have to divide it from Nth term.
    N^th TERM -->        a*(r^n - 1) 
    SERIES --> a, a*r, a*r*r, a*r*r*r, a*r*r*r*r, ...., a*(r^n - 1)
                            ||
              a, a*r, a*r^2, a*r^3, a*r^4, ...., a*r^(n-1)
    
```
7. WHAT IS THE SUM OF N^th TERM OF GEOMETRIC PROGRESSION SERIES
```
    SERIES --> a, a*r, a*r^2, a*r^3, a*r^4, ...., a*r^(n-1)
    OBSERVATION --> it is not similar to arithmetic progression series.
                    MULTIPLY THE SERIES WITH COMMON RATIO.
                        LIKE ==> Means "we are multiply every number with common ratio". 
                    SUBTRACT BOTH THE SERIES.
                        LIKE ==> Means, "we are subtracting from the second series to the first series".
    
    LIKE -->   R*S = a*r + a*r^2 + a*r^3 + a*r^4 + .... + a*r^(n-1) + a*r^n
               - S = a + a*r + a*r^2 + a*r^3 + a*r^4 + .... + a*r^(n-1)
                ----------------------------------------------------------------------
                r*S-S =  ar^n - a                                                                                         // r*s - s ==> S(r-1)  
                S(r-1) = a (r^n - 1)
                S = a (r^n - 1) / (r-1)
    
    QUES --> HOW WE SUBTRACT THE SERIES ?
    ANS --> we not touch the a term, because it is not multiplied with r.
    SO --> we will subtract the series like ar to ar, ar^2 to ar^2, ar^3 to ar^3, ar^4 to ar^4, ...., ar^(n-1) to ar^(n-1) 
            so ==> at last we will get a AND a(r^n)
                    a AND a(r^n) ==> ar^n - a.
    
    EG --> 
            SERIES ==> S = 2 + 6 + 18 + 54
             a = 2
             r = 3
             n = 4      // n = number of terms
                    we multiply the series with common ratio.
                    3*S = 2*3 + 6*3 + 18*3 + 54*3 
                    
                    3*S = 6 + 18 + 54 + 162
                    - S = 2 + 6 + 18 + 54
                    ---------------------------------   
             
             QUES --> HOW WE SUBTRACT THE SERIES ?
             ANS --> by doing cancellation.                     // Diagrammatically Cancelled. 
             LIE --> 6 canclled with 6.         
                     18 canclled with 18.
                     54 canclled with 54.
                     
             REMAINING --> 2 AND 162        // a AND a(r^n)
             SO --> 3*S - S = 162 - 2
                    S(3-1) = 162 - 2
                    S = 160/2
                    S = 80    
    
    NOTE --> "sometimes the common ration is less than 1. like r = 0.5" 
              Mean, the below r value become negative number              //  S = a (r^n - 1) / (r-1) ==> this (r-1) is negative number.
              so, in that situation we have to do 
                    ==> MULTIPLY WITH -1 TO ABOVE AND BELOW.
              so, 
                   -1 become 1
                   r^n become -r^n
                   r become -r
                   -1 become 1              // see the below formula. 
              THEN, series like this
                    ==> S = a (1- r^n) / (1 - r)       BOTH ARE SAME.    S = a (r^n - 1) / (r-1)   // line 94. 
                        
```   
8. WHAT IS log base a of a^x ?
``` 
    REVISE --> log base y of x = z.
               MEANS ==> y^z = x 
               EXPLAIN ==> " y raised to the power how much becomes x ? "
    ANS -->  log base a of a^x = ?
            EXPLAIN ==> " a raised to the power how much becomes a^x ? "
            ANS ==> x                 
```
## Find Number of Iterartion for given any code. 
```
   1. for(int i = 1; i <= N; i++)
        {
            print(i);
        }
        ANS --> N iterations.
        EXPLAIN ==> i --> [1, N] ==> N times.
                    MEANS ==> " i loop will go starting from 1 to till N ==> that implies no. of iteration is N. " 
        TC --> O(N)
        
   2. void solve(N,M) 
        {
            for(int i = 1; i <= N; i++)                 |
            {                                           |
                if(i % 2 == 0)                          |
                {                                       N times  
                   print (i);                           |
                }                                       |
            }                                           |
            
           for(int i = 1; i <= M; i++)                  |
            {                                           |
                if(i % 2 == 0)                          |
                {                                       M times
                   print (i);                           |
                }                                       |
            }                                           |
        }
         ANS --> N + M iterations. 1
         EXPLAIN --> " i loop will go starting from 1 to till N ==> that implies no. of iteration is N. " 
                        " i loop will go starting from 1 to till M ==> that implies no. of iteration is M. " 
                        " so, total no. of iteration is N + M. " 
         TC --> O(N + M) || O(Max(N,M)) ==> means, we are taking the maximum value of N and M. which is have highest value. 
                                                    that will be the TC. means if we know the which one is bigger and which one is 
                                                    smaller. then we can write the TC = bigger term. otherwise we have to write the
                                                    TC in this way. O(N + M).
            here, there is no relationship between N and M. hence we have to consider both the loops.
   3. int s = 0;
        for(init i = 1; i<= N; i+2)
        {
            s = s + i;
        }  
        ANS --> (N + 1)/2 iterations. {means, ceil(N/2) iterations. because N+1/2 is the upper bound of N/2.}--> for explaination only.
                WE ARE ONLY DOING INTEGER DIVISION.
                  
        EXPLAIN --> i = 1 ==> 3 ==> 5 ==> 7 ....
                        ASSUME --> 
                                    N = 2, --> so, i = 1 ==> stop.                              #iterations = 1.
                                    N = 3, --> so, i = 1 ==> 3 ==> stop.                        #iterations = 2. 
                                    N = 4, --> so, i = 1 ==> 3 ==> stop.                        #iterations = 2. 
                                    N = 5, --> so, i = 1 ==> 3 ==> 5 ==> stop.                  #iterations = 3.
                                    N = 6, --> so, i = 1 ==> 3 ==> 5 ==> stop.                  #iterations = 3.
                                    N = 7, --> so, i = 1 ==> 3 ==> 5 ==> 7 ==> stop.            #iterations = 4.
                                    N = 8, --> so, i = 1 ==> 3 ==> 5 ==> 7 ==> stop.            #iterations = 4.
                                    N = 9, --> so, i = 1 ==> 3 ==> 5 ==> 7 ==> 9 ==> stop.      #iterations = 5.
                                                                    so on...
                                                                    
                                    N               #iterations
                                    2               1
                                    3               2
                                    4               2
                                    5               3
                                    6               3
                                    7               4
                                    8               4
                                    9               5
                        OBSERVE--> 
                                1. if we carefully observe the above thing then we can see that, 
                                    for any given N, we are formed N/2 iterations in most cases.
                                2. in Even Numbers case ==> if N is even then we are formed N/2 iterations.
                                    LIKE --> N = 2, no. of Iteration ==> 1.         (2/2 = 1)
                                             N = 4, no. of Iteration ==> 2.         (4/2 = 2)
                                             N = 6, no. of Iteration ==> 3.         (6/2 = 3) 
                                             N = 8, no. of Iteration ==> 4.         (8/2 = 4) so on...
                                             
                                3. in Odd Numbers case ==> in Odd Number case we are not forming N/2 iteration. 
                                    LIKE --> N = 3, no. of Iteration ==> 1          (3/2 = 1.5) only int value because of integer division.
                                             N = 5, no. of Iteration ==> 2          (5/2 = 2.5) only int value because of integer division.
                                             N = 7, no. of Iteration ==> 3          (7/2 = 3.5) only int value because of integer division.
                                             N = 9, no. of Iteration ==> 4          (9/2 = 4.5) only int value because of integer division. so on...
                                    NOT TRUE -->         it is showing like if N is odd then we are forming N-1/2 iterations.
                                             
                                    ACTUALLY --> WE are loosing 1 iteration in odd number case. because we are not taking upper bound value
                                    SO --> we will do ceil(N/2) iterations. 
                                          ceil value --> **WE JUST UPER BOUND TO NEXT INTEGER**          means, 2.5 to 3. forward 
                                          floor value --> is 2. because we decrease the current integer. means 2.5 to 2.  backward
                                    MEANS --> (N + 1)/2, so we will take upper bound value.  
                                
                                4. IF WE TAKE Ceil value for EVEN NUMBERS that will not impact. 
                                    LIKE --> N = 4, then (N+1)/2 ==> (4+1)/2 ==> 5/2 = 2.5, INTEGER DIVISION OF 2.5 is 2 only. 
                                             N = 10, then (N+1)/2 ==> (10+1)/2 ==> 11/2 = 5.5, INTEGER DIVISION OF 5.5 is 5 only.
                                
                                5. IF WE TAKE Ceil value for ODD NUMBERS that will impact. 
                                    LIKE --> N = 3, then (N+1)/2 ==> (3+1)/2 ==> 4/2 = 2, INTEGER DIVISION OF 2 is 2 only. 
                                             N = 9, then (N+1)/2 ==> (9+1)/2 ==> 10/2 = 5, INTEGER DIVISION OF 5 is 5 only. 
                        CONCLUSION -->
                                        WE ARE DOING ONLY INTEGER DIVISION. 
                                        No. of Iteration for all numbers is (N+1)/2.
        TC --> O(N), because the rate of growth of this function is linear. so, we can say that TC is O(N).
                     like --> every time i is increasing by 2. so, we can say that the rate of growth of this function is linear.
                              1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, .... so on.                                              
  
  4. int s = 0;
         for(int i=0; i<=100; i++)
         {
             s = s + i + i * i;
         }
         return s;
         
         ANS --> 101 iterations.
         EXPLAIN --> there is no impact on the no. of iterations by the value of N. 
                     because we are executing the loop from 0 to 100. 
                     so, no. of iterations is constant. 
         QUES --> HOW TO CALUCLATE THE NO. OF ITERATIONS FOR THE N VALUE.
         ANS --> FORMULA OF RANGE ==> R-L+1  
         LIKE --> [L, R]
                  [0, 100] 
                    ==> 100 - 0 + 1 ==> 101 iterations.          
         TC --> O(1) 
                 this is an constant function because the function is not growing 
                 like ==> 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, .... till 100.       
                
                                             
  5. int s = 0;
        for(int i=1; i*i<=N; i++)
        { 
            s = s + i;
        }
        return s;
        
        ANS --> sqrt(N) iterations. 
        EXPLAIN --> i is going from  1 till the point when i square <= N.
                    so, it continuous till i square becomes N.
                    i will increase like 1, 2, 3, 4 so on... till i square <= N.
        OBSERVE -->
                    N = 4, i = 1, 2, stop.  #iterations = 2.
                    N = 5, i = 1, 2, stop.  #iterations = 2.
                    N = 6, i = 1, 2, stop.  #iterations = 2.
                    N = 7, i = 1, 2 stop.   #iterations = 2.
                    N = 8, i = 1, 2 stop.   #iterations = 2.
                    N = 9, i = 1, 2, 3 stop. #iterations = 3.
                    N = 10, i = 1, 2, 3 stop. #iterations = 3.
                    .
                    .
                   N = 16, i = 1, 2, 3, 4 stop. #iterations = 4.
                   
                   So, we can see that,
                     if N is perfect square then we are forming sqrt(N) iterations.
                        LIKE --> N = 4, i = 1, 2 stop. #iterations = 2.
                                 N = 9, i = 1, 2, 3 stop. #iterations = 3. 
                                   
        NOW --> WE will do SQUARING BOTH SIDE
                    i square = N
                    i = sqrt(N)  
                the range of i 
                   i ==> [1, sqrt(N)]     
                   then, sqrt(N) - 1 + 1 ==>
        
        CONCLUSION --> sqrt(N) iterations.
        TC --> O(sqrt(N))
  
  6. int s = 0; 
        for(int i=0; i<N; i=i*2)
        {
            s = s + i;
        }
        return s;
        ANS --> infinite loop. 
        QUES --> WHY ?
        ANS --> because i is initally 0,
                then, i is becoming 0*2 ==> 0.
                then, i is becoming 0*2 ==> 0.
                then, i is becoming 0*2 ==> 0.
                so on... it will continue till infinity.
  
  7. int i = N; // N > 0
        while(i > 1) 
            {
                i = i / 2;
            }                       
         
        ANS --> log base 2 of N iterations. || log2(N) iterations.
        OBSERVE --> 
                    initally ==> i = N.
                    next step ==> i is becoming N/2.     // Because we are doing i = i/2. 
                    next step ==> i is becoming N/4.     // Because we are doing i = i/2 * i/2.
                    next step ==> i is becoming N/8.     // Because we are doing i = i/2 * i/2 * i/2. 
                    so on... it will continue till it reaches 1.

        IMP --> "no.of times N is divided by 2 to reach 1" is what ?
        ANS -->  log base 2 of N. || log2(N) iterations. 
        
        QUES --> WHY WE USE LOG HERE ? || HOW DO WE GET THE IDEA OF USING LOG HERE ?
        ANS --> BECAUSE, we want to know "no. of times, N is divided by 2 to reach 1".
                so, we will use log. 
                like N = 16, then log2(16) ==> 4.
                means 16 is divided by 2, 4 times to reach 1.
                                    ||
                HOW MUCH TIME N IS DIVIDED BY 2 TO REACH 1 ?
                ANS --> log2(N) times.
                                    ||
                log base 2 of ? = N.
                eg N = 16,
                        log base 2 of 4 = 16.
                means how much power should we raised this 2, to get 16.
        
        EXAMPLE -->
                    N = 16, 
                    
                       then, i = N ==> 16
                       then, i = i/2 ==> 8
                       then, i = i/2 ==> 4
                       then, i = i/2 ==> 2
                       then, i = i/2 ==> 1
                                 iterations ==> 4.
                       
                       HOW 
                            N = 16, 
                                then, N/2 ==> N/4 ==> N/8 ... 1.
                                like, 16/2 ==> 8/2 ==> 4/2 ==> 2/2 ==> 1.
                                                ||
                                      16/2 ==> 16/4 ==> 16/8 ==> 16/16 ==> 1.
                          
        NOTE --> we can find the no. of iterations by using GEOMETRIC Progression
        TC --> O(log2(N)) || O(log(N)) both are same.
                
**************Property of Log**************
                log base b of a = log a / lob b.  // both are same.
                                                  // base can be anything
                EXAMPLE ==> log base 4 of 64 = log 64 / log 4. means log 2 of 64 / log 2 of 4.
                                3  =  6 / 2.        //  4*4*4 = 3 times 4 is 64.
                                3  =  3.          // so, both are same.
                             log base 2 of N = log N / log 2. // both are same.
                             
                    
        
        
  8. int s = 0;
       for(int i=1 ; i<N; i=i*2)
            {
                s = s + i;
            }
        return s;
        
       ANS --> log base 2 of N iterations. || log2(N) + 1 iterations.
       CASE --> 
                WHEN N is perfecct square.
                THEN, log2(N) iterations.
                
                WHEN N is not perfect square.
                THEN, log2(N) + 1 iterations.
                
                    like ==> N = 5, then log2(5) + 1 ==> 3 iterations.       i = 1, 2, 4, stop.
                    like ==> N = 8, then log2(8) ==> 3 iterations.           i = 1, 2, 4, stop.
                    like ==> N = 9, then log2(9) + 1 ==> 4 iterations.       i = 1, 2, 4, 8, stop.
                    like ==> N = 10, then log2(10) + 1 ==> 4 iterations.     i = 1, 2, 4, 8, stop.
                    
       OBSERVE --> i is initally 1.    i*2 ==> i.
                   then, i is becoming 1*2 ==> 2. & i increment twice of previous value of i.
                   then, i is becoming 2*2 ==> 4. & i increment twice of previous value of i.
                   then, i is becoming 4*2 ==> 8. & i increment twice of previous value of i.
                   so on... it will continue till it reaches N.
                   
       IMP --> "no.of times i is multiplied by 2 to reach N" is what ?
       ANS -->  log base 2 of N. || log2(N) + 1 iterations.
       
       QUES --> WHY WE USE LOG HERE ? || HOW DO WE GET THE IDEA OF USING LOG HERE ?
       ANS --> BECAUSE, we want to know "no. of times, i is multiplied by 2 to reach N".
               so, we will use log. 
               like N = 16, then log2(16) ==> 4.
               means i is multiplied by 2, 4 times to reach 16.
                                   ||
               HOW MUCH TIME i IS MULTIPLIED BY 2 TO REACH N ?
               ANS --> log2(N) + 1 iterations. 
                                   ||
               log base 2 of ? = N.
               eg N = 16,
                       log base 2 of 4 = 16.
               means how much power should we raised this 2, to get 16.
               but we are writing log2(16) = ?
                means how much power should we raised this 2, to get 16.
                log2(16) = 4.
       
       EXAMPLE --> 
                    i initially 1,
                        means, i = 1. 
                    then we do i = i * 2,
                        i becomes 2                 2^1
                    then we do again i = i * 2,
                        i becomes 4                 2^2
                    then we do again i = i * 2,
                        i becomes 8                 2^3
                        so on... 
                    it will continue at a point till i becomes 2^k = (when i reaches N) N 
                        means ==> 
                                    1. 2^k value is greater than N. then loop will break.
                    
                    QUES --> WHY 2^k ?
                    ANS --> because, we are doing i = i * 2.
                            every time the power of 2 is increasing 
                            so we can write it as 2^k.
                            now we have to find k. to know the no. of iterations.
                    
                    QUES --> HOW TO FIND k ?
                    ANS --> K = log base 2 of N.
                            means, 2^k = N.
                            means, how much power should we raised this 2, to get N.
                            means, log base 2 of N.
                            means, log2(N).
                            means, log2(N) iterations. 
                  
                    SO --> i will continue from 1 to till 2^k = N || log2(N) iterations.
                             i --> [1, log2(N)]
                                    log2(N) iterations.
       
       HINT --> this is the reverse of the previous question no. 7.
                means, in the previous question we are diving N by 2 to reach 1.
                here, we are multiplying i by 2 to reach N.
       
       TC --> O(log2(N)) || O(log(N)) both are same.
              
```
    NESTED FOR LOOP
        QUES --> HOW WE CALCULATE NO. OF ITERATION IN NESTED FOR LOOP ?
        ANS --> 1. maintain table where write all the variable of nested for loop.
                    i   j   no. of Iterations
                    for every i, we have to calculate the range of j & calculate the number of iterations.
```
  9. for(int i=1; i<=10; i++) {
        for(int j=1; j<=N; j++) {
            System.out.println("Hello");
        }
    }
        TABLE
            i       j      no. of Iterations
            1       [1,N]   N
            2       [1,N]   N
            3       [1,N]   N
            4       [1,N]   N
            .
            .
            .
            10      [1,N]   N
         ---------------------------------
           No. of Iterations  = 10 * N   
        TC --> O(N) because 10*N is a linear function & the rate of growth is linear.
        
  
  10. for(int i=1; i<=N; i++) 
        {
            for(int j=1; j<=N; j++) 
            {
                System.out.println(i+j);
            }
        }
        TABLE
            i       j      no. of Iterations
            1       [1, N]  N
            2       [1, N]  N
            3       [1, N]  N
            4       [1, N]  N
            .
            .
            .
            N       [1, N]  N
            ---------------------------------
            No. of Iterations = N * N 
        TC --> O(N^2) because N*N is a quadratic function & the rate of growth is quadratic.
  
  10. for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)   
            {
                System.out.println(i+j);
            }
        }
        
        TABLE
            i       j      no. of Iterations    j range (every time)
            0       [0, 0]      1                   0
            1       [0, 1]      2                   0, 1
            2       [0, 2]      3                   0, 1, 2
            3       [0, 3]      4                   0, 1, 2, 3
            .
            .
            .
            N-1    [0, N-1]     N                   0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ... N-1 = N 
            ---------------------------------
            No. of Iterations = 1 + 2 + 3 + 4 + ... + N  ==> this is the sum of N natural numbers.
                              = N * (N+1) / 2 
            TC --> O(N^2) because N*N is a quadratic function & the rate of growth is quadratic.
  
    11. for(int i=1; i<=N; i++)
            {
                for(int j=1; j<=N; j=j*2)
                {
                    System.out.println(i+j);
                }
            }
            
            TABLE
                i       j      no. of Iterations    j range (every time)        working
                1       [1, N]      log2(N)         1, 2, 4, 8, ... N       j is increasing by power of 2 
                2       [1, N]      log2(N)         1, 2, 4, 8, ... N           so it is log2(N)  
                3       [1, N]      log2(N)         1, 2, 4, 8, ... N
                4       [1, N]      log2(N)         1, 2, 4, 8, ... N
                .
                .
                .
                N       [1, N]      log2(N)         1, 2, 4, 8, ... N
                ---------------------------------
                No. of Iterations = N * log2(N)
                TC --> O(N*log2(N)) because N*log2(N) is a linear function & the rate of growth is linear.
    
    12. for(int i=1; i<=2^N; i++) 
            {
                print(i);
            }
        
        No. of Iterations = 2^N
        QUES --> HOW TO CALCULATE 2^N ?
        ANS --> i ==> [1, 2^N]
        TC --> O(2^N) because 2^N is an exponential function & the rate of growth is exponential.
    
    13. for (int i=1; i<=N; i++ ) 
            {
                for(int j=1; j<=2^i; j++) 
                {
                    System.out.println("Hello");
                }
            } 
            
            Table 
                i       j           no. of Iterations       j range (every time)                 working
                1       [1, 2^1]        2^1 = 2             1, 2                                 2^1
                2       [1, 2^2]        2^2 = 4             1, 2, 3, 4                           2^2  
                3       [1, 2^3]        2^3 = 8             1, 2, 3, 4, 5, 6, 7, 8               2^3 
                4       [1, 2^4]        2^4 = 16            1, 2, 3, 4, 5, 6, 7, 8, ... 16       2^4
                .
                .
                .
                N       [1, 2^N]        2^N                 1, 2, 3, 4, 5, 6, 7, 8, ... 2^N     2^N  
                -------------------------------------------
                                        2^1 + 2^2 + 2^3 + 2^4 + ... + 2^N
            
            
            QUES --> WHAT IS THIS SERIES 2^1 + 2^2 + 2^3 + 2^4 + ... + 2^N ?
            ANS --> it is an Geometric progression. 
            
            QUES --> WHY IT IS GEOMETRIC PROGRESSION ?
            ANS --> because the common ratio is 2.
                        2^2        /   2^1     = 2
                        2^3        /   2^2     = 2
            
            QUES --> HOW DO WE FIND THE COMMON RATION IN THE SERIES ?
            ANS --> second term /   first term 
                    2^2         /   2^1     = 2
                    2^3         /   2^2     = 2
                    2^4         /   2^3     = 2
                    .
                    .
                    .
                    2^N         /   2^(N-1)     = 2
                    so, the common ratio is 2. 
            first term = 2^1 ==> 2
            common ratio = 2
            No. of terms  = N           // means, how many times we have to multiply the common ratio to get the last term.
            Formula :- a * (r^N - 1) / (r - 1)  
                       2 * (2^N - 1) / (2 - 1)
                       2 * (2^N - 1)
            TC --> O(2^N) because 2^N is an exponential function & the rate of growth is exponential.
             
    14. for(int i=N; i>0; i=i/2) 
            {
                for(int j=1; j<=i; j++) 
                {
                    System.out.println("Hello");
                }
            }
    
            QUES --> HOW I OBSERVE ?
            ANS --> external loop is decreasing by half every time. 
                    & internal loop is increasing by 1 every time. 
                        means no. of iterations = log2(N) * sum of N natural numbers. 
            SUMMARISE --> i was going in wrong direction.
            
            Table 
                i       j       no. of Iterations       j range (every time)                 working
                N       [1, N]      N                   1, 2, 3, 4, 5, 6, 7, 8, ... N       N
                N/2     [1, N/2]    N/2                 1, 2, 3, 4, 5, 6, 7, 8, ... N/2     N/2
                N/4     [1, N/4]    N/4                 1, 2, 3, 4, 5, 6, 7, 8, ... N/4     N/4
                N/8     [1, N/8]    N/8                 1, 2, 3, 4, 5, 6, 7, 8, ... N/8     N/8
                .
                .
                .
                1       [1, 1]      1                   1                                   1
                -------------------------------------------
                                    N + N/2 + N/4 + N/8 + ... + 1
                first term = N
                common ratio =  1/2
                                    N/4  / N/2
                                    N/4 * 2/N
                                    N will be cancelled out.
                                    1/2 will be left. so, the common ratio is 1/2.
                N = No. of terms = log 2(N)           // means, how many times we have to divide the N/2 to till its reaches 1.
                                why log 2(N) ?
                                because the base is 2.
                                because every time we are dividing the N by 2.
                
                Formula :- a * (r^N - 1)    / (r - 1)
                           N * (1 - 1/2^N) / (1 - 1/2)
                           
                           Solution 
                            N * (1 - 1/2^log 2(N)) / (1 - 1/2) 
                            N/(1/2) * (1 - 1/2^log 2(N))           // in Denominator, 1 - 1/2 = 1/2                      
                            
                            Now we solve 2^log 2(N) = ?
                                log 2(N) = x                      
                             
                            Now we solve log 2(N) = x             // means, how much power should we raised this 2 to get N. = N only.
                            means, 2^x = N
                                Now, the value of 2^log 2(N) = x
                                    so, the value of x = N
                                        then, 2^N.  
                                                   
                                    2^log 2(N) = N.  
                                    
                                    EXAMPLE FOR BETTER UNDERSTANDING 2^log 2(N) ? 
                                    2^log 2(8) = ?
                                        log 2(8) = x 
                                        log 2(8) = 3
                                            mean 2^3 = 8    // means how much power should we raised this 2 to get 8. = 3 only. so, 2^3 = 8
                                                so, log 2(8) = 3
                                                    2^3 = 8                        
                                                
                                                like 2^log 2(8) = 8 
                            
                            N/(1/2) * (1 - 1/N)   
                            2N * (1 - 1/N)        // N/(1/2) = 2N  
                            2N - (N - 1)/N        // doing LCM of N 
                            2(N - 1)              // in Denominator, N & in Numerator, N both will be cancelled out.
                
                2(N - 1) no. of iterations. 
                CONCLUSION --> we used log property to solve this question.
            TC --> O(N) although we have 2 loops but the TC is O(N) 
                   2(N - 1) ==>  O(N)     
                                                        
``` 

``` ## Functions  

    ASSUME --> N = 16 
                then, 
                    Log 2(N) = 4            // means, how much power should we raised this 2 to get 16. = 4 only. so, 2^4 = 16
                    sqrt(N) = 4             // means, square root of 16 is 4.
                    N * Log 2(N) = 64       // means, 16 * 4 = 64
                    N^2 = 256               // means, 16 * 16 = 256     N square. 
                    2^N = 65536
                    N! = 20922789888000     // means, 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 20922789888000
                                            // it is also product of N natural numbers.
                    
                    ** for small value log 2(N) & sqrt(N) will not effect more, if we want to see the diff then check for larger number of N**
```
# log 2(N) < sqrt(N) < N < N * log 2(N) < N^2 < 2^N < N!

```
    Brief Explanation about Big O
        EXAMPLE --> 
                    f(N) = 2N^2 + 3N + 10
                        this is an quadratic function. 
        QUES --> WHY IT IS QUADRATIC FUNCTION ?
        ANS --> Because "the rate of growth of this function is N^2"              // because the highest power of N is 2.
        
        Big O --> "the rate of growth of function with respect to input"  
                    here, the input was N.
                    so, the rate of growth of function is N^2.
                        hence, it is quadratic function.
                    
                    O(N^2)
        
        QUES --> WHAT IS THE RATE OF GROWTH OF THIS FUNCTION ?  || which of these two terms which defines the growth rate of this function ? 
                    f(N) = N^3 + N(log 2(N))
        ANS --> O(N^3)
                "THE TERM THAT DEFINES THE RATE OF GROWTH OF THIS FUNCTION IS NOTHING BUT THE BIG O NOTATION OF THIS FUNCTION."  
                  
                  f(N) = 2^N +n^3 + n!
                  O(N!)
                  
                  f(N) = 2 N log 2(N) + 3 N + 100
                  O(N log 2(N)) 
                  
                  f(N) = 4 N log 2(N) + 3 N sqrt(N) + 100
                  O(N sqrt(N))
                  
                    f(N)
                   
```
### we are not finding function for any particular value, we care about that: 
**if we increase the value of N which of the terms grow very fast**
    means which term will dominate the function. that term will define the rate of growth of this function.

## TIME COMPLEXITY 
**the growth of no. of iteration with respect to input. **
## POINTS TO BE REMEMBER
    1. In Programming, whenever any log is given then we have to consider base 2. if the base is not given. then consider default base 2.
    2. While calculating the no. of iterations, we have to consider the terminate condition & the increment condition.
    3. log property is:- x^log x(N) = N
        3.1 example:-  2^log 2(N) = N
      #REVISE LOG PROPERTIES. 




























