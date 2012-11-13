import java.util.Arrays;

/**
 * User: Sina Jahan
 * Date: 12-11-12
 */
public class QuickFind implements UnionFind {
    int[] nodes;

    public QuickFind(int size) {
        nodes = new int[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = i;
        }
    }

    @Override
    public void union(int i, int j) {
        int currentStamp = nodes[i];
        for (int counter = 0; counter < nodes.length; counter++) {
            if (nodes[counter] == j)
                nodes[counter] = currentStamp;
        }
        //System.out.println(Arrays.toString(nodes));
    }

    @Override
    public boolean find(int i, int j) {
        return nodes[i] == nodes[j];
    }
}
