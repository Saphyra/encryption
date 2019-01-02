package com.github.saphyra.encryption;

import com.github.saphyra.encryption.configuration.BeanConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(BeanConfig.class)
public @interface EnableEncryption {
}
