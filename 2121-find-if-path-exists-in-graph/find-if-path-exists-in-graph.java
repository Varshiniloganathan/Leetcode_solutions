class Solution {
    public boolean dfs(Map<Integer, List<Integer>> graph, int source, int destination, Set<Integer> visited) {
        Stack<Integer> st = new Stack<>();
        st.push(source);
        while (!st.isEmpty()) {
            int curr = st.pop();

            
            if (curr == destination)
                return true;
            if (!visited.contains(curr)) {
                visited.add(curr);
                for (int neighbor : graph.get(curr)) {
                    st.push(neighbor);
                }

            }

        }
        return false;
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
        return dfs(graph, source, destination, visited);

    }
}