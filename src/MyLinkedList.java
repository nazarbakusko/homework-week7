import static java.lang.String.valueOf;

public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }
        Node<T> tNode = new Node<>(null, last, value);
        last.next = tNode;
        last = tNode;
        size++;
    }

    public void addFirst(T data) {
        if (size != 0) {
            Node<T> toAdd = new Node<>(first, null, data);
            //toAdd.next = first;
            first.previous = toAdd;
            first = toAdd;
            size++;
        } else {
            Node<T> toAdd = new Node<>(null, null, data);
            first = toAdd;
            last = toAdd;
            //toAdd.next = null;
            size++;
        }
    }

    public void addByIndex(int index, T value) {
        Node<T> toAddIndex = new Node<>(null, null, value);
        if (size == 0) {
            first = toAddIndex;
            last = toAddIndex;
            size++;
            return;
        }
        if (size != 0 && index != size) {
            Node<T> previousNode = first;
            for (int i = 0; i < index - 1; i++) {
                previousNode = previousNode.next;
            }
            Node<T> afterNode = previousNode.next;
            toAddIndex.next = afterNode;
            toAddIndex.previous = previousNode;
            previousNode.next = toAddIndex;
            size++;
            return;
        }
        if (index == size) {
            add(value);
            return;
        }
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            T result = null;
            Node<T> temp = first;
        }
        if (index == 0) {
            T result = null;
            Node<T> temp = first;
            result = first.value;
            first = first.next;
            size--;
            return;
        } else if (index == size) {
            T result = null;
            Node<T> temp = first;
            result = last.value;
            last = last.next;
            size--;
            return;
        }
        for (int i = 0; i <= index - 1; i++) {
            T result = null;
            Node<T> temp = first;
            temp = temp.next;
            Node<T> current = temp.next;
            temp.next = current.next;
            result = current.value;
            current = null;
            size--;
            return;
        }
    }

    public void removeByValue(T value) {
        Node<T> toRemove = first;
        for (int i = 0; i < size; i++) {
            if (toRemove.value.equals(value)) {
                removeByIndex(i);
            }
            toRemove = toRemove.next;
        }
    }

    public void setByIndex(int index, T value) {
        Node<T> toSet = first;
        for (int i = 0; i < index; i++) {
            toSet = toSet.next;
        }
        toSet.value = value;
    }

    public T get(int index) {
        Node<T> toGet = first;
        int tempIndex = 0;
        while (tempIndex != index) {
            toGet = toGet.next;
            tempIndex++;
        }
        return toGet.value;
    }

    @Override
    public String toString() {
        Node<T> tempNode = first;
        StringBuilder builder = new StringBuilder();
        while (tempNode.next != null) {
            builder.append(valueOf(tempNode.value));
            tempNode = tempNode.next;
            builder.append("->");
        }
        builder.append(valueOf(last.value));
        return builder.toString();
    }

    private class Node<T> {

        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }

}