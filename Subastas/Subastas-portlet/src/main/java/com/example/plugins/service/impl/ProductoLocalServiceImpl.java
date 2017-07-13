package com.example.plugins.service.impl;

import java.util.Date;
import java.util.List;

import com.example.plugins.model.Producto;
import com.example.plugins.service.base.ProductoLocalServiceBaseImpl;
import com.example.plugins.service.dto.ProductoDto;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the producto local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.plugins.service.ProductoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.base.ProductoLocalServiceBaseImpl
 * @see com.example.plugins.service.ProductoLocalServiceUtil
 */
public class ProductoLocalServiceImpl extends ProductoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.example.plugins.service.ProductoLocalServiceUtil} to access the producto local service.
     */
	public long altaProducto(ProductoDto productoDto, ServiceContext serviceContext) throws SystemException, PortalException {
		
		long productoId = counterLocalService.increment();
		
		Producto producto = createProducto(productoId);
		
		producto.setNombre(productoDto.getNombre());
		producto.setDescripcion(productoDto.getDescripcion());
		producto.setPrecio(productoDto.getPrecio());
		
		producto.setCreateDate(new Date());
		producto.setModifiedDate(new Date());
		producto.setCompanyId(serviceContext.getCompanyId());
		producto.setUserId(serviceContext.getUserId());
		producto.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		producto.setGroupId(serviceContext.getScopeGroupId());
		
		addProducto(producto);
		
		return productoId;

	}
	
	public List<Producto> buscarProductosPorNombre(String nombre) throws SystemException{
		return productoPersistence.findByNombre(nombre);
	}
	
	public List<Producto> buscarProductosPorNombreAndPrecio(String nombre, double precio) throws SystemException{
		return productoPersistence.findByNombre_Precio(nombre, precio);
	}
}
