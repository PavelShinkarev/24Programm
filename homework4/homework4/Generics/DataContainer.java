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

    public int add(T item) {
        if (this.index == this.data.length) {
            T[] copy = Arrays.copyOf(data, this.data.length + 1);
            this.data = copy;
        }
        this.data[this.index] = item;
        return this.index++;
    }
    public T get(int index) {
        return (T) data[index];
    }
    public T[] getItems() {
        return (T[]) this.data;
    }
    public int getLenght(){
        return this.data.length;
    }
    public boolean delete(int index) {
        if (index > this.index - 1) {
            System.out.println("Такого индекса нет");
            return false;
        }
        T[] temp = Arrays.copyOf(data, this.data.length - 1);
        int j = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (index != i) {
                temp[j] = this.data[i];
                j++;
            }
        }
        this.data = temp;
        this.index--;
        return true;
    }

    public boolean deleteItem(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == (T) item) {
                boolean temp = delete(i);
                return true;
            }
        }
        System.out.println("No item");
        return false;
    }
    public String toString(T[] mass) { // без удаления ячеек с null
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(String.valueOf(mass[0]));
        for (int i = 1; i<= mass.length-1 ; i++) {
            if (mass[i] != null){
                sb.append(", ");
                sb.append(String.valueOf(mass[i]));
            }
        }
        return sb.append(']').toString();
    }
    public void sort(Comparator<T> comparator) {
        int a = 0;                                    // считаем сколкьо null в массиве
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                a++;
            }
        }
        T[] temp = Arrays.copyOf(data, this.data.length - a); // создаем новый массив без null
        int k = 0;
        for (int j = 0; j < this.data.length; j++) {
            temp[k] = this.data[j];
            k++;
            this.data = temp;
        }
        T tmp; // сортиреум
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                    tmp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = tmp;
                }
            }
        }
    }
    public static <V extends Comparable> void sort(DataContainer<V> container) {
        V tmp;
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if (container.data[j].compareTo(container.data[j + 1]) > 0) {
                    tmp = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = tmp;
                }
            }
        }
    }
    public static <V> void sort(DataContainer<V> container, Comparator<V> comparator) {
        V tmp;
        for (int i = 0; i < container.data.length - 1; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if (comparator.compare(container.data[j], container.data[j + 1]) > 0) {
                    tmp = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = tmp;
                }
            }
        }
    }
}