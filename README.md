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
     String builder is nothing but an "Dynamic array of characters".



















```

