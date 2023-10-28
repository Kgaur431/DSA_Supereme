## Hashing
``` 
    Learn by Story:-
          Kartik & Mayur, they went to hill station & they started 1 hotel. hotel have 10 rooms, 1 Recepition area. one day the customer comes to hotel.
          now Kartik & Mayur wants to find which room are available. so mayur go to each & every room & check if the room is available or not (not good strategy
            becoz too much waiting time for guest & too much hard work for the guest)
            if they can maintain a register, register will store the Room No. & Availability. (see img 1)) by just maintaing register they have optimised.
          This is the example of HASH TABLE.
```
## Hash Table combines of two components.
1.  key
2.  value
``` 
    KEY is something "with respect to which we want to store a data".
        eg:-
            in the above store, with respect to Room No. we have to know weather the room is avaiable or not.
            means, Key ==> Room No. Value ==> available or not. see (img 1)
            
            Ques:-  Does we see any hotel where the two rooms having same room number ?
            Ans :-  Never
    so Hash Table stores Key & Value.
            Ques:-  Why in the Hash Table Keys are unique ?
            Ans :-  if keys are not unique then entire Hash Table are useless. 
                    becoz it will create lots of confusion like whoes customer has assigned which room no. 3, becoz there are 3 room with room no. 3. 
                    so keys are always unique.       
```
### Key Value Pair
``` 
    Story Continue :-  
           there are Room No. Kartik & Mayur wants to customise the Room No. so in some rooms they provide AC, in some rooms they provide Balcony, in some rooms they provide TV,
                in some rooms they provide Bathtub, in some rooms they provide Wifi, in some rooms they provide Geyeser. etc.  
            all of the above information is useful for the Room No. means if they have these Data in the Register then finding room with customization is easy task. 
           "all these information will knows as VALUE of this particular room no. KEY". we are saying, 
            VALUE can be multiple entry || lots of useful information can have single key. 
                like:- in hotel example, Room no. is key which is type Int & all other useful data is value.
            
            "KEYs are Unique but VALUEs are useful information about the key"
           
           Ques:-   we have to figure out what is the key & what is the value from the given situation ?
           Ans :-   
                
                Situation1:-    -   Mayur wants to store the total population of every country.
                                -   What is the data type of Country Name &  What is the data type of Population to store these data in computer program.
                                        Strings                                 Long    
                
                Situation2:-    -   Mayur wants to store count of cities of every cities.
                                    What is the data type of Country Name &  What is the data type of count of cities to store these data in computer program.
                                        Strings                                 Int
                
                Situation3:-    -   Mayur wants to store All City Name of every country.
                                    What is the data type of Country Name &  What is the data type of All City Name to store these data in computer program.
                                        Strings                                 List<String>
                
                Situation4:-    -   Mayur wants to store population of every city for every country.
                                    What is the data type of Country Name &  What is the data type of All City Name of every country to store these data in computer program.   
                                        Strings 
                
                    Situation           KEY                     VALUE 
                        S1.              country name           total population
                        S2.              country name           count of cities
                        S3.              country name           list of city name
                        S4.              country name           map                 // for every country name again we have a value as MAP. which will be key value pair of cityName & population.
                                                                                        see (img 2)
                                                                                        so given a country name we will know which hash table we are talking about & inside this hash table 
                                                                                            we have city name & its population.
                                                                                       we can solve the above thing in multiple ways.
                                        
                                        Assume we have a notebook in which every page has country name & in that we have table which stores city or population.
                Conclusion:-    Even a complete Hash Table can be Value for a Key || Value can be any Data Type & key also any data type.
                                    Hash Map can't be a key, we can't give input as map         ********************Imp********************
                                    
                                    "Given a unique key we will get unique values from Hash Table".
```
### HASH TABLE is also known as MAP.

