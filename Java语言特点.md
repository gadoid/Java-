# Java 语言特点

## 面向对象

两个基本概念 ： 类、对象
三大特征 ： 封装、继承、多态

## 健壮性

增加了垃圾回收机制

## 跨平台

由JVM来支持Java在不同的平台中运行

## 核心机制

垃圾回收 

## JDK

Java Development Kit

## 编译JAVA 程序

javac 程序名.java
java 程序名

## 注释 Comment

使用// 来对代码进行注释
使用/*   */ 来进行多行注释
javadoc -d name -author -version programname 

## Public 一个java源文件中可以声明多个class 但是 只能最多有一个类声明为public的 而且要求声明为public的类的类名必须与源文件名相同

## 编程风格

使用文档注释来注释整个类或整个方法
如果注释方法中的某一个步骤，使用单行或多行注释

使用一次tab操作，实现缩进
运算符两边习惯各加一个空格

## 关键子和保留字

定义数据类型的关键字

class   定义一个类 后跟类名
interface   定义一个接口 后跟接口名
enum    定义了一个枚举类型 后跟枚举名
byte    定义字节类型的变量 后跟变量名 或 值
short   定义short类型的变量 后跟变量名 或 值
int     定义整型变量 后跟变量名
long    定义长整型变量 后跟变量名
float   定义浮点型变量 后跟变量名
double  定义双精度浮点型变量 后跟变量名
char    定义字符变量 后跟变量名
boolean 定义布尔性变量 后跟变量名

定义流程控制的关键字

if  用于执行判断逻辑
else   当不满足if语句时，执行else语句
switch  
case   用于条件选择
default    默认修饰符
while   用于执行循环判断逻辑
do   与while一起，while条件后所需执行的语句
for    用于循环逻辑
break   中断本次循环
continue    跳过本次循环，执行下一次循环
return    声明返回值

定义访问权限关键字

private     定义只允许在本类中所使用的元素
protected   定义允许本类及其子类中所使用的元素
public      定义全局均可使用的元素

定义类、函数、变量修饰符的关键字

abstract    定义类为抽象方法(无法实例化)
final       定义元素为不可修改的元素(可先声明后赋值)
static      定义元素为类的元素
synchronized    定义元素为线程安全的元素

定义类与类之间关系关键字

extends     表示该类继承自某个父类
implements  表示该类实现了某个(些)接口

定义实例及引用实例 判断实例的关键字

new     创建变量
this    用于类内部,代表类本身
super   用于类中,进行父类的初始化和调用父类的方法
instanceof  判断某个变量是否为某类的实例

异常处理关键字

try     启动异常处理，程序会对try关键字后续的代码块进行异常处理
catch   接收try代码块中的异常
finally 无论程序是否成功执行，均需要执行的代码块
throw
throws  抛出异常

包的关键字

package  导入jar包
import   导入类库

其他修饰符关键字

native
strictfp
transient
volatile
assert

数据类型

true    表明值为“正确” 
false   表明值为“错误” 
null    表明值为空

保留字

goto
const

## 标识符

java对各种变量、方法和类等要素命名时使用的字符序列称为标识符

定义规则由字母和数字、下划线和$符号组成 不包含空格
java严格区分大小写

## 命名规范

包名 ： 多单词组成时所有字母小写
类名、接口名 ： 首字母大写
变量名、方法名 ： 第一个单词首字母小写，第二个单词开始首字母大写
常量名 ： 所有字母都大写

## 变量

内存中的一个存储区域
该区域的数据可以在同一类型范围内不断变化
变量是程序中最基本的存储单元
包括 变量类型 变量名 和 存储的值

作用

用于在内存中保存数据
变量必须先声明后使用
变量只有在其作用域内才有效
同一个作用域内，不能定义重名的变量

## 数据类型

数值型

byte int short long float double char
byte  1字节
short 2字节
int   4字节
long  8字节
float 4字节
double8字节
字符型

char 使用'' 赋值

字符串

string

string 可以和其他类型进行运算(只能“+”)，运算结果仍然为string


布尔性

boolean

引用类型

类 class
接口 interface
数组 array

## 运算

### 自动类型提升

容量小的与容量大的值进行计算，自动使用容量大的类型

byte\short\char 进行运算时 结果为一个int

### 强制类型转换

变量值前面使用“()”注明 需强制转换的类型 可能导致精度丢失

## 进制表示

0b 二进制
0  八进制
0x 十六进制

## 运算符

算术运算符

+

-

*

/   整除

%   取余

++x 先自增 后调用变量

x++ 先调用变量 后自增

--x 先自减 后调用变量

x-- 先调用变量 后自减

赋值运算符

= 支持连续赋值

比较运算符

== 相等于

！= 不等于

<  小于

>  大于

<= 小于等于

>= 大于等于

逻辑运算符

& 逻辑与

&& 短路与

| 逻辑或
|| 短路或

！ 逻辑非
^  逻辑异或

位运算符

<< 左移

>> 右移

>>> 无符号右移

& 与运算

| 或运算

^ 异或运算

~ 取反运算

三元运算符

（）? A：B

条件为真 执行A 条件为假 执行B

## if 语句

if(判断条件)
{

}
else if (判断条件)
{

}
else 
{

}

## switch

只能使用 byte 、short、int、char、枚举、string
switch(判断条件)
{
    case 常量 :
        表达式 ;
        break ;
}

default 相当于 else

## 循环结构

循环结构的四个要素
1 初始化条件
2 循环条件
3 循环体
4 迭代条件

### for 循环

for(1;2;4){
    3
}

### while 循环

1
while(2){
    3
    4
}

### do-while 循环

do-while 至少会执行一次循环体
1
do{
    3
    4
}while(2)

### 结束循环

break  结束最近的循环

break label  指定跳出对应循环

