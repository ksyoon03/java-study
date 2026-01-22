package _13_Lambda;

@FunctionalInterface
public interface Modifier<T> {
    T modify(T t);
}
