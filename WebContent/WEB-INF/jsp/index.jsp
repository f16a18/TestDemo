<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="static/framework/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="static/framework/Font-Awesome-3.2.1/css/font-awesome.min.css" rel="stylesheet">
<link href="static/framework/bootstrap/css/custom-theme/jquery-ui-1.10.0.custom.css" rel="stylesheet">
<link href="static/css/index.css" rel="stylesheet">
<title>主界面</title>
</head>
<body>
	<div id="main">
		<nav class="navbar navbar-default navbar-static-top" role="navigation" id="nav" name="nav">
			<div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.do">资讯</a>
            </div>
            <ul class="nav nav-pills navbar-top-links navbar-right nav_head">
            	<li class="dropdown">
            		<a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="icon-envelope-alt"></i>  
                        <i class="icon-angle-down"></i>
                    </a>
                    
                    <ul class="dropdown-menu dropdown-messages">
                    	<li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我我 </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
            	</li>
            	
				<li class="dropdown">
            		<a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="icon-user"></i>  
                        <i class="icon-angle-down"></i>
                    </a>
                    
                    <ul class="dropdown-menu dropdown-user">
                    	<li>
                            <a href="" >
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div></div>
                            </a>
                        </li>
                    </ul>
            	</li>
            	
           	</ul>
            
		</nav>
	
		
	</div>

	<script src="static/framework/bootstrap/js/jquery-1.12.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/framework/bootstrap/js/bootstrap.min.js"></script>
    <script src="static/framework/bootstrap/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script type="text/javascript">
    	path='<%=basePath%>';

    </script>
    
    <script src="static/js/login.js"></script>
</body>
</html>