package com.imax;


import com.imax.others.SmallestInfiniteSet;


import java.io.IOException;
import java.util.TreeSet;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        TreeSet numList = new TreeSet();
        int[] nums = {5,7,3,8,23,657,453};
        for (int s:nums
             ) {
            numList.add(s);
        }
        smallestInfiniteSet.setNumList(numList);
        int i = smallestInfiniteSet.popSmallest();
        numList.remove(i);
        System.out.println("最小值是"+i+"已在集合中删除");

        smallestInfiniteSet.addBack(23);
        System.out.println(numList);
    }
}
