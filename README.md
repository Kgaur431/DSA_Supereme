# DSA_Supereme
#ASLI CODING 
## Array
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
                                 & if we do again sqqaklllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll tgeb 
                                 
                           we have to swap the elements till i < j.