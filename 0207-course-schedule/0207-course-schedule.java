class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int[] p:prerequisites){
            int course=p[0];
            int preCourse=p[1];
            adj.get(preCourse).add(course);
            int[]vis = new int[numCourses];
            int[]pathvis = new int[numCourses];
            for(int i=0;i<numCourses;i++){
                if(vis[i] == 0){
                    if(dfs(i,adj,vis,pathvis))
                        return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,int[]vis,int[]pathvis){
        vis[node]=1;
        pathvis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i] == 0){
                if(dfs(i,adj,vis,pathvis))
                    return true;
            }
            else if(pathvis[i] == 1)
                return true;
        }
        pathvis[node]=0;
        return false;
    }
}