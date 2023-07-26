package org.example.test;

public class Test {
    public static boolean checkOneEditString(String str1,String str2)
    {
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        if(lenStr2>lenStr1)
        {
            if(lenStr1!=lenStr2-1) // acc and accde
                return false;

        }
        else if(lenStr1>lenStr2)
        {
            if(lenStr2 != lenStr1-1) // accde and acc
                return false;
        }
        int minLength  = Math.min(lenStr1,lenStr2); // acc and accd
        int count = 0;
        for(int i=0;i<minLength;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i)) // acc abd
                count++; // 1
        }
        return (count==1)?true:false;
    }
    //abc
    //acc
    //accde
    public static void main(String[] args) {
        String str1 = "acc";
        String str2 = "acb";
        System.out.println(checkOneEditString(str1,str2));
    }
}
