package com.lim.test.jetcache.demo.service;

/**
 * jetcache 操作
 *
 * @author Lim
 * @since 2020/1/4
 */
public interface IJetCacheService {

    /**
     * 添加缓存数据,自定义过期时间
     * @param key key
     * @param value value
     * @return value
     */
    String post(String key, String value);

    /**
     * 添加缓存数据，默认过期时间
     * @param key key
     * @param value value
     * @return value
     */
    String defalutExpire(String key, String value);

    /**
     * 修改缓存数据
     * @param key key
     * @param value value
     * @return value
     */
    String put(String key, String value);

    /**
     * 查询缓存数据
     * @param key key
     * @return value
     */
    String get(String key);

    /**
     * 删除缓存数据
     * @param key key
     * @return key
     */
    String delete(String key);

    /**
     * 添加缓存数据,key为方法名
     * @param value value
     * @return value
     */
    String postMethodName(String value);
}
