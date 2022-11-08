**Product of 3**<br /><br />
**Problem Description**<br />
Given an integer array A of size N.<br />

You have to find the product of the three largest integers in array A from range 1 to i, where i goes from 1 to N.<br />

Return an array B where B[i] is the product of the largest 3 integers in range 1 to i in array A. If i < 3, then the integer at index i in B should be -1.<br />
<br />
<br />
**Problem Constraints**<br />
1 <= N <= 10^5<br />
0 <= A[i] <= 10^3<br />
<br />
<br />
**Input Format**<br />
First and only argument is an integer array A.<br />
<br />
<br />
**Output Format**<br />
Return an integer array B. B[i] denotes the product of the largest 3 integers in range 1 to i in array A.<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
  A = [1, 2, 3, 4, 5]<br />
Input 2:<br />
 A = [10, 2, 13, 4]<br />
<br />
**Example Output**<br />
Output 1:<br />
 [-1, -1, 6, 24, 60]<br />
Output 2:<br />
 [-1, -1, 260, 520]<br />
<br />
**Example Explanation**<br />
Explanation 1:<br />
 For i = 1, ans = -1<br />
 For i = 2, ans = -1<br />
 For i = 3, ans = 1 * 2 * 3 = 6<br />
 For i = 4, ans = 2 * 3 * 4 = 24<br />
 For i = 5, ans = 3 * 4 * 5 = 60<br />

 So, the output is [-1, -1, 6, 24, 60].<br />
 <br /><br />
										   
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_leftDFtcFdHnt7Ok" aria-label="Previous Page: Manage Pages" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/assignment/read2ndPage.md">Prev</a>
<p align="right"><a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/assignment/read4thPage.md">Next</a></p>
