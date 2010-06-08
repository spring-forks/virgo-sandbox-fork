<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %><%-- 
--%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%-- 
--%><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Dynamics sample</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico"  />" />
	<link rel="stylesheet" href="<c:url value="/resources/styles/main.css"        />" type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/styles/local.css"       />" type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/styles/print.css"       />" type="text/css" media="print" />
</head>
<body class="main tundra">
	<div id="page">
		<div id="mini-header">
			<div id="mini-header-left"></div>
			<div id="mini-header-right"></div>
		</div> <!-- /mini-header -->

		<div id="primary-navigation">
			<div id="primary-left">
			</div>
			<img id="left-curve" src="/dynamic-sample/images/menu-curve-left.png"/>
			<div id="primary-right">
				<ul>
					<li><a href="/admin" title="Admin Console">Admin Console</a></li>
					<li><a href="http://www.eclipse.org/virgo" title="Virgo">Virgo</a></li>
				</ul>
			</div>
			<img id="right-curve" src="/dynamic-sample/images/menu-curve-right.png"/>
		</div><!-- /primary-navigation -->

		<div id="container">
			<div id="content-no-nav">
				<h1 class="title">Dynamics sample</h1>
				<p>
					The following content providers have been found.
				</p>
				
				
				
				
				
				
				<c:choose>
					<c:when test="${empty providers}">
						<p></p>No providers have been registered.</p>
					</c:when>
					<c:otherwise>
						<c:forEach var="provider" items="${providers}" varStatus="loopStatus">
							${provider.title}
						</c:forEach>
					</c:otherwise>
				</c:choose>

				
				
				
				
				
				

				
			</div><!-- /content -->
		</div><!-- /container -->

	<div id="footer-wrapper">
		<div id="footer-left">&copy; Copyright 2008, 2010 VMware Inc. Licensed under the Eclipse Public License v1.0.</div>
		<div id="footer-right"></div> 
	</div>
	</div> <!-- /page-->
</body>
</html>

