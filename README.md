# Total-number-of-occurrences-of-a-particular-string

<H2>Company : Cognizant genc elevate </H2><br/>

Recurring Strings In an interview, Alice was given an array of strings and was asked to find the total number of occurrences of a particular string.<br/>
Each string is made of characters ranging from A to Z. <br/>
Two strings S1 and S2 are considered same if S1 can be converted to S2 in one move or S2 can be converted to S1 in one move.<br/>
A move is defined as follows: Move: Replacing any one character of a string with the character that occurs immediately next to it in the English alphabet. <br/>
E.g A->B, B->C.... Z->A. "->" represents "replaced with". <br/>
Alice was not able to solve this question during her interview, so after the interview, she asks you for help in finding the solution. Help Alice. <br/>
Input Specification:<br/>
input1: N, denoting the total number of strings in the array. <br/>
input2: An array of N strings. <br/>
input3: String(S1) whose total occurrences are to be determined. <br/>
Output Specification: <br/>
Your function should return the number of occurrences of S1 in the given array.  <br/>

<H3>Example 1:</H3> <br/>
<b>input1:</b> 2 <br/>
<b>input2:</b> (AAAA, BAAA) <br/>
<b>input3:</b> BAAA Output: 2  <br/>

<b>Explanation:</b> (A)AAA can be converted to BAAA  <br/>

<H3>Example 2:</H3> <br/>
<b>input1:</b> 6 <br/>
<b>input2:</b> (ABCD, ACCD, ACBD, ABCD, ACCD, ACBD) <br/>
<b>input3:</b> ACCD <br/>
<b>Output:</b> 6  <br/>

<b>Explanation:</b> A(B)CD can be converted to ACCD and AC(B)D can be converted to ACCD.
