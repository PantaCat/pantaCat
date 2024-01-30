package com.caopeng.pantacat.学习;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Io流解析Excel {
    /***
     * 1、先添加maven依赖(注意版本号，不然无法使用)
     * <dependency>
     *       <groupId>org.apache.poi</groupId>
     *       <artifactId>poi-ooxml</artifactId>
     *       <version>4.1.2</version>
     * </dependency>
     * <dependency>
     *       <groupId>com.caopeng</groupId>
     *       <artifactId>pantacat</artifactId>
     *       <version>0.0.1-SNAPSHOT</version>
     * </dependency>
     * 
     * 2、如下代码
     */
    
    public static void main(String[] args){
        // 指定Excel文件路径
        String filePath = "E:/IoTest.xlsx";

        try {
            File f = new File(filePath);
            // 创建文件输入流
            FileInputStream fis = new FileInputStream(f);
            // 创建工作簿对象
            Workbook workbook = new XSSFWorkbook(fis);
            // 获取第一个工作表
            Sheet sheet = workbook.getSheetAt(0);
            // 遍历工作表的每一行和每一个单元格
            for (Row row : sheet) {
                System.out.println(row.getRowNum());
                for (Cell cell : row) {
                    // 根据单元格类型获取值
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("N/A\t");
                            break;
                    }
                }
                System.out.println();
            }
            // 关闭工作簿和文件输入流
            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
