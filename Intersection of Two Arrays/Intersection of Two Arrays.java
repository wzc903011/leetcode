// Given two arrays, write a function to compute their intersection.


public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        if(size1 == 0 || size2 == 0) return new int[0];
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < size1; i++) {
            int temp = nums1[i];
            for (int j = 0; j < size2; j++) {
                if (nums2[j] == temp) {
                    resultSet.add(temp);
                    break;
                }
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer i : resultSet) {
            result[index++] = i;
        }
        return result;
    }
}