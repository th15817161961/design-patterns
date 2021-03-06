/**
 * 提供一种方法来按顺序访问聚合对象的元素，而无需公开其底层表示
 * 迭代器通常用于遍历容器以访问其元素,
 * 假设有两家公司:公司A和公司B。
 * 公司A将其员工记录(姓名等)存储在一个链表中，公司B将其员工数据存储在一个大数组中。
 * 有一天，这两家公司决定合作。在这种情况下，迭代器模式非常方便。我们不需要从头开始编写代码。
 * 我们将有一个公共接口，通过它我们可以访问两家公司的数据。
 * 我们将简单地调用相同的方法，而不重写代码。
 * 类似地，在大学里，艺术系可能使用数组数据结构，而科学系可能使用链表数据结构来存储学生的记录。
 * 主管理部门将通过公共方法访问这些数据—它并不关心各个部门使用哪种数据结构。
 */
package com.atomscat.iterator;