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
public class StatsPeriodExecutor extends ServiceExecutor {

    public StatsPeriodExecutor() {
        serviceObject = new StatsPeriod();
    }

    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}
