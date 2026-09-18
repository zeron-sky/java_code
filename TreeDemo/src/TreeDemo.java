import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树节点类
 * 每个节点包含一个值 val，以及指向左孩子 left、右孩子 right 的引用
 */
class TreeNode {
    public int val;        // 节点中存放的值
    public TreeNode left;  // 左孩子（没有则为 null）
    public TreeNode right; // 右孩子（没有则为 null）

    // 构造方法：创建节点时只需给定值，两个孩子默认为 null
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeDemo {
    /**
     * 创建一棵固定的二叉树并返回根节点
     *
     * 构建出的树结构如下（数字代表节点的值）：
     *            1
     *           / \
     *          2   3
     *         / \   \
     *        4   5   6
     *           /
     *          7
     * 其中：1 是根节点；2、3 是它的左右孩子；4、5 是 2 的孩子；
     *       6 是 3 的右孩子（3 没有左孩子）；7 是 5 的左孩子
     * 对照：节点 7 个，叶子 3 个（4、7、6），第 3 层 3 个，高度 4，不是完全二叉树
     */
    public static TreeNode buildTree() {
        // 第一步：先创建 7 个孤立的节点
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        // 第二步：按上面画的结构把它们连接起来（a 是根节点）
        a.left = b;   // 1 的左孩子是 2
        a.right = c;  // 1 的右孩子是 3
        b.left = d;   // 2 的左孩子是 4
        b.right = e;  // 2 的右孩子是 5
        c.right = f;  // 3 的右孩子是 6（3 的左孩子没赋值，默认为 null）
        e.left = g;   // 5 的左孩子是 7

        return a;     // 返回根节点
    }

    /**
     * 先序遍历（根 → 左 → 右）
     * 访问顺序：先打印自己，再递归遍历整棵左子树，最后遍历整棵右子树
     * 递归出口：当前节点为 null（空树）时直接返回，不再往下走
     * 时间复杂度：O(n)，每个节点恰好被访问一次
     */
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;                        // 出口：空节点没什么可打印的
        }
        System.out.print(root.val + " ");  // 1. 打印当前节点（根）
        preOrder(root.left);               // 2. 递归：遍历整棵左子树
        preOrder(root.right);              // 3. 递归：遍历整棵右子树
    }

    /**
     * 中序遍历（左 → 根 → 右）
     * 访问顺序：先递归遍历整棵左子树，再打印自己，最后遍历整棵右子树
     * 递归出口：当前节点为 null（空树）时直接返回
     * 时间复杂度：O(n)，每个节点恰好被访问一次
     */
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;                        // 出口：空节点没什么可打印的
        }
        inOrder(root.left);                // 1. 递归：遍历整棵左子树
        System.out.print(root.val + " ");  // 2. 打印当前节点（根）
        inOrder(root.right);               // 3. 递归：遍历整棵右子树
    }

    /**
     * 后序遍历（左 → 右 → 根）
     * 访问顺序：先递归遍历整棵左子树，再遍历整棵右子树，最后打印自己
     * 递归出口：当前节点为 null（空树）时直接返回
     * 时间复杂度：O(n)，每个节点恰好被访问一次
     */
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;                        // 出口：空节点没什么可打印的
        }
        postOrder(root.left);              // 1. 递归：遍历整棵左子树
        postOrder(root.right);             // 2. 递归：遍历整棵右子树
        System.out.print(root.val + " ");  // 3. 打印当前节点（根）
    }

    /**
     * 层序遍历（从上到下、从左到右，也叫广度优先搜索 BFS）
     * 借助队列（先进先出）来实现：
     * 1. 先把根节点放进队列
     * 2. 只要队列不空就循环：出队一个节点 → 打印它 → 把它的左右孩子依次入队
     * 这样同一层的节点会按从左到右的顺序被依次取出，实现"一层一层"遍历
     * 空树直接返回，避免对 null 取 val 导致空指针
     * 时间复杂度：O(n)，每个节点恰好被访问一次
     */
    public static void levelOrder(TreeNode root) {
        if (root == null) {
            return;                                 // 空树直接结束，避免对 null 取 val
        }
        Queue<TreeNode> queue = new LinkedList<>(); // 队列：用来存放"待处理"的节点
        queue.offer(root);                          // 1. 根节点先入队
        while (!queue.isEmpty()) {                  // 2. 队列不空就继续处理
            TreeNode cur = queue.poll();            // 出队：取出队头的节点
            System.out.print(cur.val + " ");        // 打印当前节点
            if (cur.left != null) {                 // 左孩子不为空才入队（防止 null 入队）
                queue.offer(cur.left);
            }
            if (cur.right != null) {                // 右孩子不为空才入队
                queue.offer(cur.right);
            }
        }
    }

    /**
     * 统计树中节点的个数
     * 递归公式：节点数 = 1（自己）+ 左子树节点数 + 右子树节点数
     * 递归出口：空节点（null）的节点数为 0
     * 时间复杂度：O(n)
     */
    public static int size(TreeNode root) {
        if (root == null) {
            return 0;                    // 出口：空树节点数为 0
        }
        // 自己算 1 个，再加上左右子树各自的节点数
        return 1 + size(root.left) + size(root.right);
    }

    /**
     * 求叶子节点个数（子问题思路）
     * 叶子：左右孩子都是 null
     * 递归公式：叶子数 = 左子树叶子数 + 右子树叶子数（自己不是叶子，不加 1）
     * 递归出口1：空树 → 0
     * 递归出口2：当前节点本身就是叶子 → 1（不再对它的空孩子递归）
     * 时间复杂度：O(n)
     */
    public static int getLeafNodeCount(TreeNode root) {
        if (root == null) {
            return 0;                                      // 出口1：空树没有叶子
        }
        if (root.left == null && root.right == null) {
            return 1;                                      // 出口2：自己就是一片叶子
        }
        // 不是叶子，就把问题交给左右子树，把两边的叶子数加起来
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.right);
    }

    /**
     * 求第 k 层有几个节点（根是第 1 层）
     * 每往下一层，k 减 1：对孩子来说，原来的第 k 层刚好是它们的第 k-1 层
     * 递归出口1：空树，或 k < 1（层数不合法）→ 0
     * 递归出口2：k == 1 → 已经走到要找的那一层，当前节点算 1 个，停止往下
     * 时间复杂度：O(n)
     */
    public static int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null || k < 1) {
            return 0;                                      // 出口1：空位置不算节点
        }
        if (k == 1) {
            return 1;                                      // 出口2：到层了，数自己，不再往下
        }
        // 还没到第 k 层，去左右子树里找第 k-1 层
        return getKLevelNodeCount(root.left, k - 1)
             + getKLevelNodeCount(root.right, k - 1);
    }

    /**
     * 求树的高度（从当前节点走到最深叶子，最多经过几层）
     * 递归公式：高度 = 1 + max(左子树高度, 右子树高度)
     * 注意：回来时用 max 而不是相加（和 size 的差别）
     * 递归出口：空树高度为 0；单独一个节点高度为 1
     * 时间复杂度：O(n)
     */
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;                                      // 出口：空树连根都没有
        }
        int leftHeight = getHeight(root.left);             // 先问左子树有多高
        int rightHeight = getHeight(root.right);           // 再问右子树有多高
        // 自己这一层 + 较高的那一边（矮的那边丢掉）
        return 1 + Math.max(leftHeight, rightHeight);
    }

    /**
     * 在树中查找值为 val 的节点
     * 找到返回该节点，找不到返回 null
     * 顺序：先看自己 → 再搜左子树 → 左边没有才搜右子树（先序的思路）
     * 左边一旦找到，右边整棵都跳过
     * 时间复杂度：最好 O(1)，最坏 O(n)
     */
    public static TreeNode find(TreeNode root, int val) {
        if (root == null) {
            return null;                                   // 出口：走到空节点，这条路没有
        }
        if (root.val == val) {
            return root;                                   // 自己就是，立刻交回去，左右都不用看
        }
        TreeNode leftRet = find(root.left, val);           // 先搜整棵左子树
        if (leftRet != null) {
            return leftRet;                                // 左边找到了，右边不用再搜
        }
        return find(root.right, val);                      // 左边没有，去右边找
    }

    /**
     * 判断是否为完全二叉树
     * 完全二叉树：从上到下、从左到右连续排，中间不能缺洞
     * 做法：层序遍历，左右孩子不管是不是空都入队
     * 一旦取出过 null，后面再取出非空节点 → 中间有洞，不是完全二叉树
     * 和普通层序的两点不同：① 空孩子也入队  ② 用 seenNull 记住是否出现过空
     * 时间复杂度：O(n)
     */
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;                                   // 空树可以看成完全二叉树
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);                                 // 根先入队，否则循环一次都进不去
        boolean seenNull = false;                          // 有没有已经遇到过空节点

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();                   // 取出队头
            if (cur == null) {
                seenNull = true;                           // 记下：从现在起后面不该再有真实节点
            } else {
                if (seenNull) {
                    return false;                          // 空的后面又来了真实节点 → 有洞
                }
                // 关键：入队的是 cur 的孩子，空的也入队，才能发现"洞"
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
        }
        return true;                                       // 全程没有"空后面又出现节点"
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();     // 建树，拿到根节点

        // 依次用四种方式遍历这棵树，并统计节点个数
        System.out.print("先序遍历：");
        preOrder(root);
        System.out.println();

        System.out.print("中序遍历：");
        inOrder(root);
        System.out.println();

        System.out.print("后序遍历：");
        postOrder(root);
        System.out.println();

        System.out.print("层序遍历：");
        levelOrder(root);
        System.out.println();

        System.out.print("树中节点的个数为：");
        System.out.print(size(root));                      // 期望：7
        System.out.println();

        System.out.println("叶子节点个数：" + getLeafNodeCount(root));       // 期望：3（4、7、6）
        System.out.println("第3层节点个数：" + getKLevelNodeCount(root, 3)); // 期望：3（4、5、6）
        System.out.println("树的高度：" + getHeight(root));                  // 期望：4（1→2→5→7）

        TreeNode ret = find(root, 7);
        System.out.println(ret == null ? "没找到" : "找到了：" + ret.val);   // 期望：找到了：7

        System.out.println("是完全二叉树吗：" + isCompleteTree(root));       // 期望：false（3 缺左孩子却有右孩子 6）
    }
}
