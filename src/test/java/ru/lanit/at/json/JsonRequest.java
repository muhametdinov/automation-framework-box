package ru.lanit.at.json;

public class JsonRequest {
    private String site_url;
    private String browser;
    private String browser_config;
    private String remote;
    private String proxy;
    private String proxy_config;
    private String hub_url;

    public String getSite_url() {
        return site_url;
    }

    public String getBrowser() {
        return browser;
    }

    public String getBrowser_config() {
        return browser_config;
    }

    public String getRemote() {
        return remote;
    }

    public String getProxy() {
        return proxy;
    }

    public String getProxy_config() {
        return proxy_config;
    }

    public String getHub_url() {
        return hub_url;
    }
}
