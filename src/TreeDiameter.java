import java.io.*;
import java.util.*;

public class TreeDiameter {
    static List<List<Integer>> tree = new ArrayList<>();
    static boolean[] visited;
    static int farthestNode;
    static int maxDist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) tree.add(new ArrayList<>());

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        dfs(1, 0);
        Arrays.fill(visited, false);
        maxDist = 0;
        dfs(farthestNode, 0);
        System.out.println(maxDist);
    }

    static void dfs(int node, int dist) {
        visited[node] = true;
        if (dist > maxDist) {
            maxDist = dist;
            farthestNode = node;
        }
        for (int child : tree.get(node)) {
            if (!visited[child]) dfs(child, dist + 1);
        }
    }
}