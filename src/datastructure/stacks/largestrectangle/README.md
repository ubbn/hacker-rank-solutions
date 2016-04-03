There are N buildings in a certain two-dimensional landscape. Each building has a height given by hi,i∈[1,N]hi,i∈[1,N]. If you join K adjacent buildings, they will form a solid rectangle of area K×min(hi,hi+1,…,hi+k−1)K×min(hi,hi+1,…,hi+k−1).

Given N buildings, find the greatest such solid area formed by consecutive buildings.

Input Format 
The first line contains N, the number of buildings altogether. 
The second line contains N space-separated integers, each representing the height of a building.

Constraints 

1≤N≤10^51
1≤hi≤10^61

Output Format 

One integer representing the maximum area of rectangle formed.

Sample Input

5
1 2 3 4 5
Sample Output

9

Explanation 

An illustration of the test case follows.

![Explanation](https://s3.amazonaws.com/hr-challenge-images/8136/1436794554-75e178e325-drawing47.svg?raw=true "Title")
