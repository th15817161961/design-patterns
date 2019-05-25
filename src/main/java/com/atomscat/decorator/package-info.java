/**
 * 动态地为对象附加额外的职责。装饰器提供了一种灵活的方法来替代子类化来扩展功能;
 * 这个模式的主要原则是，我们不能修改现有的功能，但是可以扩展它们。换句话说，这个模式对于扩展是开放的，
 * 但是对于修改是封闭的。当我们想要将一些特定的功能添加到某个特定的对象而不是整个类时，核心概念是适用的;
 * 假设你已经拥有一所房子。现在您决定增加一个楼层。显然，您不希望更改底层(或现有楼层)的架构。
 * 您可能希望更改新添加楼层的体系结构设计，而不影响现有楼层的现有体系结构。
 */
package com.atomscat.decorator;