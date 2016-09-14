package raversetreeindepth;

import java.util.*;

public class BetterProgrammerTask {

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static List<Node> traverseTreeInDepth(Node root) {
        /*
          Please implement this method to
          traverse the tree in depth and return a list of all passed nodes.

          The method shall work optimally with large trees.
         */
        LinkedList<Node> result = new LinkedList<Node>();
        visitNode(root, result);
        return result;
    }

    static void visitNode(Node node, List<Node> path) {
        path.add(node);
        List<Node> children = node.getChildren();
        if (children != null) {
            for (Node child: children) {
                visitNode(child, path);
            }
        }
    }
}
