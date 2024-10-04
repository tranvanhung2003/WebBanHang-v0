<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="/admin/products" />"><span>Twitter
						Bootstrap ecommerce template</span> <img
					src="<c:url value="/assets/user/img/logo-bootstrap-shoping-cart.png" />"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			<div class="offerNoteWrapper">
				<h1 class="dotmark">
					<i class="icon-cut"></i> Twitter Bootstrap shopping cart HTML
					template is available @ $14
				</h1>
			</div>
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Support (24/7) : 0800 1234 678 </strong><br>
				<br>
			</p>
			<span class="btn btn-mini">[ ${TotalQuantityCart} ] <span
				class="icon-shopping-cart"></span></span> <span
				class="btn btn-warning btn-mini">$</span> <span class="btn btn-mini">&pound;</span>
			<span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<li class=""><a href="<c:url value="/admin/products" />">Sản phẩm</a></li>
					<li class=""><a href="<c:url value="/admin/categorys" />">Loại hàng</a></li>
				</ul>
				<form action="#" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2">
				</form>
				<ul class="nav pull-right">
					<c:if test="${empty LoginInfo}">
						<li class="dropdown"><a href="#"><span class="icon-lock"></span>
								Đăng nhập<b class="caret"></b></a></li>
					</c:if>
					<c:if test="${not empty LoginInfo}">
						<li class="dropdown"><a href="#">${LoginInfo.display_name}
								<b class="caret"></b>
						</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
</div>