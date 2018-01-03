/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 1.
 * @version $Id$
 */

/**
 * Instance List를 가져오는 Create Api의 Executor.
 */
public class TablesListExecutor extends ServiceExecutor {

    public TablesListExecutor() {
        serviceObject = new TablesList();
    }

    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}
