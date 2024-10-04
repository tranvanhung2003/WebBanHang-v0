<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Đăng ký tài khoản</title>
</head>
<body>
	<!-- 
Body Section 
-->
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${categorys}">
						<li><a href="<c:url value="/san-pham/${item.id}" />"><span
								class="icon-circle-blank"></span> ${item.name}</a></li>
					</c:forEach>
					<li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="<c:url value="/gio-hang" />"><strong>Đã
								mua<span class="badge badge-warning pull-right"
								style="line-height: 18px;"> <fmt:formatNumber
										type="number" groupingUsed="true" value="${TotalPriceCart}" />
									₫
							</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg" />"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> QUICK VIEW</a> <img
							src="<c:url value="/assets/user/img/bootstrap-ring.png" />"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> QUICK VIEW</a> <img
							src="<c:url value="/assets/user/img/s.png" />"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="#" title="add to cart"><span
							class="icon-search"></span> QUICK VIEW</a> <img
							src="<c:url value="/assets/user/img/bootstrap-template.png" />"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="#">VIEW</a> <span class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/" />">Trang chủ</a> <span
					class="divider">/</span></li>
				<li class="active">Người dùng</li>
			</ul>
			<h3>Người dùng</h3>
			<hr class="soft" />

			<div class="row">
				<div class="span4">
					<div class="well">
						<h5>Đăng ký tài khoản</h5>
						<br />
						<form:form action="dang-ky" method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<form:input path="user" class="span3" type="email"
										placeholder="Mời nhập email" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Mật khẩu</label>
								<div class="controls">
									<form:input path="password" class="span3" type="password"
										placeholder="Mời nhập mật khẩu" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Họ và tên</label>
								<div class="controls">
									<form:input path="display_name" class="span3" type="text"
										placeholder="Mời nhập họ và tên" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputEmail">Địa chỉ</label>
								<div class="controls">
									<form:input path="address" class="span3" type="text"
										placeholder="Mời nhập địa chỉ" />
								</div>
							</div>
							<div class="controls">
								<button type="submit" class="btn block">Đăng ký thành
									viên</button>
							</div>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
				<div class="span4">
					<div class="well">
						<h5>Đăng nhập hệ thống</h5>
						
						<form:form action="dang-nhap" method="POST" modelAttribute="user">
							<div class="control-group">
								<label class="control-label" for="inputEmail">Email</label>
								<div class="controls">
									<form:input path="user" class="span3" type="email"
										placeholder="Mời nhập email" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="inputPassword">Mật
									khẩu</label>
								<div class="controls">
									<form:input path="password" type="password" class="span3"
										placeholder="Mời nhập mật khẩu" />
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<button type="submit" class="defaultBtn">Đăng nhập</button>
									<a href="#">Quên mật khẩu?</a>
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>