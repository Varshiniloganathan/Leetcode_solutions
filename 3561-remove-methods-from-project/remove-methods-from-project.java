class Solution {
    public Map<Integer,List<Integer>> createGraph(int[][] edges){
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u,new ArrayList<>());
            graph.get(u).add(v);
        }
        return graph;
    }

    public Set<Integer> suspecious(int k, int[][] invocations, Map<Integer,List<Integer>> graph, Set<Integer> visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited.contains(curr)){
                visited.add(curr);
                for(int neighbor: graph.getOrDefault(curr, Collections.emptyList())){
                    q.add(neighbor);
                }
            }
        }
        return visited;


    }

    // public List<Integer> bfs(int k, int[][] invocations, Map<Integer,List<Integer>> graph,Set<Integer> sus, int source, List<Integer> ans,Set<Integer> visited){

    //     if(sus.contains(source) || visited.contains(source)) return ans;

    //     Queue<Integer> q = new LinkedList<>();
    //         q.add(source);
    //         visited.add(source);
    //         while(!q.isEmpty()){
    //             int curr = q.poll();
    //             ans.add(curr);
    //             for(int neighbor : graph.getOrDefault(curr, Collections.emptyList())) {
    //                 // ans.add(neighbor);
    //                 if(!visited.contains(neighbor)){
    //                     q.add(neighbor);
    //                     visited.add(neighbor);

    //                 }
                    
    //             }

                
    //         }

    //     return ans;
       


    // }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
       Map<Integer,List<Integer>> graph = createGraph(invocations);
       Set<Integer> sus = new HashSet<>();
       Set<Integer> visited = new HashSet<>();
       sus = suspecious(k, invocations, graph, sus);
       List<Integer> ans = new ArrayList<>();
       for(int[] edge : invocations){
        int u = edge[0];
        int v = edge[1];
        if(!sus.contains(u) && sus.contains(v)){
            for(int i=0;i<n;i++) ans.add(i);
            return ans;
        }

        
       }
       for(int i=0;i<n;i++){
            if(!sus.contains(i)) ans.add(i);
            
        }
       return ans;

        
    }
}