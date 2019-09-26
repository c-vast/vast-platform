# address-web-api
全国省地市名称、代码查询API
项目url ip:140.246.94.21:8090
一级
/address-api

二级
县、区域
/area 
城市
/city
省份
/province
Ps:默认查询所有信息

根据代码查询
/二级uri/代码 如：/area/350181


分页查询
/二级uri?index=数字页码&size=数量  如：/area?index=1&size=10 
参数：index--当前页码
	   size--每页数量 
Ps:只能为纯数字否则将无法转换

Ps:默认查询所有信息

名称模糊查询 
/二级uri/like?name=要查询的名称  如：/area?name=福 
参数：name--名称
ps：类型为字符串，可以进行模糊查询，返回相似名称信息

Ps:默认查询所有信息

名称模糊查询 
/二级uri/like?name=要查询的名称  如：/area?name=福 
参数：name--名称
ps：类型为字符串，可以进行模糊查询，返回相似名称信息
