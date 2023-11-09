## Sorting
``` 
    Ques:-  What is Sorting ?
    Ans :-  "Ordered arrangement of objects".
            Ex:-
                We are in library where all books are kept randomly.
                -   arranging books in library is also a sorting.
                        books can be arrange in alphabetic order.
                        books can be arrange in based on the topics, like all maths books placed together, all history books placed together and so on.
                        
                        so, they can be arranged in any order but as long as we aware of it then we can find it.
                
                see more examples in the pdf.

```
### Ordering
```
    Data = [-5, 10, 2, 3, 0, 1]
    
    Increasing Order:-  Ascending Order for Non-Duplicates.
        we arrange data in the Increasing order.
            [-5, 0, 1, 2, 3, 10]
        
        *   "Increasing order means, where A[i] < A[i+1] for all the elements".     means current element will be smaller then the next element.  
            as long as its increasing then it's good. see img 1.
    
    Decreasing Order:-  Descending Order for Duplicates.
        we arrange data in the Decreasing order.
            [10, 3, 2, 1, 0, -5]
        *   "Decreasing order means, where A[i] > A[i+1] for all the elements".     means current element will be greater then the next element.  
            as long as its decreasing then it's good. see img 2.
            
    Equality Order:-
        [-5, 10, 2, -5, 3, 2, -5, 10]
            this time we don't have increasing or decreasing order.
            Ascending Order for Duplicates. 
            Non-Decreasing :-   [-5, -5, -5, 2, 2, 3, 10, 10]   
                                it means, where A[i] <= A[i+1] for all the elements".
                                this is something we called as Ascending Order.
                                sometimes it is constant for a while & somethime it is increasing
            
            Descending Order for Non-Duplicates.                  
            Non-Increasing:-    [10, 10, 3, 2, 2, -5, -5, -5]
                                it means, where A[i] >= A[i+1] for all the elements".
                                this is something we called as Decending Order.
                                sometimes it is constant for a while & somethime it is deccreasing. see in pdf.
```
### Order in String
```
    Alphabetic Order / Lexicographical Order :-
        "The order in which dictionary was arranged".
        Eg:-
            -   we have lower case:-
                happy, sad. 
                Ques:-  Which one is smaller than which one ? 
                Ans :-  happy < sad. 
                        happy is coming before sad in the dictonary.
                        
                        sucess > save.  
                        save is smaller than sucess. becoz 
                        becoz s & s are same, the diff char are u & a, becoz we know u > a so sucess > save.

            -   [dog, bat, apple, rubber]       ==>     [apple, bat, dog, rubber]
                    a is smaller so it come first. then b is the smaller one so it come second and so on.
                    
                    Extra Scanerio:-    
                        cool & cooler 
                            In cool we have 4 char & cooler we have 6 char, after comparing till l we don't have any char in cool but we have char er in the cooler so how to descide 
                            which is smaller than other.
                            In dictonary, cool comes before the cooler.
                            "If entire prefix is matching (cool & cool er) then the word which has more char like er have more priority".
                            so, 
                                empty || null is always smaller then any char.
                                null < e.
                        
                        apple & Apple.
                            apple > Apple, becoz small char has higher ASCII value compare to Upper case char.    see in pdf.
```
### Problem0:- Sort the strings based on length. (Ascending Order --> Default)
``` 
    S = [apple, dog, bat, scaler, kite, gold]       Ans = [dog, bat, kite, gold, apple, scaler]
    
        Ques:-  What we will do in Equal char ? 
        Ans :-  if its defined based on length. 
                In our mind, if length is same then we can consider Alphabetic order.       *******Not assuem*******







```
## **As long as nothing mentioned, we should not assume** that is most important part in programming.

