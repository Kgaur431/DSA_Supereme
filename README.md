# DSA_Supereme
#ASLI CODING 
## Array Module:- 1
1. it referred to as a collection of elements.
2. Most of the Data Structures (e.g.Stack and Queue) were derived using the Array structure.
3. The purpose of an Array is to group similar kinds of data for fast access.
4. Each data element is assigned a numerical value called the index, which corresponds to the position of that item in the array.
   4. 1 the value of the index is non-negative and always starts from zero 
5. In primitive array, values are stored in a contiguous memory location Whereas,
6. In the non-primitive array, objects are stored in the **heap segment**.
7. Arrays can store primitive data-type values (e.g., int, char, floats  etc.),non-primitive data-type values (e.g., Java Objects, etc.) or it can even hold **references of other arrays**

#### HOW ARRAY IS DEFFERENT FROM LINKED LIST
``` 
An index makes it possible to access the contents of the array directly.
 Otherwise, we would have to traverse through the whole array to access a single element. 
 That is the key feature that differentiates Arrays from Linked lists
```
####  Array Declaration
```
datatype[] arrayName; // preferred way
or
datatype arrayName[]; // works but not preferred way
```
#### Array Initialization
```
datatype[] arrayName = new datatype[arraySize];
   int[] arr = new int[5];
or
datatype[] arrayName = {value0, value1, ..., valuek}; // array literal syntax
```
#### How are arrays stored in memory?
```
In Java, arrays are dynamically allocated. Arrays are stored in the memory using a reference pointer, which points to the first element.
```
#### Drawbacks of Arrays
```
1. The size of the arrays is fixed: So we must know in advance how many elements are to be stored in the array. 
2. we have to specify the size of the array during the time of instantiation. That means the size remains fixed and can not be extended.
3. If we want to add more elements, we will have to create a new array, copy all the items from the old array to the new one, and then insert the new element.
``` 
#### Use cases of Arrays
```
   if we want to store marks of 10 students then instead of defining 10 variables, it's better to define an array.
     like int marks1, marks2, marks3,..........,marks7, marks8, marks9, marks10;
          int marks[10]; ==> means 10*4 = 40 bytes of memory will be allocated
```

``` 
   array -->   A=[1,2,3,4,5]
   index-->       0 1 2 3 4
   
    A[0] = 1, first element of array
    A[4] = 5, last element of array
   
   Indexing of the Array starts from 0 and ends at n-1, where n is the size of the array.
      like size of A is N = 10.
            A = [ 1, 2, 3,..........   9,   10]
         index--> 0  1  2  ........ (n-2), (n-1)
         
   In C++, Java if we do like this.
       A[-100]
       A[N+100] 
       A[N]
            ... this will throw an error called ArrayIndexOutOfBoundException
       
       Conclusion :- index should be in the range of 0 to N-1
```
### Whenever we are solving Array Question then we have to write the indexes along with the array. 

