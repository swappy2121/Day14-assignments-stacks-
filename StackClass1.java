package com.Bridgelabz;

public class StackClass1 {

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }

        static class Stack {
            public static node head;

            public static boolean isEmpty() {
                return head == null;
            }

            public void push(int data) {
                node newNode = new node(data);
                newNode.next = head;
                head = newNode;
                System.out.print(newNode.data + "->");
            }
        }


        public static void main(String[] args) {

            Stack add = new Stack();
            add.push(70);
            add.push(30);
            add.push(56);
        }
    }
}
