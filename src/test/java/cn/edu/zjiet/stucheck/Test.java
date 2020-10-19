package cn.edu.zjiet.stucheck;

import java.io.File;

/**
 * TODO
 *
 * @author huyue
 * @version V1.0
 * @since 2020-10-10 11:02
 */
import org.apache.commons.io.FileUtils;
public class Test {
    public static void main(String[] args) {
        Test.CopyAndRenamePictures("C:\\Users\\huyue\\Desktop\\1");
    }


    public static void CopyAndRenamePictures(String airpath){  //实现功能：在路径下，拷贝png图片，并重命名图片为jpg
        try {
            File file = new File(airpath);
            //获取路径下的文件列表
            String[] list = file.list();
            if(null!=list && list.length>0){
                //遍历文件列表
                for(String pngFilename : list){
                    //将文件转化为File对象
                    File oldFile = new File(airpath, pngFilename);
                    if(!oldFile.isDirectory()){
                        //如果文件名中包含png，则替换为jpg
                        if(!pngFilename.contains(".jpg")){
                            String jpgFilename = pngFilename.substring(0, pngFilename.lastIndexOf(".")) + ".jpg";
                            //为新的jpg文件，在原来目录中创建File对象
                            File newFile = new File(airpath+"\\1", jpgFilename);
                            //使用copyFile方法把复制旧文件至新文件
                            FileUtils.copyFile(oldFile, newFile);
                        }
                        else if(pngFilename.contains("x")){
                            String jpgFilename = pngFilename.substring(0, pngFilename.lastIndexOf(".")-1) + "X.jpg";
                            //为新的jpg文件，在原来目录中创建File对象
                            File newFile = new File(airpath+"\\1", jpgFilename);
                            //使用copyFile方法把复制旧文件至新文件
                            FileUtils.copyFile(oldFile, newFile);
                        }else {
                            File newFile = new File(airpath+"\\1", pngFilename);
                            FileUtils.copyFile(oldFile, newFile);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
