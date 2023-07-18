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
    <title>弹窗配置-新增</title>
    <script type="text/javascript" src="${ctx}/js/timeFmt.js"></script>
    <script type="text/javascript" src="${ctx}/js/jqDialog/jquery.jBox-2.3.min.js"></script>
    <link href="<%=basePath%>js/calendar/jsDatePick_ltr.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="<%=basePath%>js/calendar/jsDatePick.min.1.3.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/My97DatePickerBeta/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/common1.js"></script>

    <style type=text/css>
        .button{
            width: 100px;
            line-height: 30px;
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

    </style>
</head>
<body>

<table width="95%">
    <tr align="left">
        <td align="right" width="20%;">
            <font style="color: red;">*</font>序号:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="序号" />
        </td>

        <td align="right" width="20%;">
            <font style="color: red;">*</font>状态:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="状态" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            <font style="color: red;">*</font>描述:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="描述" />
        </td>

        <td align="right" width="20%;">
            开始时间:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="开始时间" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            结束时间:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="结束时间" />
        </td>

        <td align="right" width="20%;">
            跳转地址1:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="跳转地址1" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            跳转地址2:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="跳转地址2" />
        </td>

        <td align="right" width="20%;">
            跳转地址3:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="跳转地址3" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            跳转地址4:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="跳转地址4" />
        </td>

        <td align="right" width="20%;">
            显示图片:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="显示图片" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            开关:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="开关" />
        </td>

        <td align="right" width="20%;">
            验签:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="验签" />
        </td>
    </tr>
    <tr align="left">
        <td align="right" width="20%;">
            此属性不用:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="此属性不用" />
        </td>

        <td align="right" width="20%;">
            白名单:
        </td>
        <td align="left" width="30%;">
            <input type="text" placeholder="白名单" />
        </td>
    </tr>


    <tr align="center">
        <td align="center" colspan="4">
            <input type="button" value="取消" class="button blue" onclick="parent.closeBtn();" />&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" value="确定" class="button blue" onclick="addSubmit();" />
        </td>
    </tr>
</table>

</body>

<script type="text/javascript">

    function addSubmit(){
        alert("1");
    }

</script>
</html>