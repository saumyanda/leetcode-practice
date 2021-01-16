class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        int x1=rec1[0], y1=rec1[1], x2=rec1[2], y2=rec1[3];
        int x3=rec2[0], y3=rec2[1], x4=rec2[2], y4=rec2[3];
        
        if(y3>=y2 || y1>=y4)
            return false;
        else if(x1>=x4 || x3>=x2)
            return false;
        else
            return true;
        
    }
}
