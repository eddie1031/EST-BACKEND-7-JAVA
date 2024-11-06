# 함수형 프로그래밍 패러다임
함수형 프로그래밍(Functional Programming)은 함수를 일급 객체로 다루는 패러다임으로, 주로 순수 함수와 불변성을 강조하여 프로그램을 작성합니다. 이 패러다임은 수학적 함수의 개념에서 영감을 받아, 부작용을 최소화하고 코드의 예측 가능성을 높이는 것을 목표로 합니다.  

## 함수형 인터페이스(Functional Interface)
함수형 인터페이스(functional interface)는 추상메서드가 1개만 정의된 인터페이스를 통칭합니다. 함수형 인터페이스의 목적은 Java에서 `람다 표현식(Lambda Expression)`을 이용해 함수형 프로그래밍 패러다임을 구현하는 것입니다.  

## 표준 API
Java에서 람다식을 변수 혹은 매개변수에 할당하기 위해서는 인터페이스의 선언이 필요합니다. Java는 타입이 반드시 필요하기 때문입니다. 따라서 Java는 언어차원에서 몇가지 형태를 지정하여 미리 선언해두어 제공하고 있고, 그것을 이용하여 편리하게 람다식을 이용할 수 있게 되는 것입니다.  

### 표준 API 종류
함수형 인터페이스의 표준 API는 `java.util.function`에서 제공되고 있습니다. 다음과 같습니다.  

| 인터페이스 명        | 내용                               | 
|:---------------|:---------------------------------|
| Consumer<T>    | 매개변수를 사용만 하고 반환을 하지 않는 함수 형태로 이용 | 
| Supplier<T>    | 매개변수를 사용 안하고 반환만 하는 함수 형태로 이용    | 
| Function<T, R> | 매개변수 값을 연산 후 새로운 타입으로 반환         | 
| Predicate<T>   | 매개변수 값이 조건에 맞는지 확인해서 boolean 반환  | 

#### Consumer<T>

```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

- 특징 : 값을 소비(Consume)할 뿐 반환하지는 않습니다.

#### Supplier<T>

```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}

```

- 특징 : 매개변수 없이 값을 생산(Supply)하여 반환합니다.


#### Supplier<T>

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```

- 특징 : `일정 타입<T>`의 매개변수 값을 받아서 기능을 수행한 후 `다른 타입<R>`의 값을 반환합니다.

#### Supplier<T>

```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```

- 특징 : 매개변수로 들어온 값 혹은 수식을 확인(Test) 후 참/거짓을 반환합니다.
