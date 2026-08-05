class Solution {
    public boolean bfs(Map<Integer, List<Integer>> graph, int source, int destination, Set<Integer> visited) {
        // Stack<Integer> st = new Stack<>();
        // st.push(source);
        // while (!st.isEmpty()) {
        //     int curr = st.pop();

        //     if (curr == destination)
        //         return true;
        //     if (!visited.contains(curr)) {
        //         visited.add(curr);
        //         for (int neighbor : graph.get(curr)) {
        //             st.push(neighbor);
        //         }

        //     }

        // }
        // return false;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == destination)
                return true;
            if (!visited.contains(curr)) {
                visited.add(curr);
                for (int neighbor : graph.get(curr)) {

                    q.add(neighbor);
                }

            }

        }
        return false;

        // if(source == destination) return true;

        //     for(int neighbor : graph.get(source)){
        //         if(!visited.contains(neighbor)){

        //            if( dfs(graph,neighbor,destination,visited)) return true;

        //         }

        //     }

        // return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);

        }
        return bfs(graph, source, destination, visited);

    }
}