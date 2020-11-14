<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<title>订单管理</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	font-family: "微软雅黑";
	background-color: #EDEDED;
}

h2 {
	text-align: center;
}

table {
	width: 96%;
	margin: 0 auto;
	text-align: center;
	border-collapse: collapse;
	font-size: 16px;
}

td, th {
	padding: 5px;
}

th {
	background-color: #DCDCDC;
	width: 120px;
}

th.width-40 {
	width: 40px;
}

th.width-50 {
	width: 50px;
}
th.width-80 {
	width: 80px;
}

th.width-120 {
	width: 100px;
}
hr {
	margin-bottom: 20px;
	border: 1px solid #aaa;
}

#add-emp{
	text-align: center;
	font-size: 20px;
}
</style>

<script type="text/javascript">
	
</script>
</head>
<body>
	<h2>员工管理</h2>
	<div id="add-emp">
		<!-- 点击后查询所有门店信息后再跳转到订单新增页面 -->
		<a href="toEmpAdd" target="rightFrame">新增员工</a>
	</div>
	<hr />
	<table border="1">
		<tr>
			<th class="width-40">编号</th>
			<th class="width-120">姓名</th>
			<th class="width-50">职位</th>
			<th class="width-40">入职时间</th>
			<th class="width-40">所属门店</th>
			<th class="width-50">薪资</th>
			<th class="width-80">操 作</th>
		</tr>

		<!-- 模版数据 -->
		<c:forEach items="${empList}" var="emp" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${emp.name }</td>
				<td>${emp.job }</td>
				<td><fmt:formatDate value="${ emp.hireDate }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td><c:forEach items="${doorList}" var="door">
						<c:if test="${emp.doorId == door.id}">
						${ door.name }
					</c:if>
					</c:forEach></td>
				<td>${ emp.salary}</td>
				<td><a href="empDelete?id=${emp.id}">删除</a> &nbsp;|&nbsp; <a
					href="empInfo?id=${emp.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
<!-- body-end  -->
</html>



