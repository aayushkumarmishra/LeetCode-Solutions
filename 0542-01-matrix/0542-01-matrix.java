class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 0)
                {
                    q.offer(new int[]{i,j});
                }
                else
                {
                    mat[i][j] = -1;
                }
            }
        }
        
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int counter = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            counter++;
            for(int i = 0; i < size; i++)
            {
                int[] cell = q.poll();
                for(int[] dir: dirs)
                {
                    int x = dir[0] + cell[0],
                    y = dir[1] + cell[1];
                    if(x < mat.length && x >= 0 &&
                      y < mat[0].length && y >= 0){
                        if(mat[x][y] == -1){
                            mat[x][y] = counter;
                            q.offer(new int[]{x,y});
                        }
                    }
                }
            }
        }
        return mat;
    }
}