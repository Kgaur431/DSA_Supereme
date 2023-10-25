## String Problems

#### Warm up - Given a String, reverse the substring from L to R. 
``` 
           s = "a b d e a g f"      L = 2,  R = 2
           o/p = "a b g a e d f"

           Code:-
                while (l < r) 
                    {
                        swap(s[l], s[r])
                        l++
                        r--
                    }
          
          TC = O(N)
          SC = O(1)   
          
           Ques:-   In what cases this TC = O(N) & SC = O(1) will not be scanerio ?
           Ams :-   when "String is Immutable" then this TC will not be there.      
                     means if we code this in java then T & SC will not be there. 
                    
                    What should do if we want the TC is O(N) ?
                        we have to use String builder || Dynamic array of char.
                        so SC will become O(N). see (img 1)
           
           Summary :- 
               any operation like append, upadate, anything and so on. if we perform on string & string has In-immutable, we can't do directly.
                so if we do directly then TC will get increase, so "Better part is to use the Extra Space".      
               "Use String Builder, perform the operation, then convert the string builder back to string." 
                    if we convert String builder to string || vice versa the TC will be Linear.
```
### Interview Problem 1:-                                                                                               Company:-   Rippling

### Giver a char array, storing a english sentence, the goal is to reverse it word by word.
1.  Constraints:-
   2. No extra space is allowed, so SC should be O(1).
   3. Every word is seprarated by only one white space ' '.
   4. No leading or ending spaces are present in input.
``` 
                    we are update the given input array.
        A = [the sky is blue] see (img 2)
            
            Like :-
                first word is at the last, second word is the second last and so on. see (img 3)
            Think:-
                assume, if every word we consider as the single char.    
                then the order is 1 2 3 4 To 4 3 2 1.   means the order is completely reverse. see carefully (img 4) 
                    so doing reversing is helping us. means we try to reversing the complete thing. here our goal is that "at least the words will be at the correct position".
                   
            Step 1:- Reverse the complete array.
                        then the output should be like this see (img 5)
                        time taken to reversing the array is O(N).   
                        
                        Now, the first word is at the last, second word is the second last and so on. see (img 6)
                            means the words are in the correct order.
                        but every word is not what it actually shold be. 
                      
                      Observe:-
                              "Every word is nothing but reverse of the word (in output) that was in the input"  
                                so we have to reverse every word.
            
            Step 2:- Reverse all words 
                        what is one thing that will tell us that "It is a word"
                            " " white space.
                        
                        so we can simply iterate L & R pointer from the start. see (img 7)
                            then run the i & increase the value of i, till r reaches white space. now r is at white space (see img 8) 
                            as soon as r reaches to white space, then we can reverse the array A, from l to r-1. like reverse (A, l, r-1), becoz r at the white space.
                                means r th index is the white space so till r-1 we have word. 
                                this reversing is same as the reversing we done in the warm up question. means reversing the sub string.
                        
                        Code:-
                                l = 0;
                                for r --> 0 to N-1
                                    if (s[r] == ' ')            // only r th index is the white space then we can reverse.
                                        reverse(A,l,r-1)
                                        l = r+1                       // now we have to increase the l, once r index at the ' '. so next word will start from r+1. see (img 9)
                               // then again r increase & till ' ' space. that's how we found other words. but at the last word it does not have the ' ' at the end.
                                 now r will reach at the end. how will reverse the last word.
                                 in the end we can call reverse with A,l, N-1.      // don't forgot to add this reverse fun at the end. see (img 11) to full code.
                                 (becoz the last will not reverse & condition failed so we have to reverse it seprately at the end.
                                  the ' ' is present in between the word not at the end)
                                                                
                        Dry Run:-
                            we have r & l pointer at index 0. r pointer is increasing step by step.
                            now r is at the index 0 then index 1, then index 2, ... nothing will happen. only when r is reaches white space.
                            so we will call the reverse with l to r-1 with array A.
                                reverse fun will be above code that return in warm up question.
                                now, at the first reverse we have word blue in the array with the correct order. see (img 12)
                            next step, l reaches at the 5th index. & r is only travelling || increasing, we are not resetting the r. 
                                now, r is at the index 4, index 5, ... r is reaches ' ' again then again perform reverse with l to r-1 with array A. 
                                now, at the second reverse we have word is in the array with the correct order. see (img 13)
                            so on.
                            now r reaches N. means we outside the for loop.
                            so the last word is not reverse in the for loop, so that we have called the reverse part seprately.


                        tc = O(N^2)     // if we thing TC is O(N^2) becoz we are calling reverse fun (which takes O(N)) inside the for loop.    WRONG.
                                        "becoz everytime we are reversing the word (l to r-1). so "length of word will be the TC for the Reverse fun"    *******Imp****** 
                                        now, what is the sum of length of all word is = O(N) only".
                        TC = O(N)       // we are reversing every word not anything else.
                        SC = O(1)
```
#### Calculating TC with Given Code (above problem code)
```         
            Take any random example & dry run.  (we don't the words or anything. we know there are white spaces. see in (img15)
            see the code (img 14)
                reverse fun, we know that it will take l & r(length of string)
                    like (r-1) - l + 1. this is total length. so it is nothing but r-l    // Given L & R --> {R - L + 1}
                we(r) are travelling the complete string but this reverse fun will only be called for white space.
                first time when we(r) traverse, then it will traverse l to r-1. then l indicate r+1 & again r will travers till N-1.
                last word will reverse by outside reverse fun.
                so r-l length is this (down arrorw) see in (img 15). 
                then what is the sum of length input (down arrow) 
                    O(N) 
                    
                    N is for r loop 0 to N-1 & N is for calling reverse fun for (l to r-1) words. {if we call reverse fun for "every r then its should be O(N^2) but we are calling reverse fun 
                        conditional based like ' '"} for every r loop we need to count the iteration of inner loop but for every r loop we don' have inner loop, we only have inner loop for ' '. 
                SO TC = O(2N) --> O(N)
```
### TC should be No. of Iterations.

