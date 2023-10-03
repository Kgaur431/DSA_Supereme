### Basics of 2D-Matrix
2D-Matrix is nothing but a **one-Dimensional array fitting one below the other** see the img1
``` 
   -    Things we should know about the 2D Matrix 
                  indexing is also start from 0.
                    like:-
                            row0, row1, .... row3.
                            col0, col1, .... col4.
                            
                            so this is the 4*5 matrix (4 cross 5 matrix) (row * col). 4 rows are there (row0 to row3) & 5 columns are there(col0 to col4).
                            every element inside is annotated   
                                Matrix_Name[row no.][col no.]
                                like:-
                                        A[1][3] see the img1.
                                        
                            Ques:-  What is the index of Top right cell so Minimum Row no. & Maximum Col no. ?
                            Ans :-  A[0][4]
                            
                            Ques:-  There is an N*M matrix where N is the row no. & m is the col no. see the img2.
                            Ans :-  Top Left Cell index is      :-   (0,0)
                                    Top Right Cell idex is      :-   (0,M-1)     minimum row & maximum col. 
                                    Bottom Right Cell index is  :-   (N-1, M-1)  maximum row & maximum col.
                                    Bottom Left Cell index is   :-   (N-1, 0)    maximum row & minimum col. 
                            
                            Ques:-  If we want to access any one element of the Matrix then how much TC do i take ?
                            Ans :-  O(N)    same as array.  
                            
                            Ques:-  SC of entire Matrix is ?
                            Ans :-  O(N*M)        
```
### For given Matrix, we have to Print row wise sum.
``` 
         for every row we have to calculate the sum & print it. see the img3.
         
         -  travel every row & print it.
         -  Code:-
                     for i --> 0 to (N-1)       // row
                        sum = 0
                        for j --> 0 to (M-1)    // col          imp:- for every row, column is travelling from 0 to M-1.
                            sum +=  A[i][j]
                        print (sum) 
                        
                        TC = O(N*M)
                        SC = O(1)
``` 
### Find max col sum.
```
         for every col we have to calculate the sum & print it. see the img4.
         -  travel every col & print it.
         -  Code:-
                Piece of Code:-
                                ans = 0
                                for i --> 0 to (N-1)       // row
                                    sum = 0
                                    for j --> 0 to (M-1)    // col          imp:- for every row, column is travelling from 0 to M-1.
                                        sum +=  A[i][j]
                                    ans += max(ans, sum)
                                return (sum) 
                           
                           -    in this piece of code we are "finding the maximum row sum", we are travelling every row.  but we have to find col sum.  so for that (read below)
                           -    if we make small change like below.  switch (i to j)
                                    ans = 0
                                    for j --> 0 to (N-1)       // row
                                        sum = 0
                                        for i --> 0 to (M-1)    // col          imp:- for every row, column is travelling from 0 to M-1.
                                            sum +=  A[i][j]
                                        ans += max(ans, sum)
                                    return (sum)   
                                    
                                    Ques:-  Will this solve the problem ?, now we can find max col sum ?
                                                we have switch the i to j.
                                                means, we are travelling every column, then we are travelling every row.
                                    Ans :-  this will not work.
                                            becoz "Row number(i) can go to (N-1) but Col number(j) can't go to (N-1)" becoz row & col are different.
                                             in the above code, when we are travelling col, we have to go  till (M-1) which is the col number.
                                                means (M-1) is the col number where col will reach after travelling. 
                                      IMP:-  In the Matrix the num of row & col are different.
                                                so when we travelling col then it should be go thill (M-1) otherwise compiler will give the Out of Bound Error.
                                                similarly when we are travelling row, it should be go till (N-1). like this.
                                                    ans = 0                                     Code 1.
                                                    for j --> 0 to (M-1)       // row
                                                        sum = 0
                                                        for i --> 0 to (N-1)    // col                  
                                                            sum +=  A[i][j]
                                                        ans += max(ans, sum)
                                                    return (ans)
                                      Conclusion:-   While Travelling Columns we will go to Col number (M-1), the indexing from 0 to (M-1), becoz M is the size of Column.
                                                                                                &
                                                     While Travelling Rows we will go to Row number (N-1), the indexing from 0 to (N-1), becoz N is the size of Column
                                                     both M & N may vary. 
                                                    
                                                     Ques:- why we are not do like this, instead of A[i][j] we can do A[j][i] means we are saying that first we travel col & for every column we travel row ?
                                                     Ans :- 
                                                             ans = 0
                                                             for i --> 0 to (N-1)       // col 
                                                                sum = 0
                                                                for j --> 0 to (M-1)    // row          
                                                                    sum +=  A[j][i]
                                                                ans += max(ans, sum)
                                                            return (ans) 
                                                                
                                                                will it work ?
                                                                we can think like:-    It will not work becoz we are travelling the rows & for every rows we are travelling every column ?
                                                                This not the correct statement.
                                                                        
                                                            Imp thing:-
                                                                     this looks right, why ?   
                                                                     becoz i is used for col & j is used for row. (so we did A[j][i]) 
                                                                     j is the Row number & i is the Col number. so its look like we are travelling the columns & for every columns 
                                                                     we are travelling the row. again the same issue (if j is row number then it should go to N-1 not M-1)
                                                                     so we have to change these.
                                                                     Means, if we travelling columns first (means i become col) then col should not go till N-1, it has to go from index 0 to M-1
                                                                                     ans = 0                        Code 2.
                                                                                     for i --> 0 to (M-1)       
                                                                                        sum = 0
                                                                                        for j --> 0 to (N-1)           
                                                                                            sum +=  A[j][i]
                                                                                        ans += max(ans, sum)
                                                                                    return (ans) 
                                      both of the code Code 1 & 2  are same, only i became j & j became i otherwise every thing else is same.    
                                      Dry Run:- on Code 1.
                                                    j   |   i                   |   we are travelling & calulating sum  |       sum            
                                              ----------|-----------------------|---------------------------------------|----------------
                                                    0   |   {0,1,2}             |   A[0][1] + A[1][0] + A[2][0]         |       8
                                                    1   |   {0,1,2}             |   A[0][1] + A[1][1] + A[2][1]         |       20 
                                                    .
                                                    .
                                                    .
                                                    so on. 
                                            so In these code we are calculating column wise sum. 
                                             But these code may not work.
                                                     
                                            assume every number in the matrix is negative number. Then the sum of elements will become negative. 
                                            in this situation, will these code give correct ans ?
                                              
                                              Ques:-    What is maximum of (0,-1)
                                              Ans :-    0 only.
                                                        so it will not work in that case. 
                                                        
                                                     for that update ans=0 to ans=INT_MIN. 
                                                        
                                                        ans=INT_MIN                                     updated Code 1.
                                                        for j --> 0 to (M-1)       // col
                                                            sum = 0
                                                            for i --> 0 to (N-1)    // row          for every col, travel all the rows. means the column of index is fixed & row number is changing.               
                                                                sum +=  A[i][j]
                                                            ans += max(ans, sum)
                                                        return (ans)  
                                                   
                                                     just to make sure that, whatever the sum is calculated.
                                                        sum starts from 0.
                                                        then it is adding all the col values (in i loop)
                                                        whatever the sum can (negative, positive), it will always be greater then INT_MIN.
                                                        
                                              Ques:-    Why we take max() ?
                                              Ans :-    becoz we are calculating maximum sum.
                                              
                                                                                
                                      Final code to calculate max col sum. (Both Code 1 & Code 2 will work). the idea is First travel the col & then travel the row.
```
## Square Matrix
**means, Row Number & Column Number is Same**

