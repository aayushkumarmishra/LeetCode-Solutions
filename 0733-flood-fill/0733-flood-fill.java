class Solution {
    
    private void dfs(int image[][], int row, int col, int color, int iniColor, 
                  int ans[][], int deltaRow[], int deltaCol[])
    {
        ans[row][col] = color;
        int n = image.length;
        int m = image[0].length;
        
        for(int i = 0; i < 4; i++)
        {
            int newRow = row + deltaRow[i];
            int newCol = col + deltaCol[i];
            
            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && image[newRow][newCol] == iniColor
              && ans[newRow][newCol] != color)
            {
                dfs(image, newRow, newCol, color, iniColor, ans, deltaRow, deltaCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int iniColor = image[sr][sc];
        
        int ans[][] = image;
        
        int deltaRow[] = {-1, 0, +1, 0};
        int deltaCol[] = {0, +1, 0, -1};
        
        dfs(image, sr, sc, color, iniColor, ans, deltaRow, deltaCol);
        return ans;
        
    }
}