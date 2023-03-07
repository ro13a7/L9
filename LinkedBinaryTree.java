//import java.util.Iterator;
//
//public class LinkedBinaryTree<E> extends AbstractBinaryTree {
//    private static class Node<E> implements Position<E>{
//        E element;
//        Node<E> parent;
//        Node<E> left;
//        Node<E> right;
//
//        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
//            this.element = element;
//            this.parent = parent;
//            this.left = left;
//            this.right = right;
//        }
//
//
//        @Override
//        public E getElement() {
//            return element;
//        }
//    }
//
//    private int size=0;
//    Node<E> root=null;
//
//    protected Node<E> validate(Position<E>p)
//    {
//        if(p instanceof Node) throw new  IllegalArgumentException("")
//        {
//
//        }
//        return n;
//    }
//    protected Node<E> createNode(E e,)
//    {
//
//    }
//
//    @Override
//    public Position left(Position p) {
//        Node<E> n=validate(p);
//        return n.left;
//    }
//
//    @Override
//    public Position right(Position p) {
//        Node<E> n=validate(p);
//        return n.right;
//    }
//
//    @Override
//    public Position parent(Position p) {
//        Node<E> n=validate(p);
//        return n.parent;
//    }
//
//    @Override
//    public Position root() {
//        return root;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    public Position<E> addRoot(E e)
//    {
//        if (root!=null)throw new IllegalStateException("");
////        root=createNode(e,null,null,null);
//        size=1;
//        return root;
//    }
//
//    public Position<E> addLeft(E e,Position<E> p)
//    {
//        Node<E> n=validate(p);
//        if(n.left!=null) throw new IllegalArgumentException("");
//        Node<E> child=createNode(e,n,null,null);
//        n.left=child;
//        size++;
//        return child;
//    }
//
//    public Position<E> addRight(E e,Position<E> p)
//    {
//        Node<E> n=validate(p);
//        if(n.right!=null) throw new IllegalArgumentException("");
//        Node<E> child=createNode(e,n,null,null);
//        n.right=child;
//        size++;
//        return child;
//    }
//
//    public E set(E e,Position<E>p)    //
//    {
//        Node<E> n=validate(p);
//        E old=n.element;
//        n.element=e;
//        return old;
//    }
//
//    public E remove(Position<E>p)
//    {
//        Node<E> n=validate(p);
//        if(numOfChildren(p)==2) throw new IllegalArgumentException("");
//
//    }
//
//
//
//
//    @Override
//    public Iterator iterator() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Position> POSITIONS() {
//        return null;
//    }
//}
