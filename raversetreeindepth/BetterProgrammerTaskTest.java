package raversetreeindepth;

import org.junit.Test;
import raversetreeindepth.BetterProgrammerTask.Node;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {

    @Test
    public void visitNode_Visits() throws Exception {
        Node parent = new NodeImpl(null);
        Node parentChild1 = new NodeImpl(parent);
        Node parentChild2 = new NodeImpl(parent);
        Node parentChild1Child1 = new NodeImpl(parentChild1);
        Node parentChild1Child1Child1 = new NodeImpl(parentChild1Child1);
        LinkedList<Node> expected = new LinkedList<Node>();
        expected.add(parent);
        expected.add(parentChild1);
        expected.add(parentChild1Child1);
        expected.add(parentChild1Child1Child1);
        expected.add(parentChild2);
        LinkedList<Node> actual = new LinkedList<Node>();
        BetterProgrammerTask.visitNode(parent, actual);
        assertThat(actual, is(expected));
    }

}

class NodeImpl implements Node {

    LinkedList<Node> children = new LinkedList<Node>();

    NodeImpl(Node parent) {
        if (parent != null) {
            parent.getChildren().add(this);
        }
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }
}