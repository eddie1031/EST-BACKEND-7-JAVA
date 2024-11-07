package collection.deque;

import collection.Collection;
import collection.linkedList.LinkedList;
import collection.stream.QueueStream;
import collection.stream.Stream;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<E> implements Collection<E> {

    // JDK 22
    // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Deque.html

    private final LinkedList<E> elements;

    public Deque() {
        this.elements = new LinkedList<>();
    }

    /**
     * {@link Deque}의 앞쪽(Head)에 요소를 추가합니다.
     * @param e 추가할 요소
     */
    public void offer(E e) {
        elements.addFirst(e);
    }

    /**
     * {@link Deque}의 뒤쪽(Tail)에 요소를 추가합니다.
     * @param e 추가할 요소
     */
    public void push(E e) {
        elements.addLast(e);
    }

    /**
     * {@link Deque}의 뒤쪽(Tail)에 있는 요소를 제거하고 반환합니다.
     * {@link Deque}이 비어있으면 {@code null}을 반환합니다.
     * @return 제거된 요소 ({@link Deque}의 마지막에 위치한 요소)
     */
    public E pop() {

        if ( isEmpty() ) {
            throw new NoSuchElementException();
        }

        return elements.removeLast();
    }

    /**
     * {@link Deque}의 앞쪽(Head)에 있는 요소를 제거하고 반환합니다.
     * {@link Deque}이 비어있으면 {@code null}을 반환합니다.
     * @return 제거된 요소 ({@link Deque}의 첫 번째에 위치한 요소)
     */
    public E poll() {
        if ( isEmpty() ) {
            throw new NoSuchElementException();
        }
        return elements.removeFirst();
    }

    /**
     * {@link Deque}의 앞쪽(Head)에 위치한 요소를 반환하지만, 제거하지는 않습니다.
     * {@link Deque}이 비어있으면 {@code null}을 반환합니다.
     * @return {@link Deque}의 첫 번째 요소
     */
    public E peek() {
        if ( isEmpty() ) {
            throw new NoSuchElementException();
        }
        return elements.get(0);
    }

    /**
     * {@link Deque}의 뒤쪽(Tail)에 위치한 요소를 반환하지만, 제거하지는 않습니다.
     * {@link Deque}이 비어있으면 {@code null}을 반환합니다.
     * @return {@link Deque}의 마지막 요소
     */
    public E peekLast() {
        if ( isEmpty() ) {
            throw new NoSuchElementException();
        }
        return elements.get(elements.size() - 1);
    }

    /**
     * {@link Collection} 인터페이스의 {@code add()} 메서드를 오버라이드하여 {@code push()}와 동일하게 동작합니다.
     * @param e 추가할 요소
     */
    @Override
    public void add(E e) {
        push(e);
    }

    /**
     * {@link Deque}의 뒤쪽(Tail)에 위치한 요소가 주어진 객체와 같다면, 제거합니다.
     * @param o 제거할 객체
     */
    @Override
    public void remove(Object o) {
        if ( peekLast().equals(o)) {
            pop();
        }
    }

    /**
     * {@link Deque}의 크기(요소의 개수)를 반환합니다.
     * @return {@link Deque}에 있는 요소의 개수
     */

    @Override
    public int size() {
        return elements.size();
    }

    /**
     * {@link Deque}가 비어있는지 확인합니다.
     * @return {@link Deque}가 비어있다면 {@code true}, 그렇지 않으면 {@code false}
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * {@link Deque}에 특정 요소가 포함되어 있는지 확인합니다.
     * @param o 확인할 객체
     * @return 객체가 {@link Deque}에 존재하면 {@code true}, 그렇지 않으면 {@code false}
     */
    @Override
    public boolean contains(Object o) {
        return elements.contains(o);
    }

    /**
     * {@link Deque}의 모든 요소를 순서대로 출력합니다.
     * {@link Deque}의 현재 상태를 시각적으로 확인할 수 있습니다.
     */
    public void print() {
        elements.traverse();
    }

    @Override
    public Iterator<E> iterator() {
        return elements.iterator();
    }

    @Override
    public Stream<E> stream() {
        return new QueueStream<>(this);
    }
}
