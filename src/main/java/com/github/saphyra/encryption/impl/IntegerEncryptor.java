package com.github.saphyra.encryption.impl;

import com.github.saphyra.encryption.base.AbstractEncryptor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class IntegerEncryptor extends AbstractEncryptor<Integer> {
    private final StringEncryptor stringEncryptor;

    @Override
    protected String encrypt(Integer entity, String key) {
        return stringEncryptor.encryptEntity(entity.toString(), key);
    }

    @Override
    protected Integer decrypt(String entity, String key) {
        return Integer.valueOf(stringEncryptor.decryptEntity(entity, key));
    }
}
