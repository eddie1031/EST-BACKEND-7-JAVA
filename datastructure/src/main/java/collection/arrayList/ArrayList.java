package collection.arrayList;

public class ArrayList<E> implements List<E>{

    /**
     * 요소들을 저장하는 내부 배열입니다.
     * 리스트의 크기가 증가할 때마다 동적으로 확장됩니다.
     */
    private Object[] elements = {};

    /**
     * 배열 리스트의 마지막에 주어진 값을 추가합니다.
     *
     * @param e {@link E} 자료구조에 추가할 요소
     */
    @Override
    public void add(E e) {

        // 주어진 값 e를 배열 리스트의 마지막에 추가합니다.
        // 배열의 크기를 기존보다 1만큼 늘린 후, 기존 배열의 값을 새 배열에 복사합니다.
        // 새 배열의 마지막 인덱스에 e를 저장한 후, elements 참조 변수를 새 배열로 갱신합니다.

        Object[] temp = new Object[elements.length + 1];

        for ( int i = 0; i < elements.length; i++ ) {
            temp[i] = elements[i];
        }

        temp[elements.length] = e;
        elements = temp;

    }

    /**
     * 배열 리스트의 특정 위치에 주어진 값을 추가합니다.
     * 기존 요소들은 한 칸씩 뒤로 밀립니다.
     *
     * @param index 값을 추가할 인덱스 위치
     * @param element 리스트에 추가할 정수 값
     */
    @Override
    public void add(int index, E element) {

        // 주어진 인덱스 index에 element를 삽입합니다.
        // temp 배열의 크기를 기존 배열보다 1만큼 크게 설정한 후, 인덱스 전후의 값들을 복사하여 새로운 배열을 생성합니다.
        // 특정 위치에 삽입하기 위해 for 루프와 i == index 조건을 사용하여 값을 밀어냅니다.
        // elements를 새로운 배열로 업데이트합니다.

        Object[] temp = new Object[elements.length + 1];

        for ( int i = 0, j = 0; i < temp.length; i++ ) {
            if ( i == index ) {
                temp[i] = element; // index 위치에 새로운 값을 추가
            } else {
                temp[i] = elements[j++]; // 기존 값을 복사
            }
        }

        elements = temp;

    }


    /**
     * 리스트의 특정 인덱스에 해당하는 요소를 반환합니다.
     *
     * @param index 반환할 요소의 인덱스 (0 이상, 리스트의 크기 미만)
     * @return 해당 인덱스의 요소 값
     */
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        // 주어진 index의 위치에 저장된 값을 반환합니다.
        // 현재 예외 처리가 없기 때문에, 범위를 벗어난 인덱스 접근 시 오류가 발생할 수 있습니다.
        // 예외 처리를 통해 안전하게 수정할 수 있습니다.
        return (E) elements[index];
    }

    /**
     * 배열 리스트의 특정 위치에 있는 요소를 특정 요소로 수정합니다.
     *
     * @param index 수정할 요소의 인덱스 (0 이상, 리스트의 크기 미만)
     * @param element {@link E} 대체될 요소
     */
    @Override
    public E set(int index, E element) {
        // 배열의 특정인덱스에 있는 값을 수정합니다.
        elements[index] = element;
        return element;
    }

    /**
     * 배열 리스트의 특정 위치에 있는 요소를 삭제합니다.
     * 삭제 후에는 나머지 요소들이 한 칸씩 앞으로 이동합니다.
     *
     * @param index 삭제할 요소의 인덱스 (0 이상, 리스트의 크기 미만)
     */
    @Override
    public E remove(int index) {

        // 주어진 index의 요소를 삭제하고, 나머지 요소를 새로운 배열에 복사합니다.
        // 인덱스의 값에 해당하는 요소는 continue를 사용하여 건너뛰고, 나머지 요소를 새 배열에 복사하여 저장합니다.
        // elements를 새로운 배열로 갱신합니다.
        Object[] temp = new Object[elements.length - 1];

        E target = get(index);

        for ( int i = 0, j = 0; i < elements.length; i++) {
            if ( i == index ) {
                continue;
            }
            temp[j++] = elements[i];
        }

        elements = temp;

        return target;
    }

    /**
     * 배열 리스트의 요소를 삭제할 때 포함되어있는 값으로서 삭제합니다.
     * 만일, 중복된 값이 존재할 경우 하나만 삭제합니다.
     *
     * @param o {@link Object} 자료구조서 삭제될 요소
     */
    @Override
    public void remove(Object o) {

        // 배열에 요소가 포함되어있는지 확인
        if ( !contains(o) ) {
            return;
        }

        // 배열 리스트에 일치하는 값이 있으면 하나만 삭제

        Object[] temp = new Object[elements.length - 1];

        // 하나만 삭제하기 위함
        boolean flag = false;

        for ( int i = 0, j = 0; i < elements.length; i++) {

            if ( !flag && elements[i].equals(o) ) {
                flag = true;
                continue;
            }

            temp[j++] = elements[i];
        }

        elements = temp;

    }

    /**
     * 리스트가 비어있는지 확인 후 반환합니다.
     * @return {@link Boolean} 인스턴스에 값이 비어있다면 {@code true}, 그렇지 않다면 {@code false} 반환
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * 리스트의 현재 크기(저장된 요소의 개수)를 반환합니다.
     *
     * @return 리스트에 저장된 요소의 개수
     */
    @Override
    public int size() {
        return elements.length;
    }


    @Override
    public boolean contains(Object o) {

        for ( int i = 0; i < elements.length; i++ ) {
            if ( elements[i].equals(o) ) {
                return true;
            }
        }

        return false;
    }

    /**
     * 리스트의 모든 요소를 출력합니다.
     */
    public void print() {

        for ( int i = 0; i < elements.length; i++ ) {
            System.out.print(elements[i] + " ");
        }

        System.out.println();

    }


}
