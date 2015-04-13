package me.j360.base.service.http;

import me.j360.base.bean.ResponseWrapper;

public interface IHttpClient {

    public static final String CHARSET = "UTF-8";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    
    public static final String RATE_LIMIT_QUOTA = "X-Rate-Limit-Limit";
    public static final String RATE_LIMIT_Remaining = "X-Rate-Limit-Remaining";
    public static final String RATE_LIMIT_Reset = "X-Rate-Limit-Reset";
    public static final String CMG_USER_AGENT = "CMG-API-Java-Client";
    
    public static final int RESPONSE_OK = 200;
    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";

    //设置连接超时时间
    public final int DEFAULT_CONNECTION_TIMEOUT = (20 * 1000); // milliseconds
    
    //设置读取超时时间
    public final int DEFAULT_SOCKET_TIMEOUT = (30 * 1000); // milliseconds

    public ResponseWrapper sendGet(String url, String params, String authCode);
    
    public ResponseWrapper sendPost(String url, String content, String authCode);
    

}
