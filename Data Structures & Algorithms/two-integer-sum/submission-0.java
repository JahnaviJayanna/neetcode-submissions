class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diff = new HashMap();
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            if(diff.containsKey(val)){
                return new int[]{diff.get(val),i};
            }
            diff.put(target-val, i);
        }
        return null;
    }
}
