## String 
``` 
                    Char means "Single Characters".  
       Ques:-   What is the meaning of String ?
       Ans :-   
                    1.  Sequence of Characters.
                    2.  List of Characters.
                    3.  but String is not "Group/Set of Characters" ?
                            assume there are two set of string.
                                Set1:-1 {'a','b','c'}       Set:-2  {'b','a','c'}
                                 if we talked in terms of Set Theory the above two set are not equal.
                            so, String abc != bac.
                            summary,    in the Group the elements are Unordered. but in Strings THe "Sequence Matters".
                            
       Ques:-   What is the ASCII value of ?
       Ans :-   a   -->     97              A   -->     65              '0'   -->   48                  
                b   -->     98              B   -->     66              '1'   -->   49
                c   -->     99              C   -->     67              '2'   -->   50
                .                           .                            .
                .                           .                            .
                .                           .                            .
                z   -->     122             Z   -->     90              '9'   -->   57
                
       In a computer system, Computer does not understand Characters, Computer Understands Binary. so every char is map to a Integer using ASCII Value.
            so, these numbers converted into binary & store it in memory. 
            
       In ASCII, we have 256 Unique Characters.
       [0 to 255]   ==> Range of ASCII Value.
            if we want to store 256 unique ASCII values. How Many binary numbers do we need. ||  What is the number of bits do we need to store 256 unique ASCII values. 
                8 bits.
                means, it is nothing but 1 bytes. & 1 char need just 1 byte of the memory. 
            
            Explainations:-
                 suppose we have _ _ _ _ (4 digit) number. like 4 binary number available.
                 then, what is the total number of integers i can generate if we have 4 digit binary number.
                            {   _   _   _   _   }   --> means i can generate 16 numbers.
                                3   2   1   0
                                0/1 0/1 0/1 0/1         --> every bit will be either 0 or 1. 
                            so it will be
                                       2^4 = 16 integers.
                            simillarly if i have 8 bits that means
                                        2^8 = 256 integers
                            so if we have 256 integers then we just need 8 bits & it is nothing but 1 bytes.   
                            therefore 1 bytes is required for the Characters.       
                 Ques:- Why int has 4 bytes in the memory.
                 Ans :- the range of int used to store.
                          2^32 numbers hence we need 32 bits, it is nothing but 4 bytes     
                 Ques:- there are string S="abc" ?
                 Ans :- it is having 3 diff char so it will take 3 bytes memory. 
                 
                    Number of Chars will descide Number of Bytes.
            
            if we have to store numbers only [0 to 255] --> they are nothing but 256 unique values.
            so in the memory how much memrory || how many bits do we need to have for 256 unique values.
                    8 bits.
            when we say
                    char c = 'x'    -->     it automatically takes 1 bytes.
                    int  a = 10     -->     this integer takes 4 bytes.
              ex:-
                    if we store x = 97 as int, later on we can change the value of 97 to 20097
                but if we make x = 'a'  we don't have larger char set. we have only 256 char.  
                
                
       Other way to learn the above ASCII value thing.
            in the computer program if we write like this.
                char c = 'a'   
            now, our computer know its a char data type.
            so, the computer will understand that char have 256 unique values.
            In future, if we update the char c. then char c will still have 256 unique values.
                means, we will not write any char which is not come in the range of 0 to 255. || we can write in char c whatever the keys present in the keyboard.
            the computer know that char c variable can only take 256 unique values so computer have provided 8 bit of memory.
                becoz, the range will be only [0 to 255] 
                so, 8 bits can take up to 2^8 = 256 unique values.
            
            in the computer program if we write like this.
                int x = 23875 
            now our computer will understand that it is a int data type.
            int data type take up to 2^32 unique values. these are the range of int 
            so computer have define 32 bits of memory to store the int value. 
            
            computer does not understand the char so computer stores the char in two step process.
                first it takes the char 'a' & computers converts it into his ASCII value. then it convert his ASCII value to binary (8 bit binary) 
                like this:-
                            7   6   5   4   3   2   1   0   ==>     now we have to do binary conversion (search in youtube)
                            0   1   1   0   0   0   0   1   ==>     computer will store only this much. means complete all this binary is 1 char 'a'.
                            
                            64  +   32  +   1   =   97.     
                
                assume we have declare the string.
                    String s = "shivam"  
                    now the computer will store this string "Char by Char". seprately the s needs the memory 6 bytes. (becoz 1 char = 1 bytes & its having 6 char)
                               
       if we store like this,
                s = "125";
                means digit can be a char. above we wrote the ASCII value of Digit.
                so for the char '10' what is the ASCII Value for this char ?
                    58 (wrong)
                    58  --> it is string means there are two characters
                                1   &    0
                                48       49
       Summary till now:-
            1.  Char takes 1 bytes.
            2.  The length of String will Define the Memory of String.
```

