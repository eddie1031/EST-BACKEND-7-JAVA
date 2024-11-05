package collection.queue;

import collection.Collection;
import collection.linkedList.LinkedList;

public class Queue<E> implements Collection<E> {

    // JDK 22
    // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Queue.html

    private final LinkedList<E> elements;

    public Queue() {
        elements = new LinkedList<>();
    }

    /**
     * - Queue의 끝에 새로운 요소를 추가합니다.
     * - Queue가 가득 찬 경우를 고려하지 않으며, 일반적으로 성공적으로 삽입됩니다.
     * @param e 추가할 요소
     */
    public void offer(E e) {
        elements.addLast(e);
    }

    /**
     * - Queue의 앞에서 요소를 제거하고 반환합니다.
     * - Queue가 비어있을 경우, {@link java.util.NoSuchElementException}이 발생할 수 있습니다.
     * @return 제거된 요소 (Queue의 앞에 위치한 요소) 만일 요소가 없을 경우엔 {@code null}을 반환합니다.
     */
    public E poll() {
        if ( isEmpty() ) {
            return null;
        }

        return elements.removeFirst();
    }

    /**
     * - Queue의 앞에 위치한 요소를 반환하지만, 제거하지는 않습니다.
     * - Queue가 비어있을 경우, {@link java.util.NoSuchElementException}이 발생할 수 있습니다.
     * @return Queue의 첫 번째 요소, 만일 요소가 없는 경우엔 {@code null}을 반환합니다.
     */
    public E peek() {
        if ( isEmpty() ) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * - {@link Collection} 인터페이스의 {@code add()} 메서드를 오버라이드하여 {@code offer()}와 동일하게 동작합니다.
     * @param e 추가할 요소
     */
    @Override
    public void add(E e) {
        offer(e);
    }

    /**
     * - Queue의 앞에 위치한 요소가 주어진 객체와 같다면, 제거합니다.
     * @param o 제거할 객체
     */
    @Override
    public void remove(Object o) {
        if ( peek().equals(o) ) {
            poll();
        }
    }

    /**
     * - Queue의 크기(요소의 개수)를 반환합니다.
     * @return Queue에 있는 요소의 개수
     */
    @Override
    public int size() {
        return elements.size();
    }

    /**
     * - Queue가 비어있는지 확인합니다.
     * @return Queue가 비어있다면 {@code true}, 그렇지 않으면 {@code false}
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * - Queue에 특정 요소가 포함되어 있는지 확인합니다.
     * @param o 확인할 객체
     * @return 객체가 Queue에 존재하면 {@code true}, 그렇지 않으면 {@code false}
     */
    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    /**
     * - Queue의 모든 요소를 순서대로 출력합니다.
     * - Queue의 현재 상태를 시각적으로 확인할 수 있습니다.
     */
    public void print() {
        elements.traverse();
    }

}
