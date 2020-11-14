<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<title>修改员工</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<style type="text/css">
	body{ font-family: "微软雅黑"; background-color: #EDEDED; }
	h2{ text-align: center;font-size:26px; }
	table{ margin: 30px auto; text-align: center; border-collapse:collapse; width:50%; }
	td, th{ padding: 5px;font-size:18px;}
	hr{ margin-bottom:20px; border:1px solid #aaa; }
	input,select,textarea{ width:284px; height:30px; background:#EDEDED; border:1px solid #999; text-indent:5px; font-size:18px; }
	input[type='submit']{ width:130px; height:36px; cursor:pointer; border-radius:5px 5px 5px 5px; background:#ddd; }
	select{text-indent:0px;}
	textarea{height:100px;font-size:22px;}
</style>
</head>
<body><!-- body-start  -->

<h2>修改员工</h2>
<hr/>
<form action="empUpdate" method="POST">
	<!-- hidden隐藏域,在提交表单时连order.id一起提交 -->
	<input type="hidden" name="id" value="${emp.id }"/>
	<table border="1">
		<tr>
			<td>姓名</td>
			<td>
				<input type="text" name="name" value="${emp.name }"/>
			</td>
		</tr>
		<tr>
			<td>职位</td>
			<td>
				<input type="text" name="job" value="${emp.job }"/>
			</td>
		</tr>
		<tr>
			<td>入职时间</td>
			<td>
				<input type="text" name="hireDate" value="${emp.hireDate }"/>
			</td>
		</tr>
		<tr>
			<td width="30%">所属门店</td>
			<td>
				<select id="doorId" name="doorId">
					<!-- 遍历所有门店信息 -->
					<c:forEach items="${ doorList }" var="door">
						<option value="${ door.id }"
							<c:if test="${ order.doorId == door.id }">
								selected="true"
							</c:if>
						>${ door.name }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>薪资</td>
			<td>
				<input type="text" name="salary" value="${emp.salary }"/>
					
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提 	交"/>
			</td>
		</tr>
	</table>
</form>

</body><!-- body-end  -->
</html>



