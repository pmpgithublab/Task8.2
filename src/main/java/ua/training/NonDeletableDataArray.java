package ua.training;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class NonDeletableDataArray<T> extends ArrayList {

    @Override
    public Object remove(int index) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    public void clear() {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new RuntimeException(new OperationNotSupportedException());
    }

    public static void main(String[] args) {

        NonDeletableDataArray<String> nonDeletableDataArray = new NonDeletableDataArray();
        nonDeletableDataArray.add("One");
        nonDeletableDataArray.add("Three");
        nonDeletableDataArray.add("Nine");

        nonDeletableDataArray.clear();
        nonDeletableDataArray.remove("Nine");
        nonDeletableDataArray.removeAll(Arrays.asList("One", "Three"));
        nonDeletableDataArray.removeRange(1, 2);
    }

}
