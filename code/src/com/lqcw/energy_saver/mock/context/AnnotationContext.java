package com.lqcw.energy_saver.mock.context;

import com.lqcw.energy_saver.Main;
import com.lqcw.energy_saver.mock.process.BasicProcess;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * @Author: LiuQian
 * @Date: Created in 2020/9/18 15:21
 * @Description: 注解有关上下文
 * @Modified By:
 */
public class AnnotationContext {
    private static final Logger logger = Logger.getLogger("AnnotationContext");

    /**
     * 注解及对应的处理类map
     */
    private Map<Annotation, BasicProcess> processMap = new HashMap<>();

    public BasicProcess getProcess(Annotation annotation) {
        return processMap.get(annotation);
    }

    public void init(String annotationPath) {
        // 获取基础路径
        String classpath = Main.class.getResource("/").getPath();
        annotationPath = annotationPath.replace(".", File.separator);
        File scanFilePath = new File(classpath + annotationPath);
        List<String> classPaths = new ArrayList<>();
        doToFile(scanFilePath, classPaths);
        // 遍历class文件
        for (String path : classPaths) {
            // 截取得class名
            int start = path.lastIndexOf(File.separator) + 1;
            int end = path.lastIndexOf(".");
            String className = path.substring(start, end);
            try {
                Class cls = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                logger.info("错误：" + e);
            }
        }
    }

    /**
     * 处理文件file或文件夹file下的所有文件，将class文件路径存在classPaths
     *
     * @param file       待处理文件或文件夹
     * @param classPaths class文件
     */
    private void doToFile(File file, List<String> classPaths) {
        // 如果是文件夹，则递归处理文件
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f1 : files) {
                doToFile(f1, classPaths);
            }
        } else {
            if (file.getName().endsWith(".class")) {
                //如果是class文件我们就放入我们的集合中。
                classPaths.add(file.getPath());
            }
        }
    }
}
