package com.rodrigo.brewer.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.rodrigo.brewer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Mostra os controles criados para o Spring
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	
	/**
	 * Mapeia o que vem depois do nome do projeto
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
