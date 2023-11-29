package fr.utc.onzzer.common.services;

import fr.utc.onzzer.common.dataclass.ModelUpdateTypes;
import fr.utc.onzzer.common.dataclass.UpdateListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Listenable implements Service {

    private final List<ListenerData<?>> listeners = new ArrayList<>();

    public Listenable() {

    }

    public <T extends Serializable> void addListener(UpdateListener<T> listener, Class<T> clazz, ModelUpdateTypes type) {
        this.listeners.add(new ListenerData<>(listener, clazz, type));
    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> void notify(T value, Class<T> clazz, ModelUpdateTypes type) {
        this.listeners.stream()
                .filter(listener -> listener.type.equals(type))
                .filter(listener -> listener.clazz.equals(clazz))
                .map(listener -> (UpdateListener<T>) listener.listener)
                .forEach(listener -> listener.onUpdate(value));
    }

    static class ListenerData<T extends Serializable> {
        final public UpdateListener<T> listener;
        final public Class<T> clazz;
        final public ModelUpdateTypes type;
        public ListenerData(final UpdateListener<T> listener, final Class<T> clazz, final ModelUpdateTypes type) {
            this.listener = listener;
            this.clazz = clazz;
            this.type = type;
        }
    }
}
