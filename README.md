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



## 约束
	* 概念：对表中的数据进行限定，保证数据的正确性、有效性和完整性
	* 分类：
		1. 主键约束：primary key
		2. 非空约束：not null
		3. 唯一约束：unique
		4. 外键约束：foreign key


	* 非空约束：not null
		1. 创建表时添加约束
			CREATE TABLE stu (
				id INT,
				NAME VARCHAR(20) NOT NULL 
			);
		2. 创建表后添加约束
			ALTER TABLE stu MODIFY NAME VARCHAR(20) NOT NULL;
		3. 删除name的非空约束
			ALTER TABLE stu MODIFY NAME VARCHAR(20);

	* 唯一约束：unique，值不能重复
		1. 创建表时，添加唯一约束
			CREATE TABLE stu (
				id INT,
				phone_number VARCHAR(20) UNIQUE --添加了唯一约束 
			);
	
			* 注意mysql中，唯一约束限定的列的值可以有多个null

		2. 解除唯一约束
			ALTER TABLE stu DROP INDEX phone_number;

		3. 在创建表之后，添加唯一约束
			ALTER TABLE stu MODIFY phone_number VARCHAR(20) UNIQUE;

	* 主键约束：primary key
		1. 注意：
			1. 非空且唯一
			2. 一张表只能有一个字段为主键
			3. 主键就是表中记录的唯一标识

		2. 在创建表时，添加主键约束
			CREATE TABLE stu (
				id INT primary key,
				name VARCHAR(20) 
			);
		
		3. 删除主键
			错误：alter table stu modify id int;
			alter table stu drop primary key;

		4. 创建完表后，添加主键
			alter table stu modify id int primary key;
		
		5. 自动增长：
			1. 概念：如果某一列是数值类型的，使用auto_increment可以完成值的增长

			2. 在创建表时，添加主键约束，并完成主键自增长。(按上一条记录增长)
				CREATE TABLE stu (
				id INT primary key auto_increment,
				name VARCHAR(20) 
			);

			3. 删除自动增长
			ALTER TABLE stu MODIFY id INT;

			4. 添加自动增长
			ALTER TABLE stu MODIFY id INT auto_increment;


	* 外键约束：foreign key，让表与表产生关系，从而保证数据的正确性
		1. 在创建表时，可以添加外键
			* 语法：
				create table 表名(
					...,
					外键列
					constraint 外键名称 foreign key (外键列名称) references 主表名称(主表列名称)
			);

		2. 删除外键
			alter table 表名 drop foreign key 外键名称;

		3. 创建表之后，添加外键
			alter table 表名 add constraint 外键名称 foreign key (外键列名称) references 主表名称(主表列名称);

		4. 级联操作
			1. 添加级联操作
				语法：alter table 表名 add constraint 外键名称 foreign key (外键列名称) references 主表名称(主表列名称) on update cascade on delete cascade;

			2. 分类：
				1. 级联更新：on update cascade
				2. 级联删除：on delete cascade
					* 谨慎使用


## 数据库的设计

	1. 多表之间的关系
		1. 分类
			1. 一对一：
				* 如：人和身份证
				* 分析：一个人只有一个身份证，一个身份证只能对应一个人

			2. 一对多(多对一)：
				* 如：部门和员工
				* 分析：一个部门有多个员工，一个员工只能对应一个部门

			3. 多对多：
				* 如：学生和课程
				* 分析：一个学生可以选择很多门课程，一个课程也可以被很多学生选择

		2. 实现
			1. 一对多
				* 在多的一方建立外键，指向一的一方的主键

			2. 多对多
				* 多对多的关系实现需要借助第三张中间表，中间表至少包含两个字段，这两个字段作为第三张表的外键，分别指向两张表的主键。

			3. 一对一
				* 使用同一张表

	2. 数据库设计的范式
		* 概念：在设计数据库时，需要遵循的一些规范，要遵循更高级的范式要求，必须遵守前边的所有范式要求


		* 分类：
			1. 第一范式（1NF）：数据库表的每一列都是不可分割的原子数据项
			2. 第二范式（2NF）：1NF的基础上，非码属性必须完全依赖于候选码（在1NF基础上消除非主属性对主码的部分函数依赖）
				* 几个概念：
					1. 函数依赖：A-->B，如果通过A属性(属性组)的值，可以确定唯一B属性的值，则称B依赖于A
					2. 完全函数依赖：A-->B，如果A是一个属性组，则B属性值的确定需要依赖A属性组中所有的属性值。
					3. 部分函数依赖：A-->B，如果A是一个属性组，则B属性值的确定只需要依赖A属性组中某一些属性值即可。
					4. 传递函数依赖：A-->B B-->C，如果通过A属性(属性组)的值，可以确定唯一B属性的值，在通过B属性(属性组)的值可以确定唯一C属性的值，则称C传递函数依赖于A
					5. 码：如果在一张表中，一个属性或属性组，被其他属性所完全依赖，则称这个属性(属性组)为该表的码。
					
			3. 第三范式（3NF）：在2NF基础上，任何非主属性不依赖于其它非主属性（在2NF基础上消除传递依赖）
			

	3. 数据库的备份和还原

		1. 命令行：
			* 语法：
				* 备份：mysqldump -u用户名 -p密码 > 保存的路径
				* 还原：
					1. 登录数据库
					2. 创建数据库
					3. 使用数据库
					4. 执行文件：source 文件路径
						* sql文件

		2. 图形化工具



