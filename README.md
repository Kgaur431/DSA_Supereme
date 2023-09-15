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
                                                        for j --> 0 to (M-1)       // row
                                                            sum = 0
                                                            for i --> 0 to (N-1)    // col                  
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