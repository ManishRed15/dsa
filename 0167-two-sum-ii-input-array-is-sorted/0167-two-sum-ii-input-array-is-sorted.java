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
      
        int[] results = new int[2];
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            int sum = numbers[first] + numbers[last];
            if(sum == target){
                results[0] = first+1;
                results[1] = last+1;
                return results;
            }
            else if(sum < target){
                first++;
            }
            else{
                last--;
            }
        }
       return null; 
    }
}