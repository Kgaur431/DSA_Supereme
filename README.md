## Tree Bascis
``` 
    we know arrays & LL, they are Linear Data Structure. means we can travel the data in single line || all the data are present in the sequencitial.
    Tree are Hierarchical Data Structure.
```
### Use-case of the Tree DS
``` 
    eg:-
        we are in the orgainisation, In which only 1 CEO, There are people who reporting to CEO like CTO, CFO, COO ... and so on.
            CTO can have people like Engineering Mananger 1, Engineering Mananger 2 and so on.
                Engineering Mananger also have Tech Lead's like Tech Lead 1, Tech Lead 2, Tech Lead 3 and so on.
                Tech Lead also have some some SDE's  like SDE 1, SDE 2 and so on.
            CFO can have people liek Vice President 1, Vice President 2 and so on.
            COO can have people liek Program Managers 1, Program Manager 2 and so on.
        This is kind of Hierarchical DS. img 1.    
        
        -   File system in computer where we maintain the hierarchy.  img 1.
    
    To store hierarchy data we don't use Array & LL. becoz thery are linear. so we need Hierarchical DS that we called as Trees.
    
    Ques:-  Where is the root of the Tree in Computer Science ?
    Ans :-  Inverted the Actual tree.  in pdf.

```
### Naming & Terms that we are using in the tree.
``` 
    Root:-  
            It is "Top most node in the tree, that can be used to travel the complete tree".
            Root is always unique. just like Head node in LL.
            like:-  
                    In the Ll, Head node is the head of the family, means without Head node we can not go anywhere.
                    this same thing with root node.
            
    x --> y:-
        it means we can travel x to y. (In Ll, this --> means if we are at x then we know the memory location of y).
        so if we are at node2 then we can move to node5 || node 8. img 2.
        now, "One Node store memory reference of multiple nodes".      
    
    Parent Child:-                
            x will be a Parent.     || x is parent of y.
            y will be a Child.      || y is child of x.  in pdf.
    
    Leaf:-  Nodes which do not have any children. img 3.
            
            Ques:-  Can a root become leaf node?
            Ans :-  Yes
                    like:-  
                        In LL, Head be the last node. 
                            Head is pointing to null.
                    Root node can be the leaf node if we have one node in the given tree.
                        so root & leaf both are same in this case.
    SubTree:-   
           img 4.  
           "All the nodes that can be traveled from a given node including the root node". given node 10 then sub tree will be 9 7 & from 7 we can reach 12.
                eg:-    
                    node1, 2, 3 are not the subtree, so the complete tree be the sub tree.  subtree can end at leaf node, here 2 & 3 are not leaf node.
           
           Ques:-   Can a leaf node be subtree ?
           Ans :-   Leaf Node always be a subtree.
                    like:-  
                        if we are at node4 then what all the nodes we can travel from node4, only node4. so "Single Node be a subtree".
           
           Ques:-   2 is part of how many subtrees ? 
           Ans :-   1 & 2.
                    if subtree start with root node then 2 will be the part || entire tree will be subtree.
                    if we start subtree from 2 then also. 
                    
                    so "Complete tree will also be a Subtree for a Root Node".      like complete array is also subarray.
           Note:-
                    Tree will always a leaf node. either the tree will be empty tree like null, In the case tree does not have leaf node. If tree have any node then it has 1 root node & 
                        at least 1 leaf node.         
```
### Traversals
``` 
    Preorder:-
    Inorder:-
    Postorder:-

```