### Problem0:-  Sort the integers based on absolute value.  (Ascending Order --> Default)
``` 

     Absolute value:-
     
               -----> x, if x >= 0  
            |x| 
               -----> -x, if x <= 0
               
            means,
                |10|  = 10
                |-10| = 10
                
            Like:-                  [-10, 6, 2, -6, -8, 1, 8]
            Absolute values:-         10, 6, 2, 6,   8, 1, 8            // Absolute value means, multibly the number with -1 if the number is negative.
            
            we have to arrange the input data not absolute value.
            Ans:-   [1 2 6 -6 -8 8  -10]
            
            Ques:-  What should I do when two value are same like, 6 & -6, 8 & -8     ==> absolute values.
            Ans :-  here term comes Stability.
            
            Stability:-
                Stability says "If two things are equal order, equal priority then don't change the location".
                   in terms of arranging the order stability simply means, 
                    "If X1 is before X2 & X1 = X2 then In sorted order also X1 should be before X2".
                    
                    "When we create our own Sorting Algorithm (while solving any problem) then we have to take care of stability". If we use Sorting Algorithm then they will take care stablity. 
                    
                    like:-
                        6 & 6, 8 & 8 both are equal elements (in Absolute values) then we should not change the order in which they are present in input array.  
                            6 is before -6 in input array, -8 is before 8 in input array.
                     index:-1     <     3                   4      <    6                // here the index are also smaller like -8 will come first 8. becoz index of -8 is smaller then index of 8 in input. 
                        Ans:-   [1 2 6 -6 -8 8  -10]
                        
                        dog & bat these are present in the input array, that same order we have followed in the ans as well becoz both have same length.
                        
                In general, if we deal with arrays then we have to figure out how to make anything stable then, 
                    simply "Compare index for equal element in the array". means index can not be equal of array.     
                    -   we can't sort the index in descending order. like dog is before bat so dog will always before bat even in ascending, descending order.
                            so when we compare index then index should not be descending order.
                            we can know that which element should be on left & which element should be on right based on index.
```
### Sorting a Collection:-
``` 
    Java:-
        In Java, there are Arraylist, list || something like:-  ArrayList <Integer> A;
            if we want to sort a list then there is a in-built function called Collections.sort(A)      // Data will get automatically sorted.
            sort fun will sort the data in Ascending order. it will take care of stability. means "we can't change the order of equal elements in real life".
            
```
### Problem 1:- Given an Integer array A, Find Min Cost of removing all elements from the array. where cost of removing any element A[i] is sum of all elements present in the array before removing A[i].
```
     A = [2 4 1]
          0 1 2
        :-  its depends on in which order we remove.
        
            -   let say we select 2 is remove first. 
                    Removed Element:-
                        2 --> 2 + 4 + 1.    =   7          // the cost of removing 2 is 2 + 4 + 1. now we have only 4 & 1 in the array.
                        4 --> 4 + 1         =   5                    ....
                        1 --> 1             =   1                    ....
                      ---------------------------------
                                                13
                      ---------------------------------
                                                
            -   we have changed the order in which we remove. Now we first remove 4.
                    Removed Element:-
                        4 --> 2 + 4 + 1      =   7
                        2 --> 2 + 1          =   3
                        1 -->  1             =   1
                      ---------------------------------
                                                11
                      ---------------------------------
            
            Ans = 11        becoz we have to find the min cost.
            so Among all possible orders in which we can remove, we have to select the order in which has min cost.  
     
     A = [3 5 2]
        
         "See all the possible order in which we can remove".       see img 3.        
     Ans = 17.
     
     If we find every possible order (img 3) & then find the cost. 
     Observation:-
                "We should start removing from the Largest element".
                
                Ques:-  Why we should first remove largest element ?
                Ans :-  
                
                        let say, if we have 4 elements like:-   a b c d (these are any integers)
                                                        Remove              Cost
                        if we remove first element       a                  a + b + c + d   // the cost will all the elements in the array.
                        if we remove element             b                  b + c + d       // the cost will remaing elements in the array.
                        if we remove element             c                  c + d           // the cost will remaing elements in the array.
                        if we remove element             d                  d              // the cost will be only d.
                                                   -----------------------------------------------
                                                                   1*a + 2*b + 3*c + 4d     // if we add these 
                        
                        Imp:-
                                "The element which we are removing first (1*a) is having less weight compare to the element (4*d) which we are removing last"
                                
                                so, In order to minimise "we should select 'a' to be the Largest & 'd' to be the smallest". see img 4.
                                
                                There are one more observation:-
                                            if we see the indexes 0 1 2 3. 
                                            let say we have arranged in the Descending order.
                                            The Contribution of elements is :-
                                              (index 0)  1 * a 
                                              (index 1)  2 * b 
                                              (index 2)  3 * c 
                                              (index 3)  4 * d 
                                              .
                                              .
                                              .
                                              (index N-1) A[i] * (i+1)          // element present at ith index contribution. 
                                              
                                              
                        
                Code:-
                        Step1:- Sort the array in Descending order.        // sort the data
                        Step2:- We have to calculate the ans.             // here, data is in descending order that means a is larger compare to b & b is larger compare to c and so on. 
                                
                                ans = 0;
                                for i --> 0 to N-1
                                    ans = A[i]  * (i+1)                
                                return ans;
                                
                                we can solve this question using prefix sum, suffix sum || other technique but this is the easiest way. 
```
### Problem2:-  Given an array of size N, Count the number of **Noble Integers** present.
1.  **Noble Integers**:- Any element A[i] is noble iff number of elements less than A[i] is equal to A[i].

