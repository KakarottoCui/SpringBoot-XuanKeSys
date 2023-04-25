<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head><script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script><meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"><link rel="shortcut icon" href="/StudentInfo/utils/image/favicon.ico" type="image/x-icon" />
		<meta charset="UTF-8">
		<title>兴趣班自选系统</title>
		
		<!-- 标题图标、CSS、js、jQ 
		<link href="/online/image/favicon.ico" rel="shortcut icon">
		<link rel="stylesheet" type="text/css" href="/online/css/main.css">
		<script src="/online/js/fun.js" type="text/javascript"></script>-->
		<script type="text/javascript" src="/StudentInfo/utils/js/jquery-3.3.1.min.js"></script>
			<!-- Loading Bootstrap -->
		<link href="/StudentInfo/utils/css/vendor/bootstrap.min.css" rel="stylesheet">
		<!-- Loading Flat UI Pro -->
		<link href="/StudentInfo/utils/css/flat-ui.css" rel="stylesheet">
		<!-- Loading Flat UI JS -->
		<script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.min.js"></script>	
		
	<script type='text/javascript' src='/StudentInfo/utils/scripts/particles.js'></script><link href="/StudentInfo/utils/css/animate.css" rel="stylesheet"></head>
	
	
	<body><div id="particles-js"><canvas class="particles-js-canvas-el" width="1322" height="774" style="width: 100%; height: 100%;"></canvas></div>
	<jsp:include page="adminLeft.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-6">
<h5>修改兴趣班</h5>
<c:forEach var="course" items="${requestScope.courseList}">
		
					<form action="../moditystud/${course.cid}" method="get" name="form1">
						<h6>兴趣班名称</h6>
							<input class="form-control" type="text" name="cname" value="${course.cname }" onkeyup="this.value=this.value.replace(/(^\s+)|(\s+$)/g,'');" maxlength="10"></input>
							<h6>兴趣班简介</h6>
							<textarea class="form-control" name="cintroduction" cols="20" rows="6" >${course.cintroduction }</textarea>
							

							


						
					</select>
						 <br/>	
							<input type="submit" class="btn btn-primary btn-wide login-btn" value="修改"/>
						
					   		    
					</form>
				</c:forEach>	

</div>
</div>
</div>



<script>
		$("select").select2({
			dropdownCssClass : 'dropdown-inverse'
		});
	</script>
<script type="text/javascript" src="/StudentInfo/utils/scripts/flat-ui.js"></script><script src="/StudentInfo/utils/scripts/bganimation.js"></script></body>
</html>