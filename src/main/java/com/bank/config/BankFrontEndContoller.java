package com.bank.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BankFrontEndContoller extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] confiClass = { BankConfig.class };
		return confiClass;
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/rbi/*" };
	}

}
