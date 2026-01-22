package Jan_20.Lambda;

@FunctionalInterface
public interface Modifier<T> {
    T modify(T t);
}
