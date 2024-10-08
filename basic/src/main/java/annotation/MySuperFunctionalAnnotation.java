package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySuperFunctionalAnnotation {

    String value() default "";
    int range();

}
