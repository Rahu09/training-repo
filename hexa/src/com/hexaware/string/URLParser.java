package com.hexaware.string;

import java.util.HashMap;
import java.util.Map;

public class URLParser {
    private String url;
    private String protocol;
    private String host;
    private String path;
    private Map<String, String> queryParams;

    public URLParser(String url) {
        this.url = url;
        try {
            java.net.URL parsedURL = new java.net.URL(url);

            this.protocol =  parsedURL.getProtocol();
            this.host = parsedURL.getHost();
            this.path = parsedURL.getPath();

            this.queryParams = getQueryParams(parsedURL.getQuery());

        } catch (java.net.MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }

    @Override
	public String toString() {
		return "URLParser [\nurl=" + url + ", \nprotocol=" + protocol + ", \nhost=" + host + ", \npath=" + path
				+ ", \nqueryParams=" + queryParams + "\n]";
	}

	private Map<String, String> getQueryParams(String queryString) {
        Map<String, String> queryParams = new HashMap<>();
        
        if (queryString != null && !queryString.isEmpty()) {
            String[] params = queryString.split("&");
            
            for (String param : params) {
                String[] keyValue = param.split("=");
                
                if (keyValue.length == 2) {
                    queryParams.put(keyValue[0], keyValue[1]);
                }
            }
        }
        return queryParams;
    }
}
