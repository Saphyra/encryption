package com.github.saphyra.encryption.base;

public interface Encryptor <T> {
    String encryptEntity(T entity, String key);
    T decryptEntity(String  entity, String key);
}
