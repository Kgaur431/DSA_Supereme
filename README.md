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
                                                                                         // calculating the prefix sum 
                                                            for (i --> 0 to N-1)        // i is the starting index. 
                                                            for (j--> i to N-1)        // j is the ending index. everything inside the ending index.
                                                                if( i == 0)
                                                                    print(P[j]);
                                                                else 
                                                                    print(P[j]-P[i-1]);
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
                            2.2 Carry Forward Technique.         
                                    -   we have every starting & ending position 










```