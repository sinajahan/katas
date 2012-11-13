import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Sina Jahan
 * Date: 12-11-12
 */
public class UnionFindTest {

    @Test
    public void testQuickFind() {
        UnionFind uf = new QuickFind(10);
        check(uf);

    }
    @Test
    public void testQuickUinon() {
        UnionFind uf = new QuickUnion(10);
        check(uf);
    }

    private void check(UnionFind uf) {
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);
        uf.union(8, 9);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);
        uf.union(1, 0);
        uf.union(6, 7);
        assertTrue(uf.find(0, 1));
        assertTrue(uf.find(0, 2));
        assertTrue(uf.find(0, 7));
        assertTrue(uf.find(8, 9));
        assertFalse(uf.find(0, 3));
        assertFalse(uf.find(7, 8));
    }

}
