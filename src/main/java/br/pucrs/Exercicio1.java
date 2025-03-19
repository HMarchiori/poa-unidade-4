package br.pucrs;

public class Exercicio1 {


    public static void mergeSort(int[] nums, int index) {
        if (index < 2) {return;}
        int med = index/2;
        int[] left = new int[med];
        int[] right = new int[index-med];
        System.arraycopy(nums, 0, left, 0, med);
        if (index - med >= 0) System.arraycopy(nums, med, right, 0, index - med);
        mergeSort(left, med);
        mergeSort(right, index - med);

        merge(nums, left, right, med, index-med);
    }

    public static void merge(int[] nums, int[] left, int[] right, int leftIndex, int rightIndex) {
        int i = 0; int j = 0; int k = 0;
        while (i < leftIndex && j < rightIndex) {
            if(left[i] <= right[j]) {
                nums[k++] = left[i++];
            }
            else {
                nums[k++] = right[j++];
            }
        }
        while (i < leftIndex) {
            nums[k++] = left[i++];
        }
        while (j < rightIndex) {
            nums[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        mergeSort(nums, 0);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}