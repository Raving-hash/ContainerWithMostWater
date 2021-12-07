class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int index1=0;
        int index2=len-1;
        int res = 0;
        int cur ;
        int tem1;
        int tem2;
        //双指针法，每次比较移动较小的那个指针，逐渐逼近，有点类似于博弈论，移动小的不会有害，移动大的不会有利
        while (index1 != index2){
            tem1 = height[index1];
            tem2 = height[index2];
            cur = Math.abs(index2 - index1) * Math.min(tem1,tem2);
            res = Math.max(cur, res);
            if(tem1 > tem2){
                index2--;
            }else{
                index1++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] h ={1,2,3,2};
        int i = solution.maxArea(h);
        System.out.println("i = " + i);
    }
}