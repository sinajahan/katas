import java.util.Arrays;

/**
 * User: Sina Jahan
 * Date: 12-11-12
 */
public class QuickUnion implements UnionFind {
    int[] id;
    int[] sizes;
    public QuickUnion(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
        sizes = new int[size];
        for (int i = 0; i < size; i++) {
            sizes[i] = 1;
        }
    }

    @Override
    public void union(int i, int j) {
        int iRoot = root(i);
        int jRoot = root(j);
        if (sizes[iRoot] < sizes[jRoot]) {
            id[iRoot] = jRoot;
            sizes[jRoot] += sizes[iRoot];
        } else {
            id[jRoot] = iRoot;
            sizes[iRoot] += sizes[jRoot];
        }

    }

    @Override
    public boolean find(int i, int j) {
        return root(i) == root(j);
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
