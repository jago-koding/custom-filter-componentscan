package id.jagokoding.bean;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CustomTypeFilter implements TypeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		String[] interfaceNames = classMetadata.getInterfaceNames();
//		Arrays.stream(interfaceNames).forEach(obj -> {
//			System.out.println("interface name: " + obj);
//		});
		if (Arrays.stream(interfaceNames).anyMatch(obj -> obj.equals("java.lang.Runnable"))) {
			return true;
		}
		
		return false;
	}

}
