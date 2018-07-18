package com.rabtman.wsmanager;

/**
 * @author zjm
 */

public class WsStatus {

    //websoket command常量
    public static final int JQ_ONLINE = 1; //在线并开始订阅
    public static final int JQ_TPOIC_TICKER = 100; //行情 ticker
    public static final int JQ_TPOIC_DEPTH = 101; //行情 depth
    public static final int JQ_TPOIC_NEW_TRADE = 102; //行情 new trade
    public static final int JQ_TPOIC_CANDLE = 103; //行情 candle
    public static final int JQ_MARKET = 200; //市场

    public final static int CONNECTED = 1;//已连接
    public final static int CONNECTING = 0;//连接中
    public final static int RECONNECT = 2;//重新连接
    public final static int DISCONNECTED = -1;//断开的

    class CODE {

        public final static int NORMAL_CLOSE = 1000;
        public final static int ABNORMAL_CLOSE = 1001;
    }

    class TIP {

        public final static String NORMAL_CLOSE = "normal close";
        public final static String ABNORMAL_CLOSE = "abnormal close";
    }
}
