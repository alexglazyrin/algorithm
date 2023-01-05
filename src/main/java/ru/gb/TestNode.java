package ru.gb;

public class TestNode {
    public static void main(String[] args) throws InterruptedException {
        NodeList list = new NodeList();
        System.out.println("Создать двусвязный список длиной 10");
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.last = node;
        }

        System.out.println(list.toString());
        System.out.println(list.reverse());

    }
}
