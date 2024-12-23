class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }

        int i=0;
        while(i<list.size()){
            int j = i+1;
            while(j<list.size()){
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                }else{
                    j++;
                }
            }
            i++;
        }

        for(i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }

        return list.size();
    }
}