package id.jagokoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import id.jagokoding.bean.util.BeanUtil;

@Configuration
@ComponentScan(useDefaultFilters = false,
			includeFilters = {@ComponentScan.Filter(
					type = FilterType.REGEX, pattern = {".*[AB]"}
			)},
			excludeFilters = {@ComponentScan.Filter(
					type = FilterType.ASSIGNABLE_TYPE, classes = {FilterTypeAssignable.class}
			)}
)
public class FilterTypeRegex {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeRegex.class);
		BeanUtil.printBeanNames(context);
	}
}
