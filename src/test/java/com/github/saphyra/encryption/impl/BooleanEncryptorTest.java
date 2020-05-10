package com.github.saphyra.encryption.impl;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BooleanEncryptorTest {
    private BooleanEncryptor underTest;

    private final StringEncryptor stringEncryptor = new StringEncryptor();

    @Before
    public void setUp(){
        underTest = new BooleanEncryptor(stringEncryptor);
    }

    @Test
    public void encryptDecrypt(){
        String encrypted = underTest.encrypt(true, "key");
        boolean decrypted = underTest.decrypt(encrypted, "key");
        assertThat(decrypted).isTrue();
    }
}