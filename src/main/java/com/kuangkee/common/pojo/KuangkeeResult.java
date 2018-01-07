package com.kuangkee.common.pojo;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuangkee.common.utils.constant.Constants;

/**
 * Kuangkee自定义响应结构
 */
public class KuangkeeResult {
	
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static KuangkeeResult build(Integer status, String msg, Object data) {
        return new KuangkeeResult(status, msg, data);
    }

    public static KuangkeeResult ok(Object data) {
        return new KuangkeeResult(data);
    }

    public static KuangkeeResult ok() {
        return new KuangkeeResult(null);
    }

    public KuangkeeResult() {

    }

    public static KuangkeeResult build(Integer status, String msg) {
        return new KuangkeeResult(status, msg, null);
    }

    public KuangkeeResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public KuangkeeResult(Object data) {
        this.status = Constants.KuangKeeResultConst.SUC_CODE ;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */
    public static KuangkeeResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, KuangkeeResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static KuangkeeResult format(String json) {
        try {
            return MAPPER.readValue(json, KuangkeeResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static KuangkeeResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
