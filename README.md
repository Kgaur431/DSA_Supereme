### Power of Left Shift
``` 
      let say what Left Shift will gives us.
      we have 8 bit number.  int = 32 bit, long = 64 bit but for us it is 8 bit. 
        N = 45
        
      128   64  32   16   8     4    2  1       //  2 raoised the power
        7    6   5    4   3     2    1  0       //   8 bits
        -    -   -    -   -     -    -  -       
        0    0   1    0   1     1    0  1       // binary representation of 45
            
           -       1 Left shift N, (1<<N) see (img 1)
                    like:-
                        (1<<1)  ==>     shift 1 bit left side for 1 times, everything else is 0
                        (1<<2)
                        and so on.
           -        below, we have taken any example 45. Right now we have not done anything but we will perform some opertaion below.
                        we just converted into binary number 45.
                        & we have return a number in which only 1 bit is set(1), everything else bit is 0.
                        we have selected 2nd bit & 4th bit just an example.
                        
                Ques:-  We want to focus on a particular bit of this num(45) ?
                Ans :-
                        let say we took 2 cases for each operations.
                -   OR       
                          Case1:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                                 |      // we want to focus on 2nd bit.
                                                 
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 2 nd bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<2) 1 left shift 2
                                                    means we can just 1 left side, 2 times"  .
                                           Summary:-    
                                                If we want to have any number N, in which only 1 bit is set. then we can use 1 left shift the index which we want to set.   *********IMP**********
                            
                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<2)   0 0 0 0 0 1 0 0     OR
                            ---------------------------------------
                              Ans=45    0 0 1 0 1 1 0 1     
                            ----------------------------------------
                                   
                          Case2:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                             |        // we want to focus on 4th bit.
                            
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 4th bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<4) 1 left shift 4
                                                     means we can just 1 left side, 4 times"
                            
                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<4)   0 0 0 1 0 0 0 0     OR
                            ---------------------------------------
                              Ans=61    0 0 1 1 1 1 0 1     
                            ----------------------------------------
                            
                          If we see written like this,    
                                N | (1<<i)                      // means, there can be two cases.        precedence is equal for both so first we do (i<<i) then N | result.
                                    assume ith = 2.      // Case1:- where ith(green circle in img 2) bit is already 1(set) in N(number=45) & then we perfrom OR operation with 1 left shift i, then we get back ans as N. 
                                                                    means, if the Number (45) has the ith bit already set(1) & we take OR operator with a Number in which ith bit is one & everything else is 0 which is (1<<2).
                                                                    then,this will not change anything. so we get the same value.
                                    assume ith = 4.    // Case2:- where ith bit is 0(unset) in N(number=45) & then we perfrom OR operation with 1 left shift i, then we get extra 1 bit in the ans (see img 3).
                                                                   ans we got is 61. How ?
                                                                        N =    45      // already given
                                                                             + 16      // what is (1<<4) ?  ==>  means 2^4 = 16
                                                                   -------------------------
                                                                                61
                                                                   --------------------------
                                                                  means, we are adding extra bit when ith bit of N is 0. 
                                                                  so, N can become N + 2^i (45 + 2^4) when ith bit is unset(0). 
                                                         means we increase the value when ith bit of N is 0 & we not increase the value when ith bit of N is set.
                                we got the meaning of this (N | (1<<i)) when we will see in the question.
                          Ques:-    How do we know that ith bit is already set or not ?
                          Ans :-    if we get the same number in the ans that means ith bit is already set. read Case1
                                    if we get the other number in the ans that means ith bit is not set. read Case2
                      ****Imp:-
                                "OR operator is basically helps us to setting the ith bit"
                            
                -   XOR    
                          Case1:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                                 |      // we want to focus on 2nd bit.
                                                 
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 2 nd bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<2) 1 left shift 2
                                                    means we can just 1 left side, 2 times"  .
                                           Summary:-    
                                                If we want to have any number N, in which only 1 bit is set. then we can use 1 left shift the index which we want to set.
                            
                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<2)   0 0 0 0 0 1 0 0     XOR
                            ---------------------------------------
                              Ans=41    0 0 1 0 1 0 0 1          
                            ----------------------------------------
                            
                            Ques:-  How do we get the Ans as 41 ?
                            Ans :-  we had N(45) with us, this bit that was set (blue color circle) in the N (see img 5) now becomes unset in the ANS (see img 6)
                                    means we are subtracting 2^i || 2^2 into N                                                                *********************Imp**************************
                                       
                                       
                                       
                          Case2:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                             |        // we want to focus on 4th bit.
                            
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 4th bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<4) 1 left shift 4
                                                     means we can just 1 left side, 4 times"
                                                     
                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<2)   0 0 0 1 0 0 0 0     XOR
                            ---------------------------------------
                              Ans=61    0 0 1 1 1 1 0 1          
                            ----------------------------------------
                            
                            Ques:-  How do we get the Ans as 61 ?
                            Ans :-  we had N(45) with us, this bit that was unset (see in pdf) in the N (see img 5) now becomes set in the ANS 
                                    means we are adding 2^i || 2^2 into N                                                 
                            
                            Summary:-
                                    "if the ith bit was 0 in the N then we are making it 1 in Ans & if the ith bit was 1 in the N then we are making it 0 in Ans". see (pink color circle in pdf)
                          
                          If we see written like this,    
                                N ^ (1<<i)      // there can be two possible values of this.
                                
                                    we can get ans as either Case 1 or Case 2.        
                                        Case 1:-    N - 2^i     // this means "ith bit is already set(1)"
                                        
                                        Case 2:-    N + 2^i     // this means "ith bit is unset(0)"
                     ****Imp:-
                                "XOR operator is basically helps us to toggle the ith bit", toggle means if ith bit is 0 then we make it 1 or vice versa.     
                                     
                -   AND           
                          Case1:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                                 |      // we want to focus on 2nd bit.
                                                 
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 2 nd bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<2) 1 left shift 2
                                                    means we can just 1 left side, 2 times"  .
                                           Summary:-    
                                                If we want to have any number N, in which only 1 bit is set. then we can use 1 left shift the index which we want to set.
                            
                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<2)   0 0 0 0 0 1 0 0     AND
                            ---------------------------------------
                              Ans=4     0 0 0 0 0 1 0 0          
                            ----------------------------------------
                            
                            Ques:-  How do we get the Ans as 41 ?
                            Ans :-  Ans = 4, it is nothing but 2^i
                                        
                                       
                                       
                                       
                          Case2:-      7 6 5 4 3 2 1 0
                                       0 0 1 0 1 1 0 1
                                             |        // we want to focus on 4th bit.
                            
                            Ques:-  If I want the number that is 0 at every loaction & only 1 at 4th bit ? || I want the number in which only 1 bit is set and everything else is 0.
                            Ans :-   see (img 1)    0 0 0 0 0 1 0 0 
                                        Think How to get ?
                                            -   We don't have to convert 45 to this number. what is this number we will get after do this (0 0 0 0 0 1 0 0)
                                                    this is nothing but (1<<4) 1 left shift 4
                                                     means we can just 1 left side, 4 times"

                            Performing OR Operations.
                                N=45    0 0 1 0 1 1 0 1
                               (1<<4)   0 0 0 1 0 0 0 0     AND
                            ---------------------------------------
                              Ans=0    0 0 0 0 0 0 0 0          
                            ----------------------------------------
                       
                       
                       If we see written like this,    
                                N & (1<<i)      // there can be two possible values of this.
                                
                                    we can get ans as either Case 1 or Case 2.        
                                        Case 1:-    2^i     // it can be 2^i. this means "ith bit is already set(1)"
                                        
                                        Case 2:-    0     // this means "ith bit is unset(0)"
                  ****Imp:-
                                "AND operator is basically helps us to checking the ith bit", means wether the ith bit is 1 or 0, if ith bit set then remain set & if unset then remain unset.          
```

