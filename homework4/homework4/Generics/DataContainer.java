package homework4.homework4.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

class DataContainer <T> {
    private T[] data;
    private int index = 0;


    DataContainer(Class<T> Integer) {
        this.data = (T[]) Array.newInstance(Integer, 5);
    }

    int add(T item) {
        if (this.index == this.data.length) {
            T[] copy = Arrays.copyOf(data, this.data.length + 1);
            this.data = copy;
        }
        this.data[this.index] = item;
        return this.index++;
    }

    T get(int index) {
        return (T) data[index];
    }

    T[] getItems() {
        return this.data;
    }

    boolean delete(int index) {
        if(index > this.index -1){
            System.out.println("Такого индекса нет");
            return false;
        }
        T[] temp = Arrays.copyOf(data, this.data.length - 1);
        int j = 0;
        for (int i = 0; i < this.data.length ; i++) {
            if(index !=  i){
                temp[j] = this.data[i];
                j++;
            }
        }
        this.data = temp;
        index--;
        return true;
    }

    boolean delete(T item){

        return 
    }

        @Override
        public String toString () {
            return "data = " + Arrays.toString(data);
        }
    }
