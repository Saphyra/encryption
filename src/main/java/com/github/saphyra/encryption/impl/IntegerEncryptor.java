package com.github.saphyra.encryption.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
public class IntegerEncryptor{
    private final StringEncryptor stringEncryptor;

    public String encryptEntity(Integer entity, String key) {
        return stringEncryptor.encryptEntity(entity.toString(), key);
    }

    public Integer decryptEntity(String entity, String key) {
        return Integer.valueOf(stringEncryptor.decryptEntity(entity, key));
    }
}