#### Problem 0:- Print all array elements
``` 
   void printArray(int arr[])
   {
       for (int i = 0; i < arr.length-1; i++)
          print(arr[i]);
   }
   
      TC = O(N)
      SC = O(1) // because we are not using any extra space, arr is an part of input.
```
#### Problem 1:- Given an integer array of size N, count the number of elements having at least 1 greater than itself.
``` 
   A= [-3,  -2,  6,  8,  4,  8,  5]
index=  0    1   2   3   4   5   6

    Observation:- 
         ask to ownself, do we have any element which is greater than -3 
                           yes, 
                         do we have any element which is greater than -2
                           yes, 6 is greater than -2 & -3.  
                         do we have any element which is greater than 6
                           yes, 8 is greater than 6. 
                         do we have any element which is greater than 8
                           no
                         do we have any element which is greater than 4
                           yes,
                         do we have any element which is greater than 8
                           no, we already checked.
                         do we have any element which is greater than 5
                           yes.
         Ans:- 5 elements 
                  all of these elements -3, -2, 6, 4, 5 have at least 1 other element in the array which is greater than the current element.   
                     like ==> 8 is the element which is greater than all of these elements.
                                 this means 8 is largest element in the array.
      Observation Conclusion:-
            "only for largest element there will not be any element greater then itself."
               so the final Ans is 
                           ANS = total elements - count the max element
                               = N - (count the max element)    
                                                            // if the max elements are repeated then we have to count multiple times.  
                                                                becoz in the question it is not mentioned that all elements are distinct.
                               
                               
            if we have unique elements then 
               ANS = N - 1 // becoz largest element will not have any element greater than itself & largest element only one.
            
            if A = [8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
               ANS = 0      
    
    Code :- as simple as that. 
            Step 1:- find the max element in the array
                        void maxElement(int arr[]) 
                           {
                              int max = arr[0];
                              for (int i = 1; i < arr.length-1; i++)
                                 {
                                    if (arr[i] > max  )
                                       max = arr[i];
                                 }
                              return max;
                           }   
                           
                                 ||
                        arr_max = arr[0];
                        for i--> 1 to (N-1)
                           arr_max = maths.max(arr_max, arr[i])
                           
            Step 2:- count the max element in the array 
                        void countMaxElement(int arr[], int max)
                           {
                              int count = 0;
                              for (int i = 0; i < arr.length-1; i++)
                                 {
                                    if (arr[i] == max)
                                       count++;
                                 }
                              return count;
                           }
            Step 3:- return the final Ans
                        int countGreaterElement(int arr[])
                           {
                              int max = maxElement(arr);
                              int count = countMaxElement(arr, max);
                              return arr.length - count;
                           }
                      
        
        TC = O(N + N)  
        SC = O(1) // because we are not using any extra space, arr is an part of input. 
                     the count, max variables are fixed in size like 4 bytes. so it is constant space.      ******************     
                     
                     
  Task :- Try the code in single for loop iteration. 
               arr=[1 2 2 6 4 5 5 7]
               arr_max = arr[0]; 7
               count = 0; 1
            for(int i = 1; i < n-1; i++)
            {
               if(arr[i] > arr_max)
                  {
                     count = 0;
                     arr_max = arr[i];
                     count ++;
                  }
                 if(i != N-1)
                 {
                     if(arr_max == arr[i+1])
                     {
                        count ++;
                        i++
                     }
                 }
            }                                
```

