/*
 * Copyright (C) Benesse China Company, 2017.All rights reserved.
 */

package com.zrui.java.algorithm.linkedlist;


public class SingleLinkedList {


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }



}
