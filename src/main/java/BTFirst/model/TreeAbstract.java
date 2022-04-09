package BTFirst.model;

abstract public class TreeAbstract {
    int value;
    TreeAbstract left;
    TreeAbstract right;

    public TreeAbstract(int value, TreeAbstract left, TreeAbstract right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeAbstract(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeAbstract getRight() {
        return right;
    }

    public TreeAbstract getLeft() {
        return left;
    }

    public int sum() {
        int sum = value;
        System.out.println(value);

        if (left != null) {
            sum += left.sum();
        }

        if (right != null) {
            sum += right.sum();
        }

        return sum;
    }

}
