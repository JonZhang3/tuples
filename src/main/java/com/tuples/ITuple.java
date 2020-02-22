package com.tuples;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 元组的接口类。
 *
 * @author Jon
 */
public interface ITuple extends Serializable {

    /**
     * 返回元组中元素的数量
     *
     * @return 元组中元素的数量
     * @see List#size()
     */
    int size();

    /**
     * 如果元组中包含指定名称，返回 true，否则返回 false。
     *
     * @param name 元素的名称
     * @return 如果元组中包含指定的名称，返回 true
     */
    boolean contains(String name);

    /**
     * 如果元组中包含指定的元素，返回 true；否则返回 false
     *
     * @param value 要查找的元素
     * @return 如果元组中包含指定的元素，返回 true
     */
    boolean containsValue(Object value);

    /**
     * 获取元组中指定位置的元素
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     */
    Object getValue(int index);

    /**
     * 获取元组中指定名称的元素，如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     */
    Object getValue(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 byte 数组。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 byte 数组
     */
    byte[] getBytes(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 byte 数组。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 byte 数组
     */
    byte[] getBytes(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Character。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Character
     */
    Character getChar(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Character。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Character
     */
    Character getChar(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Boolean。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Boolean
     */
    Boolean getBoolean(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Boolean。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Boolean
     */
    Boolean getBoolean(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Byte。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Byte
     */
    Byte getByte(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Byte。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Byte
     */
    Byte getByte(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Short。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Short
     */
    Short getShort(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Short。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Short
     */
    Short getShort(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Integer。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Integer
     */
    Integer getInt(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Integer。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Integer
     */
    Integer getInt(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Long。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Long
     */
    Long getLong(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Long。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Long
     */
    Long getLong(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Float。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Float
     */
    Float getFloat(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Float。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Float
     */
    Float getFloat(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 Double。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 Double
     */
    Double getDouble(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 Double。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 Double
     */
    Double getDouble(String name);

    /**
     * 获取元组中指定位置的元素，并将其尽可能转换为 BigDecimal。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     * @throws ConvertException 如果元素不能转换为 BigDecimal
     */
    BigDecimal getBigDecimal(int index);

    /**
     * 获取元组中指定名称的元素，并将其尽可能转换为 BigDecimal。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     * @throws ConvertException 如果元素不能转换为 BigDecimal
     */
    BigDecimal getBigDecimal(String name);

    /**
     * 获取元组中指定位置的元素，并将其转换为 String，调用 Object 的 toString 方法。
     *
     * @param index 要返回元素的索引
     * @return 在元组中指定位置的元素
     * @throws IndexOutOfBoundsException 若果索引超出了范围（<tt>index &lt; 0 || index &gt;= size()</tt>）
     */
    String getString(int index);

    /**
     * 获取元组中指定位置的元素，并将其转换为 String，调用 Object 的 toString 方法。如果查找不到该名称的元素，返回 null。
     *
     * @param name 要返回元素的名称
     * @return 元组中指定名称的元素，如果查找不到，返回 null
     */
    String getString(String name);

    /**
     * 获取元组中所有的值
     *
     * @return 元组中所有的值
     */
    List<Object> getValues();

    /**
     * 往元组最后添加指定的元素
     *
     * @param value 新的元素
     */
    void add(Object value);

    /**
     * 在元组中指定位置，插入指定的元素
     *
     * @param index 期望元素插入的元素
     * @param value 新的元素
     */
    void add(int index, Object value);

    /**
     * 在元组中添加指定名称的元素，元素的名称不能为 null
     *
     * @param name 元素的名称
     * @param value 元素
     */
    void add(String name, Object value);

    /**
     * 从元组中移除第一个出现的指定元素
     *
     * @param value 要移除的元素
     * @return 如果元组中包含指定的元素，返回 true
     */
    boolean remove(Object value);

    /**
     * 从元祖中移除指定名称的元素，名称不能为 null
     *
     * @param name 要移除元素的名称
     * @return 如果元组中包含指定的名称，返回指定名称对应的元素，否则返回 null
     */
    Object removeName(String name);

    /**
     * 从元组中移除指定索引位置的元素
     *
     * @param index 想要移除元素的索引值
     * @return 元组中该索引位置的元素
     */
    Object removeIndex(int index);

    /**
     * 按照顺序循环为元组中的每个元素执行执行的操作，
     * 关于操作中的参数：
     * name: 元素的名称，如果添加时没有指定名称，则为 null
     * index: 元素在元组中的索引
     * value: 元素
     *
     * @param action 为每个元素执行的操作
     */
    void forEach(Action<String, Integer, Object> action);

}
