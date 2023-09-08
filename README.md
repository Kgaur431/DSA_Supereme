# DSA_Supereme
#ASLI CODING 
### Sub-arrays
``` 
    :-  it is Continuous part of the array.
    
    -   Single Element (it is also a continuous part of the array means start & end is the same place) is an subarray. 
    -   Full Array (means everything in the array, it is continuous part of the array) is an subarray. 
```

###  For a given integer array A & integer L & R. print all the elements from index L to R. (easy, warm up ques)
``` 
            A =  [4 6 10 2 3 -8 6 -5 0]     L = 2,  R = 5.
                  0 1  2 3 4  5 6  7 8   
                  
                  so, the output is:- 10 2 3 -8
            Code:-
                    for (i --> L to R)
                        print (A[i])
                    
                    TC = O(N)   // this is also an best case T & SC. 
                    SC = O(1)
```
 ### What is the count of subarrays of an array of size N ?
``` 
           A = [8  6  5]
                0  1  2
           
           Ques:-   What all will be the subarrays of the array A ?
           Ans :-   Total No. of Subarrays is 6. 
                    [8]     //  Single eleement
                    [8 6]   
                    [8 6 5] //  Full Array 
                    [6]
                    [6 5]
                    [5]
                
                    [8 5]  is not an continuous part of the array so it is not sub array.           
                
           Ques:-   What is the Ans for general Subarray ?
           Ans :-   Sum of first N natural numbers
                 
                    A = [8  6  5  7  2]
                         0  1  2  3  4 
                    How we will  be get the ans ?
                        Think like :- 
                                If I start the sub array from index 0; then what are all the ending positions the sub array can have.
                                   Sub array can end at index 0, 1, 2, 3, 4; means If sub array start from index 0 then it can end at any index like 0 1 2 3 4.
                                      A = [8  6  5  7  2]                                                               Total No. of Sub arrays
                                           0  1  2  3  4              
                                         0 |------------> (0,1,2,3,4)  // sub array like [0] [0,1] [0,2] [0,3] [0,4]            5
                                If I start the sub array from index 1; then it can end at index 1, 2, 3, 4.
                                  A = [8  6  5  7  2]
                                       0  1  2  3  4             
                                        1 |---------> (1,2,3,4)                                                                 4
                                If I start the sub array from index 2; then it can end at index 1, 2, 3, 4.
                                  A = [8  6  5  7  2]
                                       0  1  2  3  4 
                                           2 |-----> (2,3,4)                                                                    3
                                If I start the sub array from index 3; then it can end at index 1, 2, 3, 4.
                                  A = [8  6  5  7  2]
                                       0  1  2  3  4 
                                              3 |--> (3,4)                                                                      2
                                If I start the sub array from index 4; then it can end at index 1, 2, 3, 4.
                                  A = [8  6  5  7  2]
                                       0  1  2  3  4 
                                                 4 |-> (4)                                                                      1
                                                                                                            ________________________________________
                                                                           Total no. of sub arrays are:-  5 + 4 + 3 + 2 + 1  =  15
                                                                           So N = 5, Total Sub array = 15. 
                                                                           #Generalise Pattern 
                                                                                Sub-arrays = N + (N-1) + (N-2) + (N-3) + .... + 1                       **************************************
                                                                                this is nothing but Sum of N th Natural numbers.    N * (N+1) / 2.      *************Very Important*************
                                TC = O(N^2)
                                SC = O(1)
                        - Index should be in order
                            means we can't do like sub array starting index is 2 & sub array ending index at 0 like [5 6 8] ==> 2 1 0 is not valid sub array.
                                this will not allow, so the index should be in order like 0 1 2 || 1 2 3 and so on. 
                                
                                Means," Continuous part From LEFT to RIGHT" 
                        -Subarray does not depens upon the element, its depend upon the index.
                                like:-  if we make everything is 7 in the array then also count of the sub array will be same as previous.          
           
           Ques:-   What if we have empty element in between like 0 in between the array elements ?
           Ans :-   Basically as long as there is an index, that index will be part of the subarray. 
                        elements can be anything positive, negative, 0.                                                                                                                                           
```
### Print all subarrays of a given array. 
``` 
        A = [8  6  5]
             0  1  2        [8]     
                            [8 6]   
                            [8 6 5] 
                            [6]
                            [6 5]
                            [5]  
                            
        Explaination:-
                read from line 45  to 73. that is enough to solve this question.
                Points:-
                        Every index can become starting index (of the subarray), from that index till the end, that will be the ending index.
                            like:- starting index is 2, from 2 to 2,3,4 so the 4 is the ending index.
        Code:- 
                // Wrong Code   becoz not understand the ques properly. 
                for (i --> 0 to N-1)        // i is the starting index. 
                    for (j--> i to N-1)     // j is the ending index.
                        print (j)           // print sub array           
                    print ("/n")            // printing every sub array in next line. 

                    Note:- we are printing only the end, not printing the sub array so we need one more loop to print the sub array.
                    
                // Correct Code   
                for (i --> 0 to N-1)        // i is the starting index. 
                    for (j--> i to N-1)     // j is the ending index.
                        for (k--> i to j)   // k will loop from starting index of sub array till ending index of the sub array. 
                             print (k)      // print sub array           
                        print ("/n")        // printing every sub array in next line. 

        Dry Run :- 
        A = [8  6  5]
             0  1  2                i      |    j   |   k      
                                  ---------|--------|----------   
                                      0    |     0  |   {0}         i = 0, j = 0, so k will print only index 0. ==> pring single sub array. [8]
                                           |     1  |   {0,1}              j = 1, so k will print [8,6]
                                           |     2  |   {0,1,2}            j = 2, so k will print [8,6,5]   after everything done then i will increase.
                                      1    |     1  |   {1}         i = 1, j = 1, so k will print [6]
                                           |     2  |   {1,2}              j = 2, so k will print [6,5]
                                      2    |     2  |   {2}         i = 2, j = 2, so k will print [5]      
         
        Ques:-  Where people get wrong ?
        Ans :-  from this ques (What is the count of subarrays of an array of size N ?) we get that Count the number of sub array is O(N^2).
                means, this ques will give a feel that "Whenever we travel all the sub array the we need Two Loops."
                but current ques says we need to print the sub array. means we have to print every elements in the sub array. 1   
                    so how we will count no. of elements in the sub array ? becoz in O(N^2) we are counting the no. of Sub array not the elements in sub array.
                        it will be the every starting & every ends so again its need a traversal to print every element.  
                        so every element that we count that is an linear operation.
                        hence, we are travelling one more time.
                                so if we look at total no. of elements in the every sub array. not total no. of sub arrays. so it is O(N^3)              
                        
                        Total no. of Sub arrays         print 1 sub array is         print the total sub array is
                                    O(N^2)          *        O(N)               =            O(N^3)                         ******************************
                        
                Conclusion:- without kth loop we will just print either starting or the ending of the sub array. so to print the sub array we need kth loop.     
                 TC = O(N^3)
                 SC = O(1)    
                            It is not possible to do this task is better then this TC & SC. 
```
### Print all sub arrays sum 
``` 
        A = [8  6  5]                      O/p
             0  1  2        [8]             8
                            [8 6]           14  
                            [8 6 5]         19
                            [6]             6
                            [6 5]           11
                            [5]             5
        Code:-
                 for (i --> 0 to N-1)        // i is the starting index. 
                    for (j--> i to N-1)     // j is the ending index.
                       sum = 0;             // taking sum var & initialised to 0 For every start & every end 
                        for (k--> i to j)   // travelling every sub array
                            sum += Arr[k]   // calculating sum of the all sub array.    
                        print (sum)        // print sub array           
                  
                 TC = O(N^3)
                 SC = O(1) 
        Optimisation:- 
                 There are multiple ways to optimise the code. 
                    1.  Prefix Sum way:-
                            Ques:- why we came up to the idea of prefix sum. 
                            Ans :- can we say every sub array is nothing but an Range L to R. 
                                      i    |    j  
                                  ---------|-------------
                                      0    |     0  
                                           |     1 
                                           |     2  
                                      1    |     1 
                                           |     2  
                                      2    |     2   
                                  every start & every end is the Range L to R.  
                                  so for the Range Sum, the best thing is L to R. 
                                  
                            so if we want to find the sum from i to j then we can apply the prefix sum formula.         
                                     P[j] - P[i-1]
                                -   we have know how to calculate prefix sum    
                                -   steps
                                        1:- Calculate prefix sum.                   TC = O(N)  SC = O(N)            
                                        2:- using the prefix sum in below code.     TC = O(N^2)  SC = O(1)      // Means travelling every sub array 
                                                old code :-            (find prefix sum & write into the below code & also handle the corner cases)
                                                            for (i --> 0 to N-1)        // i is the starting index. 
                                                            for (j--> i to N-1)     // j is the ending index.
                                                               sum = 0;             // taking sum var & initialised to 0 For every start & every end 
                                                                for (k--> i to j)   // travelling every sub array
                                                                    sum += Arr[k]   // calculating sum of the all sub array.    
                                                                print (sum)        // print sub array  
                                                                
                                                New Code:-  (it should be like this)
                                                                                         // calculating the prefix sum P.
                                                            for (i --> 0 to N-1)        // i is the starting index. 
                                                            for (j--> i to N-1)        // j is the ending index. everything inside the ending index.
                                                                if( i == 0)
                                                                    print(P[j]);    
                                                                else 
                                                                    print(P[j]-P[i-1]);         // we are using prefix sum values not actual array elements.
                                                                Instead of travelling the Kth loop (we ignore the Kth loop), we have to handle the i = 0 case. 
                                -   TC & SC 
                                        TC & SC of finding prefix sum:-         TC = O(N)    SC = O(N)   
                                        TC & SC ob the new code to find sum:-   TC = O(N^2)  SC = O(1)    
                                                                             ---------------------------------
                                                                                TC = O(N^2 + N) = O(N^2)
                                                                                SC = O(N   + 1) = O(N)                   
                                       this is the best TC we have achived becoz To print O(N^2) element we need minimum O(N^2) TC. 
                                        means, total no. of sub arrays of arrays is O(N^2), for every sub arrays we have to print the sum of 
                                                elements of the sub array (so we have to print one integer called sum for every sub array) so we 
                                                have to print O(N^2) elements. 
                                                therefore we can't print O(N^2) element in less than O(N^2) TC.
                                                so, to print O(N^2) element we need O(N^2) TC.
                    2.  Two way to optimise SC
                            2.1 Modify input array to prefix sum    
                                    here the cost is to modify the input array, but sometimes modify may not be allowed 
                                    In, the above prefix sum code, we are doing same thing we are using prefix sum array. so after modifying the input array to prefix sum array we can use it that we are doing above.
                            2.2 Carry Forward Technique.         
                                    -   we have every starting & ending position 
                                             for (i --> 0 to N-1)  
                                             for (j--> i to N-1)
                                             Ex:-
                                                    Index=   0 1 2 3 4
                                                    if we have the sum of element from index 0 to 2 that is             =   s
                                                        like, s is basically A[0] + A[1] + A[2]
                                                    we want to calculate the sum of element from index 0 to 3 that is   =   i
                                                        like, i is basically index 3
                                                    can we say the sum of elements from index 0 to 3 is                 =   s+A[i]
                                                        so, s+A[3] will calculate the sum from index 0 to 3.
                                                        this is exact idea of prefix sum is also same
                                                            like, sum till i-1 & add the current element & sum till i.
                                                    
                                                    means, if we have the ans of subarray that ending at 2.
                                                            we want the ans of subarray that ending at 3.
                                                            then, simply add the element 
                                                                like, s+A[3]. 
                                                        but but, it is only valid when starting index of both the subarray 
                                                        is same. 
                                                            like, subarray that ending at 2, that starting index should be 0
                                                             &,   subarray that ending at 3, that starting index should be 0
                                                        therefore, 
                                                                    for every start position, if we have an var sum.
                                                                        that should be initialise with 0. 
                                                                        
                                                                    Ques:- Why we initialising the sum = 0 for every start ?
                                                                    Ans :- so whenever sum will get update then we have sub array sum that what we want.  
                                    -   Code:-      
                                                                        // if we are initialising any var here then we get the all sub array sum.   (optional:- tested below)
                                                    for (i --> 0 to N-1) 
                                                        sum = 0         // we are initialising here so we get the every sub array sum
                                                    for (j--> i to N-1)
                                                        sum += A[j]     // here, we are adding A[j] element at every step. so after every update in sum var, we get the sub array sum.
                                                        print(sum)      // here, we print sum inside j loop. 
                                                        
                                                   TC = O(N^2)
                                                   SC = O(1) 
                                            
                                    -   Dry run:-
                                                     A = [8  6  5]                  
                                                          0  1  2               start_index(i)  |  end_index(j)  |  sum 
                                                                            --------------------|----------------|-----------
                                                                                        0       |                |    0                     for every start, sum initialised with 0. 
                                                                                                |       0        |    8         (0+8 = 8)
                                                                                                |       1        |    14        (8+6 = 14)
                                                                                                |       2        |    19        (14+5 = 19)
                                                                                        1       |                |    0                     for every start, sum initialised with 0. 
                                                                                                |       1        |    6         (0+6 = 6)
                                                                                                |       2        |    11        (6+5 = 11)
                                                                                        2       |                |    0                     for every start, sum initialised with 0. 
                                                                                                |       2        |    5         (0+5 =5)
                                                  Explaination:-
                                                       initally i initialised with 0 & sum is defined to 0.
                                                       now, j will start from index 0. so we will add  A[0] to sum, sum become 8, we print this value.
                                                            then, j will become index 1. so we will add A[1] to sum, sum become 14 we print this value
                                                            then, j will become index 2. so we will add A[2] to sum, sum become 19 we print this value
                                                            till here, j loop is complete.
                                                       i will increment to index 1 & sum will reset to 0.
                                                            now, j will become index 1. so we will add A[1] to sum, sum become 6, we print this value.
                                                            then, j will become index 2. so we will add A[2] to sum, sum become 11, we print this value.
                                                              till here, j loop is complete.
                                                       i will increment to index 2 & sum will reset to 0.
                                                            now, j will become index 2. so we will add A[2] to sum, sum become 5, we print this value.
                                                       we have done. (we are actually printing sub array sum)
                                                       here, idea is same as prefix sum but instead of using extra space we are just using a single sum var. 
```
### Given an integer array A & an integer k, Check in how many sub arrays **index k** is present.
``` 
        A = [8  6  5  7  10  2]         N       N-1
             0  1  2  3  4   5          6        5
             
             Ques:- can be the integer k duplicate in the array ?
             Ans :- here we are talking about index not element in this ques.

                -   Explaination:-
                            Ques:-  we are starting sub array from index 0, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 0.
                            Ans :-  No, its single integer. 
                            
                            Ques:-  if we are starting sub array from index 0 & ends at index 1, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 1.
                            Ans :-  No.
                            
                            Ques:-  if we are starting sub array from index 0 & ends at index 2, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 2.
                            Ans :-  Yes, index 2 in the sub array from 0 to 2.
                            
                            Ques:-  if we are starting sub array from index 0 & ends at index 3, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 3.
                            Ans :-  Yes.
                            
                            Ques:-  if we are starting sub array from index 0 & ends at index 4, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 4.
                            Ans :-  Yes.
                            
                            Ques:-  if we are starting sub array from index 0 & ends at index 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 0 TO 5.
                            Ans :-  Yes.
                            
                            Ques:-  if we are starting sub array from index 1 & ends at index 1, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 1 TO 1.
                            Ans :-  No.
                            
                            Ques:-  if we are starting sub array from index 1 & ends at index 2, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 1 TO 2.
                            Ques:-  if we are starting sub array from index 1 & ends at index 3, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 1 TO 3.
                            Ques:-  if we are starting sub array from index 1 & ends at index 4, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 1 TO 4.
                            Ques:-  if we are starting sub array from index 1 & ends at index 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 1 TO 5.
                            Ans :-  Yes, index 2 in the above sub arrays
                            
                            Ques:-  if we are starting sub array from index 2 & ends at index 2, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 2 TO 2.
                            Ans :-  No.
                            
                            Ques:-  if we are starting sub array from index 2 & ends at index 2, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 2 TO 2.
                            Ques:-  if we are starting sub array from index 2 & ends at index 3, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 2 TO 3.
                            Ques:-  if we are starting sub array from index 2 & ends at index 4, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 2 TO 4.
                            Ques:-  if we are starting sub array from index 2 & ends at index 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 2 TO 5.
                            Ans :-  Yes, index 2 in the above sub arrays
                            
                            now, 
                            
                            Ques:-  if we are starting sub array from index 3, no matter where we end 3 4 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 3 to 3 4 5.
                            Ans :-  No. it will never have.
                            
                            Ques:-  if we are starting sub array from index 4, no matter where we end 4 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 4 to 4 5.
                            Ans :-  No. it will never have.
                            
                            Ques:-  if we are starting sub array from index 5, no matter where we end 5, CAN I HAVE INDEX 2 IN THIS SUB ARRAY 5 to 5.
                            Ans :-  No. it will never have.
                            
                      
                            
                            
                            
                -     Dry run:-   
                        start index should start from   &  ending index will be.
                          k=2, then 
                                        start_index(i)  |  end_index(j)                 Total no. of sub arrays in which index 2 is present. 
                                      ------------------|-----------------
                                            0           |     {2,3,4,5}                                 4
                                            1           |     {2,3,4,5}                                 4
                                            2           |     {2,3,4,5}                                 4
                                            3           |       ---                                     -
                                            4           |       ---                                     -
                                            5           |       ---                                     -
                                                                                            ---------------------------------------
                                                                                                        12 
                                            so, 12 sub arrays which have index 2 is present. 
            
                        if k=4 then,
                        
                                             start_index(i)     |  end_index(j)                 Total no. of sub arrays in which index 2 is present. 
                                       -------------------------|-------------------
                                                    0           |     {4,5}                                    2
                                                    1           |     {4,5}                                    2
                                                    2           |     {4,5}                                    2
                                                    3           |     {4,5}                                    2
                                                    4           |     {4,5}                                    2
                                                    5           |       --                                     2
                                                                                                    ---------------------------------------
                                                                                                               10
                                                    so, 10 sub arrays which have index 4 is present. 
                        if k=0 then,
                        
                                             start_index(i)   |  end_index(j)                 Total no. of sub arrays in which index 2 is present. 
                                       -----------------------|-------------------
                                                    0         |     {0,1,2,3,4,5}                              6
                                                                                                    ---------------------------------------
                                                                                                               6
                                                    so, 10 sub arrays which have index 4 is present. 
                                                    
                -     Finding Patterns:-                                  
                                                    
                                Ques:-  what all starting index are valid indexs for general value of k.
                                Ans :-  for general value of k, valid index are starting form 0 & ending at k. like, start(i)   --> {0,1,2,......,k}    // i means any starting index from o to k. 
                                        "If we do not start the sub arrray from any one of them (0 to k), if we start from anything after k then it will never have the index k".
                                
                                Ques:-  what all ending index are valid indexs for general value of k.  like end(j)   -->  {k, k+1, k+2,......, N-1}    // j measn any ending index from k to N-1.
                                Ans:-   we can not end before k. if we end before k then it will not be valid so 
                                        "atleast we have to end at {k, k+1, k+2,......, N-1}"

                                
                                
                                Summmary:-
                                        Starting index in the Range from [0 to k]
                                        Ending index in the Range from   [k to N-1]
                                        
                                        Ques:-  Do we know what is the number of elements from L to R in the Range.
                                        Ans :-  [L to R]    --> R-L+1 
                                        
                                Conclusion:-    (Total no. of Starting & Ending position that we have for general value of k) 
                                        Starting index [0 to k]     --> k-0+1       =   k+1
                                        Ending index   [k to N-1]   --> (N-1)-k+1     = N-k
                                            
                                            so k+1 is the total no. of starting position that we have.
                                            &  N-k is the total no. of ending position that we have.
                                            
                                Deriving Formula to find the no. of subarrays which will have index k:-
                                        Since, For All Start We Can Select Any End Therefore, Ans is (k+1) * (N-k)                  *********************MOST IMPORTANT***********************
                                            means, can we say "for every starting position, we can select any ending position & we will have index k".  
                                        
                                        Example:-
                                                N=6
                                                k=2 ==> (k+1) * (N-k)   ==> (2+1) * (6-2)   ==> 3*4 =   12
                                                k=4 ==> (k+1) * (N-k)   ==> (4+1) * (6-4)   ==> 5*2 =   10
                                                k=0 ==> (k+1) * (N-k)   ==> (0+1) * (6-0)   ==> 1*6 =   6
```
###  Find the sum of all sub array sums of the array.
``` 
        A = [8  6  5]                      O/p
             0  1  2        [8]             8
                            [8 6]           14  
                            [8 6 5]         19
                            [6]             6
                            [6 5]           11
                            [5]             5
                                    -----------------
                                            63
                                                
             Code:-
                    while finding sub array sum using carry forward we have done below code.      
                                                // if we are initialising any var here then we get the all sub array sum.   (optional:- tested below)
                            for (i --> 0 to N-1) 
                                sum = 0         // we are initialising here so we get the every sub array sum
                            for (j--> i to N-1)
                                sum += A[j]     // here, we are adding A[j] element at every step. so after every update in sum var, we get the sub array sum.
                                print(sum)      // here, we print sum inside j loop. 
                    
                    In the above code we just have to add ans var & initialised with 0 at before the start of starting index. & add the sum of sub array to the ans.
                       ans = 0                        //we are initialising ans var here then we get the all sub array sum.  
                            for (i --> 0 to N-1)      // starting element
                                sum = 0            // we are initialising here so we get the every sub array sum
                            for (j--> i to N-1)  // ending element
                                sum += A[j]     // here, we are adding A[j] element at every step. so after every update in sum var, we get the sub array sum.
                                ans+=sum       // here, we are finding the sum of sub array sum
                       return ans             // outside the j & i loop 
                                
                           TC = O(N^2)
                           SC = O(1)
                            
                    Incorrect thought :- if we do like this                                                     
                       ans = 0                                                                                  [8]
                            for (i --> 0 to N-1)    // travelling to every start                                [8 6]  
                            for (j--> i to N-1)     // travelling to every end                                  [8 6 5] 
                                ans+=A[j]   // here, we are just adding the last element of the sub array       [6]
                       return ans                                                                               [6 5]
                                                                                                                [5]
                        this code will not give correct output called sum of sub array sum.   
                          becoz we are just adding the last element of the sub array in the ans, we are not adding everything
                            like, we are just adding this in the ans 8+6+5+6+5+5= 34 
                            so it is giving wrong ans.
                            
                       What we was doing ?
                        "for every starting position & for every ending position we are just adding the last element 
                        of sub array in the ans".
                    
                    thought :- Why we are Adding the SUM into Ans inside the j loop. why not outside j loop.
                        when we discuss about printing the sub array sum (see it above). we were printing inside the j loop 
                        Becoz "everytime we add a value we get new sub array sum". so everytime we add A[j] then we get new 
                        sub array sum & that new sub array sum should be added into ans. So ans+=sum will be inside the j loop.
 ```
