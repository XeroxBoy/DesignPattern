# 文本处理器


文本处理是非常常见但又非常重要的任务。其中操作纷繁复杂。而今天我们的目标就是制作一个 小型的文本预处理器。其主要功能就是对文本进行预处理以便后续进行固定宽度的排版。为了方 便说明，我们定义如下的概念：

*空白字符（white  space)*：指空格。

*文本字符（character)*：指大写或者小写的英文字母。

*节（segment）*：指一串（大于或者等于一个）连续的空白字符或者文本字符。 我们的文本处理器的功能还很朴素，无法处理除 _空白字符_ 和 _文本字符_ 之外的字符。

我们将会使用一个固定长度作为宽度进行排版。大于这个宽度的字符会被折行。而折行不会显示 任何连字符（例如 “-”），也无需对 _空白字符_ 进行额外处理。例如，假设我们规定最大宽度为30， 则 "The main theme of education in engineering school is learning to teach yourself" 将排版为：

The main theme of education  in engineering school is learnin g to teach yourself

## 要求

现在请书写一个函数，该函数的输入为两个参数：

*需要处理的文本*

*排版宽度。*

该函数的返回值为预处理后的文本。预处理后的文本为每一节，及其所在的行号。中间以分号隔 开。若一个节跨越了多行，则行号用逗号隔开，并从小到大进行排列。
## 思路
创造了一个内部类：节(Segment,如上上节描述所述) 用于记录每一节的文本，开始与结束的索引位置（用于计算行号）
先对文本进行检错处理。若无错误则从文本头开始遍历 将每一节放入Segment数组中。再遍历segment数组利用开始与结束的索引位置和排版宽度计算出行号 实现文本处理结果的显示

## 构建与运行
本项目使用JAVA语言在IDEA中开发 有一个主类TextProcessor和junit测试类TextProcessorTest 运行时使用IDEA导入该项目 并运行TextProcessorTest 中的测试方法(testTextProcess1-3)即可
![Image discription](https://github.com/XeroxBoy/DesignPattern/blob/master/1.png) 
![Image discription](https://github.com/XeroxBoy/DesignPattern/blob/master/3.png) 
![Image discription](https://github.com/XeroxBoy/DesignPattern/blob/master/4.png) 
