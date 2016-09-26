package com.example;

public class Stack {
    private int maxSize;
    private ClassInt[] stackArray;
    private int top;
    public Stack(int max) {
       maxSize = max;
       stackArray = new ClassInt[maxSize];
       top = -1;
    }

    public boolean push(ClassInt j) {
	   System.out.println("push i=" + top);
       if (top == (maxSize - 1)) { 
    	   return false;
       } else { 	   
    	   stackArray[++top] = j;
    	   return true;
       }
    }

    public ClassInt pop() {
 	   System.out.println("pop i=" + top);
       if (maxSize == -1) {
    	   return null;
       } else {
    	   return stackArray[top--];
       }
    }

    public ClassInt peek() {
       if (maxSize == -1) {
    	  return null;
       } else {
    	  return stackArray[top];
       }
    }
    public boolean isEmpty() {
       return (top == -1);
   }
}
