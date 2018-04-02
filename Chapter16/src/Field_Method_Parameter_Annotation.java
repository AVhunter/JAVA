import java.lang.annotation.*;
//用于字段、方法、参数
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
//在运行时加载Annotation到jvm中
public @interface Field_Method_Parameter_Annotation {
	String describe();//定义一个没有默认值的String成员
	Class type() default void.class;//定义一个具有默认值的Class成
	
}
