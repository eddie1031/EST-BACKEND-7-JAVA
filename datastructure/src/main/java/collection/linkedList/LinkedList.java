package collection.linkedList;

import collection.arrayList.List;

// Doubly Linked List를 기반으로 구현
public class LinkedList<E> implements List<E> {

    // Linked List의 가장 앞부분에 해당하는 노드
    private Node<E> head;
    // Linked List의 가장 뒷부분에 해당하는 노드
    private Node<E> tail;

    private int size = 0;

    /**
     * 지정된 형식의 자료를 자료구조의 가장 첫 부분에 저장합니다.
     *
     * @param e {@code E} 저장하고자 하는 자료를 파라미터로 취합니다.
     */
    public void addFirst(E e) {

        Node<E> newNode = new Node<>(e);

        if ( isEmpty() ) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    /**
     * 지정된 형식의 자료를 자료구조의 가장 마지막 부분에 저장합니다.
     *
     * @param e {@code E} 저장하고자 하는 자료를 파라미터로 취합니다.
     */
    public void addLast(E e) {

        Node<E> newNode = new Node<>(e);

        if ( isEmpty() ) {
            tail = newNode;
            head = newNode;
        } else {
            if ( tail != null ) {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }
        size++;

    }

    @Override
    public void add(int index, E element) {

        if ( index < 0 || index > size ) {
            throw new IndexOutOfBoundsException();
        }

        if ( index == 0 ) {
            addFirst(element);
            return;
        }

        if ( index == size ) {
            addLast(element);
            return;
        }

        Node<E> newNode = new Node<>(element);

        Node<E> cur = head;

        for ( int i = 0; i < index - 1; i++ ) {
            cur = cur.next;
        }

        newNode.next = cur.next;
        newNode.prev = cur;

        if ( cur.next != null ) {
            cur.next.prev = newNode;
        }

        size++;

    }

    /**
     * 자료구조의 특정 인덱스에 해당하는 노드에 저장된 값을 반환합니다.
     *
     * @param index 반환하고자 하는 값의 노드의 인덱스 번호입니다.
     * @return {@code E} 해당하는 인덱스의 요소를 반환합니다.
     */
    @Override
    public E get(int index) {

        if ( index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> cur = head;

        for ( int i = 0; i < index; i++ ) {
            cur = cur.next;
        }

        return cur.data;
    }

    /**
     * 자료구조의 제일 처음에 해당되는 요소를 삭제한 후 반환합니다.
     *
     * @return 삭제된 요소를 반환합니다.
     */
    public E removeFirst() {

        if ( isEmpty() ) {
            throw new RuntimeException("리스트가 비어있어요!");
        }

        E removedData = head.data;

        if ( head.next != null ) {
            head.next.prev = null;
            head = head.next;
        } else {
            head = null;
            tail = null;
        }

        size--;

        return removedData;

    }

    /**
     * 자료구조의 제일 마지막에 해당되는 요소를 삭제한 후 반환합니다.
     *
     * @return 삭제된 요소를 반환합니다.
     */
    public E removeLast() {

        if ( isEmpty() ) {
            throw new RuntimeException("리스트가 비어있습니다");
        }

        E removedData = tail.data;

        if ( tail.prev != null ) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            tail = null;
            head = null;
        }

        size--;

        return removedData;

    }


    @Override
    public E remove(int index) {

        if ( index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException("인덱스가 확실 하신가요..?");
        }

        if ( isEmpty() ) {
            throw new RuntimeException("리스트가 비어있는것 같습니다");
        }

        if (index == 0) {
            return removeFirst();
        }

        if ( index == size - 1 ) {
            return removeLast();
        }

        Node<E> cur = head;

        for ( int i = 0; i < index; i++ ) {
            cur = cur.next;
        }

        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;

        size--;

        return cur.data;
    }

    @Override
    public E set(int index, E element) {

        if ( index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException();
        }

        if ( isEmpty() ) {
            throw new RuntimeException();
        }

        if ( index == 0 ) {
            head.data = element;
            return element;
        }

        Node<E> cur = head;

        for ( int i = 0; i < index; i++ ) {
            cur = cur.next;
        }

        cur.data = element;

        return element;
    }

    @Override
    public void add(E e) {
        addLast(e);
    }

    @Override
    public void remove(Object o) {

        if ( isEmpty() ) {
            throw new RuntimeException("List is empty!");
        }

        Node<E> cur = head;

        while ( cur != null ) {
            if ( cur.data.equals(o) ) {
                if ( cur == head ) {
                    removeFirst();
                } else if ( cur == tail ) {
                    removeLast();
                } else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }

                size--;
                return;
            }
            cur = cur.next;
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * 리스트가 비어있는지 확인 후 반환합니다.
     * @return {@code Boolean} 인스턴스에 값이 비어있다면 {@code true}, 그렇지 않다면 {@code false}를 반환
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        if ( isEmpty() ) {
            return false;
        }

        Node<E> cur = head;

        while( cur != null ) {
            if ( cur.data.equals(o)) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    /**
     * 자료구조 안의 요소들을 처음부터 순차적으로 출력합니다.
     */
    public void traverse() {

        if ( isEmpty() ) {
            System.out.println("자료구조가 비어있습니다!");
            return;
        }

        Node<E> cur = head;

        while ( cur != null ) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

        System.out.println();

    }

    /**
     * DoublyLinkedList의 기본 단위가 되는 노드 클래스입니다.
     * 각 노드는 데이터를 저장하고, 이전 및 다음 노드를 가리키는 포인터를 가집니다.
     *
     * @param <E> 저장할 데이터의 형식을 지정합니다.
     */
    private static class Node<E> {

        Node<E> prev;
        Node<E> next;

        E data;

        /**
         * 주어진 데이터를 사용하여 새로운 노드를 생성합니다.
         * 다음 및 이전 노드의 참조는 생성 시 null로 초기화됩니다.
         *
         * @param data {@code E} 타입의 저장하고자 하는 데이터 값입니다.
         */
        public Node(E data) {
            this.data = data;
        }

    }

}