## Immutable Strings
```
    when we solve the problem on string where we have to append some characters to create a new string & sometimes compiler might gives us the TLE. (Generating String will gives TLE)
        like, if we code in C++, here, if we update the String that simillarly means that we update the array. 
            {
                if we update the any one values in the array then it will take O(1) time. means if we update any value in the array then it will update the value in the same memory location 
                    where the original value was present.
                so arrays, are mutuable. 
              Mutuable means we can update the value at the same location. we don't need any new space.
                so In C++ like lang, String are like this (char array). so we can update the char.
            }
        In JAVA, Python, C# etc.
            Strings are Im-mutable.
            
            Ex:-
                In Java if we create this var.
                    S = "abc"   // it will takes 3 bytes.
                now, when we append 1 char in S.
                    S = S + 'd' // now we create new string which is abcd.
                means In Java it does not just add the char 'd' to a original String 'S', it creates a totally new memory space.
                
                in Java like programming lang there is a concepts of String Pool (img1).  
                    when we create "abc" then in String pool "abc" is created & it is stored in String pool
                    when we add char 'd' then it does not add char 'd' in the existing "abc", it will create a new whole String. "abcd"
                        now S is pointing to "abcd". (img2)
                    if we append 't' to "abcd" then it will create a new memory where it stored "abcdt" 
                    so we have used this much memory in string pool (img3)
                        but in our program we have only "abcdt" becoz we are using 1 var S.   
        
        why there is a concept of Immutable String or String Pool. 
            String pool is "Collection of All Strings in Memory". 
            
            if we write like this
                S1 = "abc"
                S2 = "abcdt" 
                    then these will not create any new memory. they will utilise the memory from the string pool (which we created in past) (img4)
            Ques :- How many Meaningfull words do we have ?
            Ans  :- it is Finite in number. (if we read oxford dictonary it has finite number of words & in practical use we use meaning full words.)
                        abc these are the random words.
            
            
            "String Pool can Keep a copy of finite number of meaningful words".
                now there are lots of words which are not is use
                    like, we have String S = "abc" & we have updated to "abcdt". & we have S1 = "abc" & S2 = "abcdt". 
                          but there are no string who want to use this "abcd". 
                    What it will be. 
                        there are something know as Garbage collector "That runs Time to Time to free up the Unused Space".
                        so the purpose of Garbage Collector is Timely Checks What all the Memory Optimisation that we can do.
                        therefore the Garbage Collector removes the String which is not utilised.
                    Will Garbage Collector instantly do this task ? like as soon as i have update S to "abcd" to "abcdt" 
                        No, it will not instantly to this task. means for some time "abcd" will remain in the memory. but if "abcd" is not used for some time then 
                        Garbage Collector will take care of removing the extra things.
                
                "if Multiple String points to same data then String Pool will save lots of memroy". so it useful when multiple string points to same string. (img5)
                
            assume, we have define a string like this
                S = 'abc'
                S1 = S
                
                S1 + = 'x'
                print(S)    (img6)
                    previously S & S1 both are pointing to same memory location. but as soon as we appened a new char with S1, then S1 pointing to the newly created memory location.
                        when we print S then it will print the unchanged string which is "abc".  
            
            Remember:-
                string pool will always have unique strings, if another string have same value then string pool will not create the same value twice instead it will pointing to the 
                    already created value with another var. 
        
        Disadvantage:-
            Case 1:-                                                                    
                    if we create a String s (img7)          Iterations (do we need for doing all these task.
                                                                            everytimes we create a string we need to map it in the string pool.  
                            String s = "a"                     1    iteration becoz we created "a" in the memory.
                                   s = s + "b"                 2    it. becoz first it will copy everything will string has (1 iteration). then append "b" & create new string in memor (1 iteration).
                                   s = s + "c"                 3    it. becoz first it will copy "a" & the copy "b" (2 iteration). then append "c" & create new string in memor (1 iteration).
                                   s = s + "d"                 4    it. becoz first it will copy "a", the copy "b" & copy "c" (3 iteration). then append "d" & create new string in memor (1 iteration).
                                    .. so on.           -------------------
                                                                10
                                    if we say "Append N char in a **empty string**, what is the number of iteration it will take".
                                        1 + 2 + 3 + 4 + ...... + N = N*(N+1)/2
                                    TC = O(N^2)
                                    
                                    So, we can say Generating a string, char by char of length N then it takes TC = O(N^2).     disadvantage1.
                    
                    Why are we saying apending the characters ?                
                        String is Nothing but an Char by Char. so for 1 char we need 1 iterations.      **************Imp*****************
                        
                    disadvantage becoz as long as we have appended just 1 char to an existing string then it create new string in string pool & for doing that it will take 
                        O(N^2) TC. 
                        
                    if we append N char in empty string then TC would be O(N^2). but let say if we append 5 char in empty string then TC would be O(5) means constant time.
                        means untill & unless we have N size input the TC & SC will be O(N^2)  
```
## Remember: appending one char, updating one char or doing anything with String is **order of length of string || O(length of string) as TC **, **No. of Characters will define the No. of Iterations**
``` 
      Ques:-    what will be the no. of iterations for adding N char to a String of length 1 ?
      Ans :-    O(N+1) only.    // copy N char (N iterations)==> this comment i worte based on my understanding about the topic.  
                so, No. of Characters will define the No. of Iterations that is TC.        
                
                Ex:-
                    if we write like this 
                       String s = "xyz" 
                        here, it does not constant time (read Case 1), so TC = O(Length of S) so initally if the length is N then TC = O(N^2) becoz we are copying & appending 
                      String s1 = "fafrhafhaikfhiafyiarfhnewikrhwirfyairywirywkrhwrw..." 
                        here, we wrote very long string so 
                      "It Takes Length of String as TC".
                    
                    if we update a String with N char then it will take ?
                        means, if we are updating N times then it is Quadratic TC = O(N^3). if we are updating one time then it is O(N)
```
### String Builder
``` 
     String builder is nothing but an "Dynamic array of characters".    ||  "Array List of the Characters".
```
### Problem Statement 

