package queue;

import java.util.Arrays;

public class QueueImpl<E> implements Queue<E> {

    public static final int HEAD_DEFAULT = 0;
    public static final int TAIL_DEFAULT = -1;
    protected E[] data;
    protected E[] dataTemp;
    protected int size;
    protected int maxSize;
    protected int tail;
    protected int head;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object [maxSize];
        this.dataTemp = (E[]) new Object [maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
        this.maxSize=maxSize;
    }

    @Override
    public final boolean insert(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1&&tail==0) {
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }

        E value = data[head++];
       size--;


        this.dataTemp= Arrays.copyOfRange(this.data,head,tail+1);
        this.data = Arrays.copyOf(this.dataTemp,dataTemp.length+1);
        //this.data = this.dataTemp;
        tail--;
        head =HEAD_DEFAULT;
        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() { return size;
    }

    @Override
    public boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public boolean isFull() {
        return data.length == size&&data.length==maxSize;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--> [");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
