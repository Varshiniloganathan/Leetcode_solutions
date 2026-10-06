class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int l = nums[i] - 1;
                int r = nums[i] + 1;
                int sum = 0;
                if (map.containsKey(l)) {
                    sum = sum + map.get(l);

                }
                if (map.containsKey(r)) {
                    sum = sum + map.get(r);
                }
                map.put(nums[i], sum + 1);
                if (map.containsKey(l)) {
                    map.put(nums[i] - map.get(l), sum + 1);

                }
                if (map.containsKey(r)) {
                    map.put(nums[i] + map.get(r), sum + 1);

                }
                if ((sum + 1) >= max)
                    max = sum + 1;

            }

        }
        return max;

    }
}
