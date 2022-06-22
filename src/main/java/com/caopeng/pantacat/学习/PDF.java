package com.caopeng.pantacat.学习;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class PDF {
    /**
     * 用PdfPCell，PdfPTable生成PDF文件
     */
    public void PDFtoFunction1() throws Exception {
        ///////////////////////////////////////////////////////////////
        // 创建文件
        Document document = new Document();
        // 建立一个书写器
        //PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:/cat1.pdf"));//直接用输出流接收并输出到本地

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PdfWriter writer = PdfWriter.getInstance(document, bos);//用流对象接收,然后根据实际情况使用还是输出
        //中文字体,解决中文不能显示问题
        BaseFont bfChinese = BaseFont.createFont("STSong-Light","UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);
        //字体1
        Font font0 = new Font(bfChinese,16);
        //字体2
        Font font1 = new Font(bfChinese,12);
        font1.setColor(BaseColor.BLUE);
        //字体3
        Font font2 = new Font(bfChinese,14);
        // 打开文件
        document.open();
        ///////////////////////////////////////////////////////////////
        //设置属性
        //标题
        document.addTitle("这是标题");
        //作者
        document.addAuthor("这是作者");
        //主题
        document.addSubject("这是主题");
        //关键字
        document.addKeywords("这是关键字");
        //创建时间
        document.addCreationDate();
        //应用程序
        document.addCreator("这是应用程序");
        ///////////////////////////////////////////////////////////////
        //简单内容
        Paragraph beginmsg = new Paragraph("pdf begin!",font0);
        beginmsg.setAlignment(Element.ALIGN_CENTER);//段落位置设置
        document.add(beginmsg);
        ///////////////////////////////////////////////////////////////
        //图片1 绝对路径
        Image image1 = Image.getInstance("E:/图片/生如夏花.jpg");
        //设置图片位置的x轴和y周  设置了xy轴后，alignment位置参数将无效
        //image1.setAbsolutePosition(30f, 220f);
        //设置图片的宽度和高度
        image1.scaleAbsolute(384, 216);
        image1.setAlignment(Element.ALIGN_CENTER);
        //将图片1添加到pdf文件中
        document.add(image1);

        //图片2 URL
        Image image2 = Image.getInstance(new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fblog%2F201307%2F04%2F20130704171426_EkRz4.jpeg&refer=http%3A%2F%2Fcdn.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1640675719&t=2de61fdea803185e8b55724e082a393c"));
        //设置图片的宽度和高度
        image2.scaleAbsolute(384, 216);
        image2.setAlignment(Element.ALIGN_CENTER);
        //将图片2添加到pdf文件中
        document.add(image2);
        ///////////////////////////////////////////////////////////////
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(80); // table宽度填充率
        table.setSpacingBefore(10f); // 和table前面的文字内容间距
        table.setSpacingAfter(20f); // 和table后面的文字内容间距
        //设置列宽
        float[] columnWidths = {1f,1f,1f,1f};
        table.setWidths(columnWidths);


        //添加内容方式 1
        PdfPCell cells0= new PdfPCell(new Paragraph("夏目友人帐",font2));
        cells0.setColspan(4);
        cells0.setRowspan(1);
        cells0.setBorder(0);//边框宽度
        cells0.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells0.setVerticalAlignment(PdfPCell.ALIGN_CENTER);//垂直位置
        cells0.setMinimumHeight(30);//单元格高度
        table.addCell(cells0);

        //添加内容方式 2
        java.util.List<PdfPRow> listRow = table.getRows();
        PdfPCell cells1[]= new PdfPCell[4];
        PdfPRow row1 = new PdfPRow(cells1);
        //单元格
        cells1[0] = new PdfPCell(new Paragraph("序号",font2));//单元格内容
        //cells1[0].setBorderColor(BaseColor.RED);//边框颜色
        //cells1[0].setPaddingLeft(20);//左填充20
        cells1[0].setMinimumHeight(20);
        cells1[0].setHorizontalAlignment(Element.ALIGN_CENTER);
        cells1[0].setVerticalAlignment(Element.ALIGN_MIDDLE);
        cells1[1] = new PdfPCell(new Paragraph("姓名",font2));
        cells1[1].setHorizontalAlignment(Element.ALIGN_CENTER);
        cells1[1].setVerticalAlignment(Element.ALIGN_MIDDLE);
        cells1[2] = new PdfPCell(new Paragraph("性别",font2));
        cells1[2].setHorizontalAlignment(Element.ALIGN_CENTER);
        cells1[2].setVerticalAlignment(Element.ALIGN_MIDDLE);
        cells1[3] = new PdfPCell(new Paragraph("年龄",font2));
        cells1[3].setHorizontalAlignment(Element.ALIGN_CENTER);
        cells1[3].setVerticalAlignment(Element.ALIGN_MIDDLE);
        listRow.add(row1);

        //添加内容方式 3(方式1基础上的扩展)
        PdfPCell cells2= new PdfPCell(new Paragraph("狗子",font2));
        cells2.setColspan(1);
        cells2.setRowspan(2);
        cells2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells2.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);//垂直位置
        cells2.setMinimumHeight(40);//单元格高度
        table.addCell(cells2);
        PdfPCell cells3= new PdfPCell(new Paragraph("柯基",font2));
        cells3.setColspan(1);
        cells3.setRowspan(1);
        cells3.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells3.setVerticalAlignment(PdfPCell.ALIGN_CENTER);//垂直位置
        cells3.setMinimumHeight(40);//单元格高度
        table.addCell(cells3);
        PdfPCell cells4= new PdfPCell(new Paragraph("柴犬",font2));
        cells4.setColspan(1);
        cells4.setRowspan(1);
        cells4.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells4.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);//垂直位置
        cells4.setMinimumHeight(40);//单元格高度
        table.addCell(cells4);
        PdfPCell cells5= new PdfPCell(new Paragraph("拉布拉多",font2));
        cells5.setColspan(1);
        cells5.setRowspan(1);
        cells5.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells5.setVerticalAlignment(PdfPCell.ALIGN_CENTER);//垂直位置
        cells5.setMinimumHeight(40);//单元格高度
        table.addCell(cells5);
        PdfPCell cells6= new PdfPCell(new Paragraph("中华田园犬",font2));
        cells6.setColspan(4);
        cells6.setRowspan(1);
        cells6.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);//水平位置
        cells6.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);//垂直位置
        cells6.setMinimumHeight(40);//单元格高度
        table.addCell(cells6);

        //把表格添加到文件中
        document.add(table);
        ///////////////////////////////////////////////////////////////
        //添加列表 List.ORDERED=有数字序号 List.UNORDERED=无数字序号
        List orderedList = new List(List.ORDERED);
        orderedList.add(new ListItem("列表 one",font2));
        orderedList.add(new ListItem("列表 two",font2));
        orderedList.add(new ListItem("列表 three",font2));
        document.add(orderedList);
        ///////////////////////////////////////////////////////////////
        //创建章节
        Chapter chapter1 = new Chapter(new Paragraph("章节1标题", font1), 6);//章节标题+章节序号
        chapter1.setNumberDepth(1);//号码深度
        Paragraph ph1 = new Paragraph("章节下章节", font1);
        ph1.setIndentationLeft(20);
        Section section1 = chapter1.addSection(ph1);
        Paragraph ph2 = new Paragraph("内容", font1);
        ph2.setIndentationLeft(40);
        section1.add(ph2);
        //将章节添加到文章中
        document.add(chapter1);
        ///////////////////////////////////////////////////////////////
        Paragraph endmsg = new Paragraph("-------------------------------------pdf end!-------------------------------------");
        //段落设置
        endmsg.setAlignment(Element.ALIGN_CENTER);//段落位置设置
        //endmsg.setIndentationLeft(50);//左缩进
        //endmsg.setIndentationRight(50);//右缩进
        //endmsg.setSpacingBefore(50);//和前面内容的间距
        //endmsg.setSpacingAfter(50);//和后面内容的间距
        document.add(endmsg);
        ///////////////////////////////////////////////////////////////
        // 关闭文档
        document.close();
        // 关闭书写器
        writer.close();

        ///////////////////////////////////////////////////////////////
        FileOutputStream fos = new FileOutputStream("D:/cat2.pdf");
        fos.write(bos.toByteArray());
        fos.close();

    }

    public static void main(String[] args) throws Exception {
        PDF pdf = new PDF();
        pdf.PDFtoFunction1();
    }
}
