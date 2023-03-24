class Solution {
    public static void solve(int i , int j , int[][] m ,int n,ArrayList<String> ans,String path,int[][] visited,int[] di,int[] dj){
        if(i == n-1 && j == n-1){
            ans.add(path);
            return ;
        }
        String dir = "DLRU";
        for(int ind = 0; ind<4; ind++){
            int next_i = i+di[ind];
            int next_j = j+dj[ind];
            
            if(next_i >=0 && next_j >=0 && next_i <n && next_j <n && visited[next_i][next_j]==0 && m[next_i][next_j] == 1){
                 visited[i][j] = 1;
                 solve(next_i,next_j,m,n,ans,path+dir.charAt(ind),visited,di,dj);
                 visited[i][j] = 0;
            }
         }
        
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int[][] visited = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                visited[i][j] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        int[] di = {1,0,0,-1};
        int[] dj = {0,-1,1,0};
        if(m[0][0] == 1){
            solve(0,0,m,n,ans,"",visited,di,dj);
        }
        
        return ans;
    }
}
