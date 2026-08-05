class Solution {
    public Map<Integer, List<Integer>> createGraph(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.get(u).add(v);
        }
        return graph;
    }

    public Set<Integer> suspecious(int k, int[][] invocations, Map<Integer, List<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> sus = new HashSet<>();
        q.add(k);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (!sus.contains(curr)) {
                sus.add(curr);
                for (int neighbor : graph.getOrDefault(curr, Collections.emptyList())) {
                    q.add(neighbor);
                }
            }
        }
        return sus;

    }


    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        Map<Integer, List<Integer>> graph = createGraph(invocations);
        Set<Integer> sus = suspecious(k, invocations, graph);
        List<Integer> ans = new ArrayList<>();
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];
            if (!sus.contains(u) && sus.contains(v)) {
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;
            }

        }
        for (int i = 0; i < n; i++) {
            if (!sus.contains(i))
                ans.add(i);

        }
        return ans;

    }
}