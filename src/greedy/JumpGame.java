package greedy;

/**
 * Determines if you can reach the last index of the array.
 *
 * <p>
 * <b>Time Complexity:</b> O(N)
 * <br><b>Space Complexity:</b> O(1)
 */
class JumpGame{
    public boolean canJump(int[]nums){
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
        // If current index is unreachable
        if(i>maxReach){return false;}

        // Update the farthest reachable index
        maxReach=Math.max(maxReach,i+nums[i]);}

        return true;
    }
}