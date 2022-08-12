**Window String**<br />
**Problem Description**<br />
Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.<br />
Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.<br />
<br />
Note:<br />
<br />
**If there is no such window in A that covers all characters in B, return the empty string.<br />
If there are multiple such windows, return the first occurring minimum window ( with minimum start index and length )<br />**
**Problem Constraints**<br />
1 <= size(A), size(B) <= 10^6<br />
<br />
<br />
**Input Format**<br />
The first argument is a string A.<br />
The second argument is a string B.<br />
<br />
<br />
**Output Format**<br />
Return a string denoting the minimum window.<br />
<br />
<br />
**Example Input**<br />
Input 1:<br />
 A = "ADOBECODEBANC"<br />
 B = "ABC"<br />
Input 2:<br />
 A = "Aa91b"<br />
 B = "ab"<br />
<br />
**Example Output**<br />
Output 1:<br />
 "BANC"<br />
Output 2:<br />
  "a91b"<br />
<br />
**Example Explanation**
Explanation 1:<br />
  "BANC" is a substring of A which contains all characters of B.<br />
Explanation 2:<br />
 "a91b" is the substring of A which contains all characters of B.<br /><br />
										   
<a class="Pagination-link1SfnH-8-DxMA Pagination-link_right2v3HzuwWFxb4" aria-label="Next Page: Raw Mode Editor" href="https://github.com/divyangju1991/DSA-Scaler/blob/main/DSA/src/com/scaler/dsa/hashing/assignment/read4thPage.md"><div class="Pagination-text3yhjKs84FCa6 Pagination-text_right3I2htOlt_CfS">Prev</div><span class="Pagination-iconGA9TkfVeYvTp icon-arrow-right2"></span></a>
