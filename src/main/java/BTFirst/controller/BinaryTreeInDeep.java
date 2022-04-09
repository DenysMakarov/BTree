package BTFirst.controller;

import BTFirst.model.TreeAbstract;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInDeep {

    public static void main(String[] args) {
                Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38), new Tree(52))));

//        System.out.println("SUM " + root.sum());

        root.showTreeDeep(root);
    }

    static class Tree extends TreeAbstract{

        public Tree(int value, TreeAbstract left, TreeAbstract right) {
            super(value, left, right);
        }

        public Tree(int value) {
            super(value);
        }

//        in wide
        public static void showTreeDeep(Tree root){
            Queue<TreeAbstract> stack = new LinkedList<>();
            stack.add(root);

            while (!stack.isEmpty()){
                TreeAbstract node = stack.remove();
                System.out.println(node.getValue());

                if (node.getLeft() != null){
                    stack.add(node.getLeft());
                }

                if (node.getRight() != null){
                    stack.add(node.getRight());
                }
            }
        }
    }
}
