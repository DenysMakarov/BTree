package BTSecond.controller;

import BTSecond.model.BSTree;

public class BTSecondApp {

    public static void main(String[] args) {
        BSTree<Integer, String> tree = new BSTree<>();

        tree.add(1, "A");
        tree.add(2, "B");
        tree.add(3, "C");
        tree.add(4, "D");
        tree.add(5, "E");
        tree.add(6, "F");

        tree.travers((k, v) -> System.out.println(k + " : " + v));

    }

}
