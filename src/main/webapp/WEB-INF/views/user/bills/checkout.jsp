<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Thanh toán</title>
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
			<hr class="soft" />

			<div class="row">
				<div class="span9">
					<div class="well">
						<br />
						<form:form action="checkout" method="POST" modelAttribute="bills"
							class="form-horizontal">
							<h3>Thanh toán đơn hàng</h3>
							<div class="control-group">
								<label class="control-label">Họ tên <sup>*</sup></label>
								<div class="controls">
									<form:input path="display_name" type="text"
										placeholder=" Mời nhập họ tên" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Email <sup>*</sup></label>
								<div class="controls">
									<form:input path="user" type="email"
										placeholder=" Mời nhập email" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Liên hệ <sup>*</sup></label>
								<div class="controls">
									<form:input path="phone" type="text"
										placeholder=" Mời nhập số điện thoại" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Địa chỉ <sup>*</sup></label>
								<div class="controls">
									<form:textarea path="address" rows="5" cols="30" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">Ghi chú <sup>*</sup></label>
								<div class="controls">
									<form:textarea path="note" rows="5" cols="30" />
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<input type="submit" name="submitAccount" value="Thanh toán"
										class="shopBtn exclusive">
								</div>
							</div>
						</form:form>
					</div>
				</div>
				<div class="span1">&nbsp;</div>
			</div>

		</div>
	</div>
</body>