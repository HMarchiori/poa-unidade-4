package br.pucrs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class Exercicio1Test {


    @Test
    void shouldMergeSort() {

        int[] nums = new java.util.Random().ints(32, 0, 100).toArray();
        int[] expected = nums.clone();
        java.util.Arrays.sort(expected);
        Exercicio1.mergeSort(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        Assertions.assertArrayEquals(expected, nums);
    }
}