### Given a string of length, N. Return the length of longest Palindromic SubString.
``` 
            S = "a b a c a b"
                 0 1 2 3 4 5

                Ques:-  What is the meaning of Substring ?
                Ans :   "Continuous part of String".
                
                Quse:-  What is the meaning of Palindramic ?
                Ans :-  "String is equal to the Reverse of itself" that is Palindramic String.
                                S = reverse(S)  -->     these two lines can be TRUE for EVEN Length String, ODD length String also.
                        
                        eg:-    Mom, nitin, dad & so on. 
                                A != a  // both are different 
                                    Ama != amA
                
                In the String S, every single letter word is palindrome.
                apart from that, from index 0 to 2 word is an palindrome, from index 2 to 4 word is an palindrome, from index 1 to 5 word is an palindrome.
                among all of this the longest length palindrome is = 5 length
            
            S = "h a p p y"
                 0 1 2 3 4
                
                Ques:-  What is the longest palindrome String in the String S?
                Ans :-  Every single letter word is an palindrome, apart from that we have 'pp' this two length string.
                        so, Ans = 2. 
                see (img 16)
            
            SubArray is for Array is same as SubString is for String.           *****************************Imp******
            
            Bruteforce way to solve this problem:-
                "For all SubStrings, we will Check if its a palindrome & keep track of longest length". see (img 17)
                
                Ques:-  For N length Strings, How many substring will be there ?
                Ans :-  N*(N+1)/2   ==> O(N^2) means every substring will be O(N^2).
                
                Ques:-  if we want to check if the substring is a palindrome or not then how much time do we required || how we will check ?
                Ans :-  
                        S = a b c b c b a 
                           1 way    the easiest way is the compare String with the reverse of String.
                                        S = reverse(S)
                                        for reversing this it will take O(N) 
                            
                           2 way    while reversing we are replace first with last char, second with second last char, third with third last char and so on.
                                        "Instead of Reversing, why not we are comaping them", see (img 18) so compare  first with last char, 
                                            second with second last char, third with third last char and so on.
                                        for doing this it will take "O(N^2) for all the sub strings and O(N) for checking".    
                                        
                           so Total TC = O(N^3)
                                    SC = O(1) 
                                    the worst case TC will be O(N^3) becoz what happen if all the char of the string are 'a'.
                                    so if we optimise based on char then also TC = O(N^3) becoz O(N^2) for the sub string & O(N) is for checking || reversing.
                           
                           Sliding Window is not applicable here, becoz we have any length of sub string.
                           
                           Try to Optimise
                                Think like
                                 
                                 -      Checking palindrome we can't optimise, TC = O(N) will be required. it's not possible to better then this TC for sure.
                                        so we can say TC should be O(N) < TC < O(N^3)   (me:- based on my understanding)
                                 
                                 -      we can optimise in substring for N length Strings. 
                                            when we think about substring then,
                                            Ques;-  How many indexes do we required to define a substring ?
                                            Ans :-  "we need two parameters to define substring", for every two parameters if we calculate substrings & do the checks that can't be better then O(N^2)
                                                        so O(N^3) is best case scanerio.  
                                                     "If some how we reduce two pointers to 1 pointers" means instead of using 2 pointers to define substring & checking palindrome,
                                                        If we able to do it in 1 pointer then we can reduce the TC. TC = O(N)
                                                        so O(N*N) = O(N^2)  O(N) for checking & O(N) for finding substring with 1 pointer
                                       
                                       For a string, Start & End are present & we need to check palindrome. we can check it easily. (here start & end are the 2 pointers from here we have to reduce 1 pointer)
                                       Instead of Start & End "What if we use Middle Element",
                                            Ques:-  if we know the middle index then Can we do this same task ?
                                            Ans :-  if we know the middle element index, from middle element index we can check by going left & going right what is the longest palindrome.  see (img 19)
                                                        **for odd length string ==> we need 1 middle element(i)**
                                                        **for even length string ==> we need 2 middle element(i, i+1)**
                                                    "by using middle element index we can find the longest palindrome substring for every middle element". every middle element means ith element is the middle element
                                                        like:-  
                                                                Template code:- to think how we can define above thing in code  see (img 20)
                                                                             ans = 0;
                                                                             for i --> 0 to N-1     //here i becomes a middle element & this is for odd length strings. 
                                                                                ans = max(ans, longestPalindromeLength(s, i, i))        //  longestPalindromeLength(s,i,i) fun has not implemented yet,
                                                                                              // here, if condition is used so that i+1 will not go out of bound nothing much
                                                                                if(i < N-1)   // for even length strings we need 2 middle element so either we use (i,i+1) || (i-1,i). both will fine.   
                                                                                    ans = max(ans, longestPalindromeLength(s, i, i+1))  
                                                                             return ans; 
                                                                       
                                                                       Understanding what above code will do:- see (img 21)                                       (NI ==> code not written yet)
                                                                                String S ==> "a b a c a b"
                                                                                first we see for odd length string,
                                                                                        every i is the middle element.
                                                                                        if 0 index will be center point then there is nothing on the left, so the longest palindrome is 1 only {becoz 'a' is substring} (img21)
                                                                                        if 1 index will be center point then we able to go left & right (NI). so we can have 3 len substring. (img22)
                                                                                        if 2 index will be center point then we able to go left & right (NI) but left & right are not matching so we can not check next left & right
                                                                                            "we will stop when left & right are not match", so for this we can have 1 len substring. (img23).
                                                                                        if 3 index will be center point then we able to go left & right (NI) & we check left & right if they are match then we check next left & right,
                                                                                            while they are matching till there we get the palindrome substring so we can have 5 len substring. (img24)
                                                                                        if 4 index will be center point then we able to go left & right (NI).  but left & right are not matching, so we can have 2 len substring. (img25)
                                                                                        if 5 index will be center point then there is nothing on the right, so the longest palindrome is 1 only 
                                                                          
                                                                          we got one understanding that if we have 1 center then we can compare 1-1 step left & right. see (img 26) & again travel 1-1 step & compare left & right and so on.
                                                                             means, we have l pointer & r pointer, till the time l & r are matching we can continue see(img 27), as soon as there is a miss match (img 28) we will stop we don't
                                                                                    go forward.
                                                                            
                                                                                         
                                                                                now for odd length string,
                                                                                         String S ==> "a b a c a b"
                                                                                         here, i & i+1 is the substring || middle point.
                                                                                          if 0 index & 1 index will be center point. these two are not matching that means even length substring will not be possible. see (img 29)
                                                                                          if 1 index & 2 index will be center point. these two are not matching that means even length substring will not be possible. see (img 30)
                                                                                            so on for this String S.
                                                                                            here all are 0.
                                                                                          
                                                                                         String S ==> "a b b c c b b c"
                                                                                                we are starting directly here, becoz we alredy seen in the above string S that how to travel in even length string.
                                                                                                here also we have to travel evey middle element.   
                                                                                                if the middle element is 'b b' means 'i i+1' if both are matching then we will travel left & right & check them that they are matching or not.
                                                                                                    see (img 31)
                                                                                                if the middle element is 'c c' means 'i i+1' if both are matching then we will travel left & right & check them that they are matching or not.
                                                                                                     see (img 32)
                                                                Now we write the code for longestPalindromeLenght() :-
                                                                    implement by own.
                                                                            Hint:- 
                                                                                from i we have to travel left & travel right only. || its like the opposite of reverse (warm up ques) there we was travelling from right to left. 
                                                                                    here we have to travel from middle to left & right.
                                                                                 
                                                                
                                                                Total TC = O(N^2)       O(N) for longestPalindromeLenght(), this substring part we optimised "by starting of middle instetad of starting" & O(N) for checking palindrome, we can't optimise it.  
                                                                
                                                                Tricky part:-
                                                                        it is too take care of odd & even both the cases in same function 
                                                                                                                                 
                                                                                          
                                 
                                 
                           
                                    
                           
                                           
                            
                        
                        Note:- for even length || odd length string the TC will be same see (img 18)
```
## **Sliding Window works only When we have fixed length subArray || subString**