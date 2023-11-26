## Linked List Bascis
``` 
    img 1, linked list where last node are pointing to null. 
    we are at first node then only we travel this complete linked list, so if this linked list is an falmily then first node is the 'Head of family'. becoz head of the family can go to any of the familty member. 
    Note:-  Thinking logic is Easy in Linked List but writing Code is difficult.
```
### Warm up:-   Create a linked List with N Node having data 1 to N. Return the head of Linked List.
``` 
    create (int N)
    
    Ques:-  What is the return type of the function if we create LL ? 
    Ans :-  Node. 
            like:-  we have to return a node from this LL.
                        Node create (int N)
            we have to create a LL which have data 1 to N. 
            so first we create Head Node.
                Node head = new Node(1);
            for remaining Nodes we need to iterate & create it. 
                Node create (int N)
                {
                    Node head = new Node(1);
                    for i --> 2 to N                // not N-1.
                    {
                        Node x = new Node(i);
                    }
                }
            we have to attached this node in the LL.
            Ques:-  Where will be the second Node ?
            Ans :-  next to head/first node.
                    if we do like this, 
                        head.next = x;      then head node attach to second Node but head is also attach to third node. img 2.
                    we are updating the pointer with the same node. so "We have to Increase the Pointer"
            Ques:-  Is it Right to update the Head to Head.next || update the Head Pointer || Increase the Head Pointer. 
            Ans :-  if we update the head pointer || increase the head pointer then data 1 will gone. img 3.
    Imp:-   "Whenever we Iterate the LL, we never ever update the Head pointer". So we create the temp variable to do this task.            **Never update the Head pointer in any situation, always make a Copy & traverse**
                Node temp = Head;   now, temp is pointing to same memory address of Head.   we are just doing Shallo Copy.
                temp.next = x;      temp.next is same head.next & we are storing the address of x=2 in temp.next;
                                    we want that node where data=3, should be next of 2.  so "We Update the temp" means temp should be pointing to Ndoe where data=2 so we can add the address of  node3 to node2.
                temp = x;           now temp will iterating & storing the address of next node into current node.
                return head;        img 4.
    Imp:-   Last Node next has by default null, means whenever we create a Node the default value of next is Null. so if we not updating the temp.next then default value of next will be null.
            if N=0 then we should return Head = null.   means there is no node in LL that we can return.    || eniter LL is empty.      if N=-1 any -ve number then also we should return null.
    img 5.
```
### Problem 0:- Given the Head of LL, return the first node with data=X. if X is not present , return null.
``` 
    img 6.  
    // we return null, when the return type is Class / Object.
```
### Problem 1:- Given the Head of the LL. Return the data present at Kth node in LL. such that K=0 represents the Head Node & K>=0
``` 
    here, K is nothing but the index of the LL. img 7.      
    Code:-
            img 7.
            we are iterating on the index. 
            assume k=3, then we iterate from 1 to 3, once reached at index 3 return the data.
            what if k=6, (temp == null means we reached the null node becoz last node is pointing to null & ll=3) index is not present in the Node, then we get NullPointerException means Node is not exists that we are accessing.  we have to handle it. 
                            we reached that index that is not in the list so when temp==null then return -1 // anything to indicate that data is not present. || list is smaller.  img 8.
            for k=0 then the code is working fine, like temp = head, for loop is not working & return the head data.
            what if k=0 & Head = null,      means the LL is not there & we are accessing the 0th element. then we get the NullPointerException.                     ******************************Imp Test Case******************
                            so, return temp != null ? temp.data : -1; 
    TC = O(K)
         we are iterating the Kth times & k is the part of input. so the TC will be part of input.
    Same question we do in Array then TC will O(1)

```
### Problem 2:- Given a LL, insert a node at position K with data = x. 
1.  k=0 represent insert as head node.
2.  k >= size represents insert at last node.      k >= 0.
``` 
    img 9.
    Code:-  
        Node insert(Node Head, int k, int x)         // return the  head of the final node.
        {
            Node nodex = new Node(x);       // creating the node x.
            if (k==0)
            {
                Ques:-  Why do we have to handle k==0 case. 
                Ans:-   If k=0 then we want that particular node to be Head node. 
                
                nodex.next = Head;      // now nodex is the first node of ll. so we have to update the head pointer also.   
                Head = nodex;           // updated the head. 
                return Head;
                
                Becoz we are update the head so we have to handle it seprately here.    here the Head is changing.  
                if we do other value of k=3, k=4 and so on. the head will remain same. means we not update the Head.    here the Head is not changing any value of k.
            }
                // now k=3
                Ques:-  Where we should stand so that we can update this link (data=4) which pointing to the new node?
                Ans :-  k-1, means here we want to update the k then we should stand k-1. so we will travel till k-1 to do the task.
                
                Node temp = head;
                for i --> 1 to k-1          // k-1 time we are taking jump.
                {
                    temp = temp.next;       // if k=3 then we jump till 2. img 10.                              if k=7, we are travelling the index which not exist like last node pointing to null, so this current line will give NullPointerException.  like temp.next is pointing to null. 
                    
                    Ques:-  Which one should update first either temp node or new node (data=4) ?
                    Ans :-  update new node (data=4) first. means first attach new node (data=4) to these nodes (data=2, data=5) first.
                            becoz if we update the temp to new node first then we don't have access to nodes (data=2, data=5). img 11. if we update temp fist then where these nodes (data=2, data=5) have in the memory we don't have any idea.
                    
                    nodex.next = temp.next;         // first attach new node (data=4) to these nodes (data=2, data=5). 
                    temp.next = nodex;              // temp to new node
                }
                
                // if k=7   means k is greater then the size then we get NullPointerException 
                Ques:-  for k=7, at which line we get NullPointerException ?
                Ans :-  inside the last loop.                   // without hanlde the k=7 case. img 12.
                
                Ques:-  if k>size then we have to insert in the last node. where the temp should stop either last node or null ? img 13.
                Ans :-  temp should stop at last node.
                
                Ques:-  If we want that temp should stop at last node, Will we check temp = null or temp.next = null ?
                Ans :-  temp.next = null.      
                        
                        we need to create the link so we break out from the loop once we reach at the last node. means after break we are outside the loop then temp indicating to last node. 
                        /*
                            these line also join the new node at last.
                                nodex.next = temp.next;         
                                temp.next = nodex;           
                        */
                updated code in img 13.     
                
                // if k=0, x=4, Head = null.    updated code (img 13) will work for this case. check if(k==0) case {nodex.next is pointing to null, returning the new node}
                but,
                // if k>0, Head = null, updated code (img 13) will failed, 
                Ques:-  k>0, Head = null which line will give us the error ? 
                Ans :-  Node temp = head;  if(temp.next == null)    this line will give error, img 13. means we are checking null.next that is not exist so it will throw NullPointerException.
                        we can handle it if(k==0) here becoz if head is null then we will not go inside loop.
                        so we do like this,
                            if(k==0 || Head == null)
                            ... 
                        it will work even any value of k.  see in pdf.   
                        
                        we have to return the Node even if the Head = null, we will never return null; we have to return the node that we have created.
                
        }
    TC = O(K)
    SC = O(1)
    Note:-  we did insert operation, crearte operation, searching and so on. In all of these we don't required any extra space. this is the beauty of Linked List. LL is independent & taking care of its operation, but everything has to be travelled we need linear time to do the operation. "Unlike an array there we can jump using index, but here we don't have the concept of index so we can't jump to k index
                we have to travel till k". means anything we have to do then we have to travel. 
```
