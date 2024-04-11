package com.Login;

public class TestClass {

	 public static void main(String[] args) {
	        // Example 2D array
	        int[][] twoDArray = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };
	        int i,j;
	        // Access an element at row 1, column 2 (indices are 0-based)
	        int element = twoDArray[1][2];

	        System.out.println("Element at row 1, column 2: " + element);

	        // Accessing elements using loops
	        System.out.println("Accessing all elements using loops:");

	        for (i = 0; i < twoDArray.length; i++) {
	            for (j = 0; j < twoDArray[i].length; j++) {
	            	
	                System.out.print(twoDArray[i][j] + " ");
	            }
	            if(twoDArray[i][j]==2) {
            		break;
            	}
	            System.out.println(); // Move to the next row in the output
	        }
	    }
}
