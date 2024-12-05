package com.infosys.spring_boot_operation.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class XmlService {

	@GetMapping(value="/MyPage")
	public String getXmlContext() throws IOException
	{
		
		ClassPathResource resource = new ClassPathResource("index.html");
		
		return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
	}
}
