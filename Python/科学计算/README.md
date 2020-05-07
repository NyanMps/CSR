## 环境

作为有编程经验的人，喜欢纯净的人，推荐原生 python + 虚拟环境管理（pyenv + virtualenvwrapper/virtualfish）；

或者使用迷你的  Miniconda，非 Win 环境下，大可不必使用 Anaconda，py 的很多库都是 C++ 写的，在 linux 环境下一般安装是很顺利的。

## 科学计算

- **Numpy**：

  是以矩阵为基础的数学计算模块，纯数学。

  这种工具可用来存储和处理大型矩阵。

- **Scipy：**

  一个用于数学、科学、工程领域的常用软件包，可以处理插值、积分、优化、图像处理、常微分方程数值解的求解、信号处理等问题。

  可理解为函数库

- **Pandas：**

  基于 NumPy 的一种工具，该工具是为了解决数据分析任务而创建的。

  Pandas 纳入了大量库和一些标准的数据模型，提供了高效地操作大型数据集所需的工具。

  可理解为表格容器

安装相关库，使用 pip：

``` sh
numpy scipy matplotlib ipython jupyter pandas sympy nose
```

## NoteBook

手动安装：

``` sh
pip3 install notebook

# run
jupyter notebook --no-browser --port 8080 --ip 0.0.0.0
```

安装扩展：

``` sh
pip install jupyter_contrib_nbextensions
jupyter contrib nbextension install --user --skip-running-check
```

其后，可以使用 ！进入命令模式执行 sh 命令。

``` sh
!pip install matplotlib -i https://pypi.doubanio.com/simple
```

