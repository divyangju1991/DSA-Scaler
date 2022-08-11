**Count Rectangles**<br /><br />
**Problem Description**<br />
Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N represents a unique point (x, y) in a 2-D Cartesian plane.<br />

Find and return the number of unordered quadruplet (i, j, k, l) such that (A[i], B[i]), (A[j], B[j]), (A[k], B[k]) and (A[l], B[l]) form a rectangle with the rectangle having all the sides parallel to either x-axis or y-axis.<br />
<br />
<br />
**Problem Constraints**<br />
1 <= N <= 2000\n
0 <= A[i], B[i] <= 109<br />
<br />
<br />
**Input Format**<br />
The first argument given is the integer array A.<br />
The second argument given is the integer array B.<br />
<br />
<br />
**Output Format**<br />
Return the number of unordered quadruplets that form a rectangle.<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
 A = [1, 1, 2, 2]<br />
 B = [1, 2, 1, 2]<br />
Input 1:<br />
 A = [1, 1, 2, 2, 3, 3]<br />
 B = [1, 2, 1, 2, 1, 2]<br />
<br />
**Example Output**<br />
Output 1:<br />
 1<br />
Output 2:<br />
 3<br />
<br />
**Example Explanation**
Explanation 1:<br />
 All four given points make a rectangle. So, the answer is 1.<br />
Explanation 2:<br />
 3 quadruplets which make a rectangle are: (1, 1), (2, 1), (2, 2), (1, 2)
                                           (1, 1), (3, 1), (3, 2), (1, 2)
                                           (2, 1), (3, 1), (3, 2), (2, 2)<br /><br />
										   
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/hashing/assignment/read2ndPage.md" style="padding-left: 80%;"><div class="Pagination-text3yhjKs84FCa6 Pagination-text_right3I2htOlt_CfS">Next</div><span class="Pagination-iconGA9TkfVeYvTp icon-arrow-right2"></span></a>
