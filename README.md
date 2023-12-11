## Interview Puzzles

1.  ### **Number of Open Doors**
1.1 **There are N doors numbered from 1 To N. All doors are initially closed. A person who changes the state of door in the following manner**.
``` 
    changes the state of door ==> means flipping the doors. 
    like:-
        if the door open then the person will make it close.
        if the door close then the person will make it open.
    
    Manner:-
        1.  The person changes the state of every door.
            1 2 3 4 ... N.  initially every door was closed so we have to open.
        2.  The state of multiples of 2 got changes.
            2 4 6 8 ...
        3.  The state of multiples of 3 got changes.
            3 6 9 12 ... 
        4.  The state of multiples of 4 got changes.
            4 8 12 16 ... 
        .
        .
        .
        N   all the multiples of 1, 2, up till N the state of the door will change. means so many times state of door change.
        
    Goal:-
        Find the count numbers of open doors in the end.
    
    N = 6.
            1   2   3   4   5   6
            C   C   C   C   C   C           Initially every door has closed.
            O   O   O   O   O   O           N=1, first Iteration evey door will open.
            O   C   O   C   O   C           N=2, second iteration, only the multiple of 2 got changed.
            O   C   C   C   O   O           N=3, third Iteration only the multiple of 3 got changed.
            O   C   C   O   O   O           N=4, fourth Iteration only the multiple of 4 got changed.
            O   C   C   O   C   O           N=5, fifth Iteration only the multiple of 5 got changed.
            O   C   C   O   C   C           N=6, sisxth Iteration only the multiple of 6 got changed.
            
            so, at the end door 1, 4 are open.
    Ans = 2.        // Interview puzzel will asked this puzzel for large input. like N=10^6, N=10^18
```
2. 

