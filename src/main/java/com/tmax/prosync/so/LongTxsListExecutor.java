/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 04.
 * @version $Id$
 */

/**
 * MappingRule List�� �������� Create Api�� Executor.
 */
public class LongTxsListExecutor extends ServiceExecutor {

    public LongTxsListExecutor() {
        serviceObject = new LongTxsList();
    }

    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}