#### Learning 1 :- Given an integer array of size N & an integer K. check if there exists a pair of index (i,j) such that A[i] + A[j] = K, i != j.
``` 
   A= [3  -2  1  4  3  6  8]        K = 10
index  0  1   2  3  4  5  6

conditions:-
         A[i] + A[j] = k
          i != j              // means index should not be same. but value can be same.
          
          like :- 
               A= [2  4  -3  7]        K = 5
                  false
               A= [2  4 -3  7]        K = 8
                   false (true like A[1] + A[1] = 8 ) ==> wrong becoz i != j
                   
               A= [2  3  8  5  3]        K = 6
                     true (A[1] + A[4] = 6) ==> correct becoz i != j
                     
      How to think ?
         first, what we try to return from a func that we will create (like ques is not asking to return count or anything so it should not be int
                                                                           `ques is asking to check means it should be boolean)
            A[3] + A[5] = 4 + 6 = 10
               true              
      What is simple way to solve any question ?
         Bruteforce Approach (very basic solution)
            What is Bruteforce Approach?
               bruteforce means try all the possible solutions that we have & check which one is correct.
                     means don't care about TC & SC. just focus on the correctness. like code should be work.
                     so trying out every possibility & getting the output.
                
      Brueforce approach for the above problem:-
         A= [3  -2  1  4  3  6  8]        K = 10
            Ans:- "for all i,j pair check if A[i] + A[j] = K, & i != j"  // checking each & every pair.
              
            Code :- 
                  boolean sumPair(int A[], int K)
                     {
                        for (int i = 0; i < A.length-1; i++)
                           {
                              for (int j = 0; j < A.length; j++)
                                 {
                                    if (A[i] + A[j] == K && i != j)
                                       return true;
                                 }
                           }
                        return false;
                     }
              TC = O(N^2)
              SC = O(1)
      
         Observation:- 
                 1. take small array & try to observe it.
                     (A[4],k) 
                     index = 0 1  2  3
                 
                 2. we are tyring to compare each & every pair of the arry. 
                       so, we will preprare an matrix of the array  & try to observe it.
                           

                       3  (3,0) (3,1) (3,2) (3,3)
                       2  (2,0) (2,1) (2,2) (2,3)
           i           1  (1,0) (1,1) (1,2) (1,3)
                       0  (0,0) (0,1) (0,2) (0,3)
                           0      1      2    3 
                              
                                 j 
                       currently we are checking each & every pair of the array. 
                           like if we have 4 elements then we are checking 4*4 = 16 pairs.    
                  
                 3. observe:- if we somehow shorter the number of pair we check.
                        observation 1:- if we have condition i != j then we will not check the diagonal elements of the matrix.
                        observation 2:- A[0] + A[1] = A[1] + A[0] ==> we are checking the same pair twice. 
                                          becoz there is no difference in the ans.
                                          so, we will check either lower triangular matrix or upper triangular matrix.   
                                               for that we have to find the elements eiter for lower triangular matrix or upper triangular matrix. 
                                                   like:- 
                                                         lower triangular matrix: (i,j) where i < j
                                                         upper triangular matrix: (i,j) where i > j
                                          therefore only check either (i>j) or (i<j) pair. & not required for (i==j) pair. becoz it will never be equal.                
                           END. 
                 4. result of observation we reduce the no. of iteration. 
                        like if we have 4 elements then we are checking 4*4 = 16 pairs. 
                        but after observation we are checking only 6 pairs. 
                        
           Code:-  suppose we choose (i>j)
                           // go through the above matrix & check the condition where i > j.
                     so, j loop will run till i-1. 
                         i loop will start from 1 becoz if i = 0 then j = -1. so, j loop will not run.
           
               boolean sumPair(int A[], int K)
                     {
                        for (int i = 1; i < A.length-1; i++)
                           {
                              for (int j = 0; j < (i-1); j++)
                                 {
                                    if (A[i] + A[j] == K )
                                       return true;
                                 }
                           }
                        return false;
                     }
                  
                  TC = O(N^2)
                  SC = O(1)
                  Conclusion:- 
                      we take the input size 4 & we reduce the no. of iteration from 16 to 6. this is good optimisation but Tc is still O(N^2).
                        in case of larger input (big O deals with larger input) the no. of steps that we optimise that is insignificant. (means it is not matter)
                                    
                      so This question is to understand that "we see question & make some observation. we will make optimisation
                         but it will not alway true that whatever optimisation we make that will reduce the TC & SC." 
                           so by the TC & SC both the code is exactly same.  
                            
```
### The main purpose of Optimisation is to reduce the TC & SC.
``` 
      so we have optimised the no. of iteration but not reduce the TC & SC.
         Summary :- 
                     sometimes we may optimise the code logically. but TC & SC may not be reduced.
```

#### Problem 1:- Reverse the given integer array. in SC = O(1). (means modify the input array)
``` 
   A= [-1  4  7  6  -2  7  8  10]
index=  0  1  2  3   4  5  6  7

   A= [10  8  7  -2  6  7  4  -1] 
   
      Observation:- 
            1. we have to swap the elements. first with last, second with second last & so on.
                  like:- (A[0],A[7])
                         (A[1],A[6])
                         (A[2],A[5])
                         (A[3],A[4])
                              stop. 
                  means we have put i at 0 & j at 7. 
                        swapping i & j. 
                        i is moving on right side. means increasing the index of i. 
                        j is moving on left side.  means decreasing the index of j.
                           
                          (A[3],A[4]) this is the last index where we swqp the elements.
                              so, we if we do like this " keep on increasing the index of i & keep on decreasing the index of j. 
                                 what will happen?
                                    if we again swap (A[3],A[4]), (A[2],A[5]) ... so on then we will get the original array.
                                    therefore we have to swap the elements till i < j.
                           we have to swap the elements till i < j.
               
               Code:-
                     void reverse(int A[])
                        {
                           int i = 0;
                           int j = A.length-1;
                           while (i < j)
                              {
                                 int temp = A[i];
                                 A[i] = A[j];
                                 A[j] = temp;
                                 i++;
                                 j--;
                              }
                        }
                        
                     TC = O(N)
                     SC = O (1)
                                 return type will be void becoz we are modifying the input array. so from where the fun called there only we can check whether the array is reversed or not.
