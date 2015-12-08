# MyMultiDex
该项目是根据HotFix项目修改而来，使用了项目中的HotFix.java和Utils.java两个类。
但是制作补丁的方式却是使用的另外一种方法。这种方法也可以避免出现java.lang.IllegalAccessError: Class ref in pre-verified class resolved to unexpected implementation
，所以也就无需使用javassist动态注入。
项目可以直接运行。

补丁的制作方法请参考:http://blog.csdn.net/aerfahaidao/article/details/50217521
