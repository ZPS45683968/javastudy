# 抽象工厂模式

## 概述

抽象工厂模式是工厂方法模式的进一步抽象和推广，它是一种更为高级的创建型设计模式。抽象工厂模式可以向客户端提供一个接口，使得客户端在不必指定产品的具体的情况下，创建多个产品族中的产品对象。

## 优点

* 抽象工厂模式隔离了具体类的生成，使得客户并不需要知道什么被创建。这样一来，客户就可以从具体的产品中被解耦。
* 当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。
* 增加新的产品族很方便，无须修改已有系统，符合“开闭原则”。
* 增加新的产品等级结构很方便，无须修改已有系统，符合“开闭原则”。
* 抽象工厂模式是一种“编译时刻绑定”的设计模式，它要求客户端在使用抽象工厂角色创建产品对象时，必须指定具体的产品类，而不能通过参数来动态指定。
## 缺点
* 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。