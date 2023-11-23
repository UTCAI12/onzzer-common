package fr.utc.onzzer.common.dataclass;

import java.io.Serializable;

@FunctionalInterface
public interface UpdateListener<T extends Serializable> {
    void onUpdate(T value);
}