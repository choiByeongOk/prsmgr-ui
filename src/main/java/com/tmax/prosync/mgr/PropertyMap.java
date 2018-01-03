/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.mgr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.tmax.prosync.msg.Log;

/**
 * @author Uihyun (uihyun_kim@tmaxdata.com) 2017. 8. 3.
 * @version $Id$
 */

/**
 * ProSync Parameter의 값을 text로 mapping 시켜주는 class.
 */
public final class PropertyMap {

    // op_code
    private final static HashMap<Integer, String> opCodeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -5067504784208665989L;

        {
            put(0, "INS");
            put(1, "DEL");
            put(2, "UPD");
            put(3, "MI");
            put(4, "MD");
            put(5, "DPI");
            put(6, "BEGIN_TX");
            put(7, "COMMIT_TX");
            put(8, "ROLLBACK");
            put(9, "DDL");
        }
    };

    // proc_type
    private final static HashMap<Integer, String> procTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -1480836746504720987L;

        {
            put(1, "Manager process");
            put(2, "Extract process");
            put(3, "Apply process");
            put(4, "Long and lob process");
            put(7, "Verify process");
        }
    };

    // time_type
    private final static HashMap<Integer, String> timeTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -1098924616194434225L;

        {
            put(1, "Redo log time");
            put(2, "Extract - read time");
            put(3, "Apply - receive time");
            put(4, "Replay time");
        }
    };

    // event_type
    private final static HashMap<Integer, String> eventTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 3302041015134197980L;

        {
            put(0, "Fatal");
            put(1, "Error");
            put(2, "Warn");
            put(3, "Info");
            put(4, "Trace");
            put(5, "Debug");
        }
    };

    // thread_type
    private final static HashMap<Integer, String> threadTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -5237182312362993439L;

        {
            put(0, "Monitoring");
            put(1, "Control");
            put(2, "Working");
            put(3, "Read");
            put(4, "Construct");
            put(5, "Merge");
            put(6, "Replay");
            put(8, "Fetch_source");
            put(9, "Fetch_target");
            put(10, "Compare");
        }
    };

    // db_type
    private final static HashMap<Integer, String> dbTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 2715004637216898978L;

        {
            put(0, "Tibero");
            put(1, "Oracle");
        }
    };

    // status
    private final static HashMap<Integer, String> statusMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 7277373692904680325L;

        {
            put(0, "Stopped");
            put(1, "Syncing");
            put(2, "Paused");
        }
    };

    // syncType
    private final static HashMap<Integer, String> syncTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 2242615655339394650L;

        {
            put(0, "Target");
            put(1, "Source");
        }
    };

    // staticType
    private final static HashMap<Integer, String> staticTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 6601936341712354060L;

        {
            put(2, "Dynamic");
            put(1, "Static");
            put(0, "Hidden");
        }
    };

    // mandatoryType
    private final static HashMap<Integer, String> mandatoryTypeMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = -5505772398421479321L;

        {
            put(0, "Optional");
            put(1, "Mandatory");
        }
    };

    private final static HashMap<Integer, String> byKeyMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 1L;

        {
            put(0, "All Columns");
            put(1, "Key Columns");
        }
    };
    
    private final static HashMap<Integer, String> verifyStatusMap = new HashMap<Integer, String>() {
        private static final long serialVersionUID = 1L;

        {
            put(0, "In Sync");
            put(1, "Out of Sync");
            put(2, "In Progress");
            put(3, "Error");
        }
    };

    private PropertyMap() {
        throw new AssertionError();
    }

    /**
     * @return the opcodemapConnectionList
     */
    public static HashMap<Integer, String> getOpcodemap() {
        return opCodeMap;
    }

    /**
     * @return the proctypemap
     */
    public static HashMap<Integer, String> getProctypemap() {
        return procTypeMap;
    }

    /**
     * @return the timetypemap
     */
    public static HashMap<Integer, String> getTimetypemap() {
        return timeTypeMap;
    }

    /**
     * @return the eventtypemap
     */
    public static HashMap<Integer, String> getEventtypemap() {
        return eventTypeMap;
    }

    /**
     * @return the threadtypemap
     */
    public static HashMap<Integer, String> getThreadtypemap() {
        return threadTypeMap;
    }

    /**
     * @return the dbtypemap
     */
    public static HashMap<Integer, String> getDbtypemap() {
        return dbTypeMap;
    }

    /**
     * @return the status
     */
    public static HashMap<Integer, String> getStatusmap() {
        return statusMap;
    }

    /**
     * @return the syncType
     */
    public static HashMap<Integer, String> getSyncTypemap() {
        return syncTypeMap;
    }

    /**
     * @return the staticType
     */
    public static HashMap<Integer, String> getStaticTypemap() {
        return staticTypeMap;
    }

    /**
     * @return the mandatoryType
     */
    public static HashMap<Integer, String> getMandatoryTypemap() {
        return mandatoryTypeMap;
    }
    
    /**
     * @return the byKey
     */
    public static HashMap<Integer, String> getByKeymap() {
        return byKeyMap;
    }
    
    /**
     * @return the verifyStatus
     */
    public static HashMap<Integer, String> getVerifyStatus() {
        return verifyStatusMap;
    }


    /* input: (String) value, output: (int) key */
    public static int getIntKey(Iterator itr, String value) {
        int key = -1;
        while (itr.hasNext()) {
            Entry entry = (Entry) itr.next();
            if (entry.getValue().equals(value)) {
                key = (int) entry.getKey();
            }
        }

        return key;
    }

}
