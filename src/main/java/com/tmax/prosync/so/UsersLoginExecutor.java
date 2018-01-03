/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;


//import java.util.Map;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;
//import com.tmax.proobject.engine.servicemanager.ServiceManager;
//import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 04.
 * @version $Id$
 */

/**
 * MappingRule List를 가져오는 Create Api의 Executor.
 */
public class UsersLoginExecutor extends ServiceExecutor {

    public UsersLoginExecutor() {
        //Map<String,String> RESTVal = ServiceManager.getCurrentRequestContext().getRequest().getRESTMap();
        //switch (RESTVal.get("User")) {
        //case "Login":
            serviceObject = new UsersLogin();
            //break;
        //case "List":
            //serviceObject = new UserList();
            //break;
        }
        
    //}
    
    public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {

        return serviceObject.service(serviceInput);
    }

    public String getRendezvousMethodName(String service) {
        return null;
    }
}

