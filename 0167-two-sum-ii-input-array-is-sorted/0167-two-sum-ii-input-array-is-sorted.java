class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /* Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < numbers.length;i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i+1};
            }
                map.put(numbers[i],i+1);
        }
        return null;*/

        //Use Two-Pointer (O(N), O(1)) → When the array is sorted.
        //Use HashMap (O(N), O(N)) → When the array is not sorted.


        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum < target)
                left++;
            else if(sum > target)
                right--;
            else
                return new int[]{left+1, right+1};
        }
        return null;       
    }
}