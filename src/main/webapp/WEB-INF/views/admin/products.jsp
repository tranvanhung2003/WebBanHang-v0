<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<title>Quản lý sản phẩm</title>
</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="<c:url value="/admin/products" />">Trang chủ</a> <span
					class="divider">/</span></li>
				<li class="active">Sản phẩm</li>
			</ul>
			<div class="well well-small">

				<hr class="soften" />
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Giá bán</th>
							<th>Thêm</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<form:form action="AddProduct" method="POST"
								modelAttribute="themsanpham">
								<td><form:input path="name" type="text"
										placeholder=" Nhập tên sản phẩm" /></td>
								<td><form:input path="price" type="number"
										placeholder=" Nhập giá sản phẩm" /></td>
								<td><input type="submit" name="submitProduct"
									value="Thêm" class="exclusive"></td>
							</form:form>
						</tr>
					</tbody>
				</table>
				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Giá bán</th>
							<th>Chỉnh sửa</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="item" items="${ sanpham }">
							<tr>
								<td><input type="text" id="name-${item.id}"
									value="${item.name}" /></td>
								<td><input type="number" id="gia-${item.id}"
									value="${item.price}" /></td>
								<td><button data-id="${item.id}"
										class="btn btn-mini btn-danger edit-cart" type="button">
										<span class="icon-edit"></span>
									</button></td>
								<td><a
									href="<c:url value="/admin/DeleteProduct/${item.id}"/>"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br />
			</div>
		</div>
	</div>
	<content tag="script"> <script>
		$(".edit-cart").on("click", function() {
			var id = $(this).data("id");
			var name = $("#name-" + id).val();
			var gia = $("#gia-" + id).val();
			window.location = "EditProduct/" + id + "/" + name + "/" + gia;
		});
	</script></content>
</body>