### Hash Map is an black box in which we have given unique input & we get any unique output.
``` 
      In programming lang. like Java, C++ (Unorder Map), python (Dictonary) etc. 
      there is an HASH MAP which store the data in Key Value pair.
      
      Ques:-    What are the functions Hash Map supports ?
      Ans :-    these are main fun which we used mostly while using hash map.
                    1.  Insert <Key, value>                         -->         hashmap.put(k,v)   // if we insert the same key with diff or same data then it will be overrite old data.
                                                                                                        eg room 2 is free right now, later on we write room 2 is busy so it will not create new entry 
                    2.  update value for a given key                -->         hashmap.put(k,v)   // so if we update then again insert data withe same key.    means insert second time is update.
                    3.  delete <key, value> for a given key         -->         hashmap.delete(k)  // only key required
                    4.  search for a value given the key            -->         hashmap.get(k)    // only key required
                    5.  size of hashmap                             -->         hashmap.size()
                    6.  key is present or not in the hash map       -->         hashmap.contains(k)  // only key required
                    7.  map is empty or not                         -->         hashmap.isEmpty(k)  // only key required
                    
                    Internal Implementation idea will in advance content. means while we have to use inbuilt hash map which is available in java.
                    
      All of the above fun have TC = O(1). how it is that we will discuss later.
      
      We can't update a key, becoz if we want to acess any entry then we need the key.
        eg:-    AC feature in room no. 1, & the same feature is in room no. 2 then it will be new entry. so if we write new key then it will totally new entry.
                & for same key we have to delete the old entry for the key & make the new entry for that key.
      
      There is something know as Hash Set which is same as Hash Map. 
        but in Hash Set we have only the KEY. 
        HashSet <key>   || we can say HashSet is same as HashMap but the value is null like:-   HashSet<key,null>
        here also key will be unique.
        
        In Hash Set we have only key so if "we insert the same thing again then it will not do anything" means everything will remain same
      
      
      Insert:-
            let say we insert some data in map in the below order. like name & score
                <vinit, 100>
                <tejas, 47>
                <deepanshu, 100> 
                <girish,67>
                <abhishek,91>  
                <vikrams,100>    
                    
                    assume mayur travel the map & print the data.
                    Ques:-  If he travel then will it be print in same order in which the data has inserted ?
                    Ans :-  No.
                                It will print the data in random order.
                                Hash Map does not maintain the order of Input. means input it does not store in contigious memory. **************************Imp********************
                                Ques:-  What it does is ?
                                Ans :-  it just takes the key & it hashes the key (means it applied some mathimatical fun on the key) that hashes will tell where the data will store.
                                        so, at random places the data will store.
                                        
                                Ques:-  Why these fun are important ?
                                Ans :-  like when we want to know the data, let say tejas wants to know the score then the fun will take the tejas key as input, (this fun will know where 
                                            the data is present in the memory) directly in constant time we will get the data.
                                
                                In some programming lang like Java there are Linked Hash Map (modified version of hash map) that can make sure that order is maintained. 
                                    but in normal hash map order is not maintained.
                                
                                Ques:-  Can we insert null or empty string into key ?
                                Ans :-  one entry can be null, means if we insert null as key then it can be only once we can't insert multiple null as key in hash map.
```
#### How & Where the HashMap can be used 

