package com.iterator.pattern;

import java.util.Vector;

/**
 * 
 * 文件名称：Television
 * 创建人：      junly
 * 修改人 ：      junly
 * 创建日期时间：2015年5月14日 上午10:48:04
 * 备注:容器角色负责提供创建具体迭代器角色的接口
 * @version 1.0.0
 * 
 */
public interface Television {
    public Iterator createIterator();
    
    public Vector getChannel();
}
