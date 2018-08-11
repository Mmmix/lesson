<%--
  Created by IntelliJ IDEA.
  User: 93163
  Date: 2018/07/21
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>网站后台管理模版</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/layui/css/layui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/admin.css" />
    <script src="${pageContext.request.contextPath}/assets/jq/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/layui/layui.all.js" type="text/javascript" charset="utf-8"></script>
</head>

<body>
<div class="page-content-wrap">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <div class="layui-inline">
                <button type="button" class="layui-btn layui-btn-small layui-btn-normal" id="createBtn" ><i class="layui-icon">&#xe654;</i></button>
            </div>
            <div class="layui-inline">
                <input type="text" name="title" id="search_value" onkeyup="to_Page(1)" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
            <button class="layui-btn layui-btn-normal" type="button" onclick="to_Page(1)" lay-submit="search">搜索</button>
        </div>
    </form>
    <div class="layui-form" id="table-list">
        <table class="layui-table" lay-even lay-skin="nob">
            <colgroup>
                <col width="50">
                <col class="hidden-xs" width="50">
                <col class="hidden-xs" width="100">
                <col>
                <col class="hidden-xs" width="200">
                <col width="80">
                <col width="150">
            </colgroup>
            <thead>
            <tr>
                <th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose"></th>
                <th>ID</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>职业</th>
                <th>手机号</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="tabbody">
            <!--<tr>
                <td><input type="checkbox" name="" lay-skin="primary" data-id="1"></td>
                <td>1</td>
                <td>bob</td>
                <td>男</td>
                <td>26</td>
                <td>学生</td>
                <td>213488</td>
                <td>165165@qq.com</td>
                <td>
                    <div class="layui-inline">
                        <button class="layui-btn layui-btn-mini layui-btn-normal  go-btn" data-id="1" data-url="danye-detail.html"><i class="layui-icon">&#xe642;</i></button>
                        <button class="layui-btn layui-btn-mini layui-btn-danger del-btn" data-id="1" data-url="del.html"><i class="layui-icon">&#xe640;</i></button>
                    </div>
                </td>
            </tr>-->
            </tbody>
        </table>
        <div class="row">

            <div class="col-md-6" id="page_info_area">
            </div>
            <div class="col-md-6 page-wrap" id="page_nav_area">
            </div>
        </div>
        <div id="modal" style="display: none;">
            <form class="layui-form" id="modal_form">
                <div class="layui-form-item">
                    <label class="layui-form-label">会员ID</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_id" name="tdId" class="layui-input layui-disabled" disabled>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_name" name="tdName" lay-verify="required" autocomplete="off" class="layui-input" required>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block" id="td_sex">
                        <input type="radio" name="tdSex" value="男" title="男">
                        <input type="radio" name="tdSex" value="女" title="女" checked>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">年龄</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_age" name="tdAge" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">角色</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_role" name="tdRole" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">账号</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_account" name="tdAccount" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">邮箱</label>
                    <div class="layui-input-inline">
                        <input type="text" id="td_email" name="tdEmail" class="layui-input">
                    </div>
                </div>
            </form>
        </div>
        <div id="createModal" style="display: none;">
            <form class="layui-form" id="user_form">
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tdName" lay-verify="required" autocomplete="off" class="layui-input" required>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block" >
                        <input type="radio" name="tdSex" value="男" title="男">
                        <input type="radio" name="tdSex" value="女" title="女" checked>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">年龄</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tdAge" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">角色</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tdRole" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">账号</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tdAccount" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">邮箱</label>
                    <div class="layui-input-inline">
                        <input type="text" name="tdEmail" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-inline">
                        <input type="password" name="tdPassword" class="layui-input">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    layui.use(['form', 'jquery', 'layer'],function(){
        var form=layui.form;
        form.render();
    });
    $(function() {
        to_Page(1);

    });

    $("#createBtn").on("click",function () {
        layer.open({
            type:1,
            title:'添加用户',
            area: ['500px', '500px'],
            shadeClose: false, //点击遮罩关闭
            content: $('#createModal'),
            btn: ['确定', '取消'],
            yes: function(){
                $.ajax({
                    type:"get",
                    url:"/lesson/register",
                    async:true,
                    data: $("#user_form").serialize(),
                    success: function(result){
                        if(result.code===200){
                            layer.closeAll();
                            layer.msg("添加成功");
                            to_Page(sessionStorage.getItem("pageNum"));
                        }else if (result.code === 500) {
                            layer.msg("注册失败");
                        }
                    }
                });
            },
            cancel: function () {
                return;
            },
            end: function () {
                $('#createModal').css("display", "none");
            }
        })

    });

    function show_modal(User) {
        $('#td_account').val(User.tdAccount);
        $('#td_id').val(User.tdId);
        $('#td_age').val(User.tdAge);
        $('#td_email').val(User.tdEmail);
        $('#td_name').val(User.tdName);
        $('#td_role').val(User.tdRole);
        $('[name=tdSex]').each(function(i,item) {
            if ($(item).val() === User.tdSex) {
                console.log(User.tdSex);
                $(item).prop('checked', true);
                layui.use('form', function () {
                    var form = layui.form;
                    form.render();
                });
            }
        });

        layer.open({
            type:1,
            title:'用户信息',
            area: ['500px', '500px'],
            shadeClose: false, //点击遮罩关闭
            content: $('#modal'),
            btn: ['确定', '取消'],
            yes: function(){
                $.ajax({
                    type:"get",
                    url:"/lesson/update",
                    async:true,
                    data: $("#modal_form").serialize()+"&tdId="+User.tdId,
                    success: function(result){
                        if(result.code===200){
                            layer.close(layer.index);
                            to_Page(sessionStorage.getItem("pageNum"));
                        }
                    }
                });
            },
            cancel: function () {
                return;
            },
            end: function () {
                $('#modal').css("display", "none");
            }
        })
    }

    function deleteUser(id){
        layer.confirm('真的删除行么', function (index) {
            $.ajax({
                url: "/lesson/delete?tdId=" + id,
                dataType: 'json',
                type: 'get',
                success: function (result) {
                    if(result.code===200){
                        layer.msg("删除成功");
                        layer.close(index);
                        to_Page(sessionStorage.getItem("pageNum"));
                    }
                }
            });
        });

    }

    function to_Page(pageNum) {
        sessionStorage.setItem("pageNum",pageNum);
        var tdName = $("#search_value").val();
        $.ajax({
            type: "get",
            url: "/lesson/getUser",
            data:{
              "pageNum": pageNum,
              "tdName": tdName
            },
            async: true,
            dataType: "json",
            success: function(message) {
                showItem(message.extend.data.list);
                showNav(message.extend.data);
            }
        });
    }

    function showItem(arrayList) {
        $("#tabbody").empty();
        for(var i = 0; i < arrayList.length; i++) {
            var oTr = $("<tr></tr>");
            oTr.append('<td><input type="checkbox" name="" lay-skin="primary" data-id="' + arrayList[i].tdId + '"></td>')
            oTr.append('<td>' + arrayList[i].tdId + '</td>');
            oTr.append('<td>' + arrayList[i].tdName + '</td>');
            oTr.append('<td>' + arrayList[i].tdSex + '</td>');
            oTr.append('<td>' + arrayList[i].tdAge + '</td>');
            oTr.append('<td>' + arrayList[i].tdRole + '</td>');
            oTr.append('<td>' + arrayList[i].tdAccount + '</td>');
            oTr.append('<td>' + arrayList[i].tdEmail + '</td>');
            var oTd = $("<td></td>");
            var oDiv = $("<div class='layui-inline'></div>");
            oDiv.append('<button class="layui-btn layui-btn-mini layui-btn-normal" type="button" data-id="' +
                arrayList[i].tdId + '" onclick=\'show_modal('+JSON.stringify(arrayList[i])+')\'><i class="layui-icon">&#xe642;</i></button>');
            oDiv.append('<button class="layui-btn layui-btn-mini layui-btn-danger" type="button" data-id="' +
                arrayList[i].tdId + '" onclick=\'deleteUser('+arrayList[i].tdId+')\'><i class="layui-icon">&#xe640;</i></button>');
            oTd.append(oDiv);
            oTr.append(oTd);
            $("#tabbody").append(oTr);
        }
    }

    function showNav(result) {
        $("#page_info_area").empty();
        $("#page_nav_area").empty();
        $('#page_info_area').append("当前" + result.pageNum + "页，总" + result.pages +
            "页，总" + result.total + "条记录");
        var ul = $("<ul><ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<span></span>").append("首页"));
        var prePageLi = $("<li></li>").append($("<span></span>").append("&laquo;"));
        firstPageLi.click(function() {
            to_Page(1);
        });
        prePageLi.click(function() {
            to_Page(result.pageNum - 1);
        });
        if(result.pageNum !== 1) {
            ul.append(firstPageLi).append(prePageLi);
        }
        $.each(result.navigatepageNums, function(index, item) {
            var numLi = $("<li></li>").append($("<span></span>").append(item));
            if(result.pageNum === item) {
                numLi.addClass("active")
            }
            numLi.click(function() {
                to_Page(item);
            });
            ul.append(numLi);
        });
        var nextPageLi = $("<li></li>").append($("<span></span>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<span></span>").append("末页"));
        nextPageLi.click(function() {
            to_Page(result.pageNum + 1);
        });
        lastPageLi.click(function() {
            to_Page(result.pages);
        });
        if(result.pageNum !== result.pages) {
            ul.append(nextPageLi).append(lastPageLi);
        }
        var nav = $("<nav></nav>").append(ul);
        nav.appendTo('#page_nav_area');
    }
</script>
</body>

</html>