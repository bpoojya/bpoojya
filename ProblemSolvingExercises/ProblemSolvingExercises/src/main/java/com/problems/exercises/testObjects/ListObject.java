package com.problems.exercises.testObjects;

public class ListObject<K,V> {
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
      this.value=value;
    }
    public ListObject(K key,V value){
        this.key=key;
        this.value=value;

    }

}
