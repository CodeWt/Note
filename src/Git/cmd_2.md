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
>bug分支
```
fatal: cannot do a partial commit during a merge.
$git commit -i -m 'desc commit' 

$ git stash
$ git stash list
$ git stash pop  恢复的同时把stash内容也删了
$ git stash apply stash@{0}  恢复指定的stash
$ git cherry-pick 4c805e2

修复bug时，我们会通过创建新的bug分支进行修复，然后合并，最后删除；

当手头工作没有完成时，先把工作现场git stash一下，然后去修复bug，修复后，再git stash pop，回到工作现场；

在master分支上修复的bug，想要合并到当前dev分支，可以用git cherry-pick <commit>命令，把bug提交的修改“复制”到当前分支，避免重复劳动。

```
>feature分支
```
开发一个新feature，最好新建一个分支；

如果要丢弃一个没有被合并过的分支，可以通过git branch -D <name>强行删除
 ```
>