#### Problem 1:- Given an integer array, find frequency of an element of the array for multiple queries. 
``` 

     In single query, we get input x & we need to tell the freq of x.    ||      Query --> x (int).
     
        A = [2 6 3 8 2 8 2 3 3]         there are multiple Queies :-    
                                                x   -->     freeq(x)
                                                8   -->     2
                                                3   -->     3
                                                10  --?     0       // beocz if element is not present then element frequency  is 0.
          Ques:-    If this is the task, What will be our Map contain Key value || What it will store as key & store as value ?
          Ans :-    Key --> array element
                    Value --> frequency of that array element. see (img 3)   
          
          Ques:-    Do we know how to store frequency of element in freq array ?
          Ans :-    if we want to store frequency of element in freq array
                    where frequency is F[i].
                    we have to create a frequency array of size = The Range of elements.
                        we have created frequency array is 0 to 8 that will store the frequency of array element.
                        
          Ques:-    How much TC it will take to store frequency of elements in freq array ? 
          Ans :-    O(N)
                     
          Ques:-    How much SC it will take to store frequency of elements in freq array ? 
          Ans :-    O(Range of element of the array). 
                    if the range of the array is very large like 10^9 then we need that big size freq array 
                        so this big size array then compiler will give us an error (Memory limit exceeded). 
                    so freq array has its own limitation.
                    
                    Note:-
                            "To handle this limitation of freq array, we are using Map"     ******************Imp*****************************
                            Explain:-
                                        key value pair is exactly same thing. Why to store frequency of the element which are not there in the array (see the 0)
                                        means, if we only store the frequency of elements which are present in the array then we will save some space. 
                                        
                                        Ques:-  How we will save the space ?
                                        Ans :-  
                                                Steps 1:-   we travel the complete array.
                                                                for i --> 0 to (N-1)                                                                                    |
                                                Steps 2:-   if the element is present in the map || array already.                                                      |            
                                                                if (hm.containsKey(A[i])                                                                                |
                                                Step 3:-    then we have to increase the freq by 1. so first we get the element from the Map.                           |
                                                                f = hm.get(A[i])                                                                                        |
                                                Step 4:-    then for update we have to call insert fun. & increase the freq by 1.                                      O(N)
                                                                hm.put(A[i], f+1)                                                                                       |
                                                Step 5:-    else, if we are visiting the element first time in the map then we will insert the freq by 1.               |
                                                                 hm.put(A[i],i)                                                                                         |
                                        
                                        The above code is doing exactly as creating freq array, but here we are creating freq Map. see (img 4)
                                        
                                        Dry Run:-
                                            A = [2 6 3 8 2 8 2 3 3]
                                                1.  when we travel the array from L to R. first we encounter 2. so we store, for 2 the freq is 1. {else part is executed}
                                                2.  next we encounter 6. so we store, for 6 the freq is 1. as long as we don't have the key in the map we will do same thing. 
                                                3.  next we encounter 3. so we store, for 3 the freq is 1.
                                                4.  next we encounter 8. so we store, for 8 the freq is 1. as long as we don't have the key in the map we simply inserting the freq as 1.
                                                5.  next we encounter 2. now when the element is already present || maps contain the key then takeout the key & update the key by 1.
                                                    and so on.
                                                    after traveling the input array then we have updated frequency in the map. see (img 4)
                                            
                                            Now for every we want to get the freq
                                            Code:-
                                                    for i --> 1 to Query
                                                        //Read x
                                                        print(hm.get(x))
                                            
                                            Note:- if we write the above two codes then it will give error becoz they are wrong. see (img 5)
                                                   this code will work for the element which are present in the aaray but it will not work for the elements which are not present in the arrya
                                                    see (img 6) means In a map if we try to access something which is not in the Map then the above codes will give error. 
                                                        Like:-  Key not found
                                                    
                                                    we need to put the small check in the second code. 
                                                    Updated Code:-
                                                            for i --> 1 to Query            |
                                                                //Read x                    |
                                                                if(hm.containsKey(x))       |
                                                                    print(hm.get(x)       O(Q)
                                                                else                        |
                                                                    print (0)               |
                                            Now this code is working fine.
                                            
                                        Total TC = O(N + Q)
                                              SC = O(N)         // In worst case, when all the elements of array are unique then then O(N) otherwise O(Q)
          Conclusion:-  
                    In freq array the issue was "if the range is very high like 10^9 elements then creating an array of 10^9 size was giving Memory Limit Exceeded Error"
                        we can't have this much array but we can have O(N) size array || map. O(N) is my part of input. so this will solve MLE problem.
          
                    How Map is solving the issue that we was facing when we use freq array.     *****************************IMP************************    
          Ques:-    What is the steps to store frequency of elements in freq array ?
          Ans :-
                        Step 1:-    Travel the input array 0 to N-1. 
                        Step 2:-    increase the frequecy count by 1 everytime when it occurs. see code (img 3).
```
#### Problem 2:- Count no. of distinct elements present in the arrays.
``` 
        A = [6 3 7 3 8 6 9]
                yellow color are distinct elements. 
                pink color are repeated elements that we don't count.   see (img 7)
                
                Ans = 5. 5 distinct elements are there in the array.
        
        A = [8 8 8 8 8] 
                
                Ans = 1.    // becoz we have to count only first 8 all others 8 are repeating. 
            
        Ques:-  can we use the Map ?
        Ans :-  
                    if we use the map then we need key value pair. 
                    then, What is the key value pair we need.
                        keys are the element. A[i]. 
                        values are anything
                                   count/freq
                                   isPresent. 
                        
                        Note:-  
                                if we use Map --> its fine.
                                key is A[i]   --> its fine.
                                but,
                                    if we consider count/freq as value.
                                        Ques:-  will it matter element 6 has stored 2, element 3 has stored 2 times?
                                        Ans :-  No, becoz it will be counted onec, after that its repeating. 
                                                    so, freq/count is not usefull data with respect to problem.
                                    
                                    if we consider isPresent (true false) as value.
                                       is we only store the element which are present in the array. it means the elements are by default presents 
                                       so "for every entry it will True", becoz every element are present.

                        Summary:-
                                    "If the Value is not important" then why to have the value. why now we just store the unique keys. 
                                    so, 
                                        Instead of using Map,  we can use Set.

        Code:-
                for i --> 0 to (N-1)
                    hs.add(A[i])        // set will store the element once. 
                return hs.size()
        
        TC = O(N)
        SC = O(N)       // In worst case all the elements are unique & we are storing these unique elements.

        
        These above two problems will tell where to use set & map.  
 `````