## Contribution Technique (General technique for all type of question)
**If any element of array/matrix etc. is contributing multiple times in the ans, then 
ans = Σ Contribution of all elements (we write like this majority times)** 

The Main idea of this technique is **If there is any situation, in which one element is being used multiple times in the ans, then 
for every element find the contribution & add to get the answer**
``` 
        A = [8  6  5]                      O/p
             0  1  2         8              8
                             8+6            14  
                             8+6+5          19                  ==> 8 is present three time in the ans. =   24
                             6              6                   ==> 6 is present four time in the ans.  =   24
                             6+5            11                  ==> 5 is present three time in the ans. =   15
                             5              5 
                                        ------------
                                             63 Ans             ==> 63 Ans that we got nothing but
                                        ------------                    (8*3) + (6*4) + (5*3)
                                                                        so element 8 is contributing 24 in the ans
                                                                           element 6 is contributing 24 in the ans 
                                                                           element 5 is contributing 15 in the ans  
                                                                        we add all of them & get the ans.   
                    Therefore, in any question where a Array || Matrix || List || anything like that is given 
                        & we can see by using small ex like array A & dry run. then see that if 1 element is contributing 
                        multiple times then We can use Contribution technique. || we can apply this technique.              ***************************
                    
                    Ques:- How to find Contribution of all elements || every element.   Finding Contribution is ques specific. it is not generic.
                    Ans :-
                            Example:-
                                A = [8  6  5]                    
                                     0  1  2 
                                     
                                     In this ques, if we can see that this is the contribution of 8 (8*3)
                                     Ques:- How will i know that this (8*3) is the contribution of 8. (8*3) is what ?
                                     Ans :- It is the element 8 multiplied by No. of sub arrays in which 8 is present. 
                                                "Contribution of element 8 is:- A[0] * number of sub arrays containing in which index 0 is present". 
                                                
                                                (only for this ques) Contribution is element * number of sub arrays in which element 8 is present.
                                                so the ans is
                                                           n-1
                                                    Ans =   Σ A[i] * no. of sub arrays in which A[i] || index i is present.
                                                           i=0
                                                          means, Submission for all the elements from i=0 to n-1, the element multiplied by 
                                                                    no. of sub arrays in which A[i] || index i is present. 
                                                                    like, how many times index 0 is contributing in the ans
                                                                                ||
                                                                          how many times A[0] is contributing in the ans
                                                    we know how to find no. of sub arrays in which index i is present. 
                                                            (k+1)*(N-k)
                                                    now the ans is
                                                           n-1
                                                    Ans =   Σ A[i] * (i+1)*(N-i)    // replaced k to i.  (Line 516)
                                                           i=0
                                                    means, for every index simply travel & do the above thing & get the ans. 
                                                      (this formula only works with sum of all sub array sum.
                                                            but this technique is used in most question.)
                    Code:-
                            ans = 0
                                for i --> 0 to (N-1)
                                    ans += A[i] * (i+1) * (N-i)     // ans += 8 * (0+1) * (3-0)   ==> ans += 8*3
                                print(ans) 
                        TC = O(N)
                        SC = o(1)                                 
```
### Find the Max Subarray sum with length = k
``` 
        A = [8  6  5  7  10  2]         k=3
             0  1  2  3  4   5
        
            {8 6 5}     = 19
            {6 5 7}     = 18
            {5 7 10}    = 22
            {7 10 2}    = 19
                
                Ans:-   22.

                Ques:-  What is the best TC & SC for this ques.
                Ans :-  
                
                        BruteForce Approach:-
                                    "For all sub arrays of length k, 
                                     Travel to calculate sum & 
                                     Keep track of Maximum".
                                     
                   How to Think ?
                    Step1:-   we have to first see "How many sub arrays will be there" so that we can calculate the sum of all the sub arrays & find 
                           the ans.
                              so, first we have to do step 1.
                                 
                                 -  if  we talk about starting index. Starting Indexes of sub arrays can be What ?
                                        we can Start sub array from index:- 0 1 2 3.
                                        if we start sub array from index 4 then it can't be length 3.
                                        if we start sub array from index 5 then it can't be length 3.
                                        
                                        so Starting Index of the Range = [0,3]
                                 
                                 -if we talk about Ending Index. Ending Indexes of sub arrays can be What ?
                                        we can End sub array at index:-  2 3 4 5.
                                        if we start sub array from 0 then end at index 2.
                                        if we start sub array from 1 then end at index 3.
                                        if we start sub array from 2 then end at index 4.
                                        if we start sub array from 3 then end at index 5.
                                            
                                            so, Ending Index of the Range = [2,5]
                                     
                              Now, if we know either the Range of Starting Indexes & Ending Indexes. We can find Total No. of Sub arrays.       *********************
                                    Range of Starting Index [0,3]  :-  [R-L+1] =   3-0+1    =   4
                                    Range of Ending Index   [2,5]  :-  [R-L+1] =   5-2+1    =   4  
                                    
                                        Total No. of Start & Total no. of End, do anything, becoz both of them will give Total No. of Sub arrays.
                                        so, either we can focus on Finding the Range of Starting Index or we can Focus on Ending Index. (any one of them we can do).
                                        
                                        
                                         lets, go with ending Index. 
                                            first, we find out Maximum Ending Index:-
                                                    Ques:- What is the value of Maximum index we can have ?
                                                    Ans :- it will be (N-1)
                                                           Means, a sub array can end at last index of the array.  
                                                           like,
                                                                 if we start sub array from index 3 then it will end at index 5. 
                                                                 
                                                    Ques:-  What is the Minimum value of Ending Index from where Ending Index can Start ?
                                                    Ans :-  If the starting index of sub array is 0. that time we will definately have minimum value of 
                                                            ending index. 
                                                            Now,
                                                                Ques:-  If we starting from 0 then till which index you will get K elements ? 
                                                                Ans :-  so, if we start from index 0, then till k-1  index we will get k elements.
                                                                            like, 
                                                                                start index =   0
                                                                                k = 3, so (k-1) = 2  
                                                                                therefor, the minmum ending index will be 2. & at index 2 we got k element.
                                                                                
                                                                        A[0],A[1],A[2],......,A[k-1] till here, these are the First kth elements.
                                                                        so the minimum ending will be k-1.   
                                                    
                                                    Result:-    End
                                                            ==> Max Index = (N-1) 
                                                            ==> Min Index = (K-1)                   
                                                                           
                                                            
                                        Now, we talk about Starting Index.
                                            first, we find out Minimum Starting Index:-
                                                    Ques:- What is the value of Minimum Starting Index we can have ?
                                                    Ans :- it will be 0.
                                                           Means, we can start from index 0.
                                                           
                                                    Ques:- What is the value of Maximum Starting Index we can have ?
                                                    Ans :- it will be N-k.      (me said, just refer line 408)
                                                             basically,
                                                                    A[N-k], A[N-k+1], A[N-k+2],....,A[N-1] these are last k elements.
                                                    
                                                    Result:-    Start
                                                            ==> Min Index = 0 
                                                            ==> Max Index = (N-K)

                              Now, no. of sub arrays of length = k. what will be the value ?
                                     Case1:-    Ending Index.
                                                min:- if we start from index A[0],A[1],A[2],......,A[k-1] means k elements         k-1  (Left)
                                                max:-  end at last index                                                           N-1  (Right)
                                                so,     (N-1) - (k-1) + 1   =    N-k+1
                                                                ||
                                     Case2:-    Starting Index.
                                                min:- starting index =  0           (Left)
                                                max:- ending index   =  (N-k)       (Right)
                                                so,     (N-k) - 0 + 1 =  N-k+1
                                     
                                     these are the total no. of sub arrays of length k is = N-k+1. this is the bruteforce way.
                    Bruteforce Code:-
                        
                            ans = integer.Min   // read about this. minimum integer value, it is -2^31 (means smallest value that int data type can store)
                            for i --> 0 to N-k  // starting index           Starting positions that we have
                              {  sum = 0
                                    for j --> i to (i+k-1)  // ending index going from i, so i+0, i+1, i+2 .... i+k-1. here, the complete length we have to travel                       {like for k --> 0 to k-1
                                        { sum += A[j] }                                                                                                                                       ending index will be  j = i + k. }
                                ans = max(ans, sum)         // max fun to calculate the max of ans var || sum var.
                              }
                            return ans. 
                            
                                Ques:-  Why we don't have written 0 here ans = (integer.Min)
                                Ans :-  No, becoz
                                        assume input like this.
                                           A = [-8  -6  -5  -7  -10  -2]         k=3
                                                 0   1   2   3   4    5  
                                                 if all the elements are negative, so every sub array sum become negative.
                                                 therefore if we initialise the ans var as 0. then it will never changes its value,
                                                            it will always remain 0 (whatever we can add in 0, it will be 0 only na). 
                                                            so we have to make ans var as int min,
                                
                                
                                Finding TC & SC.
                                    how many starting positions we have.:-      N-k+1 
                                    how many iteration that j loop having:-     k       // size of the sub array.
                                    so, 
                                        what is the TC
                            TC =    O((N-k+1)*k) =  O(N*k)      // Worst case TC
                            SC =    O(1)
                            
                                
                            
                                Myths:-
                                    not everytime seeing two loop is O(N^2) TC. so "We need to check what are the iteration going on".
                                    if k is 0. means length of the sub array is 0 (means no sub array). so if k=2. means we are looking for sub array length 2.
                                    so if k = N then we are looking at N size length  sub array.
                                        in that case we have only 1 sub array.
                                        so, its never be a O(N^2) 
                                            O((N-k+1)*k) =  O(N*k)
                                            O((N-N+1)*N) =  O(N)
                                            Therefore if k become bigger then this is ((N-k+1)) becoming smaller.
                                                      if k become smaller then this is ((N-k+1)) becoming bigger.
                                               TC =    O((N-k+1)*k) =  O(N*k)
                                                        this TC is in Worst case scanerio only. it can be less than that beocz (N-k+1) * k.
                                                            so ignoring small case k+1. we get N*k.
                                
                                
                                    this code is just iterating over all the sub array & calculating the maximum sum
                    Prefix Sum:-
                            Home work, we can solve this ques using prefix sum to reduce the TC.
                                here, skipped it. i have to solve it.
```
## Sliding Window
Sliding window is nothing but **a Subarray of Fixed Length**
``` 
        A = [8  6  5  7  10  2]         k=3
             0  1  2  3  4   5
   
           -    Just Shifting this window One step on the Right.  
                    like,
                                {8 6 5}     = 19
                                {6 5 7}     = 18
                                {5 7 10}    = 22
                                {7 10 2}    = 19
                                assume these are the window's.
                                we are just shifting the window from {8 6 5} to {6 5 7} One step on the Right.
           -    If we have the sum of length = 3, from index 0 to 2 like {8 6 5} & the sum is 19.
                    if we want to calculate the sum of this {6 5 7},
                    Then, Instead of Travelling everything can we do like this:-
                        "Total Sum + New Element that we have in the Window - the Element that we have removed from the Window = We Get the Ans" **************************************
                             19    +                     7                  -               8                                  =    18
                             {6 5 7} sum is 18.   
                    Ques:-  How it happened ?
                    Ans :-  we have Removed One window on the Right that Increases one Element in the window & Removes one element from the window.
                    Example:-
                            If we want to find the sum for this window {5 7 10}, then
                                here, we are including 10 in our window & removing 6 from our window.
                                18 + 10 - 6 = 22. 
                    Conclusion:-
                                "If we have the previous sum then we just have to add a element & remove a element".
           -    if we say "sub array is starting from index i then ending index of sub array is i+(3-1) means i+(k-1)             ************************Important**************
                      
                                   i      i+(3-1)                       // means,  starting index is 2 so ending index is 2+(3-1) =  2 to 4. this is actually that we want.
                        A = [8  6  5  7  10  2]         k=3
                             0  1  2  3  4   5  
                                                    Start = i
                                                    End   = i+(k-1)
                                                    so whenever we caluclating the ans of this sub array from this Start to this end 
                                                     i   i+(3-1)
                                                    {5 7 10}
                                                     OLD SUM + Array at the New Ending Position - Element which is Removed  =   Ans(this is the total of new sub array sum) ***********VERY IMPOTANT*************
                                                     old sum + A[i+k-1] - A[i-1]   =    Ans
           -    Code:-  
                        Step1:- we need to find the first sub array sum. 
                        
                        sum = 0 
                        for i --> 0 to (k-1)    // travel the first sub array   
                            {sum += A[i]}       // sum of first sub array                             
                        ans = sum               // now, ans is currently first sum.                                 
                        for i --> 1 to N-k      // for every new starting position that is from index 1 to last starting postion means (the last sub array starting index is, N-k like 6-3=3 so from index 4 sub array can't created)
                            {sum = sum + A[i+k-1] - A[i-1]  // update the value of sum. this is calculating the new sub array sum starting from index 1 to lenght k.
                             ans = max(ans, sum)}// finding max becoz we are finding maximum sub array sum.
                        return ans.
                        
                                first for loop is calculating the sum of first sub array of length k.
                                second for loop is calculating the other sub array sum using the previous sum.
                                
                        TC = O(N)
                        SC = O(1)
                        
                            Why O(N) ?
                                first for loop is iterating k times.
                                second for loop is iterating N-k times.
                                
                                total no. of iteration is = (k + N - k)
                                    so, O(N)
                                      








```