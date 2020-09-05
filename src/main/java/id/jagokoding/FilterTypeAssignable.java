package id.jagokoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import id.jagokoding.bean.BeanA;
import id.jagokoding.bean.BeanC;
import id.jagokoding.bean.util.BeanUtil;

@Configuration
@ComponentScan(useDefaultFilters = false,
			includeFilters = {@ComponentScan.Filter(
					type = FilterType.ASSIGNABLE_TYPE, classes = {BeanA.class, BeanC.class}
			)})
public class FilterTypeAssignable {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeAssignable.class);
		BeanUtil.printBeanNames(context);
	}
}
