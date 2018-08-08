// Problem Source : https://oj.leetcode.com/problems/palindrome-number/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 05-02-2018

/*****************************************************************************
* Determine whether an integer is a palindrome. An integer is a palindrome
* when it reads the same backward as forward.
******************************************************************************/

/*****************************************************************************
* Solution: This problem is similar to the reverse integer problem, we will be
* generating a reverse number and when reverse number is bigger than give number
* we stop and check if both the numbers are equal are not.
* P.S: Please check for the odd-digit number as mid way through the solution,
* we will have reverse number 10 times bigger than number.
******************************************************************************/
public class PalindromeNumber{
  public boolean isPalindrome(int number){
    if(number < 0) return false;
    if(number == 0) return number;
    int rev = 0;
    while(number > rev){
      rev = rev*10 + number%10;
      number /= 10;
    }
    return (rev == number) || (rev/10 == number);
  }
}
