package Array;
/*
    Time Complexity: O(N^3)
    Space Complexity: O(N^2)

    Where 'N' is the length of the given string.
*/

import java.util.HashSet;

public class Solution 
{
    public static int countDistinctSubstrings(String s) 
    {
        //    For storing all distinct substrings of the given string.
        HashSet<String> distinctStrings = new HashSet<String>();

        int n = s.length();

        //    Iterate through the string.
        for (int i = 0; i < n; i++) 
        {
            //    Iterate till the end.
            for (int j = i; j < n; j++) 
            {
                //    Current substring
                String temp = s.substring(i, j+1);

                //    Insert the current substring into the HashSet.
                distinctStrings.add(temp);
            }
        }

        //    Return the total number of distinct substrings.
        return (distinctStrings.size() + 1);
    }
}