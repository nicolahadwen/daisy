package co.hadwen.object.translator;

import co.hadwen.exception.UnimplementedException;

public interface ObjectTranslator<T, V> {
    default V translateTo(T obj) {
        throw new UnimplementedException();
    }
    default T translateFrom(V obj) {
        throw new UnimplementedException();
    }
}
