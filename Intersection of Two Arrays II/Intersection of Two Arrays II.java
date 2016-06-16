import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

 class Solution {
    
    public static int[] hashMap(int[] nums1, int[] nums2){
    	HashMap<Integer,Integer> num1_map = new HashMap<Integer,Integer>();
    	HashMap<Integer,Integer> num2_map = new HashMap<Integer,Integer>();
    	List<Integer> array = new ArrayList<Integer>();
    	for(int i=0; i<nums1.length; i++) {
    		if(num1_map.containsKey(nums1[i])){
    			int count = num1_map.get(nums1[i]);
    			count++;
    			num1_map.put(nums1[i], count);
    		}else {
    			num1_map.put(nums1[i], 1);
    		}
    	}
    	
    	for(int i=0; i< nums2.length; i++) { 
    		if(num1_map.get(nums2[i]) != null && num1_map.get(nums2[i]) != 0 ) {
    			int count = num1_map.get(nums2[i]);
    			count--;
    			num1_map.put(nums2[i], count);
    			array.add(nums2[i]);
    		}
    	}
    	
    	int[] result = new int[array.size()];
        for(int i = 0; i < array.size(); i++) {
        	result[i] = array.get(i);
        }
    	return result;
    }
    
}
