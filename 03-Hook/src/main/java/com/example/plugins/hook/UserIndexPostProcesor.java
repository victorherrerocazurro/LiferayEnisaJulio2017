package com.example.plugins.hook;

import com.liferay.portal.kernel.search.BaseIndexerPostProcessor;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.model.User;

public class UserIndexPostProcesor extends BaseIndexerPostProcessor {

	@Override
	public void postProcessDocument(Document document, Object obj) throws Exception {
		User userEntity = (User) obj;
		
		String indexerUserTitle = userEntity.getJobTitle();
		
		if (indexerUserTitle.length() > 0){
			//Añadiendo al registro del indice (document) el campo JobTitle del User
			document.addText(Field.TITLE, indexerUserTitle);
		}
	}

}
