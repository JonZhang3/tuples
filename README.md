# Tuples

## 简介
元组是一个可以保存多个值的数据结构，而且可保存不同类型的值。

该框架是元组的一个简单的实现，不仅可以方便的存入数据，也可以从中取得想要的数据类型的数据（自动类型转换）。

## 示例
```java
Tuple tuple = new Tuple();
tuple.add("A");
tuple.add(123);
tuple.add(13.14);
tuple.add("test", "test");// 可为值指定名称，方便使用名称读取数据。如果相同名称的值已经存在，则会覆盖已经存在的值

tuple.add(1, "abc");// 也可以指定索引，在指定位置插入数据

// 获取数据
tuple.get(0);// 使用索引获取
tuple.getString("test");// 使用名称获取

// 移除数据
tuple.remove(value);// 移除指定的元素
tuple.removeName(name);// 移除指定名称的元素
tuple.removeIndex(index);// 移除指定索引的元素

/**
 * 关于接口中的参数：
 * name: 元素的名称，如果添加时没有指定名称，则为 null
 * index: 元素在元组中的索引
 * value: 元素
 */
tuple.forEach((name, index, value) -> {});

```
## 使用
### Maven
在项目的pom.xml的dependencies中加入以下内容:
```xml
<dependency>
    <groupId>com.github.jonzhang3</groupId>
    <artifactId>tuples</artifactId>
    <version>1.0.0</version>
</dependency>
```
