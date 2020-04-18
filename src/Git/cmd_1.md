>创建版本库
```aidl
$ mkdir learngit
$ cd learngit
$ pwd
/Users/michael/learngit

第二步，通过git init命令把这个目录变成Git可以管理的仓库：
$ git init
Initialized empty Git repository in /Users/michael/learngit/.git/
如果你没有看到.git目录，那是因为这个目录默认是隐藏的，用ls -ah命令就可以看见。

$ git add readme.txt
$ git add file1.txt
$ git add file2.txt file3.txt
$ git commit -m "add 3 files."

要随时掌握工作区的状态，使用git status命令。
如果git status告诉你有文件被修改过，用git diff可以查看修改内容。
```
>时光机穿梭（版本回退，改变  HEAD 指针位置从而改变当前的版本）
```aidl
$ git status
$ git diff readme.txt //查看工作目录与暂存区的差异
$ git add readme.txt
$ git commit -m "add distributed"

HEAD指向的版本就是当前版本，因此，Git允许我们在版本的历史之间穿梭，使用命令git reset --hard commit_id。
穿梭前，用git log可以查看提交历史，以便确定要回退到哪个版本。
要重返未来，用git reflog查看命令历史，以便确定要回到未来的哪个版本。

$ git log --pretty=oneline
$ git reset --hard HEAD^
$ git reset --hard 1094a
$ git reflog
```
>管理修改
```aidl
git diff HEAD -- readme.txt     命令可以查看工作区和版本库里面最新版本的区别
```
>git管理文件
```aidl
Git管理的文件分为：工作区，版本库，版本库又分为暂存区stage和暂存区分支master(仓库)

工作区>>>>暂存区>>>>仓库

git add把文件从工作区>>>>暂存区

git commit把文件从暂存区>>>>仓库，
```
>git diff
```aidl
git diff查看工作区和暂存区差异，

git diff --cached查看暂存区和仓库差异，

git diff HEAD 查看工作区和仓库的差异，

git checkout 撤销工作区修改
```

```
>撤销修改
```aidl
场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令
git checkout -- file。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，
第一步用命令git reset HEAD <file>，就回到了场景1，第二步按场景1操作。

场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。

```
>删除文件
```aidl
$ rm test.txt

$ git rm test.txt
$ git commit -m "remove test.txt"

$ git checkout -- test.txt

注意：从来没有被添加到版本库就被删除的文件，是无法恢复的！

```