**Connect ropes**<br /><br />
**Problem Description**<br />
You are given an array A of integers that represent the lengths of ropes.<br />

You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.<br />

Find and return the minimum cost to connect these ropes into one rope.<br />
<br />
<br />
**Problem Constraints**<br />
1 <= length of the array <= 100000<br />
1 <= A[i] <= 1000<br />
<br />
<br />
**Input Format**<br />
The only argument given is the integer array A.<br />
<br />
<br />
**Output Format**<br />
Return an integer denoting the minimum cost to connect these ropes into one rope.<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
  A = [1, 2, 3, 4, 5]<br />
Input 2:<br />
 A = [5, 17, 100, 11]<br />
<br />
**Example Output**<br />
Output 1:<br />
  33<br />
Output 2:<br />
  182<br />
<br />
**Example Explanation**
Explanation 1:<br />
 Given array A = [1, 2, 3, 4, 5].<br />
 Connect the ropes in the following manner:<br />
 1 + 2 = 3<br />
 3 + 3 = 6<br />
 4 + 5 = 9<br />
 6 + 9 = 15<br />

 So, total cost  to connect the ropes into one is 3 + 6 + 9 + 15 = 33.<br />
Explanation 2:<br />
 Given array A = [5, 17, 100, 11].<br />
 Connect the ropes in the following manner:<br />
 5 + 11 = 16<br />
 16 + 17 = 33<br />
 33 + 100 = 133<br />

 So, total cost  to connect the ropes into one is 16 + 33 + 133 = 182.<br /><br />
										   
<p align="right"><a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/heap/assignment/read2ndPage.md">Next</a></p>