### Revision:-  (1<<N)
```
    Like:-  
            if we have a bit 1, & binary representation of this is 0 0 0 1        // for example we have 4 bit memory
            we do,
                  (1)   0 0 0 1     ==>     2^0 =   1       // representation of 1 in binary form.
                (1>>1)  0 0 1 0     ==>     2^1 =   2
                (1>>2)  0 1 0 0     ==>     2^2 =   4
                (1>>3)  1 0 0 0     ==>     2^3 =   8           see (img 4)
                    i
            Summary, 
                    if we have 1 (decimal), then we can make any bit 1 using left shift 1.
                    means, we are  1 bit shifted toward left side into binary of 1, till i times. 
```

#### Problem1:- Given an integer N. perfrom multiple tasks.
```    
                                            Disclamer:- we can find the Ans of the given task in lots of ways but below ways are simplest way.             
                        7 6 5 4 3 2 1 0
     N = 12     ==>     0 0 0 0 1 1 0 0.            
     i = 5      
     goal ==>   set the 5th bit.
     1.     Set ith bit of N
                Think:-
                        we can do this with the use of | operator.     N = N | (1<<i)
                            like:-
                                    if the ith bit of N is set then remain 1, but if the ith bit of N is 0 then become 1.                         

                        Setting ith bit means.
                            "we want to convert this number (0 0 0 0 1 1 0 0) into a number in which everything is same but this bit (see light purple color img 7) become 1 "
                        
                        Ques:-   Why se are not performing ^ operation for this taks ?
                        Ques:-   does the ques say, if ith bit was one then make it 0 ?
                        Ans :-   No.
                                    so if we perform N = N^(1<<i)
                                        means it is setting ith bit if tis is 0. then make it 1. 
                                        but, if ith bit already 1 then it will make it 0 || unset. that we don't want.
                
                Imp thing:-
                          assume we are an interview & he has given this question. 
                            Our Counter question:-   should be "What if the bit is already set, should it remain set or unset ?"    
                            Interviewer:-            if interviewer says, let be as it is. then use it N = N | (1<<i)
                                                     if interviewer says, just toggle it. then  use it N = N ^ (1<<i)
                
                No change if it is already set then use N = N | (1<<i) & not use N = N ^ (1<<i).     

    2.      Toggle ith bit of N.
                        use XOR operator to get Ans.    N = N ^ (1<<i)

    3.      Unset ith bit of N & no change if it is already unset.
                
                Think:-
                        & operator:-   
                                        if we use & operator, & operator will make every thing 0 except ans bit with respect to ith bit in the ans, if N bit is 1 with respect to ith bit.
                                            or vice versa (means it will make every thing 0)
                            we wamt to unset the ith bit, but it will only unset when this bit was unset with respect to ith bit in the N. 
                                so & operator is not useful.    read carefully.

                        ^ Operator:-
                                        assume we know how to check that ith bit is set or unset.  
                                                if (checkBit(N, i))// if ith bit is set.
                                                    {
                                                        N = N^(1<<i)        // that's how we can ith bit unset.
                                                    }
                                                else 
                                                    // no change.
    
    4.      Check if ith bit is set.
                        Ques:-  How do we check if ith bit is set or unset ?
                        Ans :-  we can use & | ^ to do this task. 
                                    
                                |   if ith bit is set then | operator will have no change. 
                                ^   if ith bit is set then ^ operator will decrease the value to make the ans as 2^i 
                                so if we do like this, then we can check that bit is set or unset.          ==> this symbol means "that implies" means like:- EQUATION useful in MATHS & MATHS is useful in other Things. so eq ==> other things
                                        below code is for checkBit(N,i) fun
                                    N | (1<<i) == N  ==> ith bit is set.
                                        means if we getting N as Ans then bit is set or unset.
                                        
                                    N ^ (1<<i) < N   ==> ith bit is set.    // this will decrease the value on N.
                                        means if we getting Ans < N  then bit is set and if Ans > N then bit is unset.
                                        
                                    N & (1<<i) == 2^i   ==> ith bit is set.
                                        means if we getting Ans as 2^i then bit is set and if Ans as 0 then bit is unset.
    
    Note:-
            -   if | operator is giving N as Ans that means ith bit is already set and if it is giving greater then N (Ans > N) that means ith bit is unset.
            -   ^ operator will toggle the bit means, if bit is 1 then it make it 0 or vice versa.
    
    all the above task or other task we can do if we know these & | ^ operator.
    These three operators are very important to solve Bit Manipulation problem.
```
#### Problem2:- Check if ith bit is set in N without Left Shift Operator.
``` 
     N = 45         7 6 5 4 3 2 1 0
                    0 0 1 0 1 1 0 1     // binary representation of N.
     i = 3 ==> Ams = True
     i = 4 ==> Ams = False
     
     Hint:-
            we have to find the solution in single equaltion. In Bit Manipulation we don't have loop and all.  
            
     If Left shift is not allowed then we can use Right Shift.
        
        
        N & 1   ==> There can be two values, either 1 or 0.
                Case1:- 1 -->    0th bit is 1
                Case2:- 0 -->    0th bit is 0
                
        hwe know, for any N we can get wether the 0th bit is 1 or 0 (previous class we read) now we can find out 3rd bit 
        Ques:-  How to make it possible that 3rd bit move to 0th bit ?
        Ans :-  (N>>3), if we do N right shift 3 times. then 3rd bit moved to 0th bit. see (img 8)
                means, do N right shift i times then ith bit reaches to the 0th bit and do & with 1.    ==>     (N>>i) & 1
                       after doing, we can either have 1 or 0
                            1   --> ith bit is set.
                            0   --> ith bit is unset.
        How,
                Let say,
                        
                             i=3                                        i=4
                         
                 bits   7 6 5 4 3 2 1 0                             7 6 5 4 3 2 1 0
                        
                        0 0 1 0 1 1 0 1                             0 0 1 0 1 1 0 1
                now, we do (N>>i)
                            (N>>3)                                      (N>>4)
                        0 0 0 0 0 1 0 1                             0 0 0 0 0 0 1 0            
                   &    0 0 0 0 0 0 0 1                             0 0 0 0 0 0 0 0 
                 --------------------------                     ----------------------------
                        0 0 0 0 0 0 0 1                             0 0 0 0 0 0 0 0 
                 --------------------------                     ----------------------------
                            Ans = 1                                     Ans = 0

                    as we learnt either we got 0 or 1.
                    so, where i=3, ith bit is set and i=4, ith bit is unset.
``` 

