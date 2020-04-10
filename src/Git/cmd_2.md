>remote respoitory
```aidl
$ git remote add origin git@github.com:michaelliao/learngit.git

first push to remote
$ git push -u origin master

push after commit
$ git push origin master

clone respository from remote
$ git clone git@github.com:michaelliao/gitskills.git
```
>分支管理
```aidl
查看分支：git branch

创建分支：git branch <name>

切换分支：git checkout <name>或者git switch <name>

创建+切换分支：git checkout -b <name>或者git switch -c <name>

合并某分支到当前分支：git merge <name>

删除分支：git branch -d <name>
```
>解决冲突
```aidl
$ git log --graph --pretty=oneline --abbrev-commit
当Git无法自动合并分支时，就必须首先解决冲突。解决冲突后，再提交，合并完成。

解决冲突就是把Git合并失败的文件手动编辑为我们希望的内容，再提交。

用git log --graph命令可以看到分支合并图

$ git merge --no-ff -m "merge with no-ff" dev
合并分支时，加上--no-ff参数就可以用普通模式合并，合并后的历史有分支，能看出来曾经做过合并，而fast forward合并就看不出来曾经做过合并。
```