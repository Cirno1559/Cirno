<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		$("#province").change(function(){
			var val = $(this).val();
		})		
	})
	
	
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>  
        <li><select  
            size="1" style="width:116px;height: 25px; margin-left: 30px;"  
            class="ipt1" id="province" name="company_address"><option>选择地区</option>  
        </select><select id="city" name="company_address" size="1"  
            style="width:116px;height: 25px; margin-left:6px;" class="ipt1"><option>市</option>  
        </select><select id="county" name="company_address" size="1"  
            style="width:116px;height: 25px; margin-left:6px;" class="ipt1"><option>县/区</option>  
        </select></li>  
    </ul>  
     
</body>
</html>