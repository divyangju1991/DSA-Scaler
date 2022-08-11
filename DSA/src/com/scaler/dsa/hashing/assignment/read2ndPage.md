 **Count Right Triangles**<br /><br />
**Problem Description**<br />
Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N represents a unique point (x, y) in 2D Cartesian plane.<br />

Find and return the number of unordered triplets (i, j, k) such that (A[i], B[i]), (A[j], B[j]) and (A[k], B[k]) form a right-angled triangle with the triangle having one side parallel to the x-axis and one side parallel to the y-axis.<br />

NOTE: The answer may be large so return the answer modulo (10^9 + 7).<br />
<br />
<br />
**Problem Constraints**<br />
1 <= N <= 105<br />
0 <= A[i], B[i] <= 10^9<br />
<br />
<br />
**Input Format**<br />
The first argument given is an integer array A.<br />
The second argument given is the integer array B.<br />
<br />
<br />
**Output Format**<br />
Return the number of unordered triplets that form a right angled triangle modulo (10^9 + 7).<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
 A = [1, 1, 2]<br />
 B = [1, 2, 1]<br />
Input 2:<br />
 A = [1, 1, 2, 3, 3]<br />
 B = [1, 2, 1, 2, 1]<br />
<br />
**Example Output**<br />
Output 1:<br />
 1<br />
Output 2:<br />
 6<br />
<br />
**Example Explanation**
Explanation 1:<br />
 All three points make a right angled triangle. So return 1.<br />
Explanation 2:<br />
 6 triplets which make a right angled triangle are:    (1, 1), (1, 2), (2, 2)
                                                       (1, 1), (3, 1), (1, 2)
                                                       (1, 1), (3, 1), (3, 2)
                                                       (2, 1), (3, 1), (3, 2)
                                                       (1, 1), (1, 2), (3, 2)
                                                       (1, 2), (3, 1), (3, 2)
                                           
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_leftDFtcFdHnt7Ok" aria-label="Previous Page: Manage Pages" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/hashing/assignment/read.md"><span class="Pagination-iconGA9TkfVeYvTp icon-arrow-left2"></span><div class="Pagination-text3yhjKs84FCa6 Pagination-text_left3HzCMqntTYq5">Prev</div></a>
<p align="right"><a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/hashing/assignment/read3rdPage.md">Next</a></p>
