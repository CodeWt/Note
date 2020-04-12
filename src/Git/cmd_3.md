>多人协作
```aidl
当你从远程仓库克隆时，实际上Git自动把本地的master分支和远程的master分支对应起来了，并且，远程仓库的默认名称是origin。
要查看远程库的信息，用如下命令：

$ git remote

或者，用git remote -v显示更详细的信息：

$ git remote -v

上面显示了可以抓取和推送的origin的地址。如果没有推送权限，就看不到push的地址。

```
>推送分支
```aidl
把该分支上的所有本地提交推送到远程库。推送时，要指定本地分支，这样，Git就会把该分支推送到远程库对应的远程分支上
$ git push origin master
```
>推送到远程的分支选择
```aidl
master分支是主分支，因此要时刻与远程同步；

dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步；

bug分支只用于在本地修复bug，就没必要推到远程了，除非老板要看看你每周到底修复了几个bug；

feature分支是否推到远程，取决于你是否和你的小伙伴合作在上面开发。
```
>在本地创建和远程分支对应的分支
```aidl
创建远程origin的dev分支到本地，于是他用这个命令创建本地dev分支：

$ git checkout -b dev origin/dev
```
>Branch 'dev' set up to track remote branch 'dev' from 'origin'.
```aidl
$ git branch --set-upstream-to=origin/dev dev
```
>多人协作的工作模式通常是这样：
```aidl
首先，可以试图用git push origin <branch-name>推送自己的修改；

如果推送失败，则因为远程分支比你的本地更新，需要先用git pull试图合并；

如果合并有冲突，则解决冲突，并在本地提交；

没有冲突或者解决掉冲突后，再用git push origin <branch-name>推送就能成功！

如果git pull提示no tracking information，则说明本地分支和远程分支的链接关系没有创建，用命令git branch --set-upstream-to <branch-name> origin/<branch-name>。
```
