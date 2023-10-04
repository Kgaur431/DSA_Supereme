  # DSA_Supereme
# **#ASLI CODING**
## **DEVELOPING OBSERVATION SKILLS, THINKING SKILLS**
### ***IF WE OBSERVE THINGS, WE CAN DO THINGS***

### BASICS 
### FACTOR OF N
    1. WHAT IS A FACTOR OF N?
        ANS --> for any number if we devide with certain number means, if there is no which leaves a remainder 0 with 10 --> is a factor of 10.
        like --> no. is 10 and we devide it with 2 ==> if the result will be integer that means the 2 is an factor of 10. 
        so --> 1, 2, 5, 10 are the factors of 10.
                smallest factor of 10 is ==> 1
                largest factor of 10 is ==> 10 (number itself)

        1.1 GIVEN A NUMBER N, COUNT NO. OF FACTOR OF N. HOW TO SOLVE PROGRAMATICALLY. 
                firt we find out the smallest factor of any number like 10,1200 ... any number & largest factor of any number. 
            ANS --> smallest factor of N ==> 1.
                    largest factor of N ==> N. (number itself) 
            IMP --> so all the factor of N will lie between 1 to N range.
                    [] ==> this means inclusive 
                           [1.N] ==> 1 to N both inclusive so including both everthing in between is the range for the factors. 
                           (1.N) ==> 1 to N both exclusive
                           [1.N) ==> 1 inclusive and N exclusive
                           (1.N] ==> 1 exclusive and N inclusive
                if we have to write an simple piece of code to count the list of factor of given N. HOW WE WILL DO ?
                    We will run the Loop. 
            SUDO CODE -->  
                        count(N) {
                            factor = 0                      // this variable store the count of factor of N
                            for var i ==> 1 to N. 
                                                            // now i want to check weather i is a factor of N or not. how to do? 
                            if N % i == 0.                  // % will give the remainder so, if the remainder is 0 that means i is a factor of N.
                                factor += 1                 // factor are not in pair so, we will increment the factor by 1.
                        return factor   
                        }
            HOW MANY NUMBER OF TIMES THE LOOP WILL TAKE ? 
                ANS --> N. 
    
            EG --> lets, gaurav machine has executes 10^8 instruction ==> 1 second.  
                         now if we want to calculate N = 10^9.              // if a system takes 1 second to execute 10^8 instruction. 
                                                                            // then how much time will it take to execute 10^9 instruction.
                         N = 10^9 --> 10^9 iterations.                      // can we write 10^9 as 
                                       10^8 * 10  
                            ** a^n+m = a^n * a^m **
                              10^8+1 = 10^8 * 10^1 
                MEANS -->   10^8 --> 1 SECOND. * 10 = 10 SECONDS.    Gaurav System will take 10 seconds to execute the 10^9 instruction.   
            
                    EG --> 
                        N = 10^18 --> 10^18 iterations.
                        10^18 = 10^8 * 10^10 
                        10^8 = 1 second * 10^10 = 10^10 seconds                     // finding the time in seconds.
                        10^10 seconds = 10^10 / 60 * 60 = 2.7 * 10^6 hours.         // converting seconds to hours.
                        10^10 seconds = 10^10 / 60 * 60 * 24 = 115741 days.         // converting seconds to days.
                        10^10 seconds = 10^10 / 60 * 60 * 24 * 365 = 317 years.  // converting seconds to years.

                    SO --> if gaurav want to see the output he can't see if his machine taking 317 years to execute the code. so the code for count() function is not useful. 

## FASTER THE THINKS,  BETTER THE THINKS. {POWER OF THINKING, FINDING THE PATTERNS} `` ``````     

        1.2  WHY WE NEED OPTIMISATION ?  
            ANS --> Optimising the code means, ** converting the same piece of code into something which will gives exact same result but faster means, takes LESS NUMBER OF ITERATIONS. **
            MEANS --> reducing the number of iterations. 

