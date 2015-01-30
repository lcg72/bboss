package org.frameworkset.gencode.core;

import org.frameworkset.gencode.entity.Method;

import bboss.org.apache.velocity.Template;
import bboss.org.apache.velocity.VelocityContext;

import com.frameworkset.util.VelocityUtil;

public class CountMethodBodyGenerate implements MethodBodyGenerate {

	@Override
	public void gen(Method method, String entityName, String paramName,
			String encodecharset, String exception) throws Exception {
		 Template addmethodbodytempalte = VelocityUtil.getTemplate("gencode/body/countsize.vm");
		 VelocityContext context = new VelocityContext();
		 
		 
		 context.put("entityName", entityName);
		 context.put("paramName", paramName);
		 context.put("exception", exception);
	    
		 String body = GencodeServiceImpl.writetostring(context,addmethodbodytempalte,encodecharset);
		 method.setBody(body);

	}

}