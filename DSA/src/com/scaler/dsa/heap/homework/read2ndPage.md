<pre>
<b>B-th Smallest Prime Fraction</b>

<b>Problem Description</b>
Given a sorted array of integers A which contains 1 and some number of primes.
Then, for every p < q in the list, we consider the fraction p / q.
What is the B-th smallest fraction considered?
Return your answer as an array of integers, where answer[0] = p and answer[1] = q.

<b>Problem Constraints</b>
1 <= length(A) <= 2000
1 <= A[i] <= 30000
1 <= B <= length(A)*(length(A) - 1)/2

<b>Input Format</b>
The first argument of input contains the integer array, A.
The second argument of input contains an integer B.

<b>Output Format</b>
Return an array of two integers, where answer[0] = p and answer[1] = q.

<b>Example Input</b>
Input 1:
 A = [1, 2, 3, 5]
 B = 3
Input 2:
 A = [1, 7]
 B = 1

<b>Example Output</b>
Output 1:
 [2, 5]
Output 2:
 [1, 7]

<b>Example Explanation</b>
Explanation 1:
 The fractions to be considered in sorted order are:
 [1/5, 1/3, 2/5, 1/2, 3/5, 2/3]
 The third fraction is 2/5.
Explanation 2:
 The fractions to be considered in sorted order are:
 [1/7]
 The first fraction is 1/7.		
 
</pre>                                         
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_leftDFtcFdHnt7Ok" aria-label="Previous Page: Manage Pages" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/homework/read.md">Prev</a>
<p align="right"><a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/homework/read3rdPage.md">Next</a></p>
