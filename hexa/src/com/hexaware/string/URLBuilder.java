package com.hexaware.string;

import java.util.Map;

public class URLBuilder {
    private String protocol;
    private String host;
    private String path;
    private Map<String, String> queryParams;

    public URLBuilder(String protocol, String host, String path, Map<String, String> queryParams) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
        this.queryParams = queryParams;
    }

    public String build() {
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(protocol).append("://").append(host).append(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            urlBuilder.append("?");
            boolean first = true;
            
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            	
                if (!first) {
                    urlBuilder.append("&");
                }
                
                urlBuilder.append(entry.getKey()).append("=").append(entry.getValue());
                first = false;
            }
        }

        return urlBuilder.toString();
    }
}
