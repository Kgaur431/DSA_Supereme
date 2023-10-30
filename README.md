## Bit Manipulation

#### Decimal Number System
``` 
        MUST READ PDF for this Bit-Manipulation-1 while revesion.
        
    Ques:-  Normal numeric numbers that we used daily have how many digits?
    Ans :-  10 digits.  {0 to 9}

    Ques:-  If I have to write a number like 342 How do we pronounce it regularly || what is the english representation ?
    Ans :-  Threee hundered fourty two. 
            becoz we represent this number like
                3*10^2 + 4*10^1 + 2*10^0

    Ques:-  Why we are able to write every number in term of power of 10?
    Ans :-  "becoz for decimal number system we have 10 digits. so the base for decimal number system is 10".  
                eg:-    we can represent any number in this formate see puple underline (img 1)
``` 
#### Binary Number System
``` 
    In the number system if we have only two digits {0 & 1} no other digits are there.

    Ques:-  In normal numeric system, when we write number like 0 1 2 3 4 5 6... so on. Consider we have only two digits availabe {0 & 1}. then which all number we can have ?
    Ans :-  we can write 
                        0, 1   // after that we can't write 2 3 4 5 .... so on.
                        becoz we have an limit of 0 & 1 so we can't write any other two digit number
                        0, 1, 10, 11, 
                        
                        If we try writing any two digit number which is greater then 11. we need a digit which is eiter greater then 1. which is neither 0 nor 1.
                        so the next number is in decimal number system which is without any digit (2 3 4 ... and so on) will be 100
                        
                        0, 1, 10, 11, 100, 101, ... so on. these are the number that we will see. they have only two digit {0 & 1} 
                        0  1   2   3    4   5   ... so on.      ==>     In terms of Binary number    
    
    Ques:-  How do we know which is binary number & which is decimal number ?
    Ans :-   
            Eg:-    
               let say we have 110.
                    for decimal number we are able to present it like this with base 10:- 342 = 3*10^2 + 4*10^1 + 2*10^0  
                    if we follow the same idea with binary number 
                        110 ==> 1*2^2 + 1*2^1 + 0*2^0   ==>  4 + 2 = 6      {0 & 1} it has two digit so the base is 2
                        means, this decimal number (110) is actually 6th decimal number.    ||  Basically decimal representation of this binary number is 6. see (img 2)
```
#### Conversion:-   Binary to Decimal (in detail)
``` 
        The indexing in Binary number starts from Right To Left. see (img 3)
        index           4 3 2 1 0
        Binary num:-    1 0 1 1 0
                so 0 contribute to 0*2^0
                   1 contribute to 1*2^1
                        and so on.  see (img 4)
        
        So, we can say "for binary number (1 0 1 1 0) in base 2 the decimal representation is (22)10"
        
        Ques:-  How we convert Binary to Decimal ?
        Ans :-  "every digit in binary is known as Bit"
                    so In binary number representation {0,1} we called as Bits.
                       In Decimal number representation {0,1, 2, 3, ....} we called as Digits.
        
        Easy Way to do above Conversion 
        index           4 3 2 1 0
        Binary num:-    1 0 1 1 0
                        
                        *   any binary num that we have, just write the indexing R to L.
                        *   The bits which are 0 they are adding 0 to the final ans. means no use. so neglet bit = 0.
                        *   The bits which are 1 they are adding like 2 raise to the power 1 2 3 4 ... so on (2^). so why not we just count only bit which are 1.
                            
                            Ex:-    
                                see (img 5)
```

#### Conversion:-   Decimal to Binary
``` 
        -   Long Devision Method:-
                num = 20
                *   at every step devide num by 2 & focus on what is the quotient & reminder
                Eg:-    see (img 6)
                    20/2  ==>  10/2 ==>  5/2  ==>  2/2  ==> 1/2 = 0.
                    for counting binary then we have to write in reverse order. like (l --> r) & (bottom --> top)
                        Binary = 0 1 0 1 0 0        // binary representation of 20
                            check:-
                                    5 4 3 2 1 0
                                    0 1 0 1 0 0
                             
                             add ==> 2^4 + 2^2 = 20  
```

