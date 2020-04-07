# JavaBasic
##一、Git和GitHub的使用  
**(1) Github第一次上传步骤：**  
1.复制新仓库ssh  
2.在含src的目录下，右键git Bash  
3.git init				将项目初始化，使git可以管理这个项目  
4.git add .			将项目内所有文件添加到暂存区  
5.git commit -m '附带的信息' 		将文件推到commit区  
6.git remote add origin 仓库地址	关联git仓库(repository)  
7.git pull --rebase origin master	将仓库和文件合并  
8.git push -u origin master		将文件推到远程仓库  

*新的修改只能跟踪文本文件的改动，比如TXT文件，网页，所有的程序代码*  
git commit			会告诉你改动了什么  
git log				会显示从最远到最近的commit日志  
git reset --hard版本号		如git reset --hard~100往上100个版本  
  
**(2) git回溯某个历史版本**  
1.git log  
2.git reset --hard~**  

