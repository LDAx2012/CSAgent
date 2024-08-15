# CSAgent
  Bypass antivirus software by patching the CS payload in memory through the agent.

  



### WHAT	

​	通过agent修改beacon.BeaconPayload#exportBeaconStage与pe.MalleablePE#process方法来在CS生成payload的过程中去除它的内存特征，使其生成即免杀，并绕过内存查杀。


### HOW
  CodeFile.java中存放了CS中beacon.dll与payload的特征字节与替换字节，CS则是项目源码
​	编译项目，在CS启动参数中添加 -javaagent:CS.jar ，将CodeFile0.java与CodeFile1.java放到同目录下，启动CS，正常生成payload


### ToDo
- 目前仅支持x64，也许会再总结下32位的特征
- 像yara规则一样支持通配符
- 直接写特征太不优雅，写成yara那样的配置文件，支持描述之类的
- 支持动态修改配置等功能
- https TCP DNS等更多测试
