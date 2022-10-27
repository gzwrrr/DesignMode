package com.gontoy.a_single.example;

/**
 * 该实现可以防止反射攻击
 * 在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，然后调用构造函数从而实例化对象
 * 如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码
 * 而该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法
 *
 * @author gzw
 */
public enum EnumSingle {
    /**
     * 实例对象
     */
    INSTANCE;

    private String SingleName;

    public String getSingleName() {
        return SingleName;
    }

    public void setSingleName(String singleName) {
        SingleName = singleName;
    }
}
