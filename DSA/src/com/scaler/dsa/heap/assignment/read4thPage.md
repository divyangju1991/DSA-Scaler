**Magician and Chocolates**<br />
**Problem Description**<br />
Given N bags, each bag contains Bi chocolates. There is a kid and a magician.<br />
In a unit of time, the kid can choose any bag i, and eat Bi chocolates from it, then the magician will fill the ith bag with floor(Bi/2) chocolates.<br />

Find the maximum number of chocolates that the kid can eat in A units of time.<br />

NOTE:<br /><br />

floor() function returns the largest integer less than or equal to a given number.<br />
Return your answer modulo 10^9+7.<br />
<br />
<br />
**Problem Constraints**<br />
1 <= N <= 100000<br />
0 <= B[i] <= INT_MAX<br />
0 <= A <= 105<br />
<br />
<br />
**Input Format**<br />
The first argument is an integer A.<br />
The second argument is an integer array B of size N.<br />
<br />
<br />
**Output Format**<br />
Return an integer denoting the maximum number of chocolates the kid can eat in A units of time.<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
 A = 3<br />
 B = [6, 5]<br />
Input 2:<br />
 A = 5<br />
 b = [2, 4, 6, 8, 10]<br />
<br />
**Example Output**<br />
Output 1:<br />
 14<br />
Output 2:<br />
 33<br />
<br />
**Example Explanation**
Explanation 1:<br />
   At t = 1 kid eats 6 chocolates from bag 0, and the bag gets filled by 3 chocolates. <br />
 At t = 2 kid eats 5 chocolates from bag 1, and the bag gets filled by 2 chocolates. <br />
 At t = 3 kid eats 3 chocolates from bag 0, and the bag gets filled by 1 chocolate. <br />
 so, total number of chocolates eaten are 6 + 5 + 3 = 14<br />
Explanation 2:<br />
   Maximum number of chocolates that can be eaten is 33.<br /><br />
										   
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/assignment/read3rdPage.md"><div class="Pagination-text3yhjKs84FCa6 Pagination-text_right3I2htOlt_CfS">Prev</div><span class="Pagination-iconGA9TkfVeYvTp icon-arrow-right2"></span></a>
<p align="right"><a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/assignment/read.md">Next</a></p>
