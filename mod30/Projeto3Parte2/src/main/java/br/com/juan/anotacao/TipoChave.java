package main.java.br.com.juan.anotacao;

import java.lang.annotation.*;


@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
