package id.jagokoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import id.jagokoding.annotation.MyAnnotation;
import id.jagokoding.bean.util.BeanUtil;

@Configuration
@ComponentScan(useDefaultFilters = false,
			includeFilters = {@ComponentScan.Filter(
					type = FilterType.ANNOTATION, classes = {MyAnnotation.class}
			)}
)
public class FilterTypeAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeAnnotation.class);
		BeanUtil.printBeanNames(context);
	}
}
