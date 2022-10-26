package hannoi;

public class BitreeHeight {
    public int solution(Tree T) {
        int height = -1;
        if(T == null){
            return height;
        }
        if( T.l == null && T.r == null){
            height = 0;
            return height;
        }
        int lheight = solution(T.l);
        int rheight = solution(T.r);
        if(lheight >= rheight){
            height = lheight + 1;
        } else {
            height = rheight + 1;
        }
        return  height;
    }

    public static void main(String[] args) {
//        (5, (3, (20, None, None), (21, None, None)), (10, (1, None, None), None))
        Tree t1 = new Tree();
        t1.x=20;t1.l=null;t1.r=null;
        Tree t2 = new Tree();
        t2.x=21;t2.l=null;t2.r=null;
        Tree t3 = new Tree();
        t3.x=1;t3.l=null;t3.r=null;
        Tree t4 = new Tree();
        t4.x=3;t4.l=t1;t4.r=t2;
        Tree t5 = new Tree();
        t5.x=10;t5.l=t3;t5.r=null;
        Tree t6 = new Tree();
        t6.x=5;t6.l=t4;t6.r=t5;

        BitreeHeight b = new BitreeHeight();
        int r = b.solution(t6);
        System.out.println(r);

    }
}
class Tree {
    public int x;
    public Tree l;
    public Tree r;
}


