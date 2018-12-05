package org.githup.es.service;

import org.githup.es.param.DeleteParam;

/**
 * ES服务端
 * 
 * @author jijunwei
 *
 */
public interface EsDeleteService {
	
	/**
	 * 删除数据
	 * @param esDeleteParam
	 * @return
	 */
	public boolean delDataById(DeleteParam esDeleteParam);
	
}
