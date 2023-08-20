# DSA_Supereme
#ASLI CODING 
#### Problem 1:- Given a char array, calculate no. of pairs such that (i<j) and S[i] = 'a' & S[j] = 'g'. In Input all char are in lowercase. (a,b,c,d,...,z)
``` 
    S= [b  a  a  g  d  c  a  g]                              S= [g  c  a  g  g  a  a]
        0  1  2  3  4  5  6  7                                   0  1  2  3  4  5  6
        
        valid pairs which satisfied the conditions are:-        valid pairs which satisfied the conditions are:-
            (1,3) (2,3) (6,7) (1,7) (2,7)                            (2,3) (2,4)  
             Ans = 5.                                                 Ans = 2.
    
     BruteForce Approach :- (Try out every posibilities)
              "for all i,j pairs check if S[i] = 'a' & S[j] = 'g' and i<j"  ******************
                TC = O(N^2)
                SC = O(1)
                
              Bruteforce Code:-             
                    int count = 0;
                    for(int i=0;i=<n-1;i++){
                        for(int j=0;j=<n-1;j++){
                            if(S[i] == 'a' && S[j] == 'g' && i<j){
                                count++;
                            }
                        }
                    }
                    return count;
                    
                    Observations:-  
                                What is there to observe in this code ?
                                    there are three things mentioned in ques to observe that are:-
                                        1. S[i] = 'a'  
                                        2. S[j] = 'g'
                                        3. i<j
                                    observe 1:- given condition is (i<j) that means j should be greater than i.
                                                so, we can say j start from i+1. (now half of the pairs we are not traversing just check matrix of pairs)   
                                        Optimised Code:-  (In case of No. of pairs || No. of Iterations)
                                                    int count = 0;
                                                    for(int i=0;i=<n-1;i++){
                                                        for(int j=i+1;j=<n-1;j++){
                                                            if(S[i] == 'a' && S[j] == 'g'){
                                                            count++;
                                                            }
                                                        }
                                                    }  
                                      
                                         TC = O(N^2)
                                         SC = O(1)
                 
                                        Some points that come in my mind:-
                                                    if j loop starts from i+1 then will it make sense that i loop go till N-1. 
                                                        if i reaches N-1 then j will start from N. 
                                                            j =  N-1+1 = N 
                                                        so if i loop goes till N-2 then j loop will start from N-1. 
                                                            j = N-2+1 = N-1 
                                                             so (N-1 <= N-1) is true. therefore j loop will work. 
                                       Code:- 
                                            int count = 0;
                                            for(int i=0;i=<n-2;i++){
                                                for(int j=i+1;j=<n-1;j++){
                                                    if(S[i] == 'a' && S[j] == 'g'){
                                                        count++;
                                                    }
                                                }
                                                }  
                                    observe 2:- "since S[i] == 'a' therefore only j loop when i th char is 'a' "
                                                    so, we can say j loop only when S[i] == 'a'
                                            means, if i th char is not 'a' then no make sence to run j loop.
                                                   so why we are checking i char inside j loop. why can't we check it before j loop.
                                        Code:-
                                            int count = 0;
                                            for(int i=0;i=<n-2;i++){
                                                if(S[i] == 'a'){
                                                    for(int j=i+1;j=<n-1;j++){
                                                        if(S[j] == 'g'){
                                                            count++;
                                                        }
                                                    }
                                                }
                                            }
                                                TC = O(N^2)
                                                SC = O(1) 
                                         *********************************************
                                    observe 3:- we are making observation but TC is not reduced.   
                                         so, think like this.
                                         find any example where O(N^2) iteration will happen.
                                            Worst Case:- S=[a a a a .... a a a] 
                                                            means if everything is 'a', then for every i it will run all j loop. 
                                            TC is always calculated based on worst case.
                                            
                                           so focus on worst case part.
                                                 what this code is doing ?
                                                    for(int j=i+1;j=<n-1;j++){
                                                        if(S[j] == 'g'){
                                                            count++;
                                                        }
                                                    } 
                                                 Ans:- it is just counting no. of 'g' from index i+1 to n-1.]
                                                        & it is doing this for every i.
                                           therefore we doing some Analytics:- (like we are counting no. of 'g' for every i)
                                                suppose we have any char a b c d w o ... so on. (this _ _ _  is the representation of any char.)
                                                            _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _.            ========>       _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _.
                                                 index= 0     |------------------------------>                        0     |--------}---------------------->
                                                        1        |--------------------------->                        1        |-----}---------------------->
                                                        2          |------------------------->                        2          |---}---------------------->
                                                        3            |----------------------->                        3            |-}---------------------->
                                                        4              |--------------------->                        4              |--------------------->
                                                        5                |------------------->                        5                |------------------->
                                                                   ... so on
                                                 means, we are saying that "for every index we are counting no. of 'g' starting from that index till end".
                                                        like we are computing || calculating same thing multiple times.  
                                                    if i know the ans of index 4. then i can save my time when i calculate for index 3 2 1 ... so on.
                                                        means i can use the ans of index 4. & then no need to travel for every index again & again.
                                                        Example:-
                                                                if we know No. of 'g' for index 4 = 5. 
                                                                    then i can add ans 5 to other index 3, 2, 1, 0.
                                                        like:- 
                                                               we will calcuate the ans till } braces after th at we add 5 to every index. so no need to recompute again & again.
                                                        Now, there is an way for optimising.
                                                                that way is "By Storing that value before n"
                                                                   Example:- 
                                                                                0  1  2  3  4  5  6  7  
                                                                            S= [g  c  a  g  g  a  a  g] 
                                                                            
                                                                            we have to calculate ans from any index i till n-1.
                                                                                    what will make sence to travel either L to R. or R to L.
                                                                                        Ans:- R to L. 
                                                                                        _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _.
                                                                                        |--------}---------------------->
                                                                             from any index i till n-1 means, "this } braces to N-1" part.  (like } brace can be any index.)
                                                                                the always travel R to L. (its look like an Suffix Array Concepts)
                                                                                                                    <---- 
                                                                                        0  1  2  3  4  5  6  7
                                                                                    S= [g  c  a  g  g  a  a  g]
                                                                                count=              2  1  1  1]
                                                                                  we are counting no. of 'g' from index i till n-1.
                                                                                              i
                                                                                        index 7 = g is available 1 time. so count of g is one.
                                                                                        index 6 = g is not available. so count of g is not increase. 
                                                                                                 (from index 6 to n-1 we have only 1 g. so copy the value.
                                                                                        index 5 = g is not available. so count of g is not increase. 
                                                                                                 (from index 5 to n-1 we have only 1 g. so copy the value.
                                                                                        index 4 = g is available 1 time. so count of g is two.
                                                                                                 (from index 4 to n-1, at index 4 we have 1 g
                                                                                                  & we know the sum of g from index 5 to n-1 is 1. 
                                                                                                    & at index 4 is algo g so, 1+1=2)
                                                                                        index 3 = g is available 1 time. so count of g is three.
                                                                                        
                                                                                          means we are utilising the ans from Right hand side to till end.
                                                                                               like for index 3 we are using the ans of index 4 & add 1 (if g is present at index 3) 
                                                                                          but at N-1 index we don't have any thing on right side so we are using the ans of N-1 index.
                                                                                                    if it's g then add 1 else 0.
                                                                                            Forumla:- for count.            **************************************

                                                                                                count[i] = count[i+1];
                                                                                                if(S[i] == 'g'){
                                                                                                    count[i]++;
                                                                                                }
                                                                                            like:- 
                                                                                                count[3] = count[4];// whatever the ans till index 4 to n-1. copy it to index 3. & check if condition.
                                                                                                if(S[3] == 'g'){    // if current index is g then add 1 to count.
                                                                                                    count[3]++;
                                                                                                }
                                                                                                    finally count[3] = 3;
                                                                                                    count=[ 4 <- 3 <- 3 <- 3 <- 2 <- 1 <- 1 <- 1]
                                                                                            Code:-(1)
                                                                                                    count[i] = 0;       // initially for all i th index count is 0.
                                                                                                    if(S[N-1] == 'g')     // checking N-1 index is g or not. by writing seprately we are handling overflow issue.  (below i+1 we have to handle it)
                                                                                                    {
                                                                                                        count[N-1]=1;   // if g is present then add 1 to count.
                                                                                                    }
                                                                                                    for(i= N-2; i>=0; i--) // starting from N-2 index to 0 index.
                                                                                                    {
                                                                                                      count[i] = count[i+1]; // copy the value from right to left. because we are using the ans from right side. (if g then add 1 else copy previous value.)
                                                                                                        if(S[i] == 'g')        // if current index is g then add 1 to count.
                                                                                                        {
                                                                                                            count[i]+=1;
                                                                                                        }
                                                                                                    }
                                                                                                                ||
                                                                                                     count[i] = count[i+1];                             if(S[i] == 'g') {
                                                                                                        if(S[i] == 'g')                                     count[i] = 1 + count[i+1]; } // if current index element is g then add 1 to count with previous value.
                                                                                                            {                       both are same.      else {  
                                                                                                            count[i]+=1;                                    count[i] = count[i+1]; }    // else copy previous value to current index of count.
                                                                                                            }
                                                                                           // Calculating the count of 'g' from i to n-1.
                                                                                           
                                                                                              TC = O(N) 
                                                                                              SC = O(N) // for count array.
                                                                                          *********************************************   
                                      we are checking that how can we use count array to calculate the ans.
                                          0  1  2  3  4  5  6  7
                                       S=[g  c  a  g  g  a  a  g]       
                                       C=[4  3  3  3  2  1  1  1] // count of 'g' from i to n-1.       
                                            Code:- when i was 'a', for every index of i the j loop is count the no. of 'g' from i+1 to n-1
                                                        int count = 0;
                                                        for(int i=0;i=<n-1;i++){
                                                            for(int j=i+1;j=<n-1;j++){
                                                                if(S[i] == 'a' && S[j] == 'g'){
                                                                count++;
                                                                }
                                                            }
                                                        }
                                                   Now, what all places 'a' have.
                                                         index 2, index 5, index 6. 
                                                        for all of those index if we count no of 'g' from i+1 to n-1. (means right side from S[i] == 'a')
                                                         Ans = 3 + 1 + 1 = 5.
                                                                Explain:- 
                                                                        at index 2, 'a' is making pair with 3 times of 'g' (index 3, index 4, index 7)
                                                                                    (2,3) (2,4) (2,7)           ===> 3
                                                                        at index 5, 'a' is making pair with 1 times of 'g' (index 7)
                                                                                    (5,7)                       ===> 1
                                                                        at index 6, 'a' is making pair with 1 times of 'g' (index 7)
                                                                                (6,7)                           ===> 1
                                                                                        ... so on.
                                                                                                                Ans = 5. 
                                                   Code:- (2) 
                                                        int ans = 0;
                                                        for(int i=0;i=<n-1;i++){
                                                            if(S[i] == 'a'){
                                                                ans+=count[i];
                                                            }
                                                        }
                                                       return ans;
                                                            TC = O(N)
                                                            SC = O(1) 
                                                            
                                                   Total 
                                                        TC = O(N) + O(N) = O(N)         // O(N) for count array & O(N) for calculating the ans.
                                                        SC = O(N) + O(1) = O(N)         // O(N) for count array & O(1) for calculating the ans.
                                      Reduce the SC.
                                                    Ques:- do we realy need the count array or can we calculate & get the ans together. 
                                                    Ques:- can we combine these two loops. (count array & calculating the ans)
                                                    Ans:- yes, while calculating the ans. if we check current char is 'a' then add that ans. 
                                                              0  1  2  3  4  5  6  7
                                                           S=[g  c  a  g  g  a  a  g]       
                                                       
                                                                  like:-  
                                                                        int ans = 0;  
                                                                        for(int i=0;i=<n-1;i++){
                                                                            if(S[i] == 'a'){
                                                                                ans+=count[i];          // code 2.
                                                                            }
                                                                        }                                                    
                                                                        
                                                                        count[i] = 0;  
                                                                        if(S[N-1] == 'g')                 
                                                                        {
                                                                            count[N-1]=1;   
                                                                        }                               // code 1.
                                                                        for(i= N-2; i>=0; i--) 
                                                                        {
                                                                          count[i] = count[i+1];
                                                                            if(S[i] == 'g')        
                                                                            {
                                                                                count[i]+=1;
                                                                            }
                                                                  we combine these two code.
                                                                        how ?
                                                                            see, in code 1. "if the current char is 'g' then add 1 to count (increment the ans)."
                                                                                 in code 2. "if the current char is 'a' then add the count to ans."
                                                                                                          
                                       
                                                                            Code:-
                                                                                    ans = 0;
                                                                                    count = 0;                  // we are not storing everythings in count array. we are using only one variable.                             
                                                                                    for(i= N-1; i>=0; i--) 
                                                                                    {
                                                                                      if(S[i] == 'g') {     
                                                                                        count+=1;     }      // if current char is 'g' then add 1 to count.
                                                                                        
                                                                                      if(S[i] == 'a') {
                                                                                        ans+=count;   }          // if current char is 'a' then add count to ans.
                                                                                    }
                                                                                    return ans; 
                                                                            Working:- 
                                                                                        0  1  2  3  4  5  6  7              ans   = 0   => 0+1=1 => 1+1=2   => 3+2=5
                                                                                     S=[g  c  a  g  g  a  a  g]             count = 0   =>   1   => 2       => 3       => 4

                                                                                       - we are travelling from right to left. 
                                                                                       - if(S[7] == 'g') { count = 1; } // count = 1. 
                                                                                            if last char is 'g' then increment the count.
                                                                                           assume if last char is 'a' then we can't make any pair. becoz 
                                                                                                        'a' should be on left side & 'g' should be on right side.
                                                                                                so we can ignore this case. 
                                                                                       - we are starting from i = N-1; i>=0; i--. suppose last char is 'a', so count=0. if we add 0 to ans then ans =0;
                                                                                       - if last char is 'g' then count = 1.
                                                                                           so we can make pair with 'a' which is on left side.
                                                                                                so, we are checking that in loop. 
                                                                                       - we include [N-1] case in loop. previously we are checking seprately to handle the overlows issue.
                                                                                                 by checking including we don't have to handle Overflow issue. becoz there is no array so no i+1 index. inside code.          
                                                                                       - we can't ignore index 0.
                                                                                                becoz if index 0 is 'a' then we can make pair with all the 'g' which is on right side.
                                       
                                                                            TC = O(N)
                                                                            SC = O(1) 
                                                                                        Carry Forward from R to L.  
                                                                        Doubts:- 
                                                                                Ques:- why we choose R to L. we can use L to R that is also solve the problem.
                                                                                Ans:-  we can use L to R. but our observations are telling that to solve from R to L.
                                                                                        In observe1, which said (i<j) so, start the j loop from i+1. then,
                                                                                           observe2, that said if S[i] == 'a' then we should run j loop. otherwise it's no use.
                                                                                                     then, we focus on code that was telling "code was calculating no. of 'g' from i+1 to N-1."
                                                                                                     so we thought to do it using one variable. so that we don't have to do it again & again.
                                                                                        hence, we did it from R to L. that counting no of 'g' from i+1 to n-1. 
                                                                                                we can solve to using L to R. but this will not that optimised that we did.
                                                                                            "ANYTHING FROM i+1 till end. || i till end. is Basically R to L."    --> suffix part     *****************************************************************   
                                                                                
                                                                                                                     
```
## Carry Forward Technique
``` 
      we are utilising one variable (count). like carrying that variable from Right to Left. this is called Carry Forward Technique.  
            means, it same as prefix & suffix sum(there we utilise an array) but instead of using array & calculating prefix sum, suffix sum or prefix, suffix anything
                    we are using only one variable that travelling & utilising & getting the ans.
          
    Usecase:-
            while solving prefix & suffix question, we don't want to use array, we want only constant space then we can use this technique
```
#### Given an integer array A, count the number of leaders in the array A.
```
    "Leader:- an element which is  greater than all the elements on its right of it."  || leader is greater then everything on its right side.
    Note:- rightmost || A[N-1] is always a leader.
            0    1   2   3   4   5   6   7
        A= [15,  -1  7   2   5   4  -2   3]
        
            Leaders are:- 15, 7, 5, 4, 3
            Index are:-   0,  2, 4, 5, 7
              Ans = 5
              How ?
                    index 7, will always be a leader. count = 1;                                Leader
                    index 6, is -2 > right of it. like 3, No. so count is still 1. 
                    index 5, is 4 > right of it. like -2,3, Yes. so count = 2.                  Leader
                    index 4, is 5 > right of it. like 4,-2,3, Yes. so count = 3                 Leader
                    index 3, is 2 > right of it. like 5,4,-2,3, No. so count is still 3
                    index 2, is 7 > right of it. like 2,5,4,-2,3, Yes. so count = 4             Leader
                    index 1, is -1 > right of it. like 7,2,5,4,-2,3, No. so count is still 4
                    index 0, is 15 > right of it. like -1,7,2,5,4,-2,3, Yes. so count = 5       Leader    
            Observations:-
                    Observe 1:- leader as an element which is greater than the maximum element on its right side.
                                 "Leader --> A[i], if(A[i] > max) from i+1 to N-1. "
            Bruteforce Approach:-
                              "for all i, check if A[i] > max element on its right side"   
                                    0 1 2 3 4 5
                                    _ _ _ _ _ _         index 5 will be Leader.
                                            |-->        index 4, we have to check if(A[4] > last element on its right side) or not.
                                          |---->        index 3, we have to check if(A[3] > last element on its right side) or not.
                                        |------>        index 2, we have to check if(A[2] > last element on its right side) or not.
                                      |-------->        index 1, we have to check if(A[1] > last element on its right side) or not.
                                    |---------->        index 0, we have to check if(A[0] > last element on its right side) or not. 
                                    
                                    if we travel for every i till its right side & checking (like is current element  > everything on right side)
                                        TC = O(N^2)
                                        SC = O(1)  
            Optimisation 1:- "we are calculating somethihg again & again."
                                for optimisation we have to travel from Right to Left.
                                   "we have to calculate max element on its right side of i th index. so, we have to travel from Right to Left." 
                                while travelling we have to compute max element on its right side of i th index.
                                                0    1   2   3   4   5   6   7
                                            A= [15,  -1  7   2   5   4  -2   3]
                                          Max= [                             3]         ans = 1 
                                          
                                          "if any element is not an leader then we copy the max value to that index. we only increment the ans & update the max when we find an leader."
                                          from i+1 to N-1.
                                            if(A[i] > max)  
                                              
                                                initially, max_element = 3, so ans = 1 (becoz last element will be always a leader)
                                                index 6, if(-2 > 3) No. so ans is still 1  & max_element is still. 3
                                                index 5, if(4 > 3) Yes. so ans = 2 & max_element = 4
                                                index 4, if(5 > 4) Yes. so ans = 3 & max_element = 5
                                                index 3, if(2 > 5) No. so ans is still 3 & max_element is still. 5
                                                index 2, if(7 > 5) Yes. so ans = 4 & max_element = 7
                                                index 1, if(-1 > 7) No. so ans is still 4 & max_element is still. 7
                                                index 0, if(15 > 7) Yes. so ans = 5 & max_element = 15
                                                
                                                    
                                                    Max= [15 7 7 5 5 4 3 3]         ans = 5
                                          we don't have to store it in array, only one variable is enough.
                                           How ?
                                              Code:-
                                                    ans = 1;                        // last element will be always a leader. 
                                                    max_element = A[N-1];           // last element will be always a leader.
                                                    for(int i = N-2; i >= 0; i--){
                                                        if(A[i] > max_element){
                                                            ans++;                  // increment the ans   
                                                            max_element = A[i];     // update the max_element 
                                                        }                           // else we don't have to bother about it.
                                                    }
                                                    return ans;
                                                    
                                                    TC = O(N)
                                                    SC = O(1)
                                       
```
## Subarray:- is a **Continuous part of array**, means as long as indexes are continuous it is a subarray.
``` 
    Means, if we select something continuously that is an subarray.
    A= [15,  -1  7   2   5   4  -2   3]
    
            Example:-
                    7  2   5   4  -2   3    ==> subarray of A
                    2   5   4               ==> subarray of A
                            ... so on.
    Empty Array is a Subarray or not ?
       sometimes people treated as a subarray. like empty sub array.
       sometimes people treated as a not a subarray. becoz there is no element in it. 
       so, 
            In the question it will be mentioned that empty array is a subarray or not.
```
1. **Single Element is also a Subarray**
2. **Complete Array is also a Subarray** becoz it is a continuous part of array.
3. **Empty Array** default don't consider a subarray until & unless it is mentioned in the question.

