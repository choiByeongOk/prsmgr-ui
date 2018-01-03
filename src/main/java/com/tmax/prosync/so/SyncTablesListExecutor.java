/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 13.
 * @version $Id$
 */

/**
 * SyncTable List를 가져오는 Create Api의 Executor.
 */
public class SyncTablesListExecutor extends ServiceExecutor {

    public SyncTablesListExecutor() {
        serviceObject = new SyncTablesList();
    }

    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}
