  # DSA_Supereme
# **#ASLI CODING** 

### BASICS 
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
                                factor += 1                 
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

`````` FASTER THE THINGS,  BETTER THE THINGS. ``````     

        1.2  WHY WE NEED OPTIMISATION ?  
            ANS --> Optimising the code means, ** converting the same piece of code into something which will gives exact same result but faster means, takes LESS NUMBER OF ITERATIONS. **
            MEANS --> reducing the number of iterations. 

        1.3 HOW TO OPTIMISE THINGS ?
            ANS --> we have to do some observation.
                    we take small input and try to see what is the output. and try to make some small small observations. 
            EG 1 --> N = 10  { 1, 2, 5, 10 } total 4 factors.
            REPRESENTS --> means represents the factor in ** pairs of any number **
                       a * b   = N
                    1. 1 * 10  = 10     2 factors
                    2. 2 * 5   = 10     2 factors
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
                                                        

``````
                    How many number of zero in 10^9
                     ANS -->  there are 9 zeros in 10^9
                     EG  -->  10*10*10*10*10*10*10*10*10 = 10^9 = 1 billion 
     

``````
    2. WHY  WE INTRODUCE PROGRAMMING, SYSTEMS, AND ALGORITHMS?
        like --> if we ask that how many factore does this number have? 
                 10384589624 --> we have to check all the numbers from 1 to 10384589624 manually like using pen and paper.
        so --> ** as human we have certain limitation **, for that reason we have to use computer to solve this problem faster. 
     