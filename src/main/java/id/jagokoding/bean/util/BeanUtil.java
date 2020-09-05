package id.jagokoding.bean.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

public class BeanUtil {

	public static void printBeanNames(ApplicationContext context) {
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.stream(beanNames).filter(n -> !n.contains("springframework")).forEach(System.out::println);
	}
}
