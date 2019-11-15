1.git clone项目到本地

在多人开发中，一般的项目有master和其他分支，那么clone操作就需要你指定对应的分支把项目工程clone到本地，

1.首先新建一个空文件夹，把文件夹进行git初始化操作,在文件夹的根目录下，右键选择git bash here，在弹出的窗体中输入命令：git init

这样就把该文件夹git初始化了

2.接下来就是clone操作了，继续输入命令：git clone xx(此处为你的项目的git地址），一般这个命令clone下来的是master分支的项目，你也可以clone指定分支的工程，命令：git clone -b 分支名 git地址


2.使用git把本地项目提交到github

1.如果该工程没有git初始化，那么在工程根目录下使用git init进行初始化，如果已经初始化，则省略这步

2.将项目的文件添加到仓库中使用git add，（git add . ）表示将所有文件都添加，（git add xx(指定文件)）表示将指定文件添加进去

3.将add的文件commit到仓库，命令：git commit -m "你想写的注释"

4.将本地的仓库关联到github上，命令如下：git remote add origin xxx（此处为你的git地址）

5.在进行push之前，先进行pull操作，命令如下：git pull origin xxx(此处为你的分支名，master或者其他分支名)

6.上传代码到github远程仓库，命令如下：git push -u origin xxx（此处为你的分支名），在这个步骤中可能会有弹窗要你输入你的用户名和密码，按照指示操作即可