## SQL多表查询
	* 查询语法：
		select
			列名列表
		from
			表名列表
		where
			...

	* 笛卡尔积：
		* 有两个集合A，B取这两个集合的所有组成情况
		* 要完成多表查询，需要消除无用的数据

	* 多表查询的分类：
		1. 内连接查询
			1. 隐式内连接：使用while条件消除无用数据
				SELECT
					t1.name,
					t1.gender,
					t2.name
				FROM
					emp t1,
					dept t2,
				WHERE
					t1.dept_id = t2.id;

			2. 显式内连接
				SELECT * FROM emp (INNER) JOIN dept ON emp.dept_id = dept.id;

			3. 内连接查询：
				1. 从哪些表中查询数据
				2. 条件是什么
				3. 查询哪些字段
		2. 外连接查询：
			1. 左外连接：
				* 语法：select 字段列表 from 表1 left join 表2 on 条件;
				* 查询的是左表的所有数据以及和右表的交集部分
			2. 右外连接：
				* 语法：select 字段列表 from 表1 right join 表2 on 条件;
				* 查询的是右表的所有数据以及和左表的交集部分
		3. 子查询
				
## JDBC
	
	1. 解决sql注入问题：使用PreparedStatement对象来解决问题
	2. 预编译的sql使用?作为占位符
	3. 步骤：
		1. 导入驱动jar包
		2. 注册驱动
		3. 获取数据库的连接对象Connection
		4. 定义sql
			* 注意：sql的参数使用?作为占位符

		5. 获取执行sql语句的对象PreparedStatement Connection.PreparedStatement(String sql)
		6. 给?赋值
			* 方法：setXXX(参数1, 参数2)
				* 参数1：表示第几个?, 从1开始
				* 参数2：表示?的值
		7. 执行sql，接受返回对象，不需要传递sql语句
		8. 处理结果
		9. 释放资源

	4. 注意：后期我们都会使用上述步骤来完成增删改查的所有操作
		1. 可以防止SQL注入问题
		2. 效率更高

## JDBC控制事务
	1. 事务：一个包含多个步骤的业务操作，如果这个业务操作被事务管理，则这多个步骤要么同时成功，要么同时失败。
	2. 操作：
		1. 开启事务
		2. 提交事务
		3. 回滚事务
	3. 使用Connection对象来管理事务
		* 开启事务：setAutoCommit(boolean autoCommit)：调用该方法设置参数为false，即开启事务
			* 在执行sql之前开启事务
		* 提交事务：commit()
			* 在所有sql都执行完后提交事务
		* 回滚事务：rollback()
			* 一般在catch(抓一个大一点的异常)里回滚
		

## 数据库连接池
	1. 概念：其实就是一个容器(集合)，存放数据库连接的容器。
		* 当系统初始化好后，容器被创建，容器中会申请一些连接对象，当用户访问数据库时，从容器中获取连接对象，用户访问完之后，会将连接对象归还给容器。

	2. 好处：
		1. 节约资源
		2. 用户访问高效

	3. 实现：
		1. 标准接口：DataSource Javax.sql包下的
			1. 方法：
				* 获取连接：getConnection()
				* 归还连接：Connection.close()

		2. 数据库连接池技术：
			1. C3P0：
			2. Druid：Alibaba

	4. C3P0：数据库连接池技术
		* 步骤：
			1. 导入C3P0的jar包 
				* 不要忘记导入数据库驱动jar包
			2. 定义配置文件
				* 名称：c3p0-config.xml 或 c3p0.properties
				* 路径：直接将文件放在src目录下即可。

			3. 创建核心对象 数据库连接池对象 ComboPooledDataSource
			4. 获取连接：getConnection

	5. Druid：
		* 步骤：
			1. 导入jar包 
			2. 定义配置文件
				* 是properties类型的
				* 可以叫任意名称，可以放在任意目录下。
			3. 加载配置文件
			4. 获取数据库连接池对象：通过工厂来获取 DruidDataSourceFactory
			5. 获取连接getConnection


## Spring JDBC
	* Spring框架对JDBC的简单封装，提供了一个JDBCTemplate对象的简化JDBC开发
	* 步骤：
		1. 导入jar包
		2. 创建JDBCTemplate对象，依赖于数据源DataSource
			* JDBCTemplate template = new JDBCTemplate(ds);
			
		3. 调用JDBCTemplate的方法完成CRUD的操作
			* update()：执行DML增删改操作。
			* queryForMap()：查询结果将结果集封装为map集合
				* 注意：将列名封装为map为key，将值封装为value，将这条记录封装为一个map集合，这个方法查询到的结果集长度只能为1
			* queryForList()：查询结果将结果集封装为list集合
				* 注意：将每一条记录封装为一个map集合，再将map集合装载到list集合中
			* query():查询结果，将结果封装为JavaBean对象
				* query的参数：RowMapper
					* 一般我们使用BeanPropertyRowMapper实现类，可以完成数据到JavaBean 的自动封装
					* new BeanPropertyRowMapper<你的类型>(类型.class)
			* queryForObject：查询结果，将结果封装为对象
				* 一般用于聚合函数的查询