class Pair{
    int row;
    int col;
    int tm;
    
    Pair(int row, int col, int tm)
    {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> q = new LinkedList<Pair>();
        
        int visited[][] = new int[n][m];
        int countFresh = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.offer(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }
                else
                {
                    visited[i][j] = 0;
                }
                
                if(grid[i][j] == 1)
                {
                    countFresh++;
                }
            }
        }
        
        int tm = 0;
        int deltaRow []= {-1, 0, +1, 0};
        int deltaCol[] = {0, +1, 0, -1};
        
        int count = 0;
        
        while(!q.isEmpty())
        {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            
            tm = Math.max(tm, t);
            q.poll();
            
            for(int i = 0; i < 4; i++)
            {
                int newRow = r + deltaRow[i];
                int newCol = c + deltaCol[i];
                
                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                && visited[newRow][newCol] == 0 &&
                grid[newRow][newCol] == 1)
                {
                    q.offer(new Pair(newRow, newCol, t + 1));
                    visited[newRow][newCol] = 2;
                    count++;
                }
            }
        }
        
        if(count != countFresh) return -1;
        return tm;
        
    }
}