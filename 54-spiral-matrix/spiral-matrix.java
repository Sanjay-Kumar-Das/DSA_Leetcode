class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int tr =0,rc =n-1,br = m-1,lc =0; 

        while(tr <= br && lc <= rc){
            // top row
            for(int i=lc;i<=rc;i++){
                ans.add(matrix[tr][i]);
            }
            // right column
            for(int j=tr+1;j<=br;j++){
                ans.add(matrix[j][rc]);
            }
            // bottom row
            for(int k=rc-1;k>=lc;k--){
                if(tr == br) break;
                ans.add(matrix[br][k]);
            }
            // left column
            for(int x =br-1;x>=tr+1;x--){
                if(lc == rc) break;
                ans.add(matrix[x][lc]);
            }
            lc++;
            tr++;
            br--;
            rc--;
        }
        return ans;
    }
}