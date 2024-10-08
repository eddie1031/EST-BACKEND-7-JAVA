package annotation.example.S1;

// URL <-
// [WEB 발신]
// ㅇㅇㅇㅇ 당첨되셨습닏
// http://bit.ly/ABCE0934/ <zmfflr

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GetMapping {
    String value() default "";
    String httpMethod() default "GET";
}
