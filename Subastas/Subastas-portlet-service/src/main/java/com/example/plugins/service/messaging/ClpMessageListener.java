package com.example.plugins.service.messaging;

import com.example.plugins.service.ClpSerializer;
import com.example.plugins.service.ProductoLocalServiceUtil;
import com.example.plugins.service.ProductoServiceUtil;
import com.example.plugins.service.PujaLocalServiceUtil;
import com.example.plugins.service.PujaServiceUtil;
import com.example.plugins.service.SubastaLocalServiceUtil;
import com.example.plugins.service.SubastaServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            ProductoLocalServiceUtil.clearService();

            ProductoServiceUtil.clearService();
            PujaLocalServiceUtil.clearService();

            PujaServiceUtil.clearService();
            SubastaLocalServiceUtil.clearService();

            SubastaServiceUtil.clearService();
        }
    }
}
