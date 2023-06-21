package FredericoA2;

import java.util.ArrayList;
import java.util.List;

public class Node
{
    private String value;
    private List<Node> children;
    
    public Node(final String value) {
        this.value = value;
        this.children = new ArrayList<Node>();
    }
    
    public String getValue() {
        return this.value;
    }
    
    public List<Node> getChildren() {
        return this.children;
    }
    
    public void addChild(final Node child) {
        this.children.add(child);
    }
}