```
### **Arrays are always pass by reference**
``` 
   pass by value:- 
             passing the int or char ... is pass by value. means we are creating a new copy of the value which is passed to the fun.   
               so if we modify the new copy of the value then it will not be modified in the main.
   pass by reference:-
              for array like data structure the same array is passed to the fun. 
                so if we modify the array in the fun then it will be modified in the main also.
```

#### Problem 2:- Given an integer array of size N & an integer K. rotate the array from last to first (forward) by K times. in SC = O(1). (means modify the input array)
```
    A= [-1  4  7  6  -2  7  8  10]
index=   0  1  2  3   4  5  6  7

   k      A= [-1  4  7  6  -2  7  8  10]
   1 -->     [10 -1  4  7   6 -2  7   8]
   2 -->     [ 8 10 -1  4   7  6 -2   7]
   3 -->     [ 7  8 10 -1   4  7  6  -2]
   
   
            
      Observations:- 
            1. take small input array & rotate it by 1,2,3 times. 
                  like:- 
                     K=0   A= [-1  4  7  6]
                       1      [ 6 -1  4  7]
                       2      [ 7  6 -1  4]
                       3      [ 4  7  6 -1]
                       4      [-1  4  7  6]  // after 4 times it will be same as original array. 
                       
                                                           
                       
                   whatever the value of k is. like 5 ,6 ... the ans will be in the range of 0 to 3.   
                        means, k=5 that is equal to k=1. 
                              k=6 that is equal to k=2, k=10 that is equal to k=2.
                              k=7 that is equal to k=3. 
                              k=8 that is equal to k=0.
                              ...
                              
       observation 1:-    
                     if(k >= N) 
                        k = k % N;        ***************
                     if(k < N) 
                           not required. becoz k will be in the range of 0 to 3.         
                       
                        Example:-
                             A[10] --> A0  A1  A2  A3  A4  A5  A6  A7  A8  A9
                             
                               k=4 --> A6  A7  A8  A9  A0  A1  A2  A3  A4  A5     
                                    think like:- 
                                          "whatever the last  elements that will come first & whatever the first  elements that will come last."
                                            today, we read about reverse the array that will help us to solve this problem.
                                                   we read about swapping the element but here we want to move multiple elements from last to first or first to last.
                                                      swap just 2 elements. so its not helpfull.
                                                      
                                             suppose we don't know how to solve this question but 
                                              based on this observation we can say that "reverse will help us" 
                                                may be reverse will not work, we don't know 
                                                   "reverse means move the first elements to last & last elements to the first,
                                                    rotate array also move the first elements to last & last elements to the first. 
                                                      but the order is diff in both the cases. 
                                                      the ans is not going to be same as reverse the array.
                                                      
                                                      BUT THE IDEA CAN BE SIMILAR" 
                                                      
                               index   --> 0   1   2   3   4   5   6   7   8   9
                               Reverse --> A9  A8  A7  A6  A5  A4  A3  A2  A1  A0
                               
                               k=4     --> A6  A7  A8  A9  A0  A1  A2  A3  A4  A5
                                       now, by looking K=4 & reverse the array
                                       
                               carefully observed:-
                                             - we got to know after reversing 
                                             - In the elements of k=4
                                                the first four elemets are the reverse of the first four elements of the reverse array.
                                                the remaining elements are the reverse of the remaining elements of the reverse array.
                                             
                                                - so, we can say that "reverse the array & then reverse the first k elements & then reverse the remaining elements." *************************s
                               
                                 Psudo code:-
                                          reverse(A, 0, N-1)
                                          reverse(A, 0, K-1)
                                          reverse(A, k, N-1)     
                                 
                                 TC = O(N)
                                 SC = O(1)
                                           // we can have multiple approach to solve this problem. but we can't reduce the TC from N to any. 
                                                becoz we are modifing each & every index of the array.                
                       
