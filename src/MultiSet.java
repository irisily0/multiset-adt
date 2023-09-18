public interface MultiSet<T> {
    boolean add(T item);
    void remove();
    boolean contains();
    boolean isEmpty();
    int count(T item);
    int size();
}