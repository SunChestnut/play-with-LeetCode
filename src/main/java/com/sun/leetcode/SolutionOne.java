package com.sun.leetcode;

import com.sun.util.ToolUtil;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

/**
 * 题目： 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * ----------------------------------------------------------
 * 示例：
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * ----------------------------------------------------------
 *
 * @author: syl
 * @date: 2019/6/19 8:58
 **/
public class SolutionOne {

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int total;
            for (int j = i + 1; j < nums.length; j++) {
                total = nums[i] + nums[j];
                if (target == total) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
        ToolUtil.runTime(startTime);
    }
}