#### Problem 3:- Find First Non-Repeating element in the Array. if not present return -1
 ```
        A = [1 2 3 2 5 4 2 8]
             0 1 2 3 4 5 6 7

            We travel from L to R.
                first element is 1, now element 1 is present at index 0 & 5. so element 1 is repeating. 
                second element is 2, now element 2 is present at index 1 & 6. so element 2 is repeating. 
                third element is 3, now element 3 is present at only index 2. so element 3 is not repeating.    Ans = element 3. it is first non-rpeating element. see (img 7)
            
                assume we don't have to use any variation of map like linked hash map. we just have to use basic map || set.    

            Think:-
                    we know when we utilise map. when we utilise set.
                        In set --> when value is not useful.
                    now we have to find first non-repeating element.
                        Ques:-  What is the meaning of word non-repeating || How we will define any element is non-repeating ?
                        Ans :-  means, that element should be Present Only Once.
                                    so it means the frequecy of that element is 1. & this freq = 1 is useful information for this case. so we have to store this information for every element.
                                    that's why we don't have the choice to use the set. so we will use Map.
                    Map <A[i], freq of A[i]>
                        Step1:- we can use the first above code to store freq of every element. see (img 4)
                                    then we have the freq information of the array A. 
                                    Ques:-  if we travel the map, will it tell the first element ?
                                    Ans :-  No, it will travel not one after another. "Becoz data stored randomly". see (img 8)  
                                
                                        so, instead of traveling map, why we are not travel again array.
                        Step2:- we travel the array (0 to N-1) & for the firs element if the freq is == 1 then return A[i].
                        Step3:- at the end return -1.   see (img 9)         
```                
#### Problem 4:- Given an integer array A, we have to check if there exists a subarray with sum 0.
``` 
        check means ans is in true || false.
        Subarray:-  it is continuous part of the array.
        
        A = [2 2 1 -3 4 3]
             0 1 2  3 4 5   
            
            Ans = True  // becoz there is a sub array which sum is 0. see (img 10)
            
            Bruteforce:-  
                    "For All Sub array, we calculate the sum & check if sum  = 0"  
                    TC = O(N^2)
                    SC = O(1)
                    
        A = [2 2 1 -3 4 3 1 -2 -3 2]
             0 1 2  3 4 5 6  7  8 9
        
        Observation:-  
                1.  Whenever there is a sub array sum question, what is the first thing we should do.
                       -   Use Prefix Sum  
                            Formula:-   for all i, P[i] = P[i-1] + A[i]
                       
                       P = [2 4 5 2 6 9 10 8 5 7]
                2.  Now make 1 more observation in prefix sum array.
                        if we looked at index 2 & index 8.
                            element 5, which are at index 2 tells us "Sum of A[0] + A[1] + A[2]" = 5. means sum is 5 from index 0 to index 2.
                            element 5, which are at index 8 tells us "Sum of A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] + A[7] + A[8]" = 5. means sum is 5 from index 0 to index 8.
                            
                            now, if we know the sum of first three element is 5                                 (see light green color area img 10)
                            then, what is the sum of these element A[3] + A[4] + A[5] + A[6] + A[7] + A[8] = ?  (see light yellow color area img 10)
                            
                            Ex:-
                                if we have the data like,
                                    x = 5
                                    & we know x + y = 5 
                                    then what is Y = ?
                                        y = 0
                            
                            so, the sum of these element A[3] + A[4] + A[5] + A[6] + A[7] + A[8] = 0 only.
                                means, we can say the sub array sum from 3 to 8 is = 0.
                                 like,  index (2+1) to 8 the sum is = 0.  
                                if we have the information that,
                                P[i] == P[j] || P[i] <= P[j] that implies from (i+1) to j, sum = 0      // see carefully the above lines then we got that the i th index is 2 
                                                                                                            & from i+1 till 8 the sum is 5. so we have wrote index (2+1) to 8 the sum is = 0. 
           Steps1:- "create prefix sum". 
           Steps2:- we have to find out "in prefix sum that the elements are repeating or not". if elements are repeating that means  Ans = True.
           Steps3:- we know how to check there are repeating elements in the prefix sum array or not. that is same as "Problem 2"
                        & if we have all the elements are unique that means we don't have repeating elements in the prefix sum array
           
           Solution Steps:- 
                            1.  Calculate Prefix Sum
                            2.  if count the no. of distinct elements in the Prefix array which is < N that implies Ans = True. 
                            3.      A = [3 -1 2 -4 -2]
                                    P = [3  2 4  0 -2]
                                            in this array, we have all the distinct elements then this theory :-"repeating elements then i+1 to j elements sum is 0" has failed here.  
                                                but if we look at this sub array 3 -1 2 -4, the sum of sub array is 0.
                                                means when we write P array & the prefix sum itself is 0. ( "every prefix is also a sub array" becoz its continuous part of the array)
                                                    if any prefix sum (P[i]) is 0, even elements are unique in prefix array, then also Ans = True.
                                    
                                    A = [0 8 3]
                                    P = [0 8 11]
                                            Here, we have prefix sum array where P[i] is 0 that means subarray sum is 0. becoz one element is also a sub array becoz its continuous part.  
                                    
                                    We can conclude that if the element is 0 in the input array that means Ans = True. see (img 12)   
                                    so while calculating prefix sum we have to check this step || step 3.   
           Code:-   
                    step 1:-
                            P[0] = A[0]          // we initialise the P[0]
                            if(P[0] == 0)       // if the first element is 0 then return True.
                                return True;
                            for i --> 1 to N-1   // this is same for loop that we used for prefix array.
                                P[i] = P[i-1] + A[i]    // formula
                                if (P[i] == 0)
                                    return True.        // this is same as that we din in prefix sum. just the change is "when we got the prefix sum is 0 then the ans is 0"  
                    step 2:-
                            we have done this part using hashSet in problem 2.   (doubt by me :- in problem 3)    
                            hash set will use to count unique element in the prefix sum array.      
                                
                            for i --> 0 to (N-1)
                                hs.add(P[i])  
                            if (hs.size < N)    // it means there are repeating elements then Ans = True
                                return True
                            
                            return false.
                    
                    Total TC = O(N)
                          SC = O(N)     // here, prefix sum is O(N) & hash set is O(N)
                                         
             
        Dry Run:-
                1.  we calculated the prefix sum for the complete array using the prefix sum formula.
                2.  here, we have two elements which are equal 
                        index 2, where prefix sum = 5. A[0] + A[1] + A[2]
                        index 8, where prefix sum = 8. A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] + A[7] + A[8]
                3.  if this data A[0] + A[1] + A[2] is equal to 5. then what is this data A[3] + A[4] + A[5] + A[6] + A[7] + A[8]. 0 only
        Conclusion:-
                    "if we have index i & index j which have equal prefix sum then we can say the sum of index i+1 till index j the prefix sum is 0". 
                        P[i] == P[j] ==> subarray
                            (i+1) to j, sum = 0
        
                




```