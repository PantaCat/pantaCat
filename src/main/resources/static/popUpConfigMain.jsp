<%@ page import="java.util.Date" %>
<%@ page import="com.yooli.newcoupon.resp.UserGetCouponResp" %>
<%@ page import="com.fuscent.core.consts.PageVo" %>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ include file="/common/taglibs.jsp"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

    Date nowDate = new Date();
//    request.setAttribute("nowDate", nowDate);
//    PageVo<UserGetCouponResp> pageVo = (PageVo<UserGetCouponResp>)request.getAttribute("pageVo");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <%@include file="/global/global.jsp"%>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>弹窗配置</title>
    <script type="text/javascript" src="${ctx}/js/timeFmt.js"></script>
    <script type="text/javascript" src="${ctx}/js/jqDialog/jquery.jBox-2.3.min.js"></script>
    <link href="<%=basePath%>js/calendar/jsDatePick_ltr.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="<%=basePath%>js/calendar/jsDatePick.min.1.3.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/My97DatePickerBeta/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/common1.js"></script>
    <style>
        A {
            text-decoration: NONE
        }

        tr {
            text-align: center;
        }
    </style>
    <style type=text/css>
        .button{
            width: 140px;
            line-height: 38px;
            text-align: center;
            font-weight: bold;
            color: #fff;
            text-shadow:1px 1px 1px #333;
            border-radius: 5px;
            margin:0 5px 5px 0;
            position: relative;
            overflow: hidden;
        }
        .button:nth-child(6n){
            margin-right: 0;
        }
        .button.blue{
            border:1px solid #1e7db9;
            box-shadow: 0 1px 2px #8fcaee inset,0 -1px 0 #497897 inset,0 -2px 3px #8fcaee inset;
            background: -webkit-linear-gradient(top,#42a4e0,#2e88c0);
            background: -moz-linear-gradient(top,#42a4e0,#2e88c0);
            background: linear-gradient(top,#42a4e0,#2e88c0);
        }
        .blue:hover{
            background: -webkit-linear-gradient(top,#70bfef,#4097ce);
            background: -moz-linear-gradient(top,#70bfef,#4097ce);
            background: linear-gradient(top,#70bfef,#4097ce);
        }
        .blue:active{
            top:1px;
            box-shadow: 0 1px 3px #114566 inset,0 3px 0 #fff;
            background: -webkit-linear-gradient(top,#1a71a8,#1976b1);
            background: -moz-linear-gradient(top,#1a71a8,#1976b1);
            background: linear-gradient(top,#1a71a8,#1976b1);
        }

        #tabInfo_frame0{
            margin-top: 0px;
            height: 100%
        }
        .tabTd{
            border: none;
            padding: 0px;
            font-size: 10.5pt;
        }

        .tabTd td{
            border: none;
            padding: 0px;
        }
        .tabTd td a{
            color:black;
        }

        .tabInfoDisT {
            border-width: 0px 0px 1px 0px;
            border-color: #949878;
            border-style: Solid;
            height: 22px;
            font-family: Microsoft Sans Serif;
            font-size: 10.5pt;
            color: Gray;
            padding: 2px 0 0 7px;
            cursor: pointer;
            background: url("<%=basePath%>images/ig_tab_winXP3.gif") no-repeat left
            2px;
        }

        .tabInfoSelT {
            height: 22px;
            font-family: Microsoft Sans Serif;
            font-size: 10.5pt;
            color: Black;
            padding: 2px 0 2px 7px;
            cursor: pointer;
            background: url("<%=basePath%>images/ig_tab_winXP1.gif") no-repeat left
            top;
        }

        .tabInfoSelTR {
            width: 6px;
            cursor: pointer;
            font-size: 2px;
            background: url("<%=basePath%>images/ig_tab_winXP1.gif") no-repeat right
            top;
        }

        .tabInfoDefT {
            border-width: 0px 0px 1px 0px;
            border-color: #949878;
            border-style: Solid;
            height: 22px;
            font-family: Microsoft Sans Serif;
            font-size: 10.5pt;
            color: Black;
            padding: 2px 0 0 7px;
            cursor: pointer;
            background: url("<%=basePath%>images/ig_tab_winXP3.gif") no-repeat left
            2px;
        }

        .tabInfoDefTR {
            border-width: 0px 0px 1px 0px;
            border-color: #949878;
            border-style: Solid;
            width: 6px;
            cursor: pointer;
            cursor:pointer;
            font-size: 2px;
            background: url("<%=basePath%>images/ig_tab_winXP3.gif") no-repeat right
            2px;
        }

        .tabInfoHovT {
            border-width: 0px 0px 1px 0px;
            border-color: #949878;
            border-style: Solid;
            height: 22px;
            font-family: Microsoft Sans Serif;
            font-size: 10.5pt;
            color: Black;
            padding: 2px 0 0 7px;
            cursor: pointer;
            background: url("<%=basePath%>images/ig_tab_winXP2.gif") no-repeat left
            2px;
        }

        .tabInfoHovTR {
            border-width: 0px 0px 1px 0px;
            border-color: #949878;
            border-style: Solid;
            width: 6px;
            cursor: pointer;
            font-size: 2px;
            background: url("<%=basePath%>images/ig_tab_winXP2.gif") no-repeat right
            2px;
        }
        .no-border{
            border: 0px;
        }
    </style>
</head>
<body>
<table width="100%" >
    <tr align="left">
        <td align="left">
            <input type="button" value="新增" class="button blue" onclick="moreWhInfo();"/>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" value="发布" class="button blue" />
        </td>
    </tr>
</table>

<table cellspacing="0" cellpadding="0" width="100%">
    <tr>
        <td style="padding-bottom: 0px;">
            <s:form id="operationForm" method="post">
                <table width="100%" align="center" cellpadding="0" cellspacing="0" class="table_border">
                    <tr>
                        <td class="table_row1" style="min-width: 60px;">序号</td>
                        <td class="table_row1" style="min-width: 60px;">描述</td>
                        <td class="table_row1" style="min-width: 60px;">开始时间</td>
                        <td class="table_row1" style="min-width: 60px;">结束时间</td>
                        <td class="table_row1" style="min-width: 60px;">状态</td>
                        <td class="table_row1" style="min-width: 60px;">操作人</td>
                        <td class="table_row1" style="min-width: 60px;">修改时间</td>
                        <td class="table_row1" style="min-width: 60px;">操作</td>
                    </tr>
                    <%--<c:forEach items="${PageVo.voList}" var="v" varStatus="i">
                        <tr>
                            <td class="table_box"><span>${v.userId}</span></td>
                            <td class="table_box"><span class="">
                                <fmt:formatDate value="${v.releaseTime}" type="date" pattern="yyyy-MM-dd HH:mm" dateStyle="medium"/>
                                </span></td>
                                &lt;%&ndash;<td class="table_box"><span>${v.nickName}</span></td>
                                <td class="table_box"><span class="">${v.mobile}</span></td>&ndash;%&gt;
                            <td class="table_box"><span>${v.type == 0 ? '增值券' : v.type == 1 ? '千东商城优惠券' : '其他券'}</span></td>
                            <td class="table_box"><span>${v.title}</span></td>
                            <td class="table_box"><span>${v.leftValue}</span></td>
                            <td class="table_box"><span>${v.leftRate != null && v.leftRate > 0 ? v.leftRate * 100 : "100.00"}%</span></td>
                            <td class="table_box"><span>${v.value * 100}%</span></td>
                                &lt;%&ndash;<td class="table_box"><span>${v.loseTime < nowDate ? '过期' : '正常'}</span></td>&ndash;%&gt;
                            <td class="table_box"><span class="">
                                <fmt:formatDate value="${v.createTime}" type="date" pattern="yyyy-MM-dd HH:mm" dateStyle="medium"/>
                                </span></td>
                            <td class="table_box"><span class="">
                                <fmt:formatDate value="${v.loseTime}" type="date" pattern="yyyy-MM-dd HH:mm" dateStyle="medium"/>
                                </span></td>
                            <td class="table_box"><span class="">
                                    ${v.validTime}
                            </span></td>
                            <td class="table_box"><span>${v.statusDesc}&lt;%&ndash;${v.status== null ? '未领取' : (v.loseTime < nowDate ?'失效':(v.status == 0 ? '未使用' : '已使用'))}&ndash;%&gt;</span></td>
                        </tr>
                    </c:forEach>--%>
                </table>
            </s:form>
        </td>
    </tr>
</table>
<jsp:include page="/include/page.jsp" />

<div id="addDiv" class="white_content">
    <div class="top-div">
        <div style="width: 750px;height: 20px;font-size: 20px;font-weight: 600;color: #666666;margin: 11px;">
            新增
        </div>
        <div class="closeBtn" onclick="closeBtn()"
             style="width: 50px;height: 20px;padding-right: 2px;font-weight: bold;color: #666666;">
            X
        </div>
    </div>
    <div style="width: 800px;height: 360px;">
        <iframe src="<%=basePath %>popUpConfigAdd.action" style="width:100%;height:1100px" id="iframe_a" name="iframe_a" frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no" allowtransparency="yes">
            您的浏览器不支持iframe，请升级
        </iframe>
    </div>
</div>
<div class="mask" style="position: fixed;left: 0;top: 0;width: 100%;height: 100%;background-color: rgba(0,0,0,0.5);display: none;z-index: 999;"></div>

</body>
<script type="text/javascript">
    /**
     * 点击弹出框的地方
     */
    function moreWhInfo() {
        $('#iframe_a').attr('src', $('#iframe_a').attr('src'));
        $("#addDiv").show();//弹出窗体
        $(".mask").show(); //遮罩层
    };

    function closeBtn() {
        $("#addDiv").hide();
        $(".mask").hide();
    };


</script>
<style type=text/css>
    .white_content {
    display: none;
    position: absolute;
    top: 18%;
    left: 26%;

    width: 800px;
    height: 400px;
    background: #FFFFFF;
    border-radius: 6px;

    z-index: 1002; /*这是窗体的要比遮罩大*/
    /*overflow: auto;*/
    position: fixed;
    }

    .top-div {
    display: flex;
    height: 56px;
    background: #FFFFFF;
    border-bottom: 1px solid #cccc;;
    }

    .closeBtn{
    width: 14px;
    height: 14px;
    margin-left: 397px;
    margin-top: 18px;
    font-weight: bold;
    font-size: 14px;
    color: #666666;
    width: 5%;
    cursor: pointer;
    }

</style>

</html>