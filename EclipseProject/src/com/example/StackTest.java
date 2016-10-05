/**
 * Stack Test Sample Program (master branch)
 * This program implement 4 APIs :
 *   isEmpty()
 *   peek()
 *   pop
 *   push
 * 
 * @author SHGAN (shgan@naver.com)
 * @version 1.0, 06-1, Oct 2016 
 */

package com.example;
import com.example.Stack;

public class StackTest {
	public static void main(String[] args) {
		String input = "124*5/+7-36/+";
		Stack theStack;
		int stackSize = input.length();
		ClassInt a=null, b=null, c=null;
    	boolean ret=true;

    	theStack = new Stack(stackSize);
	    for (int j = 0; j < stackSize; j++) {
	    	char ch = input.charAt(j);
	    	switch (ch) {    	    
	    		case '+': 
	    			b = theStack.pop(); 
	    			a = theStack.pop(); 
	    			c = new ClassInt(a.data + b.data); 
	    			ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR A !!! ");
	    			}
	    			break;
   	            case '-':
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data - b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR B !!! ");
	    			}
   	            	break;
   	            case '*': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data * b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR C !!! ");
	    			}
   	            	break;
   	            case '/': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data / b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR D !!! ");
	    			}
   	            	break;
   	            default: 
   	            	c = new ClassInt(Integer.parseInt(""+ch));
   	            	ret = theStack.push(c); 
	    			if (ret == false) {
	    				System.out.println("The Stack operation ERROR E!!! ");
	    			}
   	                break;
   	         }
	    }
	    a = theStack.pop();
	    System.out.println("The value is " + a.data);
	}
}
