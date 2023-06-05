package com.example.myactiviti;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Mytest 
 * @Description: TODO
 * @author: wangxs
 * @date: 2023/5/22 17:43 
 * @Version 1.0
 */
public class Mytest {
    public static void main(String[] args) {
        /*
        * 算法一:输出数组重复/不重复数据
        * */
        int[] arr = {1,1,3,10,12,15,3,6,8,15,1};
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for( int j = 0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count != 1){
                set.add(arr[i]);
            }
        }
        System.out.println(set);

        /*
         * java位运算
         * */
        //位于（&）
        System.out.println(5 & 3);

        /*
         *  测试堆、栈内存溢出
         * */

    }




}