#### Problem3:- Given an integer N, count No. of Set bits in N.
```
    N = 45              0 0 1 0 1 1 0 1    ==>      Ans = 4.
    N = 10              0 0 0 0 1 0 1 0    ==>      Ans = 2.

    Simple Way:-
            "Iterate for every bit and Check wether it is set or unset"
            
            here, we have to iterate for every possible bit.
                like N = 10              0 0 0 0 1 0 1 0
                    for small number 10 we have to travel every bit. that's why it is not good approach.
    Hint:-  
        if we use knoweledge of Left Shift or Right Shift then we no need to travel every bit.
        
        if we do like this,
            N = 10
            N>>1
            print(N)
            
            Ques:-  will it print 10 or any other value ?
            Ans :-  it's remain same. 
                    becoz we have not assigned the Ans of N>>1 back to N.
                    like:-  N=N>>1
            
        Ques:-  We know how to check 0th bit ?
        Ans :-  N & 1
                like:-
                    if(N&1 == 1)        // if condition true means its Set.
                
                if we move every bit to 0th bit. 
                like:-
                        0 0 0 0 1 0 1 0             here, N=10
                   N>>1 0 0 0 0 0 1 0 1             here, N=5
                   N>>2 0 0 0 0 0 0 1 0             here, N=2
                   N>>3 0 0 0 0 0 0 0 1             here, N=1
                   N>>4 0 0 0 0 0 0 0 0             here, N=0        // after this we don't have to continue becoz we will get all 0 every time so it's stopping condtion. like as soon as all are 0 then stop.
                               
                               N= N>>1 means N= N/2                                 
        Code:-
                ans = 0
                While(N > 0)    // stopping Condtion
                 {
                    if(N&1 == 1)    // if 0th bit is 1 then it's true
                     {
                        ans += 1    // count the set bit
                     }
                    N = N>>1        // shifting right side at every step            Don't do:- if we forgot to assign back to N like N>>1 then value of N will not change & it will loop infinite times.   
                 }
                 return ans
            Now we are writing this code in one line.
                this code:- 
                            if(N&1 == 1)    // if 0th bit is 1 then it's true
                                 {
                                    ans += 1    // count the set bit
                                 }
                How,
                     ans += (N&1)       // means, either (N&1) is 1, in this case we are adding 1 into ans or (N&1) is 0, in this case we are adding 0 into the ans
                                            but adding 0 is not harm.
        Total
            TC:- O(log(N))
            SC:- O(1)
                         
```
## Perfroming Left Shift, Right Shift, AND, OR, XOR ... operation take O(1) Time

## Negative Numbers
```     
                                                                                                                        7th bit means MSB bit. for ex we took 8 bit number, otherwiese we have 32, 64 bit numbers.
    Ques:-  If we have 8 bit number which is only storing +ve numbers, What is the Maximum num we can have ?
    Ans :-  if we have every number 1 then maximum we can have number of 255. 
            so the range of num is [0 -- 255], if we have unsigned numbers.
                
                7 6 5 4 3 2 1 0
                - - - - - - - -     if we have every bit is +ve then make every bit as 1.
                1 1 1 1 1 1 1 1     the decimal number of this will be 
                                        2^7 + 2^6 + 2^5 + .... + 2^0 ==> it is nothing but an sum of GP series. 
                                        a = 2^0
                                        n = 2^8     // common ration ^ total number of terms
                                        r = 2       // common ratio
                                        
                                            2^0 * (2^8 - 1) / 2-1   =   2^8 - 1     =   255
------------------------------------------------------------------------------------------------------------------------                                        
    Negative Numbers:-
            (2's Complement is actually used to store negative numbers)
        Ques:-  If we have 8 bits like this, & if we add every other bit expect first bit. Which num is larger case 1 or case 2?
        Ans :-  case1   >   case2
                like this:-     -     -   -   -   -   -   -   -
                               2^7  (2^6+2^5+2^4+2^3+2^2+2^1+2^0)
                                |           |
                                |           |
                              case1  >    case2
                                        Finding case2 Ans ?
                                            this is nothing but sum of GP.
                                                a = 2^0
                                                r = 2 
                                                total num of terms = 7
                                                    
                                                    2^0(2^7 - 1)/(2 - 1)    =    2^7 - 1    =   Ans
                2^7 is the Most Significant Bit.        *****************Imp****************************    

        Ques:-  Why we called 2^7 bit as MSB ?
        Ans :-  
                In Int, if we have 32 bits then also leftmost is MSB
                In Long, if we have 64 bits then also leftmost is MSB
                
                MSB bit is our Signed bit.  ************************Imp******************
                    MSB is used for defining the negative numbers.
        
        Ques:-  How does MSB defines it ?
        Ans :-  
                Eg:-
                        7   6   5   4   3   2   1   0
                  N=45  0   0   1   0   1   1   0   1
                  
                  There are 2 steps with which we calculate 2's complement.
                    Step1:- To Flip every bit. means toggle the bit. after fliping we got 1's Complement. 
                            1   1   0   1   0   0   1   0            this is nothing but 1's Complement.
                    
                    Step2:- add 1, means add binary representation of 1 into 1's Complement.
                            0   0   0   0   0   0   0   1
                            
                      like:- 
                            1   1   0   1   0   0   1   0
                       add  0   0   0   0   0   0   0   1
                     ---------------------------------------
                            1   1   0   1   0   0   1   1               this is nothing but 2's Complement.
                     --------------------------------------
                  
                Explain What is this 2's Complement.
                    -  2's Complement actually represents the negative numbers.
                        if we start with N=45, after 2's complement Ans= -45
                        
                        converting Binary to Decimal numbers.
                            1   1   0   1   0   0   1   1   ==>     211         both 211 and -45 is different.
                            
                        The MSB is 7th bit. that is signed bit(that is -ve bit).
                            signed bit means the bit(2^7 || 7th) is not adding as +ve bit, it is adding as -ve bit.
                            like:-  -128 + (64 + 16 + 2 + 1)
                                    =   -128 + 83 
                                    =   -45
                    therefor if we have to see How negatives numbers are stored, they are stored in 2's complement.
        "if the Signed Bit is 1 then we can say entire N is negative, becoz this bit(2^7 || 7th) is bigger than the combined number (2^6+2^5+2^4+2^3+2^2+2^1+2^0)".
         if the Signed Bit is 0 then we can say entire N is negative, becoz we are not consider it while calculating decimal. 
         
        Note:-  if we have binary representation of any N (0   0   1   0   1   1   0   1) where the 7th bit is 0 then it will be positive number and if its 1 then it is -ve number.
                    like:-
                        0   0   1   0   1   1   0   1                   // N = 45                               here 7th bit is 0, so it's +ve
                        1   1   0   1   0   0   1   1                   // 2's Complement.                      here 7th bit is 1, so it's -ve
                                                                                                                    becoz 2^7 has more in value compare to combined number.
        Remember:-
                In Programming lang. like JAVA, Python ... so on. when we write int a = 5, "it is by default a signed bit", it means we can Store a Negative Number or Positive Number.
                    In only C++ we can make unsinged bit or signed bit.
                so every data type that we used, they have Most Significat Bit as Signe Bit.    ***********************Imp***************************
                    means, if the MSB bit is 1 then Number is positive or vice versa.

        Ques:-  Binary Representation of -12 in 8 bit ?
        Ans :-
                    7 6 5 4 3 2 1 0
                    - - - - - - - -
                    0 0 0 0 1 1 0 0         // binary representation of 12
                    
                              1 1
                    1 1 1 1 0 0 1 1         // flip the bit.
                    0 0 0 0 0 0 0 1         // add 1
                 ----------------------                     2 ==> 1 0
                    1 1 1 1 0 1  0  0               -128 + (64 + 32 + 16 + 4 )
                                                    -128 +  116 =   -12
        
        45 -12  = ?             ||  45 + (-12)
        
                    7 6 5 4 3 2 1 0                     2 ==> 1 0,      3 ==> 1 1
                    - - - - - - - -
                  1 1 1 1 1 1               // carry
                    0 0 1 0 1 1 0 1         // binary representation of 45
                    1 1 1 1 0 1 0 0         // binary representation of -12     
           ---------------------------------------  
                    0 0 1 0 0 0 0 1                      33.       
                    
                    45 - 12 = 33
                      
           Imp:-    we have 8bit memory only & we have 1 extra bit in carry so the extra bit is overflow that's we it will be discareded. see (Img 9)
```
    AFTER 01:57:00 
### Remember
1.  (N<<i) means **shifting N on the Left side for i times**
2.  (1<<i) means **shifting 1 on the Left side for i times**


3.  MSB is always Signed bit. so in 8 Bit system, 7th bit is Signed bit. in 32 bit system where the leftmost bit is Signed bit.
4.  Signed bit is used to descide the sign of that bit wether it is positive or negative.


