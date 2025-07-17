package com.evaitcs.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class BasicProblems {

  /**
   * Write a program to reverse a string without using built-in reverse function
   * @param input "hello"
   * @return "olleh
   */
  public static String reverseString(String input) {
    StringBuilder answer = new StringBuilder();
    for(int i = input.length()-1; i>=0; i--){
      answer.append(input.charAt(i));
    }
    return answer.toString();
  }

  /**
   * Calculate factorial of a number using both recursive and iterative approaches
   *
   * @param n 5
   * @return 120
   */
  public static int factorial(int n) {
    if(n < 1){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    return n * factorial(n-1);
  }

  // Iterative apporach
  public static int Ifactorioal(int n){
    if(n < 1){
      return 0;
    }
    int answer = 1;
    for(int i = 2; i<=n; i++){
      answer *= i;
    }
    return answer;
  }


  /**
   * Determine if a given number is prime
   * @param n 17
   * @return true
   */
  public static boolean isPrime(int n) {
    if(n == 1 || n == 2 || n == 0){
      return true;
    }
    for(int i = 3; i * i <= n; i+=2){
      if(n%i == 0){
        return false;
      }
    }
    return true;
  }

  /**
   * Generate Fibonacci series up to n terms
   * @return [0 1 1 2 3 5]
   */
  public static List<Integer> fibonacciSeries(int n) {
    if(n==1){
      return Arrays.asList(0);
    }
    if(n == 2){
      return Arrays.asList(0,1);
    }
    int prev = 0;
    int current = 1;
    ArrayList<Integer> answer = new ArrayList<Integer>();
    answer.add(0);
    answer.add(1);
    for(int i = 3; i<n; i++){
      answer.add(prev+current);
      int temp = prev;
      prev = current;
      current = temp+current;
      System.out.println(current + " " + prev);
    }
    return answer;
  }

  /**
   * Check if a string is palindrome
   * @param word racecar
   * @return true
   */
  public static boolean palindromeCheck(String word) {
    if((word.length() % 2) == 0){
      int x = word.length()-1;
      for(int i = 0; i<x; i++){
        if(word.charAt(i) == word.charAt(x)){
          //Yay!
        }
        else{
          return false;
        }
        x--;
      }
    }
    else{
      int x = word.length()-1;
      for(int i = 0; i<=x; i++){
        if(word.charAt(i) != word.charAt(x)){
          return false;
        }
        x--;
      }
    }
    return true;
  }

  /**
   * Count number of vowels and consonants in a string
   * @param word "Hello World"
   * @return "Vowels: 3, Consonants: 7"
   */
  public static String countVowelsAndConsonants(String word) {
    int vowelCount = 0;
    int consonantCount = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    for (char c : word.toCharArray()) {
      if(Arrays.binarySearch(vowels,Character.toLowerCase(c)) >= 0){
        vowelCount++;
      }
      if(Arrays.binarySearch(consonants,Character.toLowerCase(c)) >= 0){
        consonantCount++;
      }
    }
    return "Vowels: " + vowelCount + ", Consonants: " + consonantCount;
  }

  /**
   * Check if number is Armstrong number
   * @param n 153
   * @return true (1^3 + 5^3 + 3^3 = 153)
   */
  public static boolean armstrongNumber(int n) {
    
    return false;
  }

  /**
   * Find Greatest Common Divisor of two numbers
   * @param a 48
   * @param b 36
   * @return 12
   */
  public static int findGCD(int a, int b) {
    return 0;
  }

  /**
   * Convert binary number to decimal
   * @param binaryString "1010"
   * @return 10
   */
  public static int binaryToDecimalConversion(String binaryString) {
    return 0;
  }

  /**
   * Calculate sum of digits in a number
   * @param digits 12345
   * @return 15
   */
  public static int sumOfDigits(int digits) {
    return 0;
  }


}
