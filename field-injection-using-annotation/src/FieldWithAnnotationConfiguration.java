package com.capgemini.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.renderer.MessageRendererField;
import com.capgemini.spring.provider.*;
import org.springframework.context.annotation.ComponentScan;

@Configuration
//@ComponentScan(basePackages = {"com.capgemini.spring.provider", })
@ComponentScan(basePackages = {"com.capgemini.spring.renderer", "com.capgemini.spring.provider"})

public class FieldWithAnnotationConfiguration {
	
 	
}