### Given a Square Matrix A[N][N], Print Main diagonal from --> Top Right to Bottom Left.
``` 

        There are 4*4 Matrix. the main diagonal (img5) that we are looking.
        Now we will see the pattern in the indexes.
        Step 1: 
                Ques:-  What is the Top Right Index.
                Ans :-      i   |   j
                        --------|-----------------
                            0   |   3                 which is (0,N-1), means at index (0,3) we got first diagonal element from Top Right to Bottom Left 
        Step 2: 
                In this step we will go down & left (img6)  
                    means increasing i & decreasing j.    
                like:-
                            i   |   j
                        --------|-----------------
                            0   |   3                 which is (0,N-1), means at index (0,3) we got first diagonal element from Top Right to Bottom Left  
                            1   |   2                   now, at index (1,2) we got second diagonal element
        Step 3 & 4:
                repeat, increasing i & decreasing j.
                like:-
                            i   |   j
                        --------|-----------------
                            0   |   3                 which is (0,N-1), means at index (0,3) we got first diagonal element from Top Right to Bottom Left  
                            1   |   2                   now, at index (1,2) we got second diagonal element
                            2   |   1                   ...
                            3   |   0                   ... so on.
        These indexes elements we have to print.
        Now, what is the common pattern if we compare i & j.   
                        (Me assumed after seeing the above i & j) 
            -   i is traversing from 0 to N-1
            -   j is started from N-1
        Code:-    
                        (there is no Pattern yet, we are just doing it, will see later)
                 j= N-1                     // j is the column number, we have column number N-1.
                 for i --> 0 to N-1        // Let us travel each row, like 0 to N-1
                    print (A[i][j])       // Print
                    j-=1                 // for the next row "Col number will decrease"
        Dry Run:-
                            i   |   j               A[4][4]
                        --------|-----------
                            0   |   3                         // initially i start from 0 so it will print the element at index (0,3)
                            1   |   2                        // after printing the statment it will decrease the j & i will increase for the next iteration. now it will print the element at index (1,2)
                            2   |   1                        // after that j will decrease to 1 & i will increase to 2 then it will print the element at index (2,1)
                            3   |   0                       // after that j will decrease to 0 & i will increase to 3 then it will print the element at index (3,0)
                                                 // after that j will decrease to -1 & i increase to 4 then code will not execute becoz i have to go till N-1 not N.
                                                 
                            This code will work becoz it is square matrix so row & col num will not vary.
                            TC = O(N)
                            SC = O(1)
        IMP:-
                 Another way of coding it. the above code is also perfect.
                    -   we don't need j var 
                        becoz, if we see the pattern between i & j.
                            Pattern is simple :-  i + j = (N-1)     // i is increasing & j is decreasing. 
                            so total Sum will be constant at every step.    (means sum of i+j is constant)  
                        so, 
                            at every step we can also calculate j as 
                                j = (N-1) - i                   *******************Important******************
                            means, instead of using j var, we can skip the j var & every step we will print 
                                A[i][N-1-i] 
                        this will also work.
                            TC & SC become same.
``` 
### Print all diagonals from Right to Left, (not Square Matrix. becoz not mentioned specifically so it can be Rectangle Matrix.)
``` 
        Think like this:-
            see the (img7) 
            if we see the diagonals from right to left. see the line in the (img8), single element is counted as diagonal.
            then the expected output is:- see the (img8).
            we are printing the diagonals from Right to Left see the (img9) not Left to Right 
                so if we take the example of 17 3 8 then we are printing the Left to Right diagonal.
            
            Ques:-  Given a Matrix of size N+M, What is the Count of Diagonals from Right to Left ?
             Ans :-  
                        if we look at the starting position of the diagonal (img10). (highlighted area)
                        so we can say, How many diagonals are there || How many elements in the first row.
                            we can say that total number of elements in the first row is M. 4 elements
                        now if we take last col then how many elements are there. (img11). (highlighted area)
                            there are total number of rows elements is 3 in the last Column. this is our N.
                        but there are 1 diagonal which is counted two times. 
                            that is (0,3) diagonal 2.
                        therefore total number of diagonal will be 
                            N+M-1 
                        Conclusion
                            diagonals are starting from first row & last column, but 1 diagonal is counted twice. so we are subtracting that 1. 
                                So, N+M-1
            
            We can solve this question in two parts.
                1.  first the elements starting in the first row.
                        -   so, if we start from the first row, then we can see that "Row Number is Fixed, we are only Travelling Column Number"
                                for k --> 0 to (M-1)
                                    i = 0, j = k
                        -   now, at every step if we are at any diagonal what we will do ?
                                we are going "Down & Left".      *****Keep In Mind******
                                we can continue till we are at valid index. so "when we are going down i will increases", therefore i should not go beyound N (no. of rows). && j is decreasing so 
                                    j should be greater than & equal to 0. 
                                while this condition are satisfing we increment the i & decrement the j.
                                    while(i<N && j>=0)
                                        print(A[i][j])
                                        i+=1
                                        j-=1     
                        -   Complete Code:-     PART 1
                                    for k --> 0 to (M-1)        // k decides the column number (see img13 pink color highleted)
                                        i = 0, j = k            // i will always starts from 0 (we are always starts from first row.)       (first row & every column). 
                                        while(i<N && j>=0)
                                            print(A[i][j])
                                            i+=1
                                            j-=1
                                        print("\n")
                        -   Dry Run:-   see (img 13)   
                                        
                                        k   |   i   |   j
                                  __________|_______|_____________
                                        0   |   0   |   0                   // it will print the A[0][0] = 3.
                                            |   1   |   -1                  // now we increment the i & decrement the j, after printing 3. now j is invalid index (means index out of bound) so nothing will happen. then we outside while loop.
                                        1   |   0   |   1                   // k will increment to 1. & new diagonal will start i=0 & j=1. so we will print A[0][1] = 8. now at next step i will increase to 0 & j will decrease to 0. 
                                            |   1   |   0                   // at this step we will print A[1][0] = 1.  now at next step i will increase to 2 & j will decrease to -1.  j is invalid index so nothing will happen again we outside of while loop.
                                        2   |   0   |   2                   // now k value increment to 2. so row starts from 0 & col starts from 2.  so we will print A[0][2] = 9.  
                                            |   1   |   1                   // so we will print A[1][1] = 2.
                                            |   2   |   0                   // again i will increase & j will decrease so we will print A[2][0] = 4.
                                            |   3   |   -1                  // again i will increase & j will decrease so j is  index out of bound & i is also index out of bound becoz row 3 is not present. so nothing will happen.
                                        3   |   0   |   3                   // now k increment to 3, so we will print A[0][3] = 2.
                                            |   1   |   2                   // then  i will increase & j will decrease so we will print A[1][2] = 3. 
                                            |   2   |   1                   // then  i will increase & j will decrease so we will print A[2][1] = 10.
                                            |   3   |   0                   //  i will increase & j will decrease now j is not index out of bound, but i is out of bound becoz i can be N-1, not N. so i can't go beyond that.
                                        4  -|---------> Stop                // col will go till M-1, so k will go till 3 & we are at index 4. so k will stop.  (we have done 1 part of the code see the img14.) 
                
                2.  then the diagonal starting in the last col.
                    
                        -   Complete Code:-     PART 2
                        
                                                                        
                                         for k --> 1 to (N-1)            (we just have define the starting of the diagonals)      // now we are to start from last column elements like 2 6 17, see in img 14. row number will end till N-1
                                            i = k, j = M-1               (every row & last column)                                 //  j will be fixed, j will be last column & we need to iterate on row number. now row number will start from index 1, becoz  we don't want to row number starts from 0, becoz A[0][3] is already printed. 
                                            while(i<N && j>=0)        // everything else is same.
                                                print(A[i][j])
                                                i+=1
                                                j-=1
                                            print("\n")
                                                          
                                   now we solve this question in Two parts.
                                   
                                   Ques:-   here, i = k, j = M-1 why we don't start the i var from index 0 ?
                                   Ans :-   becoz the diagonal starts from A[0][3] are counted two times so for that reason we have started the i from index 1, so that last columns diagonals will not counted 
                                            two times.
                                            
                                          
                                This will print the blue line diagonals elements given in the img12.
                        -   Diagonal printing:-
                                first we print.     ==>     print(A[i][j])
                                then we go down.    ==>     i+=1
                                then we go left.    ==>     j-=1
                        -   we are actually travelling the every element of the matrix, so if we want to travel every element then 
                                TC = O(N*M)
                                SC = O(1)
```
### Given a Square Matrix A[N][N]. we have to update the Matrix itself to its Transpose Without Extra Space.
``` 
        -   See the img 15.
                Ques:-  What is the meaning of Transpose ?
                Ans :-  it basically means "Every Row becomes Column". (see the img16)
                
        -   See the img 17.
                Ques:-  why this transponse is not applicable on Rectangle Matrix if we have to update the original Matrix ?
                Ans :-  becoz "The Dimension are Altered so we won't have the same Matrix after Transpose"
                            so, the first row (3 elements) in the first column of Transpose Matrix.
                                    second row (3 elements) in the second column of Transpose Matrix.
                                    so the new matrix look like (see the img 17).
                        Therefor, it is not possible if we have Rectangle Matrix.
                        But, we can always create a New Matrix after doing Transpose. but updating in the original matrix is not possible.
                
        -   Points:-
                    =   for the given input, this (see the img16) is the updated expected in the original matrix.
                    =   it's only applicable for Square Matrix.
                
        -   think like that:-
                    =   first we look into normal variables.
                            like, see the element 3 (see the img18), this element 3 was at index (0,2) --> now this element went to (2,0)
                                            (0,2)   -->     (2,0)
                                  the element at (2,0) was 9 this went to (0,2)
                                            (2,0)   -->     (0,2)   
                                            (3,2)   -->     (2,3)       ==>     the element was 12  -->     15
                                            (2,3)   -->     (3,2)       ==">    the element was 15  -->     12 
                    =    Pattern:-
                                 1. every (i,j) will be swap to (j,i)   (see the img 18)
                                        (i,j)   <-->    (j,i)
                                 2. now, (i,j) if we swap (j,i) then what will happen with Diagonals ?
                                        see the img19. 
                                    means, if i & j are equals then there will be no change. so they will remain same.
                                 so simply sweet code.                        
        -   Code:-
                    for i --> 0 to (N-1) 
                        for j --> 0 to (N-1)
                            t = A[i][j]
                            A[i][j] = A[j][i]       // these three lines of code are for swapping of A[i][j] <--> A[j][i]
                            A[j][i] = t

                Ques:-  Will the above code give transpose. 
                Ans :-  It will not work.
                        eg:-
                            assume i will become equalt to 2, j will become equal to 3. we are swapping (2,3) with (3,2) 
                                            (2,3) <--> (3,2)
                            & when i will become equal to 3, j will become equal to 2. again we are swapping (3,2) with (2,3)
                                            (3,2) <--> (2,3)
                          Means, we are swapping same thing 2 times. 
                            Ques:-  what will happen if we swap same thing twice ?
                            Ans :-  we will get originall array back, instead of transpose.
                            
                            Ques:-  Now, What to do now to make sure that this above thing will not happen ?
                            Ans :-   Only Consider the Cases Either (i<j) OR (j<i), don't consider Both the Cases.
                                     & (i=j) we don't want to update so the exact code is below one.
                                     
                                     We have Choosed the (i<j) case.
        - Updated Code:-
                for i --> 0 to (N-1) 
                    for j --> (i+1) to (N-1)
                        t = A[i][j]
                        A[i][j] = A[j][i]      
                        A[j][i] = t 
                                         
           Trick:-
                    we don't have put the if check for (i=j) becoz we don't want to swap the same thing twice 
                        (this condition won't happen. becoz j will always be bigger then i) 
                    basically we are travelling half of the elements, if the total elements are N^2. becoz  We have Choosed the (i<j) case.
        -   
            TC = O(N^2) 
            SC = (1)                 
```
### ### Given a Square Matrix A[N][N]. we have to update the Matrix itself to its 90 degree Clockwise Rotation Without Extra Space.
``` 
        see the img20.
        
        If we have Transpose of Matrix. then this ques will solve easily. (EASY WAY) Prequisites is:- we should know the Transpose.
        Observation:-
                 the 90 degree Clockwise Rotation is the Mirrion Image of the Transpose. (see the img21)
                    means every row is being reversed. & we get the solution.
        Steps to find solution. 
                1.  Take Transpose. (we done)
                2.  Reverse Each Row.
                        Ques:-  Do we know how to Reverse Each Row ?
                        Ans :-  it's same as reversing the array. so every row is an array.
                        
                        Ques:-  Now, do we know how to reverse an array ?
                        Ans :-  
                *   Either we can do Reverse first & then Transpose OR we can do Trnaspose first & Then Reverse. both will be same.

        Code:-
                (write yourself)
        
        Complexities
                 TC for transpose is O(N^2)
                 SC for transpose is O(1)
                          +
                 TC for reversing 1 row is O(N) 
                 TC for reversing n row is O(N^2)
                 SC for reversing n row is O(1)
                 
                 
                 NOW,
                        Transpose TC = O(N^2)       Reversing TC = O(N^2) 
                                  SC = O(1)      +            SC = O(1) 
                    -----------------------------------------------------------
                                         Total TC = O(N^2)
                                         Total SC = O(1)    
                         
```
## Implementation Question. (to build logic)
### Given a Square Matrix Print Boundary elements in Clockwise order starting from (0,0)
``` 
        see the img 22. 
    for this question we can you as many loops as we want. but we have to write the simplest code possible. means easy to understand code.
    
    IDEA:-
            WE HAVE SEEN THE QUESTION ABOVE WHERE WE HAVE DIVIDED THE SOLUTION IN TWO PARTS TO FIND THE SOLUTION.
                    First row, Last column.
    To make Easy:-
            We will devide the question in Four parts.
            First Row
            Last Col
            Last Row
            First Col
                there are some elements which being repeated.
                Ques:-  How to avoid That ?
                Ans :-  we can avoid like this (below)                                                                                                      see the img 23. for more calrification.
                            Task1   First we travel the first row till second last element (1 element less || 1 element before)                                 (0,0) to (0,2)
                            Task2   Then we can travel the last col from the first element till last second element (1 element less || 1 element before)        (0,3) to (2,3)
                            Task3   so on.                                                                                                                      (3,3) to (3,1)
                            Task4                                                                                                                               (3,0) to (1,0)
                            
                                            i is for row, & j is for col.
                Task 1:-    Iterate every col for fixed (first) row. (means row no. is 0 & travel every col)
                                for j --> 0 to (N-2)        // here, N-1 element is the element 4 (see the img23) but we want the second last element so we used N-2 
                                    print (A[0][j])         // first row & j col        this will print element 1 2 3.  
                
                Task 2:-    Iterate every row for last column that is fixed. (means col no. is 0 & travel every row)
                                for i --> 0 to (N-2)
                                    print (A[I][N-1])       // last col & i row         this will print element 4 8 12
                                    
                Task 3:-    Iterate last (fixed) row for every col. (means row no. is N-1 & travel every col )
                                for j --> (N-1) to 1                    // we are going here Right to Left direction        L <-- R
                                    print (A[N-1][j])       // this will print element 16 15 14

                Task 4:-   Iterate every Row in reverse order for fixed (first) col.
                                for i --> (N-1) to 1
                                    print (A[i][0])       // this will print element 13 9 5   

                Code img24. we can do this in one loop (here we have to lots of checks for 1 element comes twice) but this is the easiest way to doing this, 
            
            Complexities:-
                    TC = O(4*(N-1)      // 4 is for 4 loops
                            O(N)
                    SC =    O(1)

    Conclusion:-
                 in the question if they ask for any bounday like second boundary, third boundary of the matrix.
                    we should use this approach 
                        TRY TO DEVIDE THE QUESTION IN MULTIPLE PARTS & DO EACH PART SEPERATELY .        the common way is to put everything inside in the 1 loop & do the task that approach will make complicated.
                        
                        like
                            printing first part.
                            then, printing Second part.
                            then, printing third part.
                                so on.
                            all we have to check "Where to Start & Where to end"    Done.
                            
                            
                    Question print the second boundary of the Matrix.
                        we need 1 extra loop to define the starts (to starting of the bondaries) & inside that loop we can write the every for loop to printing the boundaries
                 
                 this approach will work for Rectangular Matrix of (NM)
                            
                            
```

