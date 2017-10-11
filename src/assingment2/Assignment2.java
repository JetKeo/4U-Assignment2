/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment2;

/**
 *
 * @author jetkeo
 */
public class Assignment2 {

    int sum = 0;

    public int digitalSum(int n) {
        //BASE CASE
        //check if we are done
        if (n == 0) {
            //hold the sum number
            int temp = sum;
            //reset sum to 0 
            sum = 0;
            return temp;

        } else {
            //get the very right number
            int rnum = n % 10;
            //add the very right number to the sum
            sum = sum + rnum;
            //get rid of the very right number
            return digitalSum(n / 10);

        }

    }

    public int digitalRoot(int n) {
        //use the method digitalSum to get the total sum 
        int sum2 = digitalSum(n);
        //if number is less than 10 thats the final number
        if (sum2 < 10) {
            return sum2;

        } else {
            //if not under ten run the digitalSum again to get the total sum of
            //of the sum just found
            return digitalRoot(sum2);
        }
    }

    public int triangle(int n) {
        if (n <= 0) {
            return n;
        }
        //base case
        if (n == 1) {
            return 1;

        } else {
            //return n + n - 1
            return (n + triangle(n - 1));
        }
    }

    public int hailstone(int n) {
        int num = n;
        System.out.println(num);
        //base case
        if (n == 0 || n == 1) {
            return n;

        } else {
            //if there is no remainder
            //means its even so divide by 2
            if (n % 2 == 0) {
                num = n / 2;
                //else its odd so multiply by 3 and add 1    
            } else {
                num = 3 * n + 1;

            }
            n = num;
            return hailstone(n);

        }

    }

    public String binaryConvert(int n) {
        if (n <= 0) {
            return "Not a positive integer";

        }
        String x = "" + n;
        //base case
        if (n == 1) {
            return x;

        } else {
            //if n is even divide by 2 amd return 0
            if (n % 2 == 0) {
                return binaryConvert(n / 2) + "0";
                //else it is odd, divide by 0 return 1
            } else {
                return binaryConvert(n / 2) + "1";
            }
        }
    }

    public String convert(int n, int b) {
        //create variables for the remainder and
        int x = n % b;
        int y = n / b;
        //gives letters if a certain number
        if (x >= 10 || x <= 15) {
            if (x == 10) {
                return convert(y, b) + "A";
            }
            if (x == 11) {
                return convert(y, b) + "B";
            }
            if (x == 12) {
                return convert(y, b) + "C";
            }
            if (x == 13) {
                return convert(y, b) + "D";
            }
            if (x == 14) {
                return convert(y, b) + "E";
            }
            if (x == 15) {
                return convert(y, b) + "F";
            }
            //returns remainder
        } else if (y > 15) {
            return Integer.toString(n);

        }
        if (y == 0) {
            return Integer.toString(x);
            //goes back with y and b plus returns he remainder
        } else {
            return convert(y, b) + Integer.toString(x);
        }

    }

    public boolean isPalindrome(String word) {
         //if the length of the word is 0 or 1 it is a palindrome
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        //if the first and last word are the same repeat for the next set of letters
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        //if it doesnt match return as false
        return false;
    }

    public static void main(String[] args) {
        Assignment2 test = new Assignment2();
        System.out.println("----------------");
        System.out.println("Problem 1 - digitalSum ");
        System.out.println("0:");
        int bound1 = test.digitalSum(0);
        System.out.println(bound1);
        System.out.println("126:");
        int norm1 = test.digitalSum(126);
        System.out.println(norm1);
        System.out.println("51256:");
        int norm3 = test.digitalSum(51256);
        System.out.println(norm3);
        System.out.println("----------------");

        System.out.print("");

        System.out.println("----------------");
        System.out.println("Problem 2 - digitalRoot");
        System.out.println("9:");
        int bound2 = test.digitalRoot(9);
        System.out.println(bound2);
        System.out.println("2019:");
        int norm2 = test.digitalRoot(2019);
        System.out.println(norm2);
        System.out.println("----------------");

        System.out.print("");

        System.out.println("----------------");
        System.out.println("Problem 3 - triangle");
        System.out.println("0:");
        int bound3 = test.triangle(0);
        System.out.println(bound3);
        System.out.println("3:");
        int norm4 = test.triangle(3);
        System.out.println(norm4);
        System.out.println("----------------");

        System.out.print("");

        System.out.println("----------------");
        System.out.println("Problem 4 - hailstone");
        System.out.println("0:");
        int bound4 = test.hailstone(0);
        System.out.println(bound4);
        System.out.println("");
        System.out.println("5:");
        int norm5 = test.hailstone(5);
        System.out.println(norm5);
        System.out.println("");
        System.out.println("12:");
        int norm6 = test.hailstone(12);
        System.out.println(norm6);
        System.out.println("----------------");

        System.out.print("");

        System.out.println("----------------");
        System.out.println("Problem 5 - binaryConvert");
        System.out.println("0:");
        String bound6 = test.binaryConvert(0);
        System.out.println(bound6);
        System.out.println("1:");
        String bound5 = test.binaryConvert(1);
        System.out.println(bound5);
        System.out.println("156:");
        String norm7 = test.binaryConvert(156);
        System.out.println(norm7);
        System.out.println("13:");
        String norm8 = test.binaryConvert(13);
        System.out.println(norm8);
        System.out.println("1000:");
        String norm9 = test.binaryConvert(1000);
        System.out.println(norm9);
        System.out.println("----------------");

        System.out.print("");
        System.out.println("----------------");
        System.out.println("Problem 6 - convert");
        System.out.println("1000,16:");
        String norm11 = test.convert(1000, 16);
        System.out.println(norm11);
        System.out.println("1000,8:");
        String norm10 = test.convert(1000, 8);
        System.out.println(norm10);
        System.out.println("1000,2:");
        String norm12 = test.convert(1000, 2);
        System.out.println(norm12);
        
        System.out.print("");
        System.out.println("----------------");
        System.out.println("Problem 7 - palindronme");
        System.out.println("racecar");
        boolean norm13 = test.isPalindrome("racecar");
        System.out.println(norm13);
        System.out.println("radar");
        boolean norm14 = test.isPalindrome("radar");
        System.out.println(norm14);
        System.out.println("jet");
        boolean norm15 = test.isPalindrome("jet");
        System.out.println(norm15);
        
    }

}

