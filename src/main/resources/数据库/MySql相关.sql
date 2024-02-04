---------------常识相关---------------------------------------------------------------------------------------------------
MySQL没有select into from语法，会提示Undeclared variable
可使用insert into select
例子：insert into package_datahideconfig (seller,hideuser,hide_time,`status`) select seller,hideuser,now(),`status` from package_datahideconfig where seller='1253537'  
或者CREATE TABLE newtable (select * from oldtable)  这种建表语句会照搬旧表的结构和数据，适用于备份的场景
例子：CREATE TABLE package_datahideconfig_bak (SELECT * FROM package_datahideconfig)

---------------函数相关---------------------------------------------------------------------------------------------------
函数：GROUP_CONCAT
作用：汇总结果，用','隔开
例子：SELECT GROUP_CONCAT(DISTINCT uid) FROM m

函数：BETWEEN 
作用：操作符用于选取介于两个值之间的数据范围内的值
例子：SELECT * FROM substitute_apply_request a  where a.apply_time  BETWEEN '2024-01-01' AND '2024-02-01'

AVG（平均值）函数：返回指定组的平均值，空值会被忽略。
COUNT（统计）函数：返回指定组中项目的总数量。
MAX（最大值）函数：返回指定数据的最大值。
MIN（最小值）函数：返回指定数据的最小值。
SUM（求和）函数：返回指定数据的和，只能用于数字列，空值会被忽略。

函数：CONCAT
作用：拼接列
例子：SELECT CONCAT(a.id,'-',a.`status`) FROM package_datahideconfig a

函数：upper，lower
作用：内容大小写转换 upper=转大写，lower=转小写
例子：select upper('sheenky') as 大写;  select lower('SHEENKY') as 小写;


函数：SUBSTR
作用：截取字段
例子：SELECT SUBSTR(a.hideuser,1,LENGTH(a.hideuser)-30) FROM package_datahideconfig a;

函数：trim
作用：前后空格去除
例子：select trim(' 123 345 ') as 前后空格去除;

函数：replace
作用：替换内容
例子：select replace('编程秃头','秃头','秃顶') as out_put;

函数：round
作用：保留几位小数（四舍五入
例子：select round(1.595658,3) as out_put;

函数：ceil，floor
作用：ceil=向上取整  floor=向下取整
例子：select ceil(1.01) as out_put;select floor(1.99) as out_put;

----时间函数-begin---
格式符	含义
%Y	四位的年份
%y	2位的年份
%m	月份（01,02，..11,12）
%c	月份（1,2,3...11,12）
%d	日（01,02，...）
%H	小时（24小时）
%h	小时（12小时）
%i	分钟（00,01，...59）
%s	秒（00,01，...59）
函数：now，curdate，curtime，year，month，day，hour，minute，second，weekofyear，quarter，date_format，date_add，last_day，datediff
作用：now=当前年月日时分秒 curdate=当前年月日 curtime=当前时分秒 year=获取日期里的年 month=获取日期里的月 day=获取日期里的日 hour=获取日期里的时 minute=获取日期里的分 second=获取日期里的秒 
weekofyear=时间在当年里所属周，传的时间参数至少是年月日  quarter=时间在当年里所属季度，传的时间参数至少是年月日 date_format=时间转换为字符串
date_add(时间,interval num 时间)=往后加时间(负数等于是往前减时间  last_day=时间月最后一天 datediff=两个日期的相差天数
{timestampdiff(unit,start_date,end_date)=两个时间之间的差计算，可以是年月日小时等，如下
year：年份、month：月份、day：天、hour：小时、minute 分钟、second：秒、microsecond：微秒、week：周数、quarter：季度}
例子：
select now() as 当前时间;select CURDATE() as 当前日期;select curtime() as 当前时间;
select year(now()) as 年;select month(now()) as 月;select day(now()) as 日;
select hour(now()) as 时;select minute(now()) as 分;select second(now()) as 秒;
select weekofyear(now()) as 时间在当年里所属周;select quarter(now()) as 时间在当年里所属季度;
select date_format(now(),'%Y年%c月%d日') as 时间转换成字符串;
select date_add(now(),interval 1 YEAR) as 一年后;
select date_add(now(),interval 1 MONTH) as 一月后;
select date_add(now(),interval 1 DAY) as 一天后;
select date_add(now(),interval 1 hour) as 一小时后;
select date_add(now(),interval 1 minute) as 一分钟后;
select date_add(now(),interval 1 second) as 一秒钟后;
select last_day(now()) as 时间月最后一天;select datediff(now(),'1990-10-23') as 相差天数;
SELECT timestampdiff(YEAR,'1990-10-23',now()) as 时间差计算;
----时间函数-end---

函数：if
作用：判断
例子：SELECT if(1>2,'对','错') as if判断语句;

函数：ifnull
作用：为空的话，返回后面的值
例子：SELECT ifnull(null,'错') as 是否为空;

函数：case when else end
作用：多个判断
例子：SELECT case id when id>0 then '小明' when id>10 then '小猪' else '小狗' end as 判断语句 FROM panta_cat;

函数：FORMAT
作用：数字千分位展示,第二个参数是保留几位小数
例子：SELECT FORMAT(123456789.126,2) as 数字千分位展示;

