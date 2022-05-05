package com.problems.exercises.random;

import com.problems.exercises.testObjects.ListObject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomCacheWithList<K,V> {
    List<ListObject> dataList= new CopyOnWriteArrayList<>();
    boolean isKeyTypePresent;
    V returnValue;
    public CustomCacheWithList() {
    }

    public void insert(K key, V value) throws Exception {
        isKeyTypePresent = false;
        dataList.forEach(obj -> {
            if (isInstanceOf(key.getClass(),obj.getKey().getClass())) {
                isKeyTypePresent = true;
                if(obj.getKey().equals(key)){
                    replace(key,value);
                }
                if (value.getClass().isAssignableFrom(obj.getValue().getClass())) {
                   ListObject<K,V> listObj= new ListObject(key,value);
                   dataList.add(listObj);
                    return;
                } else {
                   throw new RuntimeException("Insertion is not Allowed");
                }
            }

        });
        if (!isKeyTypePresent) {
            ListObject<K,V> listObj= new ListObject(key,value);
            dataList.add(listObj);
            return;
        }

    }

    public V getkey(K key) {
       returnValue=null;

         dataList.forEach(obj->{
            if(obj.getKey().equals(key)){
                returnValue= (V)obj.getValue();
            }
        });
         return  returnValue;
    }

    private boolean isInstanceOf(Class t1,Class t2){
     if(t1.equals(t2)) return true;
     if(t1.isAssignableFrom(t2)) return  true;
     else return false;
    }

    private ListObject getListObject(K key){
       return dataList.stream().filter(obj-> obj.getKey().equals(key)).findFirst().get();
    }

    private void replace(K key, V value){

        this.getListObject(key).setValue(value);
    }
}