#### Addition of Binary System 
```     
    eg:-    
     carry     1  1                           -->  decimal value of this binary is
               3 6 8                    1 0 1 -->   5
             + 4 5 3                  + 0 1 0 -->   2
        --------------------        -------------------- 
                8 2 1                   1 1 1 -->   7    
    
                                    here 1+0 = 1, 0+1 = 1, & 1+0 = 1. so ans = 1 1 1 ==> wrong.
        
                1 0 1   --> 5
              + 1 1 1   --> 7 
           -------------------
                1 1 0 0 --> 12
               Ans should be 12
                here, 1+1 = 2. now what is the binary number for 2 = 10. so 0 will be in the ans & 1 will be carry. 
                      1+0+1 = 2. now what is the binary number for 2 = 10. so 0 will be in the ans & 1 will be carry.
                      1+1+1 = 3. now what is the binary number for 3 = 11. so 1 will be in the ans & 1 will be carry.
                      1+0+0 = 1. (we have added extra 0 to left side)
                      
                Ans = 1 1 0 0   see (img 7)
                      
                1+1 = 2 ==> 1 0
                1+1+1 = 3 ==> 1 1
                1+1+1+1 = 4 ==> 1 0 0
                    and so on.
```
### Bitwise Operation
``` 
     Ques:- what all the bitwise operator are ?
     Ans :- 
            main operations for binary numbers
              Name                      Symbols
                NOT             -->     ~ || !
                AND             -->     &
                OR              -->     |
                XOR             -->     ^
                LEFT SHIFT      -->     <<
                RIGHT SHIFT     -->     >>
            
            not mostly used
                NAND(NOT + AND) -->
                NOR(NOT + OR)

                1. NOT:-
                    "this operation says if the bit is 1 then make it 0, vice versa". becoz we have only two bits || digit 0 & 1. means reverse the bit.
                
                Table explaination:-
                    1.  What are all the possible combination 
                        0 0, 0 1, 1 0,, 1 1.
                    
                    -   In binary Numbers
                            0   indicates to false.  || unset bit
                            1   indicates to true.   || set bit
                    2.  A & B 
                            & means both. 
                            like:- if any one of the bits are false then ans is false, if all of the bits are true then ans is true.
                            eg;-    when we write & in the if condition that means "when both the conditions are true then only Ans True.   
                    3.  A | B
                            if any one of the bits are True then ans is true
                    4.  A ^ B
                            XOR means "Addition without carry"
                                "if the base are same like 0 0 then ans = 0 & if the base are different like 1 0 then ans = 1".   
                            eg:-
                                0 + 0 = 0,  0 + 1 = 1,  1 + 0 = 1,  1 + 1 = 2 (2 means 1 0) here 1 should go in the carry so if we ignore the carry then ans = 0.
                    5.  NAND
                            its basically means "reverse of A&B "     
                            Like:-  
                                    0   0   0   1
                                        to 
                                    1   1   1   0
                    6.  NOR
                            its basically means "reverse of A|B"
                            Like:-
                                    0   1   1   1
                                        to 
                                    1   0   0   0
                    
                    && :- is the conditional operator either this or this.
                    &  :- is the binary operator

            Numbers
                we write like this,
                    int a = 5
                    int b = 6
                    print (a&b)         // it will print 4.
                        
                      This below things are internally what is happening. we don't have to do in when we write code.
                        Ques:-  What it do internally ? 
                        Ans :-  Every number stored in binary form in computer system.
                                so, binary of 5 = 1 0 1
                                              6 = 1 1 0
                                        ------------------------
                                                  1 0 0                     // result of & operations.
                                        ------------------------ 
                                now what computer will do when we perform a & b.
                                computer will "consider bit by bit and perform & operation" 
                                like:-
                                       Ques:-   What is the result of 1 & 0
                                        Ans :-  0    
                                        
                                        Ques:-   What is the result of 0 & 1
                                        Ans :-   0 
                                        
                                        Ques:-   What is the result of 1 & 1
                                        Ans :-   1 
                                        
                                        now,
                                            Ques:-   What is the decimal of 1 0 0.
                                            Ans :-   4 
                                     
                Remaining part is in pdf.
```
## **Every Binary operation is perfrom on bit by bit seprately**

