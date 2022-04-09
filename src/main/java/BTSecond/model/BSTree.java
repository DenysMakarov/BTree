package BTSecond.model;

import java.util.function.BiConsumer;

public class BSTree<K extends Comparable<K>, V> {
    private Node<K, V> root;

    public void add(K key, V value){
        if (root == null){
            root = new Node<>(key, value);
        }
        else {
            add(root, key, value);
        }
    }

    private void add(Node<K, V> node, K key, V value) {
        if (key.compareTo(node.key) < 0) {
            if (node.left == null) {
                node.left = new Node<>(key, value);
            } else {
                add(node.left, key, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(key, value);
            } else {
                add(node.right, key, value);
            }
        }
    }

    public void travers(BiConsumer<K, V> biConsumer){
        travers(root, biConsumer);
    }

    private void travers(Node<K, V> node, BiConsumer<K, V> biConsumer){
        if (node != null){
            travers(node.left, biConsumer);
            biConsumer.accept(node.key, node.value);
            travers(node.right, biConsumer);
        }

    }


}
