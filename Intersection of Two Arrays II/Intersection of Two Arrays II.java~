import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	public static void main(String[] args) {

		int nums1[] = {1};
		int nums2[] = {1,1};
 		int[] a  = hashMap(nums1, nums2);
		System.out.println(" ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	
        List<Integer> num1 = new ArrayList<Integer>();
        List<Integer> num2 = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int size1 = nums1.length;
        int size2 = nums2.length;
        int target1 = 0;
        int target2 = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        
        for(int i = 0; i < size1; i++) {
            num1.add(nums1[i]);
            System.out.print(" "+num1.get(i));
        }
        System.out.println("  ");
        for(int j = 0; j < size2; j++) {
            num2.add(nums2[j]);
            System.out.print(" "+num2.get(j));
        }
        
        while (!flag1) {
        	target1++;
        	if(!num1.contains(target1) && !num2.contains(target1)){
        		flag1 = true;
        	}
        }
        
        while (!flag2) {
        	target2++;
        	if(!num1.contains(target2) && !num2.contains(target2) && target2 != target1){
        		flag2 = true;
        	}
        }
        
        if(size1 < size2){
            for(int i = 0; i < num2.size(); i++) {
                for(int j = 0; j < num1.size(); j++) {
                    if(num2.get(i) == num1.get(j)) {
                        result.add(num2.get(i));
                        num1.set(j, target1); 
                        num2.set(i, target2);
                    }
                }
            }
        }else {
            for(int i = 0; i < num1.size(); i++) {
                for(int j = 0; j < num2.size(); j++) {
                    if(num1.get(i) == num2.get(j)) {
                        result.add(num1.get(i));
                        num1.set(i, target1); 
                        num2.set(j, target2);
                    }
                }
            }
        }
        int[] array = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
    
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
