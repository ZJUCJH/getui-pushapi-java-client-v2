package com.getui.push.v2.sdk.dto.req.message;

public class UpsCustomBean {

    /**
     * 消息类型
     * liveactivity：灵动岛消息（荣耀YOYO建议）
     */
    private String type;

    /**
     * 相应消息类型指定请求体的JSON字符串
     */
    private String payload;

    /**
     * 需要透传给厂商的请求头JSON字符串
     */
    private String headers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "UpsCustomBean{" +
                "type='" + type + '\'' +
                ", payload='" + payload + '\'' +
                ", headers='" + headers + '\'' +
                '}';
    }

}
