package fr.utc.onzzer.common.services;

import fr.utc.onzzer.common.dataclass.ModelUpdateTypes;
import fr.utc.onzzer.common.dataclass.UpdateListener;

import java.io.Serializable;

public interface Service {

    public <T extends Serializable> void addListener(UpdateListener<T> listener, Class<T> clazz, ModelUpdateTypes type);

    public <T extends Serializable> void notify(T value, Class<T> clazz, ModelUpdateTypes type);
}
