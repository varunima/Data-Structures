package com.leetcode.problems;

public class Two_Sum_Problem {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ListNode l1=new ListNode();
     l1.insert(l1, 3);
     l1.insert(l1, 3);
     l1.insert(l1, 3);
      ListNode l2=new ListNode();
      l1.insert(l2, 3);l1.insert(l2, 3);l1.insert(l2, 3);
      ListNode l3=new ListNode();
      
      l3=Solution.addTwoNumbers(l1,l2);
      System.out.println(l3);
		
	}
	}
	 class ListNode {
		 ListNode head;
			int val;
		      ListNode next;
		      ListNode() {}
		      
			ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		      public static ListNode insert(ListNode list, int data) 
		      { 
		          // Create a new node with given data 
		          ListNode new_node = new ListNode(data); 
		            
		      
		          // If the Linked List is empty, 
		          // then make the new node as head 
		          if (list.head == null) { 
		              list.head = new_node; 
		          } 
		          else { 
		              // Else traverse till the last node 
		              // and insert the new_node there 
		              ListNode last = list.head; 
		              while (last.next != null) { 
		                  last = last.next; 
		              }  last.next = new_node; 
		          } 
		      
		          // Return the list by head 
		          return list; }

		  }

	class Solution {
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode ptr1 = l1; // pointer to traverse l1
	        ListNode ptr2 = l2; // pointer to traverse l2
	        ListNode head = l1; // pointer to the head of the result linked list, initially set to the head of l1
	        int sum = 0, carry = 0; // initialize sum and carry to 0
	        int num1 = 0, num2 = 0; // initialize num1 and num2 to 0
	        
	        // traverse both linked lists simultaneously until at least one of them is not empty
	        while (ptr1 != null || ptr2 != null) {
	            if (ptr1 != null) { // if ptr1 is not null, set num1 to its value and move ptr1 to the next node
	                num1 = ptr1.val;
	                ptr1 = ptr1.next;
	            }
	            if (ptr2 != null) { // if ptr2 is not null, set num2 to its value and move ptr2 to the next node
	                num2 = ptr2.val;
	                ptr2 = ptr2.next;
	            }
	            sum = num1 + num2 + carry; // calculate sum
	            carry = sum / 10; // calculate carry
	            sum = sum % 10; // calculate sum
	            
	            ListNode n = new ListNode(sum); // create a new node with sum as its value
	            l1.next = n; // add the new node to the result linked list
	            l1 = l1.next; // move l1 to the next node in the result linked list
	            num1 = 0;
	            num2 = 0;
	            sum = 0;
	        }
	        if (carry != 0) { // if there is a remaining carry, add a new node to the result linked list with the carry as its value
	            ListNode n = new ListNode(carry);
	            l1.next = n;
	            l1 = l1.next;
	        }
	        return head.next; // return the head of the result linked list (excluding the dummy node)
	    }
	}

