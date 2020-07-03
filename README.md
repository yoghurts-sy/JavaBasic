# JavaBasic

![](https://github.com/yoghurts-sy/JavaBasic/blob/master/u%3D4274393615%2C4090509011%26fm%3D26%26gp%3D0.jpg)

**一、Git和GitHub的使用**  

### (1) Github第一次上传步骤：  
步骤 | 说明
------------- | ------------------------------------
1.复制新仓库ssh | 没有的可以创建
2.在含src的目录下，右键git Bash | 类似cmd
3.git init | 将项目初始化，使git可以管理这个项目  
4.git add . | 将项目内所有文件添加到暂存区  
5.git commit -m '附带的信息' | 将文件推到commit区  
6.git remote add origin 仓库地址	| 关联git仓库(repository)  
7.git pull --rebase origin master | 将仓库和文件合并  
8.git push -u origin master | 将文件推到远程仓库  		  

### (2) git回溯某个历史版本  
步骤 | 说明
------------- | --------------------------------------------------
git log | 会显示从最远到最近的commit日志
git reset --hard~** | 如git reset --hard~100往上100个版本

### (3)git常用命令  
命令 | 说明
------------- | ---------------
git status | 当前仓库状态
clear | 清屏 

## 二、具体学习内容在代码中。

## 三、学习心泉

### （1）使用内部类来优化代码的，使代码简洁美丽

```java
package GUI.Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 美丽的代码
 * 使用内部类的方式优化代码,以后都要使用内部类来编程
 * 一个类包含：
 *          属性
 *          方法
 *  		内部类
 */
public class DemoCalcUpgrate {
    public static void main(String[] args) {
        new MyCalculator().loadFrame();
    }
}

class MyCalculator extends Frame {
    //属性
    TextField num1, num2, num3;

    //方法
    public void loadFrame(){

        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }

    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
            num1.setText("");
            num2.setText("");
        }
    }


}
```



## 数据库的基本概念
	1. 数据库：DataBase 简称DB
	2. 什么数据库？
		* 用于存储和管理数据得到仓库

	3. 数据库的特点：
		1. 持久化存储数据，数据库其实就是一个文件系统。
		2. 方便存储和管理数据
		3. 使用了统一的方式操作数据库  SQL


## MySQL
	1. 安装
	2. 卸载
	3. 配置
		* MySQL服务启动
			* 使用管理员权限打开cmd：
				1. net start mysql：启动
				2. net stop mysql：关闭

		* MySQL登入
			1. mysql -uroot(username) -proot(password)
			2. mysql -hip -uroot -proot(password)


		* MySQL退出
			1. exit
			2. quit


## SQL
	
	1. 什么是SQL？
		Structured Query Language：结构化查询语言
		其实就是定义了操作所有关系型数据库的规则，每一种数据库操作的方式存在不一样的地方，可以看作“方言”

	2. SQL通用语法：
		1. SQL语句可以单行或多行书写，以分号结尾。
		2. 可使用空格和缩进来增强语句的可读性
		3. MySQL数据的SQL语句不区分大小写，但建议关键字大写
		4. 3种注释方式：
			* 单行注释： -- 注释内容 或 # 注释内容(#号MySQL特有)
			* 多行注释：/* 注释 */

	3. SQL分类
		1. DDL：定义数据库、表
		2. DML：对数据库中表的增删改
		3. DQL：查询数据库中的表
		4. DCL：定义数据库访问权限和安全级别


## DDL；操作数据库、表

	1. 操作数据库：CRUD
		1. C(Create)：创建
			* 创建数据库：
				* create database 数据库名称;
			* 创建数据库，先判断是否存在，再创建
				* create database if not exists 数据库名称;
			* 创建数据库并指定字符集
				* create database 数据库名称 character set 字符集名;
			* 综合：判断是否存在并指定字符集。
				*  create database if not exists 数据库名称 character set 字符集名;

		2. R(Retrieve)：查询
			* 查询所有数据库的名称：
				* show databases;

			* 查询某个数据库的字符集：查询某个数据库的创建语句
				* show create database 数据库名称;

		3. U(Update)：修改
			* 修改数据库的字符集
				* alter database 数据库名称 character set 字符集名称;
		4. D(Delete)：删除
			* 删除数据库
				* drop database 数据库名称;
			* 判断数据库是否存在，存在再删除
				* drop database if exists 数据库名称;
		5. 使用数据库
			* 查询当前正在使用的数据库名称
				* select database();
			* 使用数据库
				* use 数据库名称;

	2. 操作表
		1. C(Create)：创建
			1. 语法：
				create table 表名(
					列名1 数据类型1,
					列名2 数据类型2,
					...
					列名n 数据类型n,
			);
			* 注意：最后一列，不需要加逗号
			* 数据库类型：
				1. int：整数类型
					* age int,
				2. double：小数类型
					* score double(5,2)
				3. date：日期，只包含年月日，yyyy-MM-dd
				4. datatime：日期，包含年月日时分秒，yyyy-MM-dd HH:mm:ss
				5. timestamp：时间戳类型，包含年月日时分秒，yyyy-MM-dd HH:mm:ss
					* 默认使用当前的系统时间

				6. varchar：字符串
					* name varchar(20):姓名最大20个字符
			* 创建表
				create table student(
					id int,
					name varchar(32),
					age int,
					score double(4, 1),
					birthday date,
					insert_time timestamp
			);
			* 复制表
				* create table 表名 like 被复制的表名;
		2. R(Retrieve)：查询
			* 查询某个数据库中所有的表名称
				* show tables;
			* 查询表结构
				* desc 表名;
		3. U(Update)：修改
			1. 修改表名
				alter table 表名 rename to 新的表名;
			2. 修改表的字符集
				alter table 表名 character set 字符集名称;
			3. 添加一列
				alter table 表名 add 列名 数据类型;
			4. 修改列名称 类型
				alter table 表名 change 列名 新列别 新数据类型;
				alter table 表名 modify 列名 新数据类型;
			5. 删除列
				alter table 表名 drop 列名;
		4. D(Delete)：删除
			* drop table 表名;
			* drop table if exists 表名;


## DML：增删改表中数据
	
	1. 添加数据：
		* 语法：
			* insert into 表名(列名1,列名2,列名3,...,列名n) values(值1,值2,...,值n,);
		* 注意：
			1. 列名和值要一一对应。
			2. 如果表名后不使用列名，则默认给所有列添加值
				* insert into values(值1,值2,...,值n,);

			3. 除了数字类型，其他类型需要使用引号(单双都可)引起来

	2. 删除数据
		* 语法：
			* delete from 表名 where 条件;
		* 注意
			1. 如果不加条件，则删除所有表中记录
			2. 如果要删除所有表中记录：
				1. delete from 表名; --不推荐使用，有多条记录就执行多少次
				2. TRUNCATE TABLE 表名; --推荐使用，先删除表，在创建格式一样的新表。
	3. 修改数据
		* 语法：
			* updata 表名 set 列名1 = 值1, 列名2 = 值2,... where 条件;

		* 注意：
			* 如果不加任何条件，则会将表中的所有记录全部修改。


## DQL：查询表中的记录
	* select * from 表名;


	1. 语法：
		select
			字段列表
		from
			表名列表
		where
			条件列表
		group by
			分组字段
		having
			分组之后的条件
		order by
			排序
		limit
			分页限定

	2. 基础查询
		1. 多个字段的查询
			select 字段名1, 字段名2,from... 表名;
			* 注意：
				* 如果查询所有字段，则用*号代替

		2. 去除重复
			* distinct
		3. 计算列
			* 一般可以使用四则运算计算一些列的值。（数值运算）
			* ifnull(表达式1,表达式2); null参与的运算，计算结果都为null
				* 表达式1：哪个字段需要判断是否为null
				* 如果该字段为null，则值变为表达式2的值
		4. 起别名
			* as(其中as也可以省略)

	3. 条件查询
		1. where子句后跟条件
		2. 运算符
			* >、 <、 <=、 >=、 =(没有==)、 <>(!=)
			* BETWEEN...AND
			* IN(集合)
			* LIKE：模糊查询
				* 占位符：
					* _：单个任意字符
					* %：多个任意字符
			* IS NULL
			* AND(推荐) 或 &&
			* or 或 ||
			* NOT 或 ！


## DQL：查询语句
	1. 排序查询
		* 语法：order by 子句
			* order by 排序字段1 排序方式1, 排序字段2 排序方式2...

		* 排序方式：
			* ASC:升序，默认
			* DESC：降序

		* 注意：
			* 如果有多个排序条件，则当前边的条件值一样时，才会判断第二条件。


	2. 聚合函数：将一列数据作为一个整体，进行纵向的计算
		1. count：计算个数
			1. 一般选择不存在非空的列：主键
			2. count(*)
		2. max：计算最大值
		3. min：计算最小值
		4. sum：计算和
		5. avg：计算平均值
			select AVG(math) from student;


		* 注意：聚合函数的计算，排除null值
			* 解决方案：
				1. 选择不包含null的列进行计算
				2. 使用IFNULL函数

	3. 分组查询
		1. 语法：group by 分组字段;
		2. 注意：
			1. 分组之后查询的字段：分组字段、聚合函数
			2. where和having的区别？
				1. where在分组之前进行限定，如果不满足则不参与分组；having在分组之后限定，如果不满足，则不会被查询出来。
				2. where后不可以跟聚合函数，having可以进行聚合函数的判断。

		-- 按照性别分组，分别查询男、女同学的平均分，人数。 要求：分数低于70的人不参与分组，分组之后人数要大于2个人。
		SELECT sex, AVG(math), count(id) FROM student WHERE math > 70 GROUP BY sex HAVING COUNT(id) > 2;

	4. 分页查询
		1. 语法：limit 开始的索引，每页查询的条数
		2. 公式：开始的索引 = (当前的页码 - 1) * 每页显示的条数
			-- 每页显示3条
			SELECT * FROM student LIMIT 0,3; --第一页
			SELECT * FROM student LIMIT 3,3; --第二页
			SELECT * FROM student LIMIT 6,3; --第三页

		3. limit 是一个MySQL的方言