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
   
   3. int s = 0;
        for(init i = 1; i<= N; i+2)
        {
            s = s + i;
        }  
        ANS --> (N + 1)/2 iterations. {means, ceil(N/2) iterations. because N+1 is the upper bound of N/2.}--> for explaination only.
                WE ARE ONLY DOING INTEGER DIVISION.
                  
        EXPLAIN --> i = 1 ==> 3 ==> 5 ==> 7 ....
                        ASSUME --> 
                                    N = 4, --> so, i = 1 ==> 3 ==> stop.        #iterations = 2. 
                                    N = 5, --> so, i = 1 ==> 3 ==> 5 ==> stop.  #iterations = 3.
                                    N = 6, --> so, i = 1 ==> 3 ==> 5 ==> stop.  #iterations = 3.
                        
        SO --> "for any given N, we are formed N/2 iterations. "  
        BECAUSE -->  because of INTEGER DIVISION. 
                        so, for N = 4, then 4/2 = 2.        #iterations = 2.
                            for N = 5, then 5/2 = 2.5        #iterations = 3.
                                why we make 2.5 to 3 ?
                                because of INTEGER DIVISION.
                                    N = 5,
                                        then, (5+1)/2 = 3
                                    
                            ceil value --> **WE JUST UPER BOUND TO NEXT INTEGER**          means, 2.5 to 3. forward 
                            floor value --> is 2. because we decrease the current integer. means 2.5 to 2.  backward
                            like    6/2 = 3,
                                    7/2 = 3, 
                                    8/2 = 4,  
                                    9/2 = 4   
                                    ==> Because of Integer Division.
                            
        Imp --> "for even number we are not considering 1/2. ==> so, for that N/2 iterations only. 
                    like even number N = 4, 
                              then, 4/2 = 2. 
                                    ||
                                   (4+1)/2 = 2.5
                                    the integer division will make 2.5 to 2.
                    so, both are same. that's why we not consider 1/2.
                 for odd number we are considering 1/2. ==> so, for that (N+1)/2 iterations. "  
                    like odd number N = 7,
                                             
                                      
```
            



 
    
