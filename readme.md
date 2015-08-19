##注意事项:

系统不会告诉你使用的测试数据是什么，也不会告诉你你的程序的输出是什么。你需要自己思考、查错、修改以通过更多的测试数据获得更多的分数。  
系统不会自动保存代码框中的内容。只有当你点击提交时，才会把代码框中的内容提交到系统上。  
针对同一题目，你可以多次提交程序，系统将会以最后一次编译通过的提交为准，但提交的次数多少会影响最终的排名。
只通过标准输入(STDIN)和标准输出(STDOUT)进行输入和输出数据。 您的程序应该通过STDIN读入数据，并通过STDOUT输出数据。请不要访问其他资源例如磁盘文件，可能导致不确定的结果。  
严格依照题目描述的格式输入输出数据。 您的程序应该严格依照题目描述的格式输入输出数据。不符合描述格式的输出会导致系统判定您的程序为Wrong Answer。  
样例输入/输出不包含系统全部的评测数据。 题目中样例输入/输出只是为了编程者能更清楚了解题目的输入输出格式。  
如果你使用Java, 你需要编写一个类名为Main(大小写敏感)的public类，类中包含入口main函数，并且不要使用package。请参考样例题目和程序中的JAVA程序。  
请查看下表了解CE/WA/AC/TLE等系统反馈的详细意义：  

评测结果	缩写	含义
Waiting	WT	用户程序正在排队等待测试  
Accepted	AC	用户程序输出正确的结果  
Presentation Error	PE	用户程序输出有中有多余的空行，或者某行内有多余的空格。  
Time Limit Exceeded	TLE	用户程序运行时间超过题目的限制  
Memory Limit Exceeded	MLE	用户程序运行内存超过题目的限制  
Wrong Answer	WA	用户程序输出错误的结果  
Runtime Error	RE	用户程序发生运行时错误  
Output Limit Exceeded	OLE	用户程序输出的结果大大超出正确答案的长度  
Compile Error	CE	用户程序编译错误  
System Error	SE	用户程序不能被评测系统正常运行  
Validator Error	VE	用户程序的输出结果导致评测程序非正常退出  
Not Available	NA	针对编程之美系列比赛，大数据的结果在比赛结束前不公开，会显示NA。  
##答疑求助

如果测试之前发现不能成功注册和登陆考试平台或在线测试过程中遇到任何问题，可以通过hihoCoder网站上的“讨论”区域提问或发邮件到邮箱webmaster@hihocoder.com中，会有相应的人员解答。  

##反作弊

为了保证在线测试的公平性，践行诚信高于技能的理念，我们会采用技术和抽样加试等手段防止考试中不公平竞争现象的发生。系统会自动对提交程序进行一一的比对，判断是否有大面积的重复和类似的程序；对于相似度较高的程序会提示高作弊风险，笔试出题组会判断和决定存在高作弊风险的候选人是否能够进入下一轮甄选或要求其进行其他形式的加试。另外，在总体参与笔试并可能入选面试的人群中，在正式面试之前，也会随机抽取相当比例的同学进行电面等形式的加试。  

所有作弊行为一经查实或笔试与后续其他测评考核结果相差过大，不仅会导致申请人无法进入到下一步筛选流程中，还将永久被记录在公司人才库的诚信档案中作为将来该申请者申请微软其他职位的警示。  

##评测系统参数

OS:  
Ubuntu 14.04  
GCC:  
GNU C 4.8.2  
G++:  
GNU C++ 4.8.2  
Java:  
OpenJDK 1.7.0_51  
C#:  
Mono 3.2.8  
Python:
Python2.7.6 --pylint
##样例题目及程序

A+B Problem

描述

Given two integers a and b, calculate their sum a + b.

输入

The input contains several test cases. Each contains a line of two integers, a and b.

输出

For each test case output a+b on a seperate line.

样例输入

    1 2
    3 4
    5 6
    
样例输出

    3
    7
    11