```
    A = [1, -5, 3, 5, 5, -10, 4]
         0   1  2  3  4   5   6
         
         In this array, we have to see 'number of elements less than A[i]' that will decide wether the current element is noble or not.
         
         Counting for all the elements:-
            -   How many elements are less than 1 in array  ==>       2
            -   How many elements are less than -5 in array  ==>      1
            -   How many elements are less than 3 in array  ==>       3
            -   How many elements are less than 5 in array  ==>       5
            -   How many elements are less than 5 in array  ==>       5
            -   How many elements are less than -10 in array  ==>     0
            -   How many elements are less than 4 in array  ==>       4
            
         if the number is equal to A[i] then that number is Noble number. 
         these are the Noble Integers:-
                A[i]    ==>     Count
                 3                3
                 5                5
                 5                5
                 4                4
            ---------------------------
                           Ans = 4          // count of Noble integers.
                           
         
         Observations:- 
            -   Can -ve number be noble Integer ?   
                    No, becoz we are comparing the value with the count of number & count of numbers are the positive data (>= 0). 
                       A[i] --> count of integers.          // so we ignore the negative elements. means negatvie number will never be part of the ans.
            
            -   Distinct Element:-   
                        A = [10 1 3 -5 4 -10 5]
                        
                        Think:-
                            -   we can sort in ascending order.
                            -   we can compare with index i.
                        
                        Step1:- Sort in Ascending order.
                                [-10 -5 1 3 4 5 10]
                                  0   1 2 3 4 5  6
                        Step2:- Count the number of elements which is less than A[i]
                                How many elements are less than -10 in array    ==>     0
                                How many elements are less than -5 in array    ==>      1
                                How many elements are less than 1 in array    ==>       2
                                How many elements are less than 3 in array    ==>       3
                                How many elements are less than 4 in array    ==>       4
                                How many elements are less than 5 in array    ==>       5
                                How many elements are less than 10 in array    ==>      6
                                
                                if we see the count "it is nothing but the index".
                                so,
                                    "All the elements where value is equal to index" for those pairs we have to look at. 
                                
                        Code:-
                                1.  Sort in Ascending order.                                    //Sort in Descending order
                                2.  ans = 0;
                                    for i --> 0 to (N-1)        
                                        if (A[i] == i)                                          // if(A[i] == N-1)  
                                            ans += 1
                                    return ans;                 here Index are not play an important role
            
            -   Non-Distinct Element:-
                        Sorting will help in Non-Distinct Element also.     How it will help we will see below. so used sorted array.
                            Sorted A =[-10 1 1 2 4 4 4 8]
                                        0  1 2 3 4 5 6 7 
                        
                            Step2:- Count the number of elements which is less than A[i] 
                                    How many elements are less than -10 in array    ==>     0
                                    How many elements are less than   1 in array    ==>     1
                                    How many elements are less than   1 in array    ==>     1
                                    How many elements are less than   2 in array    ==>     2
                                    How many elements are less than   4 in array    ==>     4
                                    How many elements are less than   4 in array    ==>     4
                                    How many elements are less than   4 in array    ==>     4
                                    How many elements are less than   8 in array    ==>     7
                                    
                                    Ans = 5,    // noble integers are 1 1 4 4 4       
                                    
                                    Ques:-  How do we get to know that there are five noble integers ?
                                    Ans :-  
                                            A[i]    ==>     Count
                                     first  1               1          // index & no. of element less than A[i] are same         
                                     first  4               4          // also index & no. of element less than A[i] are same
                                                                       // for duplicates elements.
                                     second 1               1         // index is not helping, becoz no. of element less than A[i] is not same compare to index. 
                                                                     // so we use previous index means first 1 index.
                                     second 4               4        // we use previous index means first 4 index. 
                                     second 4               4        // we use previous index means first 4 index. 
                                     second 4               4        // we use previous index means first 4 index. 
                                     
                                     means "for every element, if the index of the first copy (means first 1, first 4) is equal to the value" that is the noble integers. see img 5.
                                                                     
                        Code:-
                            1.  Sort
                            2.  ans=0
                                count = 0                       // count the no. of elements less than A[i] 
                                for i --> 0 to N-1 
                                   if (i > 0 && A[i] != A[i-1] )        // if the current & previous data are not same then index are important (means index are telling that no. of elements less that A[i])
                                                                        //   it means "no. of element A[i] is less than "
                                    count = i.                      // as long as current element are not equal to previous element (1 & -10) then index is same as count of element less than A[i] 
                                                                    // (2 & 4 both are not equal then index of 4 is 4 this index is telling that count the no. of element less than A[i])
                                                                    // (8 & 4 both are not equal then index of 8 is 7 this index is telling that count  the no. of element less than A[i])
                                                                    
                                                                    Dry run:-
                                                                            re watch the video 
                                   if(A[i] == count)
                                        ans += 1
                                return ans;                                 here Index play an important role                                                
```  
### Comparators:-
``` 
      Ques:-    How do we arrange based on length (above ques) ? || How do we arrange based on the absolute values ?
      Ans :-    
                In the Collections.sort(A)
                    here, along with Array A we can pass one more parameter that is fun, that fun will descide which parameter we can compare.
                    by default sort method sort data in Ascending order.
                    now if we want to sort based on Absolute value || based on any other parameter.
                        we can compare custom compare fun Collections.sort(A, compare);
                        Ques:-  What is the Compare fun ?
                        Ans :-  every fun has this compare fun.
                                eg:-
                                    data_type compare(data_type a, data_type b)       // depending on the data present in the arraylist A, will have this data_type. see in pdf 
                                            {
                                                see img 6
                                            }

                                    ArrayList <Integer> A;
                                    Collections.sort(A, mysort); 
                                    
                                    // Comparator
                                    Comparator <Integer> mysort = new Comparator <Integer> ()
                                    {
                                        @Override 
                                        public int compare (Integer a, Integer b)
                                        {
                                            return a-b;                     // based on above compare fun it will sort the data.  
                                        }
                                    }
                                        like:-
                                                a = 10      b = 5
                                                    10 - 5 = 5  means positive number. so a will be on right of b.  b____a  see img 7
                                                    
                                        Compare fun will take care of Stability. 
                                        In absolute value:-      We will use Absolute value as parameter of compare function. This will descide which element should be on left & which one is on right.
                                        In compare String:-    We will use length of string as parameter of compare function. This will descide which element should be on left & which one is on right.
                                            based on length
```
                                                    
                                                                
                                                                
                                                    

 







    
    

 




















