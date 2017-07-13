package com.example.plugins.service.impl;

import java.util.List;

import com.example.plugins.model.Producto;
import com.example.plugins.model.Puja;
import com.example.plugins.model.Subasta;
import com.example.plugins.service.base.PujaLocalServiceBaseImpl;
import com.example.plugins.service.dto.PujaDto;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the puja local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.plugins.service.PujaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.base.PujaLocalServiceBaseImpl
 * @see com.example.plugins.service.PujaLocalServiceUtil
 */
public class PujaLocalServiceImpl extends PujaLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.example.plugins.service.PujaLocalServiceUtil} to access the puja local service.
     */
	
	public List<Puja> consultarPujasDeUnaSubasta(long idSubasta) throws SystemException{
		return pujaPersistence.findBySubasta(idSubasta);
	}
	
	public PujaDto getPujaDto(long pujaId) throws PortalException, SystemException {
		
		Puja puja = getPuja(pujaId);
		
		Subasta subasta = subastaPersistence.findByPrimaryKey(puja.getSubastaId());
		
		Producto producto = productoPersistence.findByPrimaryKey(subasta.getProductoId());
		
		PujaDto pujaDto = new PujaDto();
			
		pujaDto.setPuja(puja);
		
		return null;
	}
}
