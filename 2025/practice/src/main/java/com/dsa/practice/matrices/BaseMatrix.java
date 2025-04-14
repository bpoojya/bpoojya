package com.dsa.practice.matrices;

public class BaseMatrix<T>{

    public <t> String printArray(t[][] array){

        final StringBuilder builder = new StringBuilder();
        for(t[] row :array){
            for (t t : row) {
                builder.append(t);
            }
        }

        return builder.toString();
    }
}
