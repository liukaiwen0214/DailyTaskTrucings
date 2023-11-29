package com.imax.others;


import java.util.TreeSet;

/**
 * 现有一个包含所有正整数的集合 [1, 2, 3, 4, 5, ...] 。
 * 实现 SmallestInfiniteSet 类：
 * SmallestInfiniteSet() 初始化 SmallestInfiniteSet 对象以包含 所有 正整数。
 * int popSmallest() 移除 并返回该无限集中的最小整数。
 * void addBack(int num) 如果正整数 num 不 存在于无限集中，则将一个 num 添加 到该无限集中。
 *
 * @author admin
 * 2023/11/29
 */
public class SmallestInfiniteSet {
//    public TreeSet<Integer> getNumList() {
//        return numList;
//    }

    public void setNumList(TreeSet<Integer> numList) {
        this.numList = numList;
    }

    private TreeSet<Integer> numList;

    public SmallestInfiniteSet() {
    }

    public int popSmallest() {
        return numList.first();
    }

    public void addBack(int num) {
        boolean add = numList.add(num);
        if (add){
            System.out.println("数字"+num+"已经添加到集合");
        }else {
            System.out.println("集合中存在");
        }
    }
}

