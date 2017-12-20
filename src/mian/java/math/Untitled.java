package math;

class Untitled {

    static class Tree {
        int size;
        Node root;
    }

    static class Node {
        Node parent;
        Node left;
        Node right;
        int value;
    }

    static void insertNode(Tree tree, int value) {
        if (tree == null) {
            return;
        }
        Node tNode = tree.root;
        //待插入结点的父结点，如果遍历完为空，说明此时是一个空树。
        Node pNode = null;
        //新的结点。
        Node nNode = new Node();
        nNode.value = value;
        while (tNode != null) {
            pNode = tNode;
            if (tNode.value > value) {
                tNode = tNode.left;
            } else {
                tNode = tNode.right;
            }
        }
        nNode.parent = pNode;
        if (pNode == null) {
            tree.root = nNode;
        } else if (pNode.value > value) {
            pNode.left = nNode;
        } else {
            pNode.right = nNode;
        }
        tree.size++;
    }

    static Tree createBinTree(int p[], int len) {
        Tree tree = new Tree();
        for (int i=0; i<len; i++) {
            int value = p[i];
            insertNode(tree, value);
        }
        return tree;
    }

    //递归的方式中序打印二叉查找树，最后输出的顺序必然是递增的。
    static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.println(node.value);
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        int p[] = {4,5,6,1,2,3};
        Tree tree = createBinTree(p, p.length);
        printInOrder(tree.root);
    }
}
