/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 01.
 * @version $Id$
 */

/**
 * Event List를 가져오는 Create Api의 Executor.
 */
public class ParametersListExecutor extends ServiceExecutor {

    public ParametersListExecutor() {
        serviceObject = new ParametersList();
    }

    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}