#### Given a String S. toggle the case of every Character. do not use inbuilt fun. (means all we have to do is convert lower to upper case & vice versa)
``` 
        "a B c d E" -->  "A b C D e"
 How to Think ?
    -   do we know the ASCII values. (check above)
    -   if we see the ASCII values (img8) then we got to know that we have to convert a ==> A, b ==> B, vice versa. 
    -   now if we check the difference of the ASCII values, & the difference between of every char is 32. 
    -   now, if we have given small letters & "We Subtract 32 from small latters" to get the Capital letters. see(img9)
                                ||
             if we have given capital letters & "We Add 32 to capital letters" to get the Small letters. see(img9)
    -   Steps to do this task.
        
        =   we travel from 0 to (N-1), where N-1 is the length of the string.
                 for i --> 0 to (N-1)
        =   we have to know "weather the char has small or capital"
        =   I have to know the i th char has the lower case or upper case char. 
                do we really know that, from where upper & lower case start & all. (img9)
                No,   
                if (S[i] >= 'a' && S[i] <= 'z')     // when we compare char then it always checks the ASCII values. so we don't have to remember the ASCII values.
                    {
                      S[i] -= 32                   // now we have to subtract 32 from the i th ASCII value.
                    }
                else  if (S[i] >= 'A' && S[i] <= 'Z')
                    {
                      S[i] += 32                   // now we have to add 32 to the i th ASCII value.
                    }
                    
        =      for knowing weahter string is upper or lower we don't need to remember the ASCII values. (see in if & else if check).
                but in the program we need to remember about the 32 to convert. let say we frogort this 32 number || difference between the ASCII values.
                Ques:-  Is there any way to find out the Difference ? Can we still find the solution. 
                Ans :-  'a' - 'A'   // 97 - 65 = 32
                let say we also forgot that 'a' has large value & 'A' has small value. Can we still find the solution.
                    abs('A' - 'a'). we just need to take absolute value of either 'A' - 'a' or 'a' - 'A', it will definately work.
                still we have to remember one thing like "Weather we have to subtract or add" that info still we have to remember.
                let say we forgot that also. then, 
                    we write this & remember all the above things.
                        if('a' > 'A') then  lower to upper case, like 97 > 65, if yes then it means we have smaller value & now we have to convert into upper case.
                            so we have to subtraction.
                        vice versa.
                    see (img10) 
```
## Facts!!
``` 
Obs 1:-
        we are taking about ASCII values from a to z (lower case)
            a   -->     97
            b   -->     98
            .
            .
            .
            z   -->     122
             
            now, we observe carefully.
                if we have 8 bit number  like this,                                _  _  _  _  _  _  _  _        (it is binary)
                                                                                   7  6  5  4  3  2  1  0
                & if we look at the int 97 to 122
                   we can find the pattern for the 6th bit of these int. what is the comment on the 6th bit of these integers ? || for these numbers (97 to 122) can we comment anything about the 6th bit of these integers.
                   6th bit always be the 1.
                   becoz, if we see carefully then we got to know that "every number is 64 < num < 128 (in 97 to 122) 
                   so, "we can say that 6th bit will always be set to 1". see (img 11)
                
                Now, we want to 5th bit.
                if we select all these numbers (97 to 122) & subtract 64 (now 64 bit has set to 1).
                    so, we write like this. see (img 12)
                            97 - 64 = 33
                            98 - 64 = 34
                            .
                            .
                            122 - 64 = 58
                        if we see carefully then we got to know that "every number is 32 < num < 64 (in 33 to 58)
                        so we can say that 5th bit also set to 1. see (img 12)
                    
                the 5th bit is important. we will use this bit. see (img 13)
        we are taking about ASCII values from A to Z (upper case)
            A   -->     65
            B   -->     66
            .
            .
            Z   -->     90
           now, we observe carefully.
              if we have 8 bit number  like this,                                _  _  _  _  _  _  _  _        (it is binary)
                                                                                 7  6  5  4  3  2  1  0
              Can we comment again on the 6th bit ?
                all these numbers (65 to 90) are 64 < num < 128
                so 6th bit always be the 1.                   
              Can we comment again on the 5th bit ?
                5th bit always be 0.
                becoz if sw subtract 64 from these numbers (65 to 90) then
                    65 - 64 = 1
                    66 - 64 = 2
                    .
                    .
                    90 - 64 = 26
                the range will be from 1 to 26 &  if we see carefully then we got to know that "every number is less then 32 (in 1 to 26) see (img 14)
                so we can say that 5th bit also set to 0. see (img 14)
        
        Summary:-
                from the ASCII value a to z --> the 5th bit is set to 1. becoz, num starts from (97 to 122) is like (64 < num < 128) so 6th bit = 1. same nums starts from (33 to 58) is like (32 < num < 64) so 5th bit = 1.
                from the ASCII value A to Z --> the 5th bit is set to 0. becoz, num starts from (65 to 90) is like (64 < num < 128) so 6th bit = 1. same nums starts from ( 1 to 26) is like (less then 32 so we not count 5th bit) so 5th bit = 0.
    
   Obs 2:-
        look at any number a --> 97
        Ques:-  What is the 8 bit binary representation of the 97 ?              
        Ans :-  
                
                         7  6  5  4  3  2  1  0
         a --> 97 -->    0  1  1  0  0  0  0  1
         A --> 65 -->    0  1  0  0  0  0  0  1
         
            if we look at carefully then we get to know that "Only 5th bit is changed".
            
         z --> 122 -->    0  1  1  1  1  0  1  0
         Z --> 90  -->    0  1  0  1  1  0  1  0
            here, also only 5th bit is different.
        
        Ques:-  Why we observing only 5th bit. || why only 5th bit is diff ?
        Ans :-  becoz "difference in the ASCII values is of 32", which is nothing but 2^5.      ******************************************
                so, if we have to convert z to Z, a to A, b to B ... so on.
                "we just have to toggle  5th bit". see (img 15)                                 **********************************************
    
        Ques:-  How to toggle 5th bit ?
        Ans :-  We simply do ^32 (XOR 32) operation || ^(1<<5) (means, XOR(1 left shift 5))
        
                so, if we take any ith char of Str[i] & toggle the 5th bit of i.
                    s[i] ^=32   // performing XOR of 32 on ith char (^32) see (img 16)
                that's why "We are using Bitwise operator in String Ques"
        
 Conclusion:-
                if we have to convert "Lower Case to Upper Case" Simply do XOR operation. so no need to remember anything just do XOR of 32.          
```
## Need To Know 
``` 
            Update the String
            
         if we code in C++ like lang's, where the String by nature is Mutuable(changable) then what is the TC it will take for "updating the every ith char of the string". see (img 16)
            it will take Linear TC. O(N)
            SC = O(1)
            
         if the strings are Immutable(Not Changable) like Java. in that case we want Linear time not more then that. then what is the way to do in linear time. 
            "Convert String to Char Array || String Builder". TC = O(N) 
            but in that case we need extra space so, SC = O(N) see (img 17)
                here, if we try to update the existing string then it will gona create new string so if we want to update the existing string then we need to convert it.
```
#### Given a string with lower case characters. (a to z) sort in dictionary order (Alphabetic order)
```         
            String      -->          O/p
            "utkarsh"   -->         "ahkrstu"
            "vinit"     -->         "iintv" 

            we can use sorting algorithms. then TC will be O(N log(N)) 
            "but if we know that there are only 26 unique chars, so can we find out the better solution then sorting algos".
            
           Hint:-
                -   26 char is the constant time.
                -   utilise Time
                -   utilise Space    
          
          s = "d a b d b e d a" 
          
          think like:-
            alphabetic order is like this:-
                a______ b_____ c______ d______ ... z______      (means all the a, all the b, all the c & so on)
                freq(a) freq(b) freq(c) ... so on.              (use case of  frequnecy.) see (img 18)
            if we know the "frequency of a" so we can first create all the a, if we know the "frequency of b" then we can append all the b to a,
             if we know the "frequency of c" then we can append all the c to b. (use case of  frequnecy.)
             means, if we have only 26 unique chars then "can we have the 26 size array to store the frequency" 
                       we can create one frequency array which is of length 26. see (img 19)
                       Ques:-   How do we know that "at which index represents which character". 
                       Ans :-   means if we want to store a, b, c, d .... till z. ideally the array look like this. see (img 19)
                                Is there any way to map the Char a to 0, b to 1, c to 2, ... so on. 
                                    Yes, 
                                    if we simply do like this. 
                                        char - ASCII value of a 
                                         'a'  -  97     = 0                  see (img 20)
                                         'b'  -  97     = 1 
                                                ... so on.
                                Do we really need to remember the ASCII value of a. || if we forgot this value 97. then, 
                                     we simply do like this. 
                                        'a'  -  'a'     = 0                  see (img 21)
             Code:-
                    for i --> 0 to (N-1)     // i start from 0 till complete string length.
                        F[s[i] - 'a'] += 1           //  see (img 20) these two lines used to store the Frequency of every char. like  'a'  -  'a'     = 0      (we subtracting to get index)  
                        
                        
                        TC = O(N)
                        SC = O(26) = O(1)   // The frequency array is not linear space, its just 26 char space means constant space. it does not mean that we are creating n length array. 
                            
                            
                    once we have frequency array then all we need to do is "travel every ASCII" 
                    for i --> 0 to 25       // travel every char. 
                        char c = (char) (i + 'a')   // we are generate the char from index. we just need to adding the ASCII value to the index. (we have index & we want char) (we adding to get char) 
                        // now we have to desicde that How many time i have to print this char.  
                        for j --> 1 to F[i]
                            print (c)
                    
                    see (img 22)
                    
                       TC = O(N^2)  --> NO
                       TC = O(26 * N) -->  NO 
                            Total no. of times the j loop is working is how much ?
                                it is nothing but freq(a) + freq(b) + freq(c) ... and so on. 
                                then, what is the sum of freq of all the char.
                                it is nothing but length of string N.
                       TC = O(N)    // means, the no. of iteration is not N for every char. for every char we are not running N times, we are running just the freq of that char.  
                       SC = O(1) 
                    
                    Ques:-  like if i at index 3 but how do i know d=3.
                    Ans :-  3 + 'a' = 100. 
                            100 is the ASCII value of d. 
             
             
             DRY RUN:-
                            i   |         j        |   #iteration 
                     -----------|------------------|-------------------------
                           0    |   1 to F[o]      |        F['a']
                           1    |   1 to F[1]      |        F['b']
                           .    |                  |
                           .    |                  |    
                           25   |   1 to F[25]     |        F['z']
                                |                  |    -------------------
                                                        sum of Freq = length of string = O(N)
                            
                                       We are Creating Freq Array, Travelling String & Increasing the Frequency.               
                     In the first loop, for the char d, we update the the index 3 = 1. 
                        then for char a, then we update the index 0 = 1.
                          for char b, then we update the index 1 = 1.
                          for char d, then we again update the index 3 = 2.
                          for char b, then we again update the index 1 = 2.
                          for char e, then we update the index 4 = 1.
                          for char d, then we again update the index 3 = 3.
                          & for char d, then we again update the index 0 = 2.
                        everything else by default its 0.   see (img 23)
                                        
                                        We will Travel the freq array & we will print the char with the no. of times the frequency is there.
                     In the Second Loop, the char a has frequency 2 times so we print a two times. 
                        then we print b two times.
                        we don't print c.
                        we print d three times.
                        we print e one times.
                        
                        Result = a a b b d d d e
                    
                            
                                                        
             THIS ABOVE SORTING ALGO WE HAVE DISCUSSED IS KNOWN AS count sort.
             
                count sort has own Limitation like "can we have the freq array of very large length"
                    No, here we have only 26 length unique char so in that case Count sort has possible.
                    suppose if we have 10^9 unique value then we can't create the freq array.
                    becoz it will give memory too high error. 
             
```
## Count sort is working when we have a Limited set of unique values.