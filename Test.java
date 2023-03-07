public class Test {
    public static void main(String[] args) {
        LinkedBinaryTree<Character> l=new LinkedBinaryTree<>();
       Position<Character>p= l.addRoot('A');
        l.addLeft('B',p);
        System.out.println(l.root().getElement());
        System.out.println(l.left(p).getElement());
    }
}
