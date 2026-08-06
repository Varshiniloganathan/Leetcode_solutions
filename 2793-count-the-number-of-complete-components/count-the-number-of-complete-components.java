class Solution {
    public Map<Integer,List<Integer>> createGraph(int n, int[][] edges){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u,new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }

    public boolean bfs(int source, int[][] edges, Map<Integer, List<Integer>> graph, Set<Integer> visited, int count){

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited.add(source);
        int vertices = 0;
        int degree = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            vertices++;
            degree+= graph.getOrDefault(curr,Collections.emptyList()).size();
           for(int neighbor : graph.getOrDefault(curr,Collections.emptyList())){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                q.add(neighbor);
            }
           }
        }

        return vertices*(vertices-1) == degree;
    }
    public int countCompleteComponents(int n, int[][] edges) {

        Map<Integer, List<Integer>> graph = createGraph(n, edges);
        Set<Integer> visited = new HashSet<>();
        int count = 0;

        for(int i=0; i<n; i++){
            if(!visited.contains(i)) {
               if(bfs(i, edges, graph, visited, count) == true){
                count++;

               }
            }
            
        }

        return count;
        
    }
}