### Properties
``` 

    1.  If we do Number & with 1    ==>     A & 1 = ?
            Like:-  
                    A = 12              // Decimal number
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 1 0 0
                    
                    Ques:-  What is binary of 1 ?
                    Ans :-   1
                    So,
                            1 1 0 0
                        &   0 0 0 1
                        ----------------
                            0 0 0 0         ==> ans is 0.
                    How to find:-
                         for 1, these bit (yello color, see img 8) are always 0.
                         so, "if we do 0 and perform & operation with any number then we get 0 only"    // becoz 0 & with any number, the result is 0 only. so we don't care.
                         for 0 & 1 this is also 0. (light green color, see img 8)

            read another example from pdf.
         Imp:-  "Pickup any number A, The Result will always be either 0 or 1"
                    like:-  
                        What is the information give us.            
                                            ------> 0   ==> this give us first info, "Last bit is unset(means 0) for A"
                                            |
                            any number A & 1    
                                            |   
                                            ------> 1   ==> this give us second info, "Last bit is set(means 1) for A"
                                            
                                            here, Last bit means 0th position bit. || 0th bit
                                            
                                            means, if we see in the (img 8)" where the last bit of A is 0"(light green color where A = 12) then Ans will be 0
                                                    if the last bit of A is 1(light green color where A = 13) then Ans will be 1
                        
                        Ques:-  What kind of Number have Last bit is = 0 ?
                        Ans :-  Any number which can be written as 2^x, 2^y, 2^z ... and so on.(means any num which 2 raised to powre something).
                                Pickup any binary number.
                                like:-  
                                    bits :-     4 3 2 1 0
                                    Number:-    1 0 1 1 0
                                        
                                        these numbers 1 0 1 1, currently it is store 2^4, 2^3, 2^2, 2^1. irrespective of these the addidiont of these number will always be Even. 
                                            like:-  it will be like 2 raised to power something + 2 raised to power something + 2 raised to power something, only for the last bit(0th bit) 
                                                    if it is 0 then it also Even (becoz 0 is always even number) 
                                                    but, 
                                                    if we have same thing but last bit is 1 then this will be odd.
                                                        like:-  it is 1 * 2^0 = 1 * 1 = 1 so, its odd   see (img 9)
                                                        
                                    now, if we add two Even number then we will get Even number.
                                         if we add Even number with odd number then we will get Odd number
                                    
                                    so,  if the last bit of A is 0(means unset) then "A is Even"
                                    and, if the last bit of A is 1(means set) then "A is Odd"   see (img 10)
                                    
                    
                    This is Even Odd Property, "Checking if the Number is Even or Odd", so we can check it with the & with 1. then we know if the number is Even or Odd. (same thing as A%2) ******IMP***
                                                
                                            ------> 0   ==> this give us first info, "Last bit is unset(means 0) for A"     ==>     A is Even
                                            |
                            any number A & 1    
                                            |   
                                            ------> 1   ==> this give us second info, "Last bit is set(means 1) for A"      ==>     A is Odd
    
                    Note:-  Binary operation are usually faster then Airthmetic operation but the TC is O(1) for both. so if we do A&1 is little faster then A%2

    2.  If we do Number & with 0    ==>     A & 0 = 0
            Like:-
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1
                    
                    Ques:-  What is binary of 0 ?
                    Ans :-   0
                    So,
                            1 0 1
                        &   0 0 0
                        ----------------
                            0 0 0         ==> ans is 0.
                    
                    Means, we can say A & 0 is always a 0, irrespective of the value of A.

    3.  If we do Number & with Number    ==>     A & A = A
            Like:-  
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1

                    So,
                            1 0 1
                        &   1 0 1
                        ----------------
                            1 0 1         ==> ans is A.

                    Means, we can say A & with itself A is always a A.
    
    4.  If we do Number | with 0    ==>     A | 0 = A
             Like:-  
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1
                    
                    Ques:-  What is binary of 0 ?
                    Ans :-   0

                    So,
                            1 0 1
                        |   0 0 0
                        ----------------
                            1 0 1         ==> ans is A.

                    Means, we can say A | with 0 is always a A.
                    
    5.  If we do Number | with Number    ==>     A | A = A
            Like:-  
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1

                    So,
                            1 0 1
                        |   1 0 1
                        ----------------
                            1 0 1         ==> ans is A.

                    Means, we can say A | with itself A is always a A.
    
    6.  If we do Number ^ with 0    ==>     A ^ 0 = 0
            Like:-
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1
                    
                    Ques:-  What is binary of 0 ?
                    Ans :-   0
                    So,
                            1 0 1
                        ^   0 0 0
                        ----------------
                            1 0 1         ==> ans is A.
                    
                    Means, we can say A ^ 0 is always a A.
                    
        Very Important
    7.  If we do Number ^ with Number    ==>     A ^ A = 0
            Like:-
                A = 5       // Decimal Number
                
                    
                    Ques:-  What is binary of A ?
                    Ans :-   1 0 1
                    
                    So,
                            1 0 1
                        ^   1 0 1
                        ----------------
                            0 0 0         ==> ans is 0.
                    
                    Means, we can say A ^ A is always a 0.
    
    -   for A|1, A^1 there is nothing specific information means we will not get 0 or A. 
    
    8.  Commutative Property
            
            -   if we do any Number A & any Number B  ||  any Number B & any Number A, so the ans will be equal.        A&B = B&A
            -   if we do any Number A | any Number B  ||  any Number B | any Number A, so the ans will be equal.        |&B = B|A 
            -   if we do any Number A ^ any Number B  ||  any Number B ^ any Number A, so the ans will be equal.        A^B = B^A     
            
            Notes:- "Order doesn't matter, bits matter If we Perfrom any Binary Operations". 
            
            -   if we do any Number A & any Number B & any Number C ||  any Number C & any Number A & any Number B, so the ans will be equal.        A&B&C = C&A&B  
                    simply, consider the result of A&B is X. so we are doing X&C is smae as C&X  
                    
                    we can perform these three. like this,
                        so first, A&B ==> result Then result&C
                        eg:-
                            5&7&4       5 ==>   1 0 1   7 ==>   1 1 1   4 ==>   1 0 0
                                
                                Step1:- 
                                        1 0 1       <==     5
                                      & 1 1 1       <==     7
                                   --------------
                                        1 0 1       <==     5 & 7
                                   --------------
                                
                                Step2:-
                                        1 0 1       <==     5 & 7
                                      & 1 0 0       <==     4
                                  ---------------
                                        1 0 0       <==     5 & 7 & 4
                                  ---------------
            
            -   if we do any Number A & any Number B & any Number C ||  any Number C & any Number B & any Number A, so the ans will be equal.        A&B&C = C&B&A 
                    becoz as we said "Order does not matter, Bits are Matter"
                    so if we select any order
                                             C & B & A
                                             A & C & B
                                             B & A & C
                                             B & C & A
                    everything will be same. 
    
    9.  Associative Property
    
            -   if we do (any Number A & any Number B) & any Number C ||  any Number A & (any Number B & any Number C), so the ans will be equal.        (A&B)&C = A&(B&C)
                    consider, (A&B) ==> result  == (B&C) ==> result
                                result&C = A&result     // becoz we can perform in any order.
            
            -   if we do (any Number A | any Number B) | any Number C ||  any Number A | (any Number B | any Number C), so the ans will be equal.        (A|B)|C = A|(B|C)
                    consider, (A|B) ==> result  == (B|C) ==> result
                                result|C = A|result     // becoz we can perform in any order.
            
            -   if we do (any Number A ^ any Number B) ^ any Number C ||  any Number A ^ (any Number B ^ any Number C), so the ans will be equal.        (A^B)^C = A^(B^C)
                    consider, (A^B) ==> result  == (B^C) ==> result
                                result^C = A^result     // becoz we can perform in any order.
    
    Summary:-
                if we perform any of the opertion we can perform in any order. we will get the same result.

```
#### Warm-up Problem
``` 
     if we want to take ^ of these Number, a^b^a^d^b, tell what will be the result for this.
     Ans:-  
        Must Remember:-   "If we perform this in Any Order, Can we say this result will exactly same as this" a^a^b^b^d
            
            a^a ==> 0 
            b^b ==> 0
             now, 0^0^d
                0^d
                Ans = d
             therefor, we can perform the operation in any order the ans will remain same.
                
        Imp:-   here, we are using ^ property:- "if the value is same 0^0 then ans is 0, and 0^d (means, 0^with any value) that value will be ans"
```

