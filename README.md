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
  
  6. int i = N; // N > 0
        while(i > 1) 
            {
                i = i / 2;
            }                       
         
        ANS --> log
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
                          
               
```


























This error means that your local branch is behind the remote branch and you need to integrate the remote changes before pushing again¹. This can happen when someone else has pushed new commits to the same branch as you². You can fix this by fetching and merging the remote changes with your local work using `git fetch` and `git merge` commands, or simply using `git pull` command¹². Alternatively, you can use `git rebase` command to reapply your local commits on top of the remote branch², but be careful as this can rewrite the history and cause conflicts³. You can also use `git push -f` command to force push your local changes and overwrite the remote branch, but this is not recommended as it can potentially lose work or delete other people's contributions⁴⁵.

Source: Conversation with Bing, 25/4/2023
(1) Dealing with non-fast-forward errors - GitHub Docs. https://docs.github.com/en/get-started/using-git/dealing-with-non-fast-forward-errors.
(2) Git push rejected "non-fast-forward" - Stack Overflow. https://stackoverflow.com/questions/20467179/git-push-rejected-non-fast-forward.
(3) Rejected non fast forward-Git push rejected “non-fast-forward”. https://www.janbasktraining.com/community/devops/git-push-rejected-non-fast-forward.
(4) What does "Git push non-fast-forward updates were rejected" mean?. https://stackoverflow.com/questions/4684352/what-does-git-push-non-fast-forward-updates-were-rejected-mean.
(5) Common Git Errors, How to Fix, and 5 Ways to Avoid Them. https://komodor.com/learn/git-errors/.
 
    
