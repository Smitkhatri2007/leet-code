class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else  {
                map.put(nums[i], 1);
            }
        }
        Integer maxKey = null;
        Integer maxValue = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((maxValue == null) || (entry.getValue().compareTo(maxValue) > 0)) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return  maxKey;
    }
}