### OPTIMISE THINGS
        1.3 HOW TO OPTIMISE THINGS ?
            ANS --> we have to do some observation.
                    we take small input and try to see what is the output. and try to make some small small observations. 
            EG 1 --> N = 10  { 1, 2, 5, 10 } total 4 factors.
            REPRESENTS --> means represents the factor in ** pairs of any number **
                       a * b   = N
                    1. 1 * 10  = 10     2 factors
                    2. 2 * 5   = 10     2 factors
                                                                    // if we write any number into a * b form. obiously 1 number will be smaller than other. like 10 ==> 2 * 5.
                                                                    // so, in our case a is smaller number and b is larger number. but we can write b < a also. then,
                                                                    //      b * a   = N
                                                                    //   1. 1 * 10  = 10     2 factors
                                                                    //   2. 2 * 5   = 10     2 factors  ==> any 1 number can be smaller than other.
            EG 2 --> N = 100 { 1, 2, 4, 5, 10, 20, 25, 50, 100 }
            REPRESENTS --> means represents the factor in ** pairs of any number **
                       a * b   = N
                    1. 1 * 100 = 100
                    2. 2 * 50  = 100
                    3. 4 * 25  = 100
                    4. 5 * 20  = 100
                    5. 10 * 10 = 100
            
            GENERALISING --> now, generalising the above two examples. can I say that 
                            ** if I have a number N, then the number of factors of N will be equal to the number of pairs of factors of N. **
            MEANS --> any number N. where a & b are the factors of N. 
            LIKE --> N = a * b.                         // without loss of generality means taking simpliest form.
                    WHERE ==> a <= b.                   // means a = 1, b = 10. || a = 2, b = 5. 
                    DEFINATION ==>  any number can be represent as a product of two factors. there one number is less than or equal to other.
            NOW,
                 if we have N = a * b. 
                    and i have to write b in terms of N and a. 
                    it will be --> b = N / a.
                        so, we can say that N has factors a and b is like N / a.    // Threfore we have multiple values of a and b. if we have a and N we can caluclate the b. 
                             so, why not we try to find out just a , b we will find later with the help of N/a. 
                                If we finding a We don't know the ** RANGE OF A **  
                                    smallest factor of a is 1.
                                    largest factor of a is  ?.
                                                                        // calculating a with the help of N = a * b, where a <= b.
                                        a <= b.
                                        a <= N / a.                     // Transfere of a to right side. & make it a * a = a^2. 
                                        a^2 <= N.                       // Now, squaring both side.
                                        a <= sqrt(N).                   // Now, taking the square root of both side. so square root & square cancel & N has square root.
                                            maximum value of a is sqrt(N). 
                                    largest factor of a is  sqrt(N).
                                    Now we write the code for finding the a <= sqrt(N).
                                        count(N) {
                                                    factors = 0
                                                `   for var a ==> 1 to sqrt(N).
                                                                                    // now, first we check that a is factor of N or not.
                                                        if( N % a == 0) {           // if a is factor of N, then we definately sure that N / a is also factor of N.
                                                                                    // In our case. factors presents in pairs. 
                                                                                    // eg --> 1 * 10, 2 factors.
                                                                                    //        2 * 5,  2 factors. 
                                                                                    // total 4 factors. so for any given a we also have N/a means b. [10/1, 10/2]
                                                                                    // means we have 2 factors for each. 
                                                                                    // so if we find the a,  the number of factors should increase by 2. ==> wrong answer. 
                                                        // factors +=2;             // it means if we have any a, we can increase the number of factors by 2. like if we have, we have b also.
                                                                                    // we can not add simply 2 because see the example N = 100. 
                                                                                    // 1 * 100 =100 ==> 2 factors
                                                                                    // 2 * 50  =100 ==> 2 factors
                                                                                    // 4 * 25  =100 ==> 2 factors
                                                                                    // 5 * 20  =100 ==> 2 factors   
                                                                                    // 10 * 10 =100 ==> 1 factor (10 & 10 both are one factor)   here, a == b.
                                                                                    // so, total we have 9 factors. 
                                                                    // we have 1 factor for a and b,  if a == b means (N/a). 
                                                            if(a == N/a) {            // if a == b(N/a). 
                                                                factors += 1;         // then we have 1 factor. 
                                                            } else {                  // if a != b(N/a). 
                                                                factors += 2;         // then we have 2 factors. 
                                                            }
                                                        }     
                                                return factors;
                                        }
                                                    // No. of iteration will remain sqrt(N). ==> optimised code.
                                // the above code means, we have an factors in the pair so we are adding 2 factors for each a.(a & N/a). eg ==> 10 facotrs
                                // but when we have only 1 factor then we have to add only 1 factor. (both a & N/a are same) eg ==> 100 factors. 
            
            NEW PROGRAMMER --> when we new programmer we don't know how to find the sqrt(N). then what is the solution? 
            ANS --> N = 100, sqrt(N) = 10.
            EG --> for(a = 1; a <= sqrt(N); a++) ==> sqrt(N) like 1, 2, 3, 4, 5, stop at 6.
                             ||
                    a * a <= N ==> 1*1 = 1, 2*2 = 4, 3*3 = 9, 4*4 = 16, 5*5 = 25, stop at 6*6 = 36.
            
            SUMMARISE --> N = 10^18  iterations, if we write simple code in gaurav machine it was taking 317 years to run the code.
            NOW -->     N = 10^18 ==> sqrt(10^18) ==> 10^9 iterations, 
            SO --> 10^8 = 1 second. * 10^1 = 10 second 
            CONSLUSION --> SO WHEN WE WRITE THE SOLUTION IF THERE IS AN SCOPE OF OPTIMISATION THEN WE HAVE TO FIGURE OUT WITH THE SMALL SAMLL INPUTS, SOME 
                           SOME OBSERVATIONS THAT CAN GET YOU TO OPTIMISED SOLUTION.

            FINALLY --> 317 years to 10 second.     // extermely optimised code.
 
### SUM OF NATURAL NUMBERS
        1.4 SUM OF NATURAL NUMBERS
            1.4.1 SUM OF NATURAL NUMBERS TILL 10 ?
                  ANS --> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
                           1 + 2 + 3 + 4 + ... + N = 55
            1.4.2 SUM OF NATURAL NUMBER TILL 100 ?
                  ANS --> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12  +.............+  92 + 93 + 94 + 95 + 96 + 97 + 98 + 99 + 100 = 5050
                  GAUS'S FORMULA --> 5050 = 100 * 101 / 2
                  QUES --> HOW GAUS'S OBSERVED? 
                  OBSERVATION --> HOW TO FIND THE NATURAL NUMBERS
                  EG --> S = 1   + 2  + 3  + 4  + 5  + 6  + 7  + 8  + 9  + 10 + ........+ 98 + 99 + 100 
                         S = 100 + 99 + 98 + 97 + 96 + 95 + 94 + 93 + 92 + 91 + ........+ 3  + 2  + 1     // GAUS'S wrote the number in reverse order
                         ----------------------------------------------------------------------------
                         2s = 101 + 101 + 101 + ............. + 101 + 101 + 101 ==> 100 times           //  100 times he added 101
                                  2s = 101 * 100 = 10100
                                        S = 101 * 100 / 2
                                        S = 5050
            
            1.4.3 GEMERALISING THIS FOR N NATURAL NUMBERS ? || HOW THE N NATURAL NUMBER FORMULA CAME. 
                  ANS --> S = 1 + 2 + 3 + ... + (N-2) + (N-1) + N                                       // doing for any number of N
                          S = N + (N-1) + (N-2) + ... + 3 + 2 + 1
                          ----------------------------------------
                          2S = (N+1) + (N+1) + (N+1) + ... + (N+1) + (N+1) + (N+1) ==> N times          // (N - 1) + 2 = (N + 1)  && (N - 2) + 3 = (N + 1)
                          
                                2S = (N+1) * N 
                                S = (N+1) * N / 2
                                
### SUM OF WHOLE NUMBER                                
        1.5 SUM OF WHOLE NUMBER 
            ANS --> Number which starts from 0. 
            1.5.1 FIRST 5 WHOLE NUMBERS ?
                  ANS --> 0, 1, 2, 3, 4  ==> 0 to (5-1). 
            1.5.2 FIRST N WHOLE NUMBERS ?
                  ANS --> 0, 1, 2, 3 , .... , (N-1) 
                  EG --> Nautral numbers ==> 1, 2, 3, 4, 5 
                  QUES --> WHY (N-1) ?
                           ANS --> because, we have to included 0 also. so, at left side we have to add 0. & at right side we will go till N-1.
                  QUES --> CONVERTING FIRST 5 NATURAL NUMBER TO WHOLE NUMBERS ?
                           ANS --> 0, 1, 2, 3, 4                          // 0 to (N-1) ==> 0 to 5-1 = 4
                  CONCLUSION --> adding 0 to any number will not change the number.
                                    0 + "1 + 2 + 3 + ... + (N-1)"  ==> also SUM OF FIRST (N-1) NATURAL NUMBERS. 
                                    SO --> IN THE SAME FORMULA "RERPLACE N WITH N-1"
                                    LIKE --> (N-1) * { (N-1) + 1 } / 2 
                                    THEN --> (N-1) * N / 2
                  SUMMARY --> This is the ans of SUM OF FIRST N WHOLE NUMBERS ==> (N-1) * N / 2. ==  SUM OF FIRST (N-1) NATURAL NUMBERS.   

### INTEGER DIVISION
        1.6 INTEGER DIVISION
            EG --> int a = 7
                   print(a/2), what it will print ?
                   ANS --> 3, it will not print 3.5
                   BECAUSE --> 7 is int & when we divide this 7 by int 2, then the resultant will also be int.
                   
            FLOOR VALUE --> "IF WE HAVE AN INTEGER & DIVIDE WITH THE INTEGER THEN WE GET THE INTEGER" 
            MEANS --> "IF THE DATA TYPE IS INTEGER THEN THE RESULTANT WILL ALSO BE INTEGER & IF THE DATA TYPE IS FLOAT THEN THE RESULTANT WILL ALSO BE FLOAT"
            EG --> 5.0 / 2 ==> 2.5 
            
            1.6.1 GIVE A +VE NUMBER N, WE HAVE TO COUNT THE NO. OF TIMES IT IS DIVIDED BY 2 TO REACH 1.
                  LIKE --> N = 8, 8/2 = 4, 4/2 = 2, 2/2 = 1.
                           SO --> 8 is divided by 2, 3 times to reach 1.
                           
                  LIKE --> N = 20, 20/2 = 10, 10/2 = 5, 5/2 = 2, 2/2 = 1.
                           SO --> 20 is divided by 2, 4 times to reach 1.
                           
                  LIKE --> N = 12, 12/2 = 6, 6/2 = 3, 3/2 = 1.
                           SO --> 12 is divided by 2, 3 times to reach 1.
                           
            1.6.2  WHAT IS THE NO. OF STEPS TO FINDING N ? 
                   QUES --> WHAT'S ALL STEPS SHOULD I FOLLOW TO THINK BETTER 
                   ANS --> I WILL TRY TO FIND THE ANS FOR EVERY N STARTING FROM 1 TO AS MUCH AS POSSIBLE.
                   HOW --> TAKE N & TRY TO FIND THE NO. OF STEPS TO REACH 1. 
                   
                   LIKE -->     N       #STEPS      EXPLANATION
                                1         0         if n is already 1 then we no need any steps to reach 1.
                                2         1         2/2 = 1
                                3         1         3/2 = 1   
                                4         2         4/2 = 2, 2/2 = 1
                                5         2         5/2 = 2, 2/2 = 1
                                6         2         6/2 = 3, 3/2 = 1
                                7         2         7/2 = 3, 3/2 = 1     
                                8         3         8/2 = 4, 4/2 = 2, 2/2 = 1
                                9         3         9/2 = 4, 4/2 = 2, 2/2 = 1
                                10        3         10/2 = 5, 5/2 = 2, 2/2 = 1
                                :         :         :
                                :         :         :
                                :         :         :
                                15        3         15/2 = 7, 7/2 = 3, 3/2 = 1  
                                16        4         16/2 = 8, 8/2 = 4, 4/2 = 2, 2/2 = 1
                                17        4         17/2 = 8, 8/2 = 4, 4/2 = 2, 2/2 = 1             
                                :         :         :
                                :         :         :
                                :         :         :
                   OBSERVATION --> 1. if we observe, we have ANS = 1, WHEN STARTING FROM N = 2 
                                        1.1 we have ANS = 2, WHEN STARTING FROM N = 4
                                        1.2 we have ANS = 3, WHEN STARTING FROM N = 8
                                        1.3 we have ANS = 4, WHEN STARTING FROM N = 16
                   PATTERN -->  N = 2^k, then STEPS = k
                                MEANS --> N is the POWER OF 2 
                                EG --> N = 2,
                                       N = 4,
                                       N = 8,
                                       N = 16,
                                       THE ANS for that will be k. 
                                LIKE --> IF N = 1,
                                WRITTEN AS --> N can be written as 2^k,                 
                                SO --> 1 = 2^0 ==> No. of STEPS = 0 

                                LIKE --> IF N = 2,
                                WRITTEN AS --> N can be written as 2^k,
                                SO --> 2 = 2^1 ==> No. of STEPS = 1             

                                LIKE --> IF N = 4, 
                                WRITTEN AS --> N can be written as 2^k,
                                SO --> 4 = 2^2 ==> No. of STEPS = 2

                                LIKE --> IF N = 8,
                                WRITTEN AS --> N can be written as 2^k,
                                SO --> 8 = 2^3 ==> No. of STEPS = 3

                                LIKE --> IF N = 16,
                                WRITTEN AS --> N can be written as 2^k, 
                                SO --> 16 = 2^4 ==> No. of STEPS = 4
                        
#### LOGARITHM
                                NOW --> LOGRITHMIC. 
                                         QUES --> WHAT IS LOGRITHMIC ?
                                         ANS --> log base b of x = y,
                                                        ||
                                         MEANS --> b^y = x 
                                                    the log basically asked "HOW MUCH POWER SHOULD WE RAISE THIS b TO SO THAT WE GET x ?" 
                                                    ANS ==> y power should be raised to b so that we get x.
                                WRITE --> k = log base 2 of N
                                MEANS --> 2^k = N so, k can be written as log base 2 of N
                                EG --> log base 3 of 27 = ?
                                       MEANS --> 3 REAISE TO THE POWER HOW MUCH, WILL MAKE IT 27 ?
                                       ANS -->  3^3 = 27, SO --> 3 REAISE TO THE POWER 3 WILL MAKE IT 27.
                                                          SO --> 3^k = 27, SO --> k = 3
                        
                                EG --> log base 2 of 16 = ?
                                        MEANS --> 2 REAISE TO THE POWER HOW MUCH, WILL MAKE IT 16 ?
                                        ANS -->  2^4 = 16, SO --> 2 REAISE TO THE POWER 4 WILL MAKE IT 16.
                                                           SO --> 2^k = 16, SO --> k = 4
                                EG --> if the num in between 
                                        2^k <= N < 2^(k+1) 
                                        THEN --> NO. OF STEPS  = k, ANS ==> K of any value of N. {line 319.}                ** IMP **
                                        IMP --> log base 2 of 2^k = ?
                                                MEANS --> 2 REAISE TO THE POWER HOW MUCH, WILL MAKE IT 2^k ?
                                                ANS -->  2 REAISE TO THE POWER k WILL MAKE IT 2^k.
                                                                      SO --> log base 2 of 2^k = k 
                                                EG --> log base 2 of 2^3 = x
                                                        MEANS --> 2 REAISE TO THE POWER HOW MUCH, WILL MAKE IT 2^3 ?
                                                                            || 
                                                        MEANS -->  2^x = 2^3        
                                                                   SO --> x = 3
                                                        ANS -->  2 REAISE TO THE POWER 3 WILL MAKE IT 2^3.
                                                                          SO --> log base 2 of 2^3 = 3

                                        NOW --> TAKE LOG BOTH SIDE
                                        LOG --> (log base 2 of 2^k = k) <= (log base 2 of N = k) < (log base 2 of 2^(k+1) = k+1)
                                        MEANS --> k <= log base 2 of N < k+1

                                NO. OF STEPS FOR N --> {log can be a decimal number so we will simply write in integer like ==> floor(log base 2 of N)}
                                                       EG --> N = 10
                                                              2^3 <= 10 < 2^4
                                                              SO --> NO. OF STEPS = 3  
                                                              BECAUSE --> 3 <= log base 2 of 10 < 4                 // did log both side
                                                                            ||
                                                              BECAUSE --> 3 <= {log base 2 of 10} ==> 3.3219 < 4    // we will take integer part of log
                                
                                SUMMARY --> log basically means that "HOW MUCH POWER SHOULD WE RAISE OF BASE b SO THAT WE GET X."
###  SQUARE ROOT
        1.7 
            QUES --> GIVEN A PERFECT SQUARE NUMBER, FIND THE SQUARE ROOT OF THAT NUMBER.
            PERFECT SQUARE --> 
                                EG --> 10 * 10 = 100
                                DEFINE --> "ANY INTEGER MULTIPLIED BY ITSELF, IF RESULTS IS AN NUMBER, THEN THAT NUMBER IS CALLED PERFECT SQUARE."
                                PERFECT SQUARE --> 100. 
                                LIST OF PERFECT SQUARE --> 100, 49, 36, 25, 16, 9, 4, 1
                                LIKE --> N = 49
                                SQUARE ROOT --> 7  ==> 7 * 7 = 49
                                QUES --> IF FOR ANY PERFECT SQUARE NUMBER N, TO FIND THE SQUARE ROOT OF THAT NUNMBER 
                                ANS --> 1 <= SQUARE ROOT(N) <= N.       // square root of any perfect square number is always within this range. 
                                CODE -->    N is an perfect square. N = 9.
                                        for i --> 1 to N;
                                            if (i * i == N)
                                                return i;               // this will return definately that we sure because N is an perfect square.

                                No. OF ITERATION -->  SQUARE ROOT(N) = 3 
                                CONSTRAINTS --> INPUT will be the perfect square number. otherwise code will throw invalid input. 
                                                    EG --> N = 25.
                                                            i --> 1, i * i = 1, 1 != 25, i++ = 2
                                                            i --> 2, i * i = 4, 4 != 25, i++ = 3   
                                                            i --> 3, i * i = 9, 9 != 25, i++ = 4
                                                            i --> 4, i * i = 16, 16 != 25, i++ = 5
                                                            i --> 5, i * i = 25, 25 == 25, return i = 5
                                                    
                                                    EG --> N = 9
                                                            i --> 1, i * i = 1, 1 != 9, i++ = 2
                                                            i --> 2, i * i = 4, 4 != 9, i++ = 3   
                                                            i --> 3, i * i = 9, 9 == 9, return i = 3
                                CONCLUSION --> "for any N, we definately don't travel till N, we will travel till SQUARE ROOT(N)."
## **IMPORTANT LEARNING**
1.    Don't look at the "what is the for loop statement"  

           CONSTRAINTS --> N = PERFECT SQUARE NUMBER
           CODE --> 
                    for i --> 1 to N;
                    if (i * i == N)
                    return i;
            Don't DO --> i = 1 & i is <n  then the Time Complexity will be O(N)     --> WRONG 
            DO --> **WE SHOULD LOOK AT WHAT IS THE BREAKING CONDITON TOO**
            LIKE -->  we should check the code is actually running N times? 
            EG --> if N is an perfect square then code will definately run till SQUARE ROOT(N) times. 
            BUT --> if in question they are not mentioned that N is an perfect square then code wil run N times.

### CONCLUSION
**FOR ANY LOOPING STATEMENT WE MUST SEE THE BREAKING CONDITION.**

### WHY WE HAVE TO SEE THE CONSTRAINTS ?
**DUE TO THE CONTRAINTS THE CODE WAS RUNNING SQUARE ROOT(N) TIMES.**
     

### WHY  WE INTRODUCE PROGRAMMING, SYSTEMS, AND ALGORITHMS
    2. WHY  WE INTRODUCE PROGRAMMING, SYSTEMS, AND ALGORITHMS?
        like --> if we ask that how many factore does this number have? 
                 10384589624 --> we have to check all the numbers from 1 to 10384589624 manually like using pen and paper.
        so --> ** as human we have certain limitation **, for that reason we have to use computer to solve this problem faster. 

# SIGMA RULE's
1. whatever the mentioned in the question, we have to only answer that. do check **STATEMENT, CONSTRAINTS, INPUT, OUTPUT** very well.  
2. THE STEPS TO SOLVE ANY PROBLEM 
    1. **spend some time on your own & try to solve it without taking any help** like 1 hour, 2 hour, 3 hour etc. **fixed ==> 2 to 3 hours**.
             ~~if after fixed time you are not able to solve it then,~~
    2.  **watch the hints || watch the video explanation then, spend 1 hour**
        ~~if you are not able to solve it now then,~~
    3. check the solution. or ask the solution.
   
     
