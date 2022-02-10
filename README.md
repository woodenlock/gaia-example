# gaia 示例应用

##背景介绍
原型项目 - [gaia](https://github.com/woodenlock/gaia) 的使用示例

##项目包结构
一 [postman.json](document/postman.json) postman测试脚本<br>
一 [io.github.woodenlock.gaia.example](src/main/java/io/github/woodenlock/gaia/example)<br>
&emsp;&emsp;一 [controller](src/main/java/io/github/woodenlock/gaia/example/controller):控制器<br>
&emsp;&emsp;一 [dao](src/main/java/io/github/woodenlock/gaia/example/dao):数据持久层<br>
&emsp;&emsp;一 [model](src/main/java/io/github/woodenlock/gaia/example/model):模型<br>
&emsp;&emsp;&emsp;&emsp;一 [entity](src/main/java/io/github/woodenlock/gaia/example/model/entity):持久化映射对象<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolAccount.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolAccount.java):mongodb使用示例<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolAddress.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolAddress.java):mybatis-plus使用示例<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolBuilding.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolBuilding.java):mongodb原始写法<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolCollege.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolCollege.java):solr原始写法<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolCourse.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolCourse.java):solr使用示例<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolInfo.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolInfo.java):mybatis-plus原始写法<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolStudent.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolStudent.java):elasticsearch使用示例<br>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;一 [SchoolTeacher.java](src/main/java/io/github/woodenlock/gaia/example/model/entity/SchoolTeacher.java):elasticsearch使用/覆盖默认模板示例<br>
&emsp;&emsp;&emsp;&emsp;一 [vo](src/main/java/io/github/woodenlock/gaia/example/model/vo):视图对象<br>
&emsp;&emsp;一 [service](src/main/java/io/github/woodenlock/gaia/example/service):服务层<br>