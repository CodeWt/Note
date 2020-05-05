>Git Community Book　中文版
```aidl
http://gitbook.liuhui998.com/ 
```
>rebase
```aidl
http://gitbook.liuhui998.com/4_2.html 

rebase操作可以把本地未push的分叉提交历史整理成直线；

rebase的目的是使得我们在查看历史提交的变化时更容易，因为分叉的提交需要三方对比
```
>tag
```aidl
git tag <tagname>   用于新建一个标签，默认为HEAD，也可以指定一个commit id；

git tag -a <tagname> -m "blablabla..."可以指定标签信息；

git tag可以查看所有标签。

git push origin <tagname>可以推送一个本地标签；

git push origin --tags可以推送全部未推送过的本地标签；

git tag -d <tagname>可以删除一个本地标签；

git push origin :refs/tags/<tagname>可以删除一个远程标签
```
>fork&pull request
```aidl
┌─ GitHub ────────────────────────────────────┐
│                                             │
│ ┌─────────────────┐     ┌─────────────────┐ │
│ │ twbs/bootstrap  │────>│  my/bootstrap   │ │
│ └─────────────────┘     └─────────────────┘ │
│                                  ▲          │
└──────────────────────────────────┼──────────┘
                                   ▼
                          ┌─────────────────┐
                          │ local/bootstrap │
                          └─────────────────┘
在GitHub上，可以任意Fork开源仓库；

自己拥有Fork后的仓库的读写权限；

可以推送pull request给官方仓库来贡献代码。
```
>.gitignore
```aidl
1.忽略某些文件时，需要编写.gitignore；

2. .gitignore文件本身要放到版本库里，并且可以对.gitignore做版本管理

3.忽略文件的原则是：

忽略操作系统自动生成的文件，比如缩略图等；
忽略编译生成的中间文件、可执行文件等，也就是如果一个文件是通过另一个文件自动生成的，那自动生成的文件就没必要放进版本库，比如Java编译产生的.class文件；
忽略你自己的带有敏感信息的配置文件，比如存放口令的配置文件。

4.https://github.com/github/gitignore
  https://www.jianshu.com/p/1c74f84e56b4

$ git add -f App.class
$ git check-ignore -v App.class
```
>alias
```aidl
--global参数是全局参数，也就是这些命令在这台电脑的所有Git仓库下都有用。
~/.gitconfig    全局配置文件
workdir/.git/config 当前仓库配置文件

git config --global alias.lg "log --color --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"
```
