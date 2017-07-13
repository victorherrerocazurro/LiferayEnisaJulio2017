package com.example.plugins.model.impl;

import com.example.plugins.model.Subasta;
import com.example.plugins.service.SubastaLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Subasta service. Represents a row in the &quot;Subastas_Subasta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubastaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaImpl
 * @see com.example.plugins.model.Subasta
 * @generated
 */
public abstract class SubastaBaseImpl extends SubastaModelImpl
    implements Subasta {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a subasta model instance should use the {@link Subasta} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SubastaLocalServiceUtil.addSubasta(this);
        } else {
            SubastaLocalServiceUtil.updateSubasta(this);
        }
    }
}
