package id.jagokoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import id.jagokoding.bean.BeanF;
import id.jagokoding.bean.CustomTypeFilter;
import id.jagokoding.bean.util.BeanUtil;

@Configuration
@ComponentScan(useDefaultFilters = false,
			includeFilters = {@ComponentScan.Filter(
					type = FilterType.CUSTOM, classes = CustomTypeFilter.class
			)}
)
public class FilterTypeCustom {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeCustom.class);
		BeanUtil.printBeanNames(context);
		BeanF beanF = context.getBean(BeanF.class);
		beanF.run();
	}
}
