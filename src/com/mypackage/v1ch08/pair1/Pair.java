package com.mypackage.v1ch08.pair1;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月23日  15:01
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null; second = null;
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }
    public void setSecond(T newValue) {
        second = newValue;
    }
}