```  
********************************************************************************************************************************************************************************************************************************

## Array Module:- 2
# Prefix Sum

#### Problem 1:- Given an array of size N. find the sum of elements from index L to R.
``` 
     A=[-6  3  2  4  5  -2  1  9]            L=1, R=4
  index  0  1  2  3  4  5  6  7

        sum = 3 + 2 + 4 + 5 = 14
        
        Code:- 
                int sum = 0;
                for(int i = L; i <= R; i++)
                     sum += A[i];
                     
                TC = O(N)
                SC = O(1)
```  
### Queries:-
``` 
   Ques:- What is the term mean queries ?
   Ans:- Queries means "same set of task done multiple times".
   Like:-   
          means for the same input array, if we ask you to calculate the sum of elements from index L to R for different different L & R. 
 ```  

##### Problem 2:- Find sum of elements from index L to R for multiple queries.
```
     A=[-6  3  2  4  5  -2  1  9]            L= [1 3  0]       Total queries is Q.
  index  0  1  2  3  4  5  6  7              R= [4 6  5]
  
   for Q=1, L=1, R=4                      for Q=2, L=3, R=6                   for Q=3, L=0, R=5
        sum = 3 + 2 + 4 + 5 = 14                sum = 4 + 5 + (-2) + 1 = 8          sum = -6 + 3 + 2 + 4 + 5 + (-2) = 6
        
    - for every query we will traverse the array & get the sum.
         Bruteforce Approach:- 
                          TC = O(N * Q) // means, we have Q no. of queries & for every query we are traversing linear time.
                          SC = O(1)
       - Statement:- 
                if we are doing a task once then its ok to do it in linear time. (line 459)
                   but if we are doing the same task multiple times then there has to be way to do it in better way. logically.
                   
           -Real Life Scanerio:-
                        = suppose, we are going office from our home daily by walk & it takes 1 hour to reach office.
                           but we don't want to walk for 1 hour & go office then we will definately find the alterante way to reach office.
                           like:- we will take a bike or car or bus or train. (means we pay certain cost but it will reduce the time)
                           if we go office from our home, once. then its ok to go by walk.    
           - so there should be a way to optimise the things. what is that way ?
                  for that we discuss another case study.
                        = Case Study:- 
                                 In Cricket, every over we can score some runs. 
                                    team :- Kartik
                                    over:- 10
                                                initially score is 0 & scoreboard is keep on updating after every over. 
                                    Over  :-    1   2  3  4  5  6  7  8  9  10
                                  Scoreboard:-0 16 22 30 45 51 70 75 90 104 120   
                                  
                                          Runs 51 means, run after 5th over is completed. 
                                          Runs 75 means, run after 7th over is completed. || total run after 7th over is completed.
                                          
                                          = Ques1:- what is the socre of 10th over alone ?            |
                                            Ans:-   score after 9th over complete= 104                |
                                                    score after 10th over complete= 120               |
                                                    score of 10th over alone = 120 - 104 = 16         |
                                                                                                      |
                                          = Ques2:- what is the score of Last 6 over ?                |
                                            Ans:-   last 6 over means, 5th over to 10th over.         |
                                                    score before 5th over = 45                        |
                                                    score after 10th over complete= 120             TC = O(1) per query.               
                                                    score of last 6 over = 120 - 45 = 75              |
                                                                                                      |
                                          = Ques3:- what is the score from 4th to 7th over ?          |
                                            Ans:-   score before 4th over = 30                        |    
                                                    score after 7th over complete= 75                 |
                                                    score of 4th to 7th over = 75 - 30 = 45           |
                                                                                                      
                                                   - we are doing the same task like above 
                                                         TC = O(1) per query. becoz just subtracting the two values.
           :- what is the diff bw this input & above input is not allowing us to do in constant time.
                  in the above input we are giving each & every element seprately.
                  but in the below input  we are giving cumulative input.
                        cumulative input :-
                                        we are giving the input in such a way that we can calculate the sum of any range in constant time.
                                        ********what is the way to give input in such a way ?
                                                      - we will give the input in such a way that each element is the sum of all the elements before it.********
                                                -
                                            like:-  0 16 22 30 45 51 70 75 90 104 120
                                                      runs = 30 
                                                        means, the score 30 does not imply that the run scored in the 3rd over.
                                                        it implies that the run scored till 3rd over. (from starting till 3rd over) 
      
                                                    "Scoreboard[i] is runs scored from first to i th over."
                                                       socreboar[i] means, scoreboard till i over. & total score from starting till i th over.
                        
                        In this array we try to do the same. 
                               L                        R
                             A=[-6  3  2  4  5  -2  1  9]            
                          index  0  1  2  3  4  5  6  7    
                           
                          we have to create an array which stores the sum of all the elements from the first to i th index. like below    
                             Prefix Sum:-   -->                                                                                   *********************************************                         
                                       "prefix means from start till any index in the middle"
                              prefixSum= [-6            ]
                               means P[i] = sum of elements from 0 to i th index.
                                            how we can calculate ?
                                               like:- 
                                                   - if there is only 1 element in the array 
                                                         P[0] = A[0] is -6. means from start till that element will be that element only.
                                                   - if there are 2 elements in the array
                                                         P[1] = A[0] + A[1] = -6 + 3 = -3. means from start till that element will be sum of both the elements. 
                                                      ... so on 
                                                   
                                            actual:-
                                                 find P[i] & we already idea about P[i-1]          // P[i] means prefix sum of i th index.
                                                   means if we know the sum of elements from 0 to till any index i.
                                                  
                                                  Example:- find P[i], index i = 1; 
                                                            index i-1 = 0; means we already know the sum of elements till 0th index.  
                                                            so, P[i] = P[i-1] + A[i] = -6 + 3 = -3. 
                                                            
                                                            find P[i], index i = 4;    assume P[3] is x. 
                                                            so, P[i] = P[i-1] + A[i] = x + A[i] = x + 5. 
                                            Formula:-  to find prefix sum
                                                      P[i] = P[i-1] + A[i]                                                                              
