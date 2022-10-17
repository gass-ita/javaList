public class Node {
    Node next;
    int inf;

    public Node(int inf, Node next){
        this.next = next;
        this.inf = inf;
    }

    public Node(int inf){
        this.next = null;
        this.inf = inf;
    }

    @Override
    public String toString() {
        return inf + "";
    }
}
