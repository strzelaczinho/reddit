/*
The Fibonacci numbers are defined recursively as

f(0) = 0
f(1) = 1
f(n) = f(n-2) + f(n-1)

Find the last eight digits of f( 1018 ).

If you have some computer science and/or discrete math training, this is not very difficult, but if you don't it can be really tricky. 
You can't just write a for-loop to calculate Fibonacci numbers one by one (and you certainly can't simply implement
the recursive definition directly). That for-loop would have to run a quintillion times, and by the time it's finished,
the sun will probably have exploded. You have to be more clever than that.

I should add that the identity you need to solve this problem is on the Wikipedia page for Fibonacci numbers.
Using that identity and another algorithm solves the problem instantly (my Python program gives the answer in less than 0.1 seconds).
 */
package CHALLENGE_30_DIFFICULT_FIBONACCI_NUMBER______________;

/**
Sure, ok. First off all, since we only want the last eight digits, we're going to do every calculation to the mod of 108 .
* We don't need to store the whole number, just the last eight digits.
Second, all the math you need is in the Matrix form section of the wikipedia article on Fibonacci numbers.
* At the bottom there it gives you a formula for how to calculate Fibonacci number 2n-1 and 2n given that you know n.
* That means that you calculate very large fibonacci numbers without needing to know every number in between. 
* For instance, if you wanted to know fibonacci number 100, you would only need fibonacci numbers 50, 25, 12, 6, 3, 1.
* So instead of having to calculate 100 numbers, we only needed to calculate 5. 
* To calculate the last digits of f( 1018 ) you only need to calculate around 60 values since 260 is approximately 1018 .
Implement those two formulas at the bottom of that section (and remember to add the mod 108 ), and that's basically it.
Another technique you can use, and this was how I originally solved it, is to figure out the fibonacci numbers from the matrix form directly. 
* On that page you can see that if you take the matrix ((1,1),(1,0)) to the nth power, you will get the nth fibonacci numbers. 
* Well, you can take something to the nth power really, really fast by using the algorithms for modular exponentiation.
* Implement that pseudo-code there, but with a matrix instead of a number, and it'll give you the answer in no time.
By the way, these two ways are basically the same technique, just coming from different direction.
 */
public class asd {
    
}