```                                                            
``` 
               We are try to implement the cricet scoreboard concept in the code. to reduce the TC. 
                      A=[-6  3  2  4  5  -2  1  9]                                                    L= [1 3  0] 
                      P=[-6 -3 -1  3  8   6  7 16]  // this is score board for the above array A.     R= [4 6  5]
                                                   // means P[i] = sum of elements from 0 to i th index.
                        Q1= [1 4]  //  we are finding the sum till the 4th index. & before 1st index.
                                         assume, run scored from first to 4th over means run scored after 4th over - run scored before 1st over. (we are subtracting becoz till 4th index we have the sum of all the elements before 4th index)
                                            means, P[4] - P[1-1] = 8 - (-6) = 14.
                        Q2= [3 6]  ==> P[6] - P[3-1] = 7 - (-1) = 8.
                      
                           suppose, by given prefix sum if i have to find the 7 element (means what is the last element of array A given the prefix sum)
                                       like what was the score of 10th over.
                                    means, A[i] = P[i] - P[i-1] = 16 - 7 = 9.
                        Q3= [0 5] ==> P[5] = 8. 
                                             we don't have to subtract anything becoz we want from starting to 5th index. 
        TC = O(1) per query.
                        scanerio:- we are going to office initially it took 1 hour but by taking new bike the time reduced but we paid some cost to buy a bike.
                                       here, the cost is Prefix Sum(calculating prefix sum take some time & space).
                                       so, 
                                          TC = O(N) to calculate the prefix sum.
                                          SC = O(N) to store the prefix sum.
        Code:- to find Prefix Sum.
                  P[0] = A[0];            // line 551
                  for (int i = 1; i < n-1; i++) {
                      P[i] = P[i-1] + A[i];
                  }
                        TC = O(N) 
                        SC = O(N) // becoz we are creating P array to store the prefix sum. that is size of N. & Prefix Sum is neither part of input nor output.
                                          this space has taken by the algorithm to do the task. so, it is part of the algorithm.
        Code:- for every query.  || finding the sum of any range from L to R.  
               for i = 0 to q-1;
                  l = L[i];                              // L[i] to R[i] means this is one query. so we have to find the sum from L[i] to R[i].        
                  r = R[i];                             
                  if (l == 0) {                          // if l is 0 means we have to find the sum from starting to r th index.  liek Q3.
                      ans = P[r];                        // P[r] is the sum of elements from starting to r th index. 
                  } else {
                      ans = P[r] - P[l-1];               // P[r] is the sum of elements from starting to r th index. 
                  }                                      // P[l-1] becoz we have to find the sum from l-1 th index to r th index.  
                  
                     TC = O(1) per query. || TC = O(Q) for all the queries. every query takes constant time.
                        SC = O(1) // becoz we are not creating any new array to store the sum. we are just creating a variable to store the sum.
                                  
          Total:- 
                TC = O(N) + O(Q) = O(N+Q) 
                SC = O(N) + O(1) = O(N)                                 
                                          
           Approach:-
                  Bruteforce                                         Prefix Sum
                  TC = O(N*Q)                                         TC = O(N+Q)
                  SC = O(1)                                           SC = O(N)                               
