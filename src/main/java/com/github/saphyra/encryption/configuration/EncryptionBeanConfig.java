package com.github.saphyra.encryption.configuration;

import com.github.saphyra.encryption.impl.BooleanEncryptor;
import com.github.saphyra.encryption.impl.IntegerEncryptor;
import com.github.saphyra.encryption.impl.PasswordService;
import com.github.saphyra.encryption.impl.StringEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EncryptionBeanConfig {
    @Bean
    public PasswordService passwordService(){
        return new PasswordService();
    }

    @Bean
    public StringEncryptor stringEncryptor(){
        return new StringEncryptor();
    }

    @Bean
    public IntegerEncryptor integerEncryptor(StringEncryptor stringEncryptor){
        return new IntegerEncryptor(stringEncryptor);
    }

    @Bean
    public BooleanEncryptor booleanEncryptor(StringEncryptor stringEncryptor){
        return new BooleanEncryptor(stringEncryptor);
    }
}
