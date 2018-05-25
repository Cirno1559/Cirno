<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$(":input[name='userName']").change(function(){
			var val = $(this).val();
			val = $.trim(val);
			
			if(val != ""){
				var url = "valiateUserName";
				var args = {"userName":val,"time":new Date()};
				$.post(url,args,function(data){
					$("#message").html(data);
				})
			}
		})
	})
</script>
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
	UserName:<input type="text" name="userName" />
	<br>
	<div id="message"></div>
	<br>
	<input type="submit" value="submit"/>
</form>
</body>
</html>