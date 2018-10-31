package com.mypackage.v1ch08.pair3;

/**
 * 描述:
 * Pair
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年10月24日  10:36
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() { first = null; second = null; }
    public Pair(T first, T second) { this.first = first;  this.second = second; }

    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
}
