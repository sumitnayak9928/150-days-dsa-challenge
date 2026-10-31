class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // for (int num : nums){ yeh bhi kaam karega , balki yeh jada best hai
            for (int i = 0; i<nums.length; i++){
               int num = nums[i];
            if (set.contains(num)){
                return true;
            }
            else {
                set.add(num);
            }
        }return false;
    }
}
