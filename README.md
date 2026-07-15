# Java 学习记录

这是一个持续更新的个人 Java 学习仓库，用于保存学习过程中的练习代码和阶段性示例。

## 仓库约定

- 按学习主题建立目录，一个主题一个目录。
- 新主题目录使用英文小写名称，例如 `basics/`、`arrays/`、`oop/`。
- 源码放在主题目录的 `src/` 中；需要补充说明时，可在主题目录中添加 README。
- 只提交手写源码、README 和实际需要的学习资料；IDE 配置和编译产物由 `.gitignore` 排除。

后续目录会逐步扩展为以下形式：

```text
.
├── <topic>/
│   ├── src/
│   │   └── ...
│   └── README.md  # 可选
├── README.md
└── .gitignore
```

## 如何运行代码

### IntelliJ IDEA

打开需要运行的主题目录，找到包含 `public static void main(String[] args)` 的类并运行。

### 命令行

当前学习环境使用 JDK 21。对于不含包名的练习代码，在仓库根目录执行：

```bash
javac -d out <topic>/src/<源文件名>.java
java -cp out <类名>
```

如果代码使用了 `package`，第二条命令中的类名需要写成完整包名加类名。

## 添加新练习

1. 在仓库根目录创建英文小写的主题目录。
2. 将源码放入该目录的 `src/` 中。
3. 需要说明学习目标或运行方式时，在主题目录中添加 README。
