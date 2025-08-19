

public class AVLTree {
    class Node {
        int key;
        Node left;
        Node right;
        int height;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }
    Node root;
    int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
    void updateHeight(Node node) {
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }
    Node rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;

        updateHeight(node);
        updateHeight(temp);

        return temp;
    }
    Node rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;

        updateHeight(node);
        updateHeight(temp);

        return temp;
    }
    Node rebalance(Node node) {
        int balance = getBalance(node);

        if (balance > 1) {
            if (getHeight(node.left.left) >= getHeight(node.left.right)) {
                node = rotateRight(node);
            } else {
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }
        } else if (balance < -1) {
            if (getHeight(node.right.right) >= getHeight(node.right.left)) {
                node = rotateLeft(node);
            } else {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }

        return node;
    }
    Node insertNode(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertNode(node.left, key);
        } else if (key > node.key) {
            node.right = insertNode(node.right, key);
        } else {
            return node; // No duplicate keys allowed
        }

        updateHeight(node);
        node = rebalance(node);

        return node;
    }
    Node deleteNode(Node node, int key) {
        if (node == null) {
            return node;
        }

        if (key < node.key) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.key) {
            node.right = deleteNode(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            Node temp = node.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            node.key = temp.key;
            node.right = deleteNode(node.right, temp.key);
        }

        if (node == null) {
            return node;
        }

        updateHeight(node);
        node = rebalance(node);

        return node;
    }
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        avlTree.root = avlTree.insertNode(avlTree.root, 10);
        avlTree.root = avlTree.insertNode(avlTree.root, 20);
        avlTree.root = avlTree.insertNode(avlTree.root, 30);
        avlTree.root = avlTree.insertNode(avlTree.root, 40);
        avlTree.root = avlTree.insertNode(avlTree.root, 50);
        avlTree.root = avlTree.insertNode(avlTree.root, 25);

        System.out.println("Inorder traversal after insertion:");
        avlTree.inorderTraversal(avlTree.root);

        avlTree.root = avlTree.deleteNode(avlTree.root, 20);

        System.out.println("\nInorder traversal after deletion:");
        avlTree.inorderTraversal(avlTree.root);
    }
}