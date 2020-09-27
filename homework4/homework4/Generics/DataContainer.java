package homework4.homework4.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class DataContainer <T> {
    private T[] data;
    private int index = 0;

    DataContainer(Class<T> Integer) {
        this.data = (T[]) Array.newInstance(Integer, 10);
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
        return (T)data[index];
    }

    T[] getItems() {
        return (T[])this.data;
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

    boolean deleteItem(T item) {

        for (int i = 0; i < this.data.length ; i++) {
            if (this.data[i] == (T) item) {
                boolean temp = delete(i);
                return true;
            }
        }
        System.out.println("No item");
        return false;
    }

    void sort(Comparator<T> comparator){
        int a = 0;                                    // считаем сколкьо null в массиве
        for (int i = 0; i < this.data.length ; i++) {
            if (this.data[i] == null) {
                a += 1;
            }
        }
        // создаем новый массив без null
                T[] temp = Arrays.copyOf(data, this.data.length - a);
                int k = 0;
                for (int j = 0; j < this.data.length; j++) {
                    temp[k] = this.data[j];
                        k++;
                this.data = temp;
                }
        T tmp; // сортиреум
        for (int i = 0; i < this.data.length-1 ; i++) {
            for (int j = 0; j < this.data.length-1; j++) {
                if(comparator.compare(this.data[j], this.data[j + 1]) > 0){
                    tmp = this.data[j];
                    this.data[j] = this.data[j+1];
                    this.data[j+1] = tmp;
                }
            }
        }
    }

        @Override
        public String toString () {
            int a = 0;                                    // считаем сколкьо null в массиве
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] == null) {
                    a += 1;
                }
            }
            // создаем новый массив без null
            T[] temp = Arrays.copyOf(data, this.data.length - a);
            int k = 0;
            for (int j = 0; j < this.data.length; j++) {
                temp[k] = this.data[j];
                k++;
                this.data = temp;
            }
            return "data = " + Arrays.toString(temp);
        }
    }
