public class P116 {
    class Solution {
        public Node connect(Node root) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i=0; i<size; i++) {
                    Node node = queue.poll();
                    if (node == null) continue;
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    if (i != size - 1) {
                        node.next = queue.peek();
                    }
                }
            }

            return root;
        }
    }
}