#### Problem1:- Given an integer array of size N. such that all elements appear twice except for one element which appear once. Find the unique element.
``` 
    A = [6 9 6 10 9]    Ans = 10
    
      Ques:-    How do we find the unique element in the array, if we have every element appearing two times & one element appearing once ?
      Ans :-    we can simple use the above property
      
      Hint:-    This Ques is same as the warm up problems.
                    a^b^a^d^b   ==>     a^a^b^b^d, Ans = d
                    "When we rearrange the two equal values that will cancel out & the only one element will be the ans"
      
      Step1:-   if we take ^ of all the elements.
                    like:-  6^9^6^10^9  we can rearrange them becoz the value of these is equal to value like this 6^6^9^9^10
                            if we solve this, then 6^6      ==> 0
                                                   9^9      ==> 0
                                                   0^0^10   ==> 10
      this is only work when all elements appear twice except once.
      
      Pseudo Code:-
                            // this code has written based on where the array element is in this form 6^6^9^9^10. but to get into this form i have to write code.   ==> think by me
            ans = A[0]
            for i --> 1 to (N-1)
                ans = ans^A[i]
            return ans;
            
            TC = O(N)
            SC = O(1)
```
### Left Shift (<<)
``` 
     Ques:- How much int var will take ?
     Ans :- 4 bytes.
            1 bytes = 8 bits.
            4 bytes = 8*4 = 32 bits.
            if we use 32 bit & explain then it get compicate to explain. so, instead we can use 8 bits. so that it can easy to write. 
            now, we can only store 8 bit number. 
                7 6 5 4 3 2 1 0                 bit(in 2 raised to power)
                _ _ _ _ _ _ _ _                 any number a = 22, if i want to represent in 8 bit.
                
                0 0 0 1 0 1 1 0                 binary representation of 22
            -   Story:-
                    consider this 8 bit representation as 8 people sit in the banch.  let say "0 is coming from right side".      **Always 0 will come in both left shift & right shift**
                       Ques:-   To make the space for this 0 in the banch ?
                        Ans :-  every person will shift on left side by 1 step. 
                        
                        Ques:-  What will happen with the person who has sit on the 7 bit ?
                        Ans :-  this person (0) will fall down. means this bit (0) will be discarded.
                        
                        **When we found Left shift means 0 is coming from Right side then every bit is shifted on the left**
                        
                        This above thing is general idea "when we write (a<<1) || a left shift 1" then this will happens.
                        now,
                                                                    from right side the 0 bit are coming & every other bit are shift left & last bit will discarded at every step.   
                                    0 0 0 1 0 1 1 0                 binary representation of 22 
                            (a<<1)  0 0 1 0 1 1 0 0                 binary representation of 44,  when we found 1 left shift.           shifted once    means every bit shifted 1 times on left side.
                            (a<<2)  0 1 0 1 1 0 0 0                 binary representation of 88,  when we found 1 left shift again.     shifted twice   means every bit shifted 2 times on left side.
                            (a<<3)  1 0 1 1 0 0 0 0                 binary representation of 176,  when we found 1 left shift again.     shifted three times    means every bit shifted 3 times on left side.
                            (a<<4)  0 1 1 0 0 0 0 0                 binary representation of 96,  when we found 1 left shift again.     shifted four times    means every bit shifted 4 times on left side.
                            Observe:-   
                                    (see pdf to get more clarity)
                                    if we observe, "num is doubled for every left shift || num is multipled by 2 for every left shift"
                                    
                                    Ques:-  If we double the num, n times then what is happens || if we do left shift n times?
                                    Ans :-   
                                            like:-  
                                                (a<<n)  ==>  a * 2^n        // we can say a * 2 * 2 * 2 * 2 * .... n times
                                                this is doubling at every 1 shfit.
                                                Ques:-  If its keep on doubling at every 1 shfit, then will our memory able to store it ?
                                                Ans :-      
                                                            means, we have only 8 bits in the memroy. if we have very very big number then can we control it ==> No.
                                                            
                                                            Ques:-  What will happen after a certain point ?
                                                            Ans :- 
                                                                    so, if we shift on left side one more time. (a<<4) ideally we should get  176 * 2 =  352
                                                                        we were expecting 352 & we got 96
                                                                    (read from above) here, we are discarding bit 1 from left side. "which was adding something on the final ans"
                                                                        so, some numbers get overflow that's why we got 96  (overflow is 1 bit from left side which one adding something)
                                                                        means 2^8 bit was gone. whatever we are expecting 352 from that subtracting 2^8. then we got 96
                                                                            (this bit 1 was coming on left side while discarding so now it's on 2^8)
                                    Noticed:-
                                            we can increased numbers up to certain limit. becoz we have limited capicity like 8 bit numbers.
                                            
                                            Ques:-  What is the Maximum number we can store ?
                                            Ans :-   
                                                    if I have all one's.
                                                        1 1 1 1 1 1 1 1 
                                                        it is, 2^7 + 2^6 + 2^5 + 2^4 + .... 2^0
                                                        which is, 2^8 - 1 = 255 
                                                    this is the maximum number we can store if i have 8 bit memory. so if we trying to add big number then it will give wrong ans. becoz we are adding outside the capicity.
                                                        so, if we have limited memroy & if we keep on increasing the numbers then it will Overflow Situation.
                                                                            
                                                                      
                                                                      
                                                
                                    Ques:-  If we do (1<<n) then what is happens ?
                                    Ans :-  1 * 2^n = 2^n        
                                            Note:- so if we want to calculate 2^n then we don't have to use any power fun or anything.  "only do 1 left shift n" & done
                                                    (1 left shift n) means, "Shifting 1, n times on the left side"
                                                    so, decimal number 1 shifted left n times.
                                                    like:-
                                                            (a<<3) means a shifted 3 times on the left.
                                                            1 0 1 1 0 0 0 0     ==>     1 0 1 1 0 (actual bit)          0 0 0 (shifted 3 times on left side) 
                                            Means, 
                                                    single bit is shifted on left side n times.
                                                        like:-
                                                            (a<<1)  0 0 1 0 1 1 0 0
                                                                                  |
                                                                                  |
                                                                    this bit will shift left, n times.
                                                    
                                                    Ques:-  What is (1<<5) ?
                                                    Ans :-  2^5 = 32
                                                            7 6 5 4 3 2 1 0     // we 8 bit memory.
                                                            0 0 0 0 0 0 0 1     // this how we write normal 1
                                                                          |      // if we do (1<<5)
                                                                          |
                                                                          we are shfiting this bit 5 times on left side. see (img 11)
                                                            0 0 1 0 0 0 0 0      // everything else is 0.   the decimal representaion of this is:-  32
``` 
### Right Shift (>>)
```             
                    if we do (a>>1), this means "Person is coming from Left & the existing person are shifting on right"
                        means, "at every step we are diviging by 2"
            7 6 5 4 3 2 1 0         // we 8 bit memory.
            0 0 0 1 0 1 0 0        // this how we write normal 20
     (a>>1) 0 0 0 0 1 0 1 0       //  the decimal number is 10      here, 0 has discarded.
     (a>>2) 0 0 0 0 0 1 0 1       //  the decimal number is 5      here, 1 has discarded.
     (a>>3) 0 0 0 0 0 0 1 0       //  the decimal number is 2      here, 0 has discarded.
     (a>>4) 0 0 0 0 0 0 0 1       //  the decimal number is 1
     (a>>5) 0 0 0 0 0 0 0 0       //  the decimal number is 0     ... so on. we are discarding right most bit.
     
     
          
            Ques:-  Why 5/2 is 2, it should be 2.5 ?
            Ans :-  In Computer Programming we always have Integer Division.
                    so, 5/2 = 2
            
            Ques:-  eveytime if we doing this (a>>n) then what will happen ?
            Ans :-  
                    we have any number a, we are shifting a on right side for n times. 
                    means we are dividing a/2 n times.
                    so, it will be 
                    a >> n = a/2n
                    
                    if we keep on dividing every number by 2. Will it become Very large number ? 
                        no, it will never have overflow issues.
                    then, what will happen ?
                        if we do (a>>4) ==> 1.
                        if we do (a>>5) ==> 0.
            
            If we do right shift multiple times then we have 0.
                now we get 0, so if we do 0 right shift with any number || (0>>n)
                it will remain 0. becoz 0 divide by anything is 0.   like 0/2 = 0.
                if we do this operation multiple times then we get at least 0, we don't get less than 0 || more than 0, so we don't have any overflow issue.
     
     In Right shift, it will never get underflow so in worst case it wll be 0.
```