#### Given an integer array, find the length of smallest sub array which contain both min & max of array.
```     
        0 1 2 3 4 5 6 7 8 9 10 
    A= [1 2 3 1 3 4 6 4 6 3 5]
    
        Think like:-
                Ques:- What is an min element of the array ?
                Ans:- 1
                Ques:- What is an max element of the array ?
                Ans:- 6
            so we have to consider an subarray which contain both 1 & 6. & has the smallest length.      
                    if we consider subarray from 0 to 6, it contain both 1 & 6. but it is not the smallest subarray.
                    if we consider subarray from 0 to 8, it contain both 1 & 6. but it is not the smallest subarray.
                      ... so on.
                    if we consider subarray from 3 to 6, it contain both 1 & 6. & it is the smallest subarray.
                    
        Ans:- 4. the length of smallest subarray which contain both 1 & 6 is 4.
         
                    A=[8 8 8 8 8 8 8]
                        min:- 8
                        max:- 8 
                                here, select any one length array that is the ans.
                        Ans:- 1
        Bruteforce Approach:-
                    "for index i, we have to check for every j from i+1 to N-1. & check if it contain both min & max. & we have to find the smallest length."
                        
        Observations:-
             Observe1:- can smallest subarray which containing min & max element have more than 1 min element or max element ?
                  ANS:- No
                        Expalin:-  max = M, min = m.
                                                         |-------------| 2       
                                 _ _ _ _ _ _ m _ _ _ _ _ m _ _ _ _ _ _ M
                                             |-------------------------| 1        suppose this is an subarray which contain both min & max.
                                            
                         sub array 1 will be better answer than subarray 2. becoz it has smallest length ? 
                         "No, smallest subarray will have exactly || only one min element & one max element."  
                                            
             Observe2:- can the ans subarray have element in corner which is neither min nor max ?
                  ANS:- No
                        Expalin:-  max = M, min = m.
                                                         |-------------| 2       
                                 _ _ _ _ _ _ _ _ _ _ _ _ m _ _ _ _ _ _ M
                                                      |---------------| 1 
                            subarray 1 will not be the ans becoz it has element in corner which is neither min nor max.
                            subarray 2 will be the ans.
                            "No, Either Min or Max element should be on the corner of the subarray." like subarray 2.
                              
             can we say the ans of the sub array should be in the below format:-
                    [Min _______ Max] means, subarray starting from min & ending at max.
                      A.   means, we have min element then we just have to find "Nearest max element on the right side of min element."
                                ||
                      B.   means, if we have max element then we just have to find "Nearest min element on the left side of max element."
                    [Max _______ Min] means, subarray starting from max & ending at min.   
                      A.      means, we have max element then we just have to find "Nearest min element on the right side of max element."
                                ||
                      B.      means, if we have min element then we just have to find "Nearest max element on the left side of max element."
                      
                "Either we can do Both the A cases or we can do Both the B cases." so that we will cover all the possible subarrays.      
        
index= 0  1  2  3  4  5  6  7  8  9 10  11 12 13 14  15 16
    A=[2  2  6  4  5  1  5  2  3  6  4   3  1  2  6  3  6]
    
        Task1:- finding the min element & max element of the array.
                    min = 1, max = 6. 
                    TC = O(N)
                    SC = O(1)
                Code:- 
                    int min = A[0];
                    int max = A[0];
                    for(int i=0; i<n-1; i++){
                        if(A[i]<min){
                            min = A[i];
                        }
                        if(A[i]>max){
                            max = A[i];
                        }
                    }
                      
                      
        Read the Case A statement. ==> "for every min ==find=> nearest max(right side) & for every max ==find=> nearest min(left side)"  
            no. of elements in range L to R ?
            Formula:- R-L+1 // we are adding 1 becoz we are considering both L & R. so in this case we have to add 1. Otherwise we will lose 1 element.
                                                        (i,j)           ans(length) 
                max = 6, closest min on right = 1, index(2,5)           5-2+1 = 4 elements
                min = 1, closest max on right = 6, index(5,9)           9-5+1 = 5 elements
                max = 6, closest min on right = 1, index(9,12)          12-9+1 = 4 elements
                min = 1, closest max on right = 6, index(12,14)         14-12+1 = 3 elements
                
                Optional subarray:- suppose, at index 11, if we have element 6 instead of 3 then the ans will be 2.
                max = 6, closest min on right = 1, index(11,12)         12-11+1 = 2 elements
                
                                                                    Ans = 3 smallest length subarray which contain both min & max.
                
                - based on current conditions, element 6 at last index will not be pair with any element.
                - pair of index(12, 16), do we have to really need this subarray in the consideration ?
                    Ans:- No, becoz if we see the Observe 1 (smallest subarry will have only one min or only one max element)
                              In this sub array we have  2 max element. so, this can never be the ans.  
                
        For every element we have to find the nearest min or max element on the right side.
              do we need L to R || R to L traversal. ?
                    hint:- we are considering some set of element from current index till the end. means (i+1 to N-1).
                    like:- index(2,5)
                            suppose, we are at index 2. if we travel from L to R then we will get the nearest min element on the right side. 
              
              approach 1:- "for all index i, ifA[i] is min or max, travel right side from i to get closest min or max element."
                            TC = O(N^2)
                            SC = O(1) 
                    Optimisation:- 
                            Example:-
                                            0 1 2 3 4 5 6 7 8         
                                            _ _ _ _ _ _ _ _ _    
                                                  |---------->            | by this symbol we are representing that the current index (it can be min or maximum), so the elements that we have to consider a which will form a pair with the current index that called closest min or max on right will be this range like |------------> means "among these elements we are finding the closest min or max"
                                                |------------>
                                              |-------------->
                                        assume index 3 is the min or max element. then we have to check the closest min or max element on the right side. (index 4 to 8)  
                                        assume index 2 is the min or max element. then we have to check the closest min or max element on the right side. (index 3 to 8) 
                                        assume index 1 is the min or max element. then we have to check the closest min or max element on the right side. (index 2 to 8)
                                            ... so on.
                                  by checking element we can see some patterns. like we are checking some element again & again for closest min or max element on the right side.
                                      so, "for checking the closest min or max element on the right side & we don't want to repeated work then we traverse from R to L."
                        
                                Ans:- R to L traversal.
                                
                                0  1  2  3  4  5  6  7  8  9  10 11 12 13 14
                            A= [2  6  4  1  5  2  6  3  4  6  5  3  2  1  1]
                                
                                min = 1, max = 6. // first we must able to find the min & max element from the array then continue with the below part.
                                Traversing from R to L. & checking how it will help us.
                                   "we have to find the closest min or max element on the right side" so we need to store their indexes.
                                        minId = -1 => 14 => 13 => 3
                                        maxId = -1 => 9  =>  6 => 1                                          // initially we don't have any min or max element so we are storing -1.
                                   
                                   Working:-
                                            at index 14, we check is the current element is min or max element. this is min element, then we check for closest max element on right side. No, so no pair will be formed. but we update minID = 14.
                                            at index 13, we check is the current element is min or max element. this is min element, then we check for closest max element on right side. No, so no pair will be formed. but we update minID = 13.
                                            at index 12, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 11, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 10, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 9, we check is the current element is min or max element. this is max element, then we check for closest min element on right side. that is 13. so we find the pair(9 to 13).
                                                    13-9+1= 5 length subarray.
                                            at index 8, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 7, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 6, we check is the current element is min or max element. this is max element, then we check for closest min element on right side. that is 13. so we find the pair(6, 13)
                                                    13-9+1= 8 length array.
                                            at index 5, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 4, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 3, we check is the current element is min or max element. this is min element, then we check for closest max element on right side. yes, so we find the pair(3,6)
                                                    6-3+1= 4 length subarray. 
                                            at index 2, we check is the current element is min or max element. No, so no pair will be formed. go to next element.
                                            at index 1, we check is the current element is min or max element. this is max element, then we check for closest min element on right side. that is 3. so we find the pair(1,3)
                                                    3-1+1= 3 length subarray.
                                            at index 0, we check is the current element is min or max element. No, so no pair will be formed. go to next element.     
                                        
                                        Ans:- 3
                                        TC = O(N)
                                        SC = O(1) 
                                            here we are carry forward these two element minId & maxId.
                            Code:-
                             ans = N;       // initially ans is complete array length we are taking.  
                             minId = -1;
                             maxId = -1;
                             
                                code to calcuate the minE & maxE. (in O(N) TC) 
                             for( i --> N-1 to 0)
                                  if(A[i] == minE) 
                                  {
                                        minId = i;
                                        if(maxId != -1)             // we are checking that valid maxId should be availabe at right side of the element.
                                            ans = min(ans, maxId - minId +1);       // current element is min so max element is on right side
                                  }
                                  if(A[i] == maxE)
                                  {
                                    maxId = i;
                                    if(minId != -1)
                                        ans = min(ans, minId-maxId+1)              // current element is max so min element is on right side   
                                  }
                             return ans;
                             
                                    Explain:- 
                                           if current element is minE then "right side the higher index will be max"
                                           if current element is maxE then "right side the higher index will be min"
                                           
                                           this code will will work if all elements are same.
                                           this will work when only one element is present. 
                                            


```






## In any question, if we see that one task is doing for multiple times there is chance to optimise it. **By calculating that part & storing it Reusing it multiple times**
``` 
    means, in the question something in the question (anything it can be) that we are using multiple times & we are calculating it 
              multiple times. so, there is an chance to optimise it.we can calculate it once & store it & reuse it multiple times.
                like:-  see the Analytics part.
```
### Matrix
``` 
                                                                     0      1     2     3     4
                                                                  0 (0,0) (0,1) (0,2) (0,3) (0,4) 
                                                                  1 (1,0) (1,1) (1,2) (1,3) (1,4)
                                                                  2 (2,0) (2,1) (2,2) (2,3) (2,4)
                                                                  3 (3,0) (3,1) (3,2) (3,3) (3,4)
                                                                  4 (4,0) (4,1) (4,2) (4,3) (4,4)

```
### **Sometimes Observations may not optimise Time & Space Complexity but it always good to have (No. of Iterations optimised)**
### ** No TC & SC will change if-else to else-if**
### When to choose R to L. & when to choose L to R.

1. if we have to calculate the ans from **current index to till n-1 or right hand side** then we should choose R to L.  => suffix part
2. if we have to calculate the ans from **start to current index** then we should choose L to R. => prefix part


              
               
