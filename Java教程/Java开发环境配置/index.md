###  在本章节中我们将为大家介绍如何搭建Java开发环境，以及不同系统下的环境变量怎么配置。

### window系统安装java

- 下载JDK
- 首先我们需要下载java开发工具包JDK，下载地址：https://www.oracle.com/java/technologies/downloads/#java11-windows

- 点击如下下载按钮：

- 下载后JDK的安装根据提示进行，还有安装JDK的时候也会安装JRE，一并安装就可以了。

- 安装JDK，安装过程中可以自定义安装目录等信息，例如我们选择安装目录为 C:\Program Files (x86)\Java\jdk11.0.1。

### 配置环境变量

1. 右击“我的电脑”→“属性”→“高级系统设置”→“高级”→“环境变量”；

2. 选择"高级"选项卡，点击"环境变量"；

3. 新建“JAVA_HOME”系统变量（点击“系统变量”下方的“新建”按钮，填写变量名与变量值，点击“确定”）

4. 同上，新建“CLASSPATH”系统变量，变量值为“.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;”。（引号内的全部内容，注意最前方是点不是逗号）

5. 双击“系统变量”下的“Path”变量进行编辑。（此时可以看到JAVA_HOME已经存在于系统变量中），（有的电脑"Path"也写作“PATH”）

#### 这是 Java 的环境配置，配置完成后，你可以启动 Eclipse 来编写代码，它会自动完成java环境的配置。

- 在"系统变量"中设置3项属性，JAVA_HOME,PATH,CLASSPATH(大小写无所谓),若已存在则点击"编辑"，不存在则点击"新建"。

- 变量设置参数如下：
1. 变量名：JAVA_HOME
2. 变量值：C:\Program Files (x86)\Java\jdk1.8.0_91        // 要根据自己的实际路径配置
3. 变量名：CLASSPATH
4. 变量值：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;         //记得前面有个"."
5. 变量名：Path
6. 变量值：%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;

#### 通过控制台测试JDK是否安装成功
 
1. 同时按键盘上“win”、“R”两个键打开运行，输入“cmd”确定打开控制台。
2. 键入命令: java -version、java、javac 几个命令，出现以下信息，说明环境变量配置成功；

- Linux，UNIX，Solaris，FreeBSD环境变量设置
- 环境变量PATH应该设定为指向Java二进制文件安装的位置。如果设置遇到困难，请参考shell文档。

- 例如，假设你使用bash作为shell，你可以把下面的内容添加到你的 .bashrc文件结尾: export PATH=/path/to/java:$PATH