```
### **whatever fun we write the Higher Order term will dominate so whichever is bigger N or Q will dominate so, either we have to write max(N,Q) or (N+Q).**
``` 
   Reducing the SC of Prefix Sum.
            Case Study:- 
                  we are going office daily & it took 1 hour to reach office. so we purchased bike but we have to pay some cost to buy a bike.
                       now we don't want to pay any cost to buy a bike or by public transport. so, we have to find some other way to reach office.
                        "we will move our house near to office." means we are moving the starting point.
                  we are modifing the input array A. || making array A directly to Prefix Sum P. || instead of creating new array we are make array A as Prefix Sum array P.`
                     so if we modify the array A then it will take some cost (not talk about TC & SC). WE ARE LOSSING THE ORIGINAL ARRAY A.  
                           sometimes input is not important for us but sometimes we can't modify the given input so  "depending on the problem it will mentioned that we can modify the input or not."********* Modify the input is an Situational dependant. ********************************
                           like if someone live in Pg who can shif to near office but someone who live in own house can't shift to near office.
            How do we Modify the input array ?
                    A=[-6  3  2  4  5  -2  1  9]  // original array A.
                          modify the array A like:-
                                                 A[i] = SUM OF ELEMENTS FROM START TILL i th INDEX. 
                                                   A[0] = -6; //it will be same.
                           Formula:-               A[i] = A[i-1] + A[i];             to update input array.
                                    A= [-6 -3 -1  3  8   6  7 16]  
                           Code:- 
                                 for (int i = 1; i < n-1; i++)       // this will convert the array A like prefix sum array P.
                                 {
                                     A[i] = A[i-1] + A[i];
                                 }                  
                                     TC = O(N)
                                     SC = O(1)
   
   All Approaches:-
            Bruteforce                                         Prefix Sum                       Modify Input
               TC = O(N*Q)       --->                              TC = O(N+Q)     --->               TC = O(N+Q)
               SC = O(1)         --->                              SC = O(N)       --->               SC = O(1)         
```
### **Prefix Sum means Left to Right. & Suffix Sum means Right to Left** 
``` 
        L                        R
      A=[-6  3  2  4  5  -2  1  9]
index=    0  1  2  3  4   5  6  7      <---
Suffix= [                       9]  // SUFFIX SUM ARRAY.
         S[i] = SUM OF ELEMENTS FROM i th INDEX TILL END.
                  Last index will be same.
                     Suffix= [16 22 19  17 13 8 10 9]  // SUFFIX SUM ARRAY.
                        S[i] = S